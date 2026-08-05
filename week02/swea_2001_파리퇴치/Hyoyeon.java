package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;

public class swea_2001 {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int[][] arr = new int[A][A];
			int max = 0;
			for (int i = 0; i < A; i++) {
				for (int j = 0; j < A; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int sum = 0;
			for (int a = 0; a < A-B+1; a++) {
				for (int b = 0; b < A-B+1; b++) {
					sum = 0;
					for (int c = 0; c < B; c++) {
						for (int d = 0; d < B; d++) {
							sum += arr[c+a][d+b];
						}
					}
					if (max < sum) {
						max = sum;
					}
				}
				
				
			}
			System.out.println("#" + test_case + " " + max);

		}

	}
}
