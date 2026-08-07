package SWEA;

import java.util.Scanner;

public class swea_1976 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			int hour1 = sc.nextInt();
			int min1 = sc.nextInt();
			int hour2 = sc.nextInt();
			int min2 = sc.nextInt();
			int summin = min1 + min2;
			int sumhour = hour1 + hour2;
			System.out.print("#" + i + " ");
			if (summin >= 60) {
				summin -= 60;
				sumhour += 1;
				if (sumhour >= 12) {
					System.out.printf("%d %d\n", sumhour - 12, summin);
				} else {
					System.out.printf("%d %d\n", sumhour, summin);
				}

			} else {
				if (sumhour >= 12) {
					System.out.printf("%d %d\n", sumhour - 12, summin);
				} else {
					System.out.printf("%d %d\n", sumhour, summin);
				}

			}
		}
	}
}
