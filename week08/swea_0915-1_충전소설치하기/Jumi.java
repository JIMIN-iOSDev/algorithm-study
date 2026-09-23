package algo;

import java.util.*;

public class 충전소 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			// 최대 K, 최소 1 거리에 있는 충전소만 이용 (먼거리는 이용x)
			// 하나만 설치할 수 있으면 1개만,, 최대 2개
			// 각 집이 이용하는 충전소 까지 거리의 합의 최솟값
			// 모두 이용할 수 없을때 -1

			int N = sc.nextInt(); // 집의 수
			int[] h_x = new int[N];
			int[] h_y = new int[N];
			int[] h_k = new int[N];

			for (int i = 0; i < N; i++) {
				h_x[i] = sc.nextInt();
				h_y[i] = sc.nextInt();
				h_k[i] = sc.nextInt();
			}

			int min = Integer.MAX_VALUE;
			// 충전소 1개만
			for (int i = -15; i <= 15; i++) {
				for (int j = -15; j <= 15; j++) {
					boolean ok = true;
					int sum = 0;

					for (int l = 0; l < N; l++) {
						int dist = Math.abs(h_x[l] - i) + Math.abs(h_y[l] - j);

						if (dist < 1 || dist > h_k[l]) {
							ok = false;
							break;
						}

						sum += dist;
					}

					if (ok) {
						min = Math.min(min, sum);
					}

				} // j
			} // i

			if (min != Integer.MAX_VALUE) {
				System.out.println(min);
				continue;
			}

			// 충전소 두개
			for (int x1 = -15; x1 <= 15; x1++) {
				for (int y1 = -15; y1 <= 15; y1++) {

					for (int x2 = -15; x2 <= 15; x2++) {
						for (int y2 = -15; y2 <= 15; y2++) {

							if (x1 == x2 && y1 == y2) {
								continue;
							}

							boolean ok = true;
							int sum = 0;

							for (int l = 0; l < N; l++) {
								int dist1 = Math.abs(h_x[l] - x1) + Math.abs(h_y[l] - y1);
								int dist2 = Math.abs(h_x[l] - x2) + Math.abs(h_y[l] - y2);

								boolean build1 = ((1 <= dist1) && (dist1 <= h_k[l]));
								boolean build2 = ((1 <= dist2) && (dist2 <= h_k[l]));
								if (!build1 && !build2) {
									ok = false;
									break;

								}

								if (build1 && build2) {
									sum += Math.min(dist1, dist2);
								} else if (build1) {
									sum += dist1;
								} else {
									sum += dist2;
								}

							}

							if (ok) {
								min = Math.min(min, sum);
							}

						}
					}
				}
			}

			if (min != Integer.MAX_VALUE) {
				System.out.println(min);
			} else {
				System.out.println("-1");
			}

		}
	}

}
