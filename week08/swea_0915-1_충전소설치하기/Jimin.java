package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 충전소 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][3];
			int min = Integer.MAX_VALUE;
			boolean oneStationPossible = false;

			for (int i = 0; i < N; i++) {
				arr[i][0] = sc.nextInt(); // x좌표
				arr[i][1] = sc.nextInt(); // y좌표
				arr[i][2] = sc.nextInt(); // 최대 거리 K
			}

			// 충전소가 1개인 경우
			for (int x1 = -15; x1 <= 15; x1++) {
				for (int y1 = -15; y1 <= 15; y1++) {

					int sum = 0; // 충전소까지의 거리 합
					boolean possible = true;

					for (int i = 0; i < N; i++) { // 집 좌표
						int distance = Math.abs(arr[i][0] - x1) + Math.abs(arr[i][1] - y1); // 1번째 충전소와의 거리

						if (distance < 1 || distance > arr[i][2]) {
							possible = false;
							break; // 충전소 1개로 모든 집 커버 불가능
						}

						sum += distance;
					}

					if (possible) {
						oneStationPossible = true;
						min = Math.min(min, sum);
					}
				}
			}
			
			if (oneStationPossible) {
				System.out.printf("#%d %d%n", tc, min);
				continue;
			}

			//충전소가 2개인 경우
			for (int x1 = -15; x1 <= 15; x1++) {
				for (int y1 = -15; y1 <= 15; y1++) {
					for (int x2 = -15; x2 <= 15; x2++) {
						for (int y2 = -15; y2 <= 15; y2++) {
							
							int sum = 0;
							boolean possible = true;
							
							for (int i = 0; i < N; i++) {
								int distance1 = Math.abs(arr[i][0] - x1) + Math.abs(arr[i][1] - y1); // 1번째 충전소와의 거리
								int distance2 = Math.abs(arr[i][0] - x2) + Math.abs(arr[i][1] - y2); // 2번째 충전소와의 거리
								
								int distance = Math.min(distance1, distance2);
								
								if (distance < 1 || distance > arr[i][2]) {
									possible = false;
									break;
								}
								
								sum += distance;
							}
							
							if (possible) min = Math.min(min, sum);
						}
					}
				}
			}
			
			if (min == Integer.MAX_VALUE) min = -1;
			
			System.out.printf("#%d %d%n", tc, min);
		}
	}
}
