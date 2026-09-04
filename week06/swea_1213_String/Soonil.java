package algo.swea;

import java.util.Scanner;

public class swea1213 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */

		for (int test_case = 1; test_case <= T; test_case++) {

			int n = sc.nextInt();
			String str = sc.next();
			String strs = sc.next();
			if (strs.startsWith(str) || strs.endsWith(str)) {
				System.out.println("#" + n + " " + (strs.split(str).length));
			} else {
				System.out.println("#" + n + " " + (strs.split(str).length - 1));
			}
		}
	}

}
