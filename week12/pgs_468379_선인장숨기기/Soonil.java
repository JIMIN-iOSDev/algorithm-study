class Solution {
    public int[] solution(int m, int n, int h, int w, int[][] drops) {
        int[] answer = {};
        int[][] map = new int[m][n];
        int count = drops.length + 1;
        
        for (int i = 0; i < drops.length; i++){
            map[drops[i][0]][drops[i][1]] = count--;
        }
        
        
        int minI = 0;
        int minJ = 0;
        int minS = Integer.MAX_VALUE;
        
        for (int i = 0; i <= m - h; i++){
            for (int j = 0; j <= n - w; j++) {
                int maxValue = 0;
                for (int k = 0; k < h; k++) {
                    for (int l = 0; l < w; l++){
                        maxValue = Math.max(maxValue, map[i + k][j + l]);
                    }
                }
                if (minS > maxValue){
                    minS = maxValue;
                    minI = i;
                    minJ = j;
                }
            }
        }
        answer = new int[] {minI, minJ};
        return answer;
    }
}
