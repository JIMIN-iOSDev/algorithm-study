package practice;

import java.util.Scanner;

public class swea1966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int[] nList = new int[n];
			for (int i = 0; i < n; i++) {
				nList[i] = sc.nextInt();
			}
			for (int i = 0; i < n - 1; i++) {
				for (int j = i; j < n; j++) {
					if (nList[i] > nList[j]) {
						int tmp = nList[i];
						nList[i] = nList[j];
						nList[j] = tmp;
					}
					
				}
			}
			System.out.printf("#%d ", test_case);
			for (int i : nList) {
				System.out.print(i + " ");
			}
			System.out.println();

		}

	}
}
