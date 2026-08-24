package d2;

import java.util.Scanner;

public class swea_1961 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr1 = new int[N][N];
			int[][] arr2 = new int[N][N];
			int[][] arr3 = new int[N][N];
			int[][] arr4 = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr1[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int k = j;
					int l = N - i - 1;
					
					arr2[k][l] = arr1[i][j];
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int k = j;
					int l = N - i - 1;
					
					arr3[k][l] = arr2[i][j];
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int k = j;
					int l = N - i - 1;
					
					arr4[k][l] = arr3[i][j];
				}
			}
			
			int[][][] arrs = {arr2, arr3, arr4};
			
			System.out.printf("#%d%n", tc);
			
			for (int row = 0; row < N; row++) {
				for (int[][] arr : arrs) {
					for (int col = 0; col < N; col++) {
						System.out.print(arr[row][col]);
					}
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		
		sc.close();
	}
}
