class Solution {
    public int[] solution(int m, int n, int h, int w, int[][] drops) {
        int[][] arr = new int[m][n];
        int max = -1;
        int[] answer = new int[2];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = drops.length + 1;;
            }
        }
        
        for(int i=0; i<drops.length; i++){
            arr[drops[i][0]][drops[i][1]] = i + 1;
        }
        
        for(int i=0; i<=m-h; i++){
            for(int j=0; j<=n-w; j++){
                int cnt = drops.length + 1;
                for(int a=0; a<h; a++){
                    for(int b=0; b<w; b++){
                        if (arr[i + a][j + b] < cnt) {
                            cnt = arr[i + a][j + b];
                        }
                    }
                }
                if (cnt > max) {
                    max = cnt;
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        return answer;
    }
}