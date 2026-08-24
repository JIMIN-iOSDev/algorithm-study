#!/bin/bash
# ------------------------------------------------------------
# algorithm-study 주차 폴더 자동 생성 스크립트
#
# 사용법:
#   ./new_week.sh 01        → week01 폴더 만들고 문제 6개 입력받음 (기본값)
#   ./new_week.sh 01 4      → week01 폴더에 문제 4개만 추가로 입력받음
#   (이미 week01/README.md가 있으면 덮어쓰지 않고 뒤에 이어붙입니다)
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
  read -p "문제 번호 (예: 1945): " P_NUM
  read -p "문제 이름 (공백은 자동으로 _ 처리됩니다, 예: 간단한소인수분해): " P_NAME_RAW
  read -p "문제 링크 (SWEA URL): " P_URL_RAW

  # URL에서 contestProbId 값만 추출해서 깔끔한 링크로 재구성
  # (문제 목록 페이지에서 복사하면 붙는 필터/정렬 파라미터를 전부 제거)
  PROB_ID=$(echo "$P_URL_RAW" | grep -o 'contestProbId=[^&]*' | head -1 | cut -d'=' -f2)

  if [ -n "$PROB_ID" ]; then
    P_URL="https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=${PROB_ID}"
  else
    # contestProbId를 못 찾으면 입력한 링크를 그대로 사용
    P_URL="$P_URL_RAW"
  fi

  # 공백 -> 언더스코어 치환
  P_NAME=$(echo "$P_NAME_RAW" | tr ' ' '_')

  FOLDER_NAME="swea_${P_NUM}_${P_NAME}"
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