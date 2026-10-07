package temp;

public class temp {

	public int solution(int[][] signals) {
		int n = signals.length;
		int answer = -1;
		int num = 0;
		int sig = 0;
		int mnum = 0;
		int nnum = 1;
		int[] sum = new int[n];
		int[] start = new int[n];
		int[] end = new int[n];

		// 공배수 구하기
		for (int i = 0; i < signals.length; i++) {
			for (int j = 0; j < 3; j++) {
				mnum += signals[i][j];
			}

			nnum *= mnum;
			mnum = 0;
		}

		for (int c = 0; c < 3; c++) {
			for (int b = 0; b < n; b++) {
				if (c == 1) {
					start[b] = sum[b] + 1;
					end[b] = sum[b] + signals[b][c];
				}

				sum[b] += signals[b][c];
			}
		}
        
        
		for (int a = 1; a <= nnum; a++) {
            int chk =0;
			for (int b = 0; b < n; b++) {
        
				if (a > end[b]) {
					start[b] += sum[b];
					end[b] += sum[b];
				}
                // 노란색 구간인지
				if (a >= start[b] && a <= end[b]) {
					chk ++;
				}
			}

			if(chk==n){
                answer=a;
                break;
            }
		}
		return answer;
	}
}
