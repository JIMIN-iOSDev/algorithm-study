package algo;

import java.util.Scanner;

public class swea1209 {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T = 10;
		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */

		for (int test_case = 1; test_case <= T; test_case++) {
			int t = sc.nextInt();
			int[][] nlist = new int[100][100];
			nlist[0][0] = sc.nextInt();
			int x1 = nlist[0][0];
			int x2 = 0;
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {

					if (i == 0 && j == 0)
						continue;
					int num = sc.nextInt();
					if (i == j)
						x1 += num;
					if (i + j == 99)
						x2 += num;
					if (i == 0) {
						nlist[i][j] = num + nlist[i][j - 1];
					} else if (j == 0) {
						nlist[i][j] = num + nlist[i - 1][j];
					} else {
						nlist[i][j] = num + nlist[i - 1][j] + nlist[i][j - 1] - nlist[i - 1][j - 1];
					}
				}
			}
			int max = Math.max(x1, x2);
			for (int i = 0; i < 100; i++) {
				if (i == 0) {
					max = Math.max(max, nlist[i][99]);
					max = Math.max(max, nlist[99][i]);
				} else {
					max = Math.max(max, nlist[i][99] - nlist[i - 1][99]);
					max = Math.max(max, nlist[99][i] - nlist[99][i - 1]);
				}
			}
			System.out.println("#" + test_case + " " + max);
		}
	}

}
