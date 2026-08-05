package SWEA;

import java.util.Scanner;

public class swea_1979 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int cnt = 0;
			int[][] arr = new int[N][N];
			for (int a = 0; a < N; a++) {
				for (int b = 0; b < N; b++) {
					arr[a][b] = sc.nextInt();
				}
			}
			for (int j = 0; j < N; j++) {
				int len = 0;
				int len2 = 0;
				for (int h = 0; h < N; h++) {
					if (arr[h][j] == 1) {
						len2 += 1;
					} else {
						if (len2 == K) {
							cnt += 1;
						}
						len2 = 0;
					}
					if (arr[j][h] == 1) {
						len += 1;
					} else {
						if (len == K) {
							cnt += 1;
						}
						len = 0;
					}
				}
				if (len == K) {
					cnt += 1;
				}
				if (len2 == K) {
					cnt += 1;
				}

			}
			System.out.println("#" + i + " " + cnt);
		}
	}
}
