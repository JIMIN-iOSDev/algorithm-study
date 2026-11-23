#!/bin/bash
# ------------------------------------------------------------
# algorithm-study 주차 폴더 자동 생성 스크립트 (백준 전용)
#
# 사용법:
#   ./new_week.sh 01        → week01 폴더 만들고 문제 6개 입력받음 (기본값)
#   ./new_week.sh 01 4      → week01 폴더에 문제 4개만 추가로 입력받음
#   (이미 week01/README.md가 있으면 덮어쓰지 않고 뒤에 이어붙입니다)
#
# 문제 링크만 넣으면 번호/제목을 자동으로 채웁니다.
#   - 번호: URL의 problem/{숫자} 값에서 추출
#   - 제목: 문제 페이지를 받아서 <title> 태그에서 추출
#   둘 중 하나라도 자동으로 못 읽으면 그때만 직접 입력을 받습니다.
#
# 폴더명: boj_{번호}_{제목}
# ------------------------------------------------------------

set -e

if [ -z "$1" ]; then
  read -p "주차 번호를 입력하세요 (예: 01): " WEEK_NUM
else
  WEEK_NUM="$1"
fi

# 두 번째 인자로 문제 개수를 받음, 안 주면 기본 6개
PROBLEM_COUNT="${2:-6}"

WEEK_DIR="week${WEEK_NUM}"
mkdir -p "$WEEK_DIR"

WEEK_README="${WEEK_DIR}/README.md"

# README가 이미 있으면 그대로 두고(이어붙이기), 없으면 새로 헤더 생성
if [ ! -f "$WEEK_README" ]; then
  echo "# Week ${WEEK_NUM}" > "$WEEK_README"
  echo "" >> "$WEEK_README"
  echo "| 문제 | 링크 |" >> "$WEEK_README"
  echo "|------|------|" >> "$WEEK_README"
fi

echo "총 ${PROBLEM_COUNT}문제를 순서대로 입력해주세요."
echo ""

for i in $(seq 1 "$PROBLEM_COUNT"); do
  echo "----- 문제 ${i} -----"
  read -p "문제 링크: " P_URL_RAW

  # URL에서 problem/{숫자} 값만 추출해서 깔끔한 링크로 재구성
  PROB_ID=$(echo "$P_URL_RAW" | grep -o 'problem/[0-9]*' | head -1 | cut -d'/' -f2)

  if [ -n "$PROB_ID" ]; then
    P_URL="https://www.acmicpc.net/problem/${PROB_ID}"
  else
    P_URL="$P_URL_RAW"
  fi

  # 번호를 못 찾았을 때만 직접 입력받음
  if [ -n "$PROB_ID" ]; then
    P_NUM="$PROB_ID"
    echo "문제 번호: ${P_NUM} (자동 추출)"
  else
    while true; do
      read -p "문제 번호를 자동으로 못 찾았습니다. 직접 입력해주세요 (예: 1000): " P_NUM
      [ -n "$P_NUM" ] && break
      echo "문제 번호는 비워둘 수 없습니다."
    done
  fi

  # 문제 페이지를 받아서 <title> 태그에서 제목 추출 시도
  TITLE_HTML=$(curl -s -L -A "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36" "$P_URL" | grep -o '<title>[^<]*</title>' | head -1)

  AUTO_TITLE=$(echo "$TITLE_HTML" \
    | sed -e 's/^<title>//' -e 's/<\/title>$//' \
    | sed -E 's/ *-[[:space:]]*백준( 온라인 저지)?[[:space:]]*$//' \
    | sed -E 's/^[0-9]+번:[[:space:]]*//' \
    | sed -e 's/&amp;/\&/g' -e 's/&lt;/</g' -e 's/&gt;/>/g' -e "s/&#39;/'/g" -e 's/&quot;/"/g' \
    | sed -e 's/^[[:space:]]*//' -e 's/[[:space:]]*$//')

  if [ -n "$AUTO_TITLE" ]; then
    P_NAME_RAW="$AUTO_TITLE"
    echo "문제 이름: ${P_NAME_RAW} (자동 추출)"
  else
    read -p "문제 이름을 자동으로 못 가져왔습니다. 직접 입력해주세요 (공백은 _ 처리됨): " P_NAME_RAW
  fi

  # 공백, 슬래시 -> 언더스코어 치환 (슬래시는 경로가 깨지는 것을 방지)
  # 그 외 파일명에 쓸 수 없는 문자(: * ? " < > |)는 제거
  P_NAME=$(echo "$P_NAME_RAW" | tr ' /' '__' | tr -d ':*?"<>|')

  FOLDER_NAME="boj_${P_NUM}_${P_NAME}"
  FOLDER_PATH="${WEEK_DIR}/${FOLDER_NAME}"

  mkdir -p "$FOLDER_PATH"

  # 폴더 내부에 문제 정보용 README 생성 (팀원들은 이 폴더 밑에 본인 이름.java만 올리면 됨)
  cat > "${FOLDER_PATH}/README.md" <<EOF
# ${P_NUM} - ${P_NAME_RAW}

- 문제 링크: ${P_URL}
EOF

  # 주차 README에 링크 한 줄 추가
  echo "| ${P_NUM} ${P_NAME_RAW} | [문제 링크](${P_URL}) |" >> "$WEEK_README"

  echo "생성 완료: ${FOLDER_PATH}"
  echo ""
done

echo "week${WEEK_NUM} 폴더 생성이 모두 완료되었습니다."
echo "이제 git add / commit / push 하시면 됩니다."
