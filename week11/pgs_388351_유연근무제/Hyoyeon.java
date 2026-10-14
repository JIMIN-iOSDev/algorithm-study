class Solution {
	public int solution(int[] schedules, int[][] timelogs, int startday) {
		int answer = 0;
		int chk = 0;
		for (int i = 0; i < schedules.length; i++) {
			int temp = startday;
			chk = 0;
			int time = 0;
			if ((schedules[i] + 10) % 100 >= 60) {
				time = ((schedules[i] / 100 * 100) + 100 + (schedules[i] % 10));
			} else {
				time = schedules[i] + 10;
			}
			for (int j = 0; j < 7; j++) {
				if (temp <= 5 && time >= timelogs[i][j]) {
					chk++;
				}
				temp++;
				if (temp > 7) {
					temp = 1;
				}
			}
			if (chk == 5) {
				answer++;
			}
		}
		return answer;
	}
}