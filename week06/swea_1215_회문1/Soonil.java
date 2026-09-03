package algo.swea;

import java.util.Scanner;

public class swea1215 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {

			StringBuilder sb1;
			StringBuilder sb2;
			StringBuilder rev1;
			StringBuilder rev2;

			int n = sc.nextInt();
			char[][] list = new char[8][];
			for (int i = 0; i < 8; i++) {
				list[i] = sc.next().toCharArray();
			}
			int cnt = 0;
			for (int i = 0; i < 8; i++) {
				sb1 = new StringBuilder();
				sb2 = new StringBuilder();
				for (int j = 0; j < 8; j++) {
					sb1.append(list[i][j]);
					sb2.append(list[j][i]);
					if (sb1.length() > n) {
						sb1.deleteCharAt(0);
						sb2.deleteCharAt(0);
					}
					if (sb1.length() == n) {
						rev1 = new StringBuilder(sb1).reverse();
						rev2 = new StringBuilder(sb2).reverse();
						if (rev1.toString().equals(sb1.toString()))
							cnt++;
						if (rev2.toString().equals(sb2.toString()))
							cnt++;
					}
				}
			}
			System.out.println("#" + test_case + " " + cnt);

		}
	}

}
