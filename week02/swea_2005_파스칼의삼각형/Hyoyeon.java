package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class swea_2005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			int cnt = sc.nextInt();
			System.out.println("#" + i);
			int[][] arr = new int[cnt][cnt];

			for (int j = 1; j <= cnt; j++) {
				for (int k = 0; k < j; k++) {
					if (j == 1 || k == 0) {
						arr[j - 1][k] = 1;
					} else {
						arr[j - 1][k] = arr[j - 2][k] + arr[j - 2][k - 1];
					}
				}
				for (int k = 0; k < arr[j - 1].length; k++) {
					if (arr[j - 1][k] != 0) {
						System.out.print(arr[j - 1][k] + " ");
					}
				}
				System.out.println();
			}

		}
	}
}
