package SWEA;

import java.util.Scanner;

public class Hyoyeon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			System.out.println("#" + i);
			int chk = 0;
			int cnt = sc.nextInt();
			for (int j = 0; j < cnt; j++) {
				String s = sc.next();
				int a = sc.nextInt();
				for (int h = 0; h < a; h++) {
					System.out.print(s);
					chk++;
					if (chk % 10 == 0) {
						System.out.println();
					}
				}
			}
			System.out.println();
		}
	}
}
