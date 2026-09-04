import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			int tc = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();
			long ans = N;

			for (int i = 0; i < M - 1; i++) {

				ans *= N;
			}

			System.out.printf("#%d %d%n", tc, ans);

		}
	}
}