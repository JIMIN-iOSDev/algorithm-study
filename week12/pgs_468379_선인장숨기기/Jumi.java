class Solution {
	public int[] solution(int m, int n, int h, int w, int[][] drops) {
		int[][] count = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				count[i][j] = Integer.MAX_VALUE;
			}
		}

		for (int i = 0; i < drops.length; i++) {
			int temp_i = drops[i][0];
			int temp_j = drops[i][1];

			count[temp_i][temp_j] = i + 1;
		}

		int max = -1;
		int ans_x = 0;
		int ans_y = 0;
		for (int i = 0; i <= m - h; i++) {
			for (int j = 0; j <= n - w; j++) {
				int current = min_cal(count, i, j, h, w);

				if (current == Integer.MAX_VALUE) {
					return new int[] { i, j };
				}

				if (current > max) {
					max = current;
					ans_x = i;
					ans_y = j;
				}
			}
		}

		int[] answer = { ans_x, ans_y };
		return answer;
	}

	static int min_cal(int[][] a, int r, int c, int h, int w) {
		int val = Integer.MAX_VALUE;

		for (int i = r; i < r + h; i++) {
			for (int j = c; j < c + w; j++) {
				val = Math.min(val, a[i][j]);
			}
		}
		return val;
	}
}