
public class 유연근무제 {
	public int solution(int[] schedules, int[][] timelogs, int startday) {
		int answer = 0;

		for (int i = 0; i < schedules.length; i++) {
			int cnt = 0;
			int start = startday;
			int hour = schedules[i] / 100;
			int minute = schedules[i] % 100;
			int limit = hour * 60 + minute + 10;
			for (int j = 0; j < 7; j++) {

				int hour_r = timelogs[i][j] / 100;
				int minute_r = timelogs[i][j] % 100;
				int realtime = hour_r * 60 + minute_r;

				if (start != 6 && start != 7) {
					if (realtime <= limit) {
						cnt++;
					}
				}

				if (start == 7) {
					start = 0;
				}
				start++;
			}

			if (cnt == 5) {
				answer++;
			}
		}

		return answer;
	}

}
