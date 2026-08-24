import java.util.Scanner;

public class swea_2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			String[] arr = new String[N]; //int로 하면 런타임에러
			int[][] arr2 = new int[N][N];
			int sum = 0;

			// 띄어쓰기 없이 들어온 숫자 2차원 배열 만들기
			for (int i = 0; i < N; i++) {
				arr[i] = sc.next();
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr2[i][N - 1 - j] = arr[i].charAt(j) - '0';
				}
			}

			// 별찍기
			for (int i = 0; i < N; i++) {
				int start = Math.abs(i - N / 2); // 체크 시작 인덱스

				for (int j = start; j < start + (N - start * 2); j++) { // 몇 칸
					sum += arr2[i][j];
				}
			}

			System.out.printf("#%d %d%n", tc, sum);
		}
	}
}
