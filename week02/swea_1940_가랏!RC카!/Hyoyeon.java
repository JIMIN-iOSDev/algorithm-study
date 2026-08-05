package SWEA;

import java.util.Scanner;

public class swea_1940 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int cnt = sc.nextInt();
			int sum = 0;
			int speed = 0;
			for (int j = 0; j < cnt; j++) {
				int a = sc.nextInt();
				int b = 0;
				if (a != 0) {
					b = sc.nextInt();
				}
				if (a == 1) {
					speed += b;
					sum = sum + speed;

				} else if (a == 0) {
					sum = sum + speed;
				} else {
					speed -= b;
					if (speed < 0) {
						speed = 0;
					}
					sum = sum + speed;
				}
			}
			System.out.println("#" + i + " " + sum);
		}

	}
}
