package algo;

import java.util.Scanner;

public class swea2005 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */

		for (int test_case = 1; test_case <= T; test_case++) {
			System.out.printf("#%d%n", test_case);
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			arr[0][0] = 1;
			for (int i = 1; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (j == 0) {
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
					}
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j] > 0) {
						System.out.printf("%d ", arr[i][j]);
					}
				}
				System.out.println();
			}

		}
	}

}
