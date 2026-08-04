package algo;

import java.util.Scanner;

public class swea1979 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int n = sc.nextInt();
			int k = sc.nextInt();
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int ans = 0;
			for (int i = 0; i < n; i++) {
				boolean wWasOne = false;
				boolean hWasOne = false;
				int wCnt = 0;
				int hCnt = 0;

				for (int j = 0; j < n; j++) {

					if (arr[j][i] == 1) {
						hCnt++;
						hWasOne = true;
					} else {
						if (hCnt == k) {
							ans++;
						}
						hWasOne = false;
						hCnt = 0;
					}

					if (arr[i][j] == 1) {
						wCnt++;
						wWasOne = true;
					} else {
						if (wCnt == k) {
							ans++;
						}
						wWasOne = false;
						wCnt = 0;
					}
				}
				if (hCnt == k) {
					ans++;
				}
				if (wCnt == k) {
					ans++;
				}

			}
			System.out.printf("#%d %d", test_case, ans);

		}
	}

}
