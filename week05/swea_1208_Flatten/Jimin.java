import java.util.Scanner;

public class swea_1208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt(); // 덤프 횟수
			int[] arr = new int[100];

			for (int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}

			while (N >= 1) {
				int max = Integer.MIN_VALUE;
				int min = Integer.MAX_VALUE;
				int idxmax = 0;
				int idxmin = 0;

				// 덤프 횟수가 남았다면 최고점 -1, 최저점 +1
				for (int i = 0; i < 100; i++) {
					if (max < arr[i]) {
						max = arr[i];
						idxmax = i;
					}
					
					if (min > arr[i]) {
						min = arr[i];
						idxmin = i;
					}
				}

				if (max - min <= 1) { // 평탄화 끝났으면 종료
					break;
				}

				arr[idxmax]--;
				arr[idxmin]++;

				N--;
			}

			//최종 min, max 구하기
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;

			for (int i = 0; i < 100; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}

				if (min > arr[i]) {
					min = arr[i];
				}
			}

			System.out.printf("#%d %d%n", tc, max - min);
		}
	}
}
