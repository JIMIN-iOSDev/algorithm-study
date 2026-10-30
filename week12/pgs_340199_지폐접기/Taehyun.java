class Solution {
    public int solution(int[] wallet, int[] bill) {
        int cnt = 0;

        while (true) {
            if ((wallet[0] >= bill[0] && wallet[1] >= bill[1]) ||
                (wallet[0] >= bill[1] && wallet[1] >= bill[0])) {
                break;
            }

            if (bill[1] > bill[0]) {
                bill[1] /= 2;
            } else {
                bill[0] /= 2;
            }

            cnt++;
        }

        return cnt;
    }
}