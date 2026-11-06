import java.util.Arrays;

class Solution {
    public int solution(int[][] info, int n, int m) {
        int len = info.length;
        int mid = len / 2;

        int[] best = new int[m];
        Arrays.fill(best, Integer.MAX_VALUE);

        // 오른쪽 절반의 모든 부분집합
        for (int mask = 0; mask < (1 << (len - mid)); mask++) {
            int a = 0;
            int b = 0;

            for (int i = mid; i < len; i++) {
                if ((mask & (1 << (i - mid))) != 0) {
                    b += info[i][1];
                } else {
                    a += info[i][0];
                }

                if (a >= n || b >= m) break;
            }

            if (a < n && b < m) {
                best[b] = Math.min(best[b], a);
            }
        }

        // B 흔적이 b 이하일 때 A의 최소 흔적
        for (int b = 1; b < m; b++) {
            best[b] = Math.min(best[b], best[b - 1]);
        }

        int answer = Integer.MAX_VALUE;

        // 왼쪽 절반의 모든 부분집합
        for (int mask = 0; mask < (1 << mid); mask++) {
            int a = 0;
            int b = 0;

            for (int i = 0; i < mid; i++) {
                if ((mask & (1 << i)) != 0) {
                    b += info[i][1];
                } else {
                    a += info[i][0];
                }

                if (a >= n || b >= m) break;
            }

            if (a >= n || b >= m) continue;

            int other = best[m - 1 - b];

            if (other != Integer.MAX_VALUE) {
                answer = Math.min(answer, a + other);
            }
        }

        return answer < n ? answer : -1;
    }
}