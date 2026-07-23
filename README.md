# Algorithm Study

## 📅 진행 방식

- 매일 1문제 풀이
- 주 6문제 진행
- 동일한 문제를 각자 풀이 후 GitHub에 업로드
- 서로의 코드를 리뷰하며 다양한 풀이 방법 학습

---

## 📂 폴더 구조

```
algorithm-study
│
├── week01
│   ├── swea_문제번호_문제이름
│   │   ├── 지민.java
│   │   ├── 효연.java
│   │   └── 순일.java
│   └── ...
│
├── week02
└── ...
```

---

## 📝 폴더 / 파일명 규칙

폴더 : swea_문제번호_문제이름

```
swea_27006_대칭찾기
swea_27005_산불수열
```

개인 풀이 파일 : 개인 이름 영어로 작성

```
Jimin.java
Hyoyeon.java
Sunil.java
```

---

## ✅ Git 규칙

- 자신의 파일만 수정한다.
- 다른 사람의 코드는 허락 없이 수정하지 않는다.

작업 전

```bash
git pull origin master
```

작업 후

```bash
git add .
git commit -m "week01 문제번호"
git push origin master
```
