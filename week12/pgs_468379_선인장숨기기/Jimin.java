//테스트 13-17 시간초과 해결 못함

import java.util.Arrays;

class Solution {
    public int[] solution(int m, int n, int h, int w, int[][] drops) {
        int[][] map = new int[m][n];
        for (int[] row: map) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        //drops의 좌표에 drops의 인덱스 값 저장
        for (int i = 0; i < drops.length; i++) {
            map[drops[i][0]][drops[i][1]] = i + 1;
        }
        
        int[][] rowMin = new int[m][n - w + 1];
        for (int i = 0; i < m; i++) {
            for (int c = 0; c <= n - w; c++) {
                int local = Integer.MAX_VALUE;
                for (int j = c; j < c + w; j++) {
                    local = Math.min(local, map[i][j]);
                }
                rowMin[i][c] = local;
            }
        }
        
        //전체 좌표를 h * w 사이즈로 훑으면서 그 크기안에 가장 작은 값이 현재 가장 늦게 내리는 비보다 크면 max 변경 -> 해당 영역의 가장 작은 행, 그 중 가장 작은 열 저장
        int max = 0;
        int idx = -1;
        int idy = -1;        
        for (int r = 0; r <= m - h; r++) {
            for (int c = 0; c <= n - w; c++) {
                int local = Integer.MAX_VALUE;
                for (int i = r; i < r + h; i++) {
                    local = Math.min(local, rowMin[i][c]);
                    if (local <= max) break; //local은 계속 감소 -> max보다 작아지는 순간 무의미
                }
                if (local > max) {
                    max = local;
                    idx = r;
                    idy = c;
                }
            }
        }
        
        return new int[] {idx, idy};
    }
}
