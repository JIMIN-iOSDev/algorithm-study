class Solution {
    public int solution(int[][] info, int n, int m) {
        int result = Integer.MAX_VALUE;
        int anum = 0;
        int bnum = 0;

    for (int i = 0; i < (1 << info.length); i++) {
        anum = 0;
        bnum = 0;

        for (int j = 0; j < info.length; j++) {
            if ((i & (1 << j)) != 0) {
                anum += info[j][0];
            } else {
                bnum += info[j][1];
            }

            if (anum >= n || bnum >= m) {
                break;
            }
        }

        if (anum < n && bnum < m) {
            result = Math.min(result, anum);
        }
    }

    return result == Integer.MAX_VALUE ? -1 : result;
}
}