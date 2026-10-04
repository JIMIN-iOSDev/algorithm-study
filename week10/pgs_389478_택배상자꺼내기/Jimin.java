package pgs;

public class Pgs_389478 {
    public int solution(int n, int w, int num) {
        int height = (n + w - 1) / w; //쌓을 높이
        int memory = height;
        int[][] arr = new int[height][w];
        boolean valid = false;
        int i = 1; //담을 숫자 1 ~ n
        
        //2차원 배열에 담기 시작
        if (height % 2 != 0) valid = true;
        
        height--;
        
        //행이 0이 아닌 경우
        while (height >= 0) {
            if (valid) { //전체 높이가 홀수 인덱스일 경우
                if (height % 2 == 0) { //현재 높이가 짝수 인덱스일 경우 -> 방향
                    for (int c = 0; c < w && i <= n; c++) {
                        arr[height][c] = i++;
                    }
                    height--;
                } else { //현재 높이가 홀수 인덱스일 경우 <- 방향
                    for (int c = 0; c < w && i <= n; c++) {
                        arr[height][w - 1 - c] = i++;
                    }
                    height--;
                }                
            } else { //전체 높이가 짝수 인덱스일 경우
                if (height % 2 != 0) { //현재 높이가 홀수 인덱스일 경우 -> 방향
                    for (int c = 0; c < w && i <= n; c++) {
                        arr[height][c] = i++;
                    }
                    height--;
                } else {
                    for (int c = 0; c < w && i <= n; c++) { //현재 높이가 짝수 인덱스일 경우 <- 방향
                        arr[height][w - 1 - c] = i++;
                    }
                    height--;
                }               
            }
        }
        
        //상자 꺼내기 시작
        int idx = 0;
        int idy = 0;
        for (int r = 0; r < memory; r++) {
            for (int c = 0; c < w; c++) {
                if (arr[r][c] == num) {
                    idx = r;
                    idy = c;
                    
                }
            }
        }
        
        //idy와 같은 열, idx와 같거나 작은 행 중에 0이 아닌 것의 개수
        int ans = 0;
        for (int r = idx; r >= 0; r--) {
            if (arr[r][idy] != 0) ans++;
        }
        
        return ans;
    }
}