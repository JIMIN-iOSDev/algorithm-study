import java.util.Arrays;
import java.util.Scanner;

public class swea_9229 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			Arrays.sort(arr);
			int start = 0;
			int end = N - 1;
			int answer = -1;

			while (start < end) {
				if (arr[start] + arr[end] > M) {
					end--;
				} else {
					answer = Math.max(answer, arr[start] + arr[end]);
					start++;
				}
			}

			System.out.printf("#%d %d%n", tc, answer);
		}
	}
}
