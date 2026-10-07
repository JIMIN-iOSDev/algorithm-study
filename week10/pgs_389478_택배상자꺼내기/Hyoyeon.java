class Solution {
	public int solution(int n, int w, int num) {
		int answer = 0;
		int[][] arr = new int[(n + w - 1) / w][w];
		int num2 = 1;
		for (int j = arr.length - 1; j >= 0; j--) {

			if ((arr.length - 1 - j) % 2 == 0) {

				for (int i = 0; i < w; i++) {
					arr[j][i] = num2;
					num2++;
					if (num2 > n) {
						break;
					}

				}

			} else {

				for (int i = w - 1; i >= 0; i--) {
					arr[j][i] = num2;
					num2++;
					if (num2 > n) {
						break;
					}

				}
			}
		}

		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < w; b++) {
				if (arr[a][b] == num) {
					if (arr[0][b] == 0) {
						answer = a;
						break;
					} else {
						answer = a + 1;
						break;
					}

				}
			}
		}

		return answer;
	}
}
