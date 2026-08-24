package SWEA;

import java.util.Scanner;

public class swea_1926 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int cnt = 0;
			String num = Integer.toString(i);
			for (int j = 0; j < num.length(); j++) {
				if (num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') {
					cnt++;
				}
			}
			if (cnt > 0) {
				for (int j = 0; j < cnt; j++) {
					System.out.print("-");
				}
			} else {
				System.out.print(num);
			}
			System.out.print(" ");
		}
	}
}
