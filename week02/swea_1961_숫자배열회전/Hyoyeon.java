package SWEA;

import java.util.Scanner;

public class swea_1961 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int cnt = sc.nextInt();
			System.out.println("#" + i);
			int[][] arr = new int[cnt][cnt];
			for (int j = 0; j < cnt; j++) {
				for (int h = 0; h < cnt; h++) {
					arr[j][h] = sc.nextInt();
				}
			}
			int e = cnt - 1;
			for (int a = 0; a < cnt; a++) {

				for (int b = cnt - 1; b >= 0; b--) {
					System.out.print(arr[b][a]);
				}
				System.out.print(" ");
				for (int c = cnt - 1; c >= 0; c--) {
					System.out.print(arr[cnt - 1 - a][c]);
				}
				System.out.print(" ");
				for (int d = 0; d < cnt; d++) {
					System.out.print(arr[d][e]);
				}
				System.out.println();
				e--;

			}

		}
	}
}
