package algo;

import java.util.Scanner;

public class swea1206 {
	static int[] iArr;
	static int cnt;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {

			iArr = new int[5];
			cnt = 0;
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				add(sc.nextInt());
				cal();
			}

			System.out.println("#" + test_case + " " + cnt);
		}
	}

	public static void add(int num) {
		for (int i = 0; i < 4; i++) {
			iArr[i] = iArr[i + 1];
		}
		iArr[4] = num;
	}

	public static void cal() {
		int a = iArr[2] - Math.max(Math.max(iArr[0], iArr[1]), Math.max(iArr[3], iArr[4]));
		if (a > 0) {
			cnt += a;
		}

	}

}
