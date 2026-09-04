package algo_study;

import java.util.Scanner;

public class swea_1217 {
	public static int func(int n, int m) {
		if (m == 0) {
			return 1;
		}
		return n * func(n, m - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			int cnt = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			
			System.out.println("#" + cnt + " " + func(a, b));
		}
	}
}
