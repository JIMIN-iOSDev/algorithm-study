

import java.util.Scanner;

public class Hyoyeon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int k = 1; k <= T; k++) {
			int a = sc.nextInt();
			int[][] arr = new int[a][a];

			for (int j = 0; j < a; j++) {
				String num = sc.next();
				for (int h = 0; h <a; h++) {
					arr[j][h] = num.charAt(h)-'0';
				}
			}

			int i = a / 2 ;
			int sum = 0;
			for (int j = 0; j < a; j++) {
				for (int h = 0; h < a; h++) {

					if (Math.abs(i - j) <= h && h <= a - Math.abs(i - j) - 1) {

						sum += arr[j][h];
					}

				}

			}

			System.out.println("#" + k + " " + sum);
		}
	}
}
