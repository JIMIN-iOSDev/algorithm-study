package pgs;

public class Pgs_468371 {
	public int solution(int[][] signals) {
		int time = 1;
		int[] sum = new int[signals.length]; // 각 신호등 시간들 합

		for (int i = 0; i < signals.length; i++) {
			sum[i] = signals[i][0] + signals[i][1] + signals[i][2];
		}

		int multi = 1;

		for (int i = 0; i < signals.length; i++) { // time 언제까지 돌건지. 최소공배수 돌면되는데 그냥 공배수로 함
			multi *= sum[i];
		}


		while (time <= multi) {
			boolean allYellow = true;

			for (int i = 0; i < signals.length; i++) {
				int now = time % sum[i];
				if (!(now > signals[i][0] && now <= signals[i][0] + signals[i][1])) { // 초록과 빨강 사이인가
					allYellow = false;
					break;
				}
			}

			if (allYellow) return time;
			time++;
		}

		return -1;
	}
}