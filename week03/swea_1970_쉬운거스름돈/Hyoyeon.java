package SWEA;

import java.util.Scanner;

public class swea_1970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			int N = sc.nextInt();
			System.out.println("#" + i);

			if (N / 50000 >= 0) {
				System.out.print(N / 50000 + " ");
				N %= 50000;
			}
			if (N / 10000 >= 0) {
				System.out.print(N / 10000 + " ");
				N %= 10000;
			}
			if (N / 5000 >= 0) {
				System.out.print(N / 5000 + " ");
				N %= 5000;
			}
			if (N / 1000 >= 0) {
				System.out.print(N / 1000 + " ");
				N %= 1000;
			}
			if (N / 500 >= 0) {
				System.out.print(N / 500 + " ");
				N %= 500;
			}
			if (N / 100 >= 0) {
				System.out.print(N / 100 + " ");
				N %= 100;
			}
			if (N / 50 >= 0) {
				System.out.print(N / 50 + " ");
				N %= 50;
			}
			if (N / 10 >= 0) {
				System.out.print(N / 10 + " ");
			}
			System.out.println();
		}
	}
}
