

import java.util.Scanner;

public class Hyoyeon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {

			long a = sc.nextLong();
			long b = sc.nextLong();
			long sum = 0;

			for (long j = a; j <= b; j++) {
				long chk = j;
				while (chk != 0) {

					sum += chk % 10;
					chk = chk / 10;
				}
			}
			System.out.println("#" + i + " " + sum);
		}
	}
}
