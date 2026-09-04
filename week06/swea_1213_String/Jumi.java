import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int tc = sc.nextInt();
			String find = sc.next();
			String sen = sc.next();
			int cnt2 = 0;

			int N = sen.length();
			int M = find.length();

			for (int i = 0; i < N - M + 1; i++) {
				int cnt = 0;
				for (int j = 0; j < M; j++) {
					if (sen.charAt(i + j) == find.charAt(j)) {
						cnt++;
					}

					if (cnt == M) {
						cnt2++;
					}
				}
			}

			System.out.printf("#%d %d%n", tc, cnt2);
		}
	}
}