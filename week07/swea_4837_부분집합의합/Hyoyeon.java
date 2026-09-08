package algo_study;

import java.util.Scanner;

public class swea_4837 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
			int sum;
			int chk = 0;
			for (int a = 0; a < (1<<arr.length); a++) {
				sum = 0;
				for (int b = 0; b < N; b++) {
					if (a % (1 << b) != 0) {
						sum += arr[b];
					}
				}
				if (sum == K) {
					chk++;
				}
			}
			System.out.println("#" + i + " " + chk);
		}
	}
}
