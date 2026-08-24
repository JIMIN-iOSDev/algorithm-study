package d2;

import java.util.Scanner;

public class swea_2005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			arr[0][0] = 1;
			
			for (int i = 1; i < N; i++) {
				for (int j = 0; j <= i; j++) {
					if (j - 1 >= 0 && j < i) {
						arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
					} else if (j - 1 == -1) {
						arr[i][j] = arr[i - 1][j];
					} else if (j - 1 == i - 1) {
						arr[i][j] = arr[i - 1][j - 1];
					} 
				}
			}
			
			System.out.printf("#%d%n", tc);
			
			for (int[] arr1 : arr) {
				for (int num : arr1) {
					if (num == 0) {
						System.out.print(" ");
					} else {
						System.out.print(num + " ");
					}
				}
				System.out.println();
			}
		}
	}
}
