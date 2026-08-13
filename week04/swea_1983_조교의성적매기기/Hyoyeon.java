package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class swea_1983 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] score = new String[] { "D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+" };
		for (int i = 1; i <= T; i++) {
			int cnt = sc.nextInt();
			double[] arr = new double[cnt];
			int num = sc.nextInt();
			double chk = 0;
			for (int j = 0; j < cnt; j++) {
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int num3 = sc.nextInt();
				arr[j] = (num1 * 0.35 + num2 * 0.45 + num3 * 0.2);
			}
			chk = arr[num - 1];
			Arrays.sort(arr);
			for (int j = 0; j < cnt; j++) {
				if (chk == arr[j]) {
					System.out.println("#" + i + " " + score[j / (cnt / 10)]);
					break;
				}
			}
		}
	}
}
