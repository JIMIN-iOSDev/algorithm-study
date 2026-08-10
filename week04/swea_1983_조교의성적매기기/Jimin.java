import java.util.Scanner;

public class swea_1983 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] arr = new int[N][3];
			double[] score = new double[N];
			int[] rank = new int[N];
			String[] result = new String[N];
			
			//각각의 점수, 총점 입력
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < 3; j++) {
					arr[i][j] = sc.nextInt();
				}
				score[i] = arr[i][0] * 0.35 + arr[i][1] * 0.45 + arr[i][2] * 0.2;
			}
			
			//등수 구하기
			//나보다 큰 점수일 경우 +1 -> 내림차순
			for (int i = 0; i < N; i++) {
				int count = 1;
				for (int j = 0; j < N; j++) {
					if (score[i] < score[j]) {
						count++;
					}
				}
				rank[i] = count;
			}
			
			//등수에 따른 학점 배치
			int num = N / 10;
			for (int i = 0; i < N; i++) {
				for (int j = 1; j <= 10; j++) {
					if (rank[i] <= num * j) {
						result[i] = grade[j - 1];
						break;
					}
				}
			}
			
			System.out.printf("#%d %s%n", tc, result[K - 1]);
		}
	}
}
