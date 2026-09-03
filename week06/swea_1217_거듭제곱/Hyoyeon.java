package algo_study;

import java.util.Scanner;

public class swea_1217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			int cnt = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum=1;
			for (int j = 1; j <= b; j++) {
				sum *= a;
			}
			System.out.println("#" + cnt + " " + sum);
		}
	}
}
