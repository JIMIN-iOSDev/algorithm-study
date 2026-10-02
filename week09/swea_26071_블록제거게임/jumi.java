package test;

import java.util.Scanner;

public class 블록제거게임 {

	static int N;
	static int[] blocks;
	static boolean[] crash;
	static int maxScore;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			N = sc.nextInt();

			blocks = new int[N];
			crash = new boolean[N];

			for (int i = 0; i < N; i++) {
				blocks[i] = sc.nextInt();
			}

			maxScore = 0;
			dfs(0, 0);
			System.out.printf("#%d %d%n", tc, maxScore);
		}
	}

	static void dfs(int cnt, int score) {
		if (cnt == N) {
			maxScore = Math.max(maxScore, score);
			return;
		}

		// 제거할 블록 선택
		for (int i = 0; i < N; i++) {

			if (crash[i]) {
				continue;
			}

			// 왼쪽블록 찾기
			int left = i - 1;

			while (left >= 0 && crash[left]) {
				left--;
			}

			// 오른쪽블록 찾기
			int right = i + 1;

			while (right < N && crash[right]) {
				right++;
			}

			int tmp;
      //남은 블록에 따라서 계산하기
			if (left >= 0 && right < N) {

				tmp = blocks[left] * blocks[right];

			} else if (left >= 0) {

				tmp = blocks[left];

			} else if (right < N) {

				tmp = blocks[right];

			} else {

				tmp = blocks[i];
			}

			//i 부수기
			crash[i] = true;

			dfs(cnt + 1, score + tmp);

			crash[i] = false;
		}
	}
}