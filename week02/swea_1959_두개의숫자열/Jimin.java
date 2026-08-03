package d2;

import java.util.Scanner;

public class swea_1959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arr1 = new int[N];
			int[] arr2 = new int[M];
			
			for (int i = 0; i < N; i++) {
				arr1[i] = sc.nextInt();
			}
			
			for (int j = 0; j < M; j++) {
				arr2[j] = sc.nextInt();
			}
			
			int max = Integer.MIN_VALUE;
			
			if (N >= M) {
				for (int num = 0; num <= N - M; num++) {
					int sum = 0;
					for (int i = num; i < num + M; i++) {
						sum += arr1[i] * arr2[i - num];
					}
					max = Math.max(max, sum);
				}
			} else {
				for (int num = 0; num <= M - N; num++) {
					int sum = 0;
					for (int i = num; i < num + N; i++) {
						sum += arr2[i] * arr1[i - num];
					}
					max = Math.max(max, sum);
				}
			}
			
			System.out.println("#" + test_case + " " + max);
		}
	}
}
