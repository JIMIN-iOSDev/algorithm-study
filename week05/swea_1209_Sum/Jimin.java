import java.util.Scanner;

public class swea_1209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			sc.nextInt();
			int[][] arr = new int[100][100];
			int[] arr2 = new int[202];

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			// 가로, 세로 합
			for (int i = 0; i < 100; i++) {
				int sum1 = 0;
				int sum2 = 0;

				for (int j = 0; j < 100; j++) {
					sum1 += arr[i][j];
					sum2 += arr[j][i];
				}
				arr2[i] = sum1;
				arr2[i + 100] = sum2;
			}

			// 대각선 합
			int sum = 0;
			for (int i = 0; i < 100; i++) {
				sum += arr[i][i];
			}
			arr2[200] = sum;

			sum = 0;
			for (int i = 99; i >= 0; i--) {
				sum += arr[i][i];
			}
			arr2[201] = sum;

			// max 값
			int max = Integer.MIN_VALUE;
			for (int num : arr2) {
				max = Math.max(max, num);
			}

			System.out.printf("#%d %d%n", tc, max);
		}
	}
}
