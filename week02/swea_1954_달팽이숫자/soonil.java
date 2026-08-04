package algo;

import java.util.Scanner;

public class swea1954 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */

		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };
		for (int test_case = 1; test_case <= T; test_case++) {
			int x = 0;
			int y = 0;
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			int num = 1;
			int idx = 0;
			while (num <= n * n) {

				arr[y][x] = num++;
				if (x + dx[idx] >= n | y + dy[idx] >= n | x + dx[idx] < 0 | y + dy[idx] < 0) {
					idx = (idx + 1) % 4;
				} else if (arr[y + dy[idx]][x + dx[idx]] > 0) {
					idx = (idx + 1) % 4;

				}
				x += dx[idx];
				y += dy[idx];
			}
			System.out.println("#" + test_case);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.printf("%d ", arr[i][j]);
				}
				System.out.println();
			}

		}
	}

}
