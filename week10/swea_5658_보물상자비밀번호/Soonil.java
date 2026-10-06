package a;

class Soonil {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int[][] iList = new int[n % w == 0 ? n / w : n / w + 1][w];
        int cnt = 1;
        for (int i = 0; i < iList.length; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < w; j++) {
                    iList[i][j] = cnt++;
                    if (cnt > n) break;
                }
            } else {
                for (int j = 0; j < w; j++) {
                    iList[i][w - 1 - j] = cnt++;
                    if (cnt > n) break;
                }
            }

        }
        int a = -1;
        int b = -1;
        for (int i = 0; i < iList.length; i++) {
            for (int j = 0; j < iList[i].length; j++) {
                if (iList[i][j] == num) {
                    a = i;
                    b = j;
                }
                if (a >= 0 && b >= 0) {
                    if (i >= a && j == b && iList[i][j] > 0) {
                        answer += 1;
                    }
                }
            }
        }

        return answer;
    }
}