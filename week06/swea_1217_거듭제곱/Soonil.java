package algo.swea;

import java.util.Scanner;

public class swea1217 {
	static int num;
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int test = sc.nextInt();
			num = sc.nextInt();
			int cnt = sc.nextInt();
			System.out.println("#" + test + " " + multi(cnt));
		}
	}
	public static int multi(int cnt) {
		cnt--;
		if (cnt == 0) {
			return num;
		}
		return num * multi(cnt);
	}

}
