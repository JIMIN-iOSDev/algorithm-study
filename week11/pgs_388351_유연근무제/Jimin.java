package pgs;

public class Pgs_388351 {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int length = schedules.length;
        int[] chk = new int[schedules.length]; //출근 인정 시각
        int ans = 0;
        
        for (int i = 0; i < length; i++) {
            chk[i] = schedules[i] + 10;
            
            if (chk[i] % 100 > 59) chk[i] += 40; //분이 60이상이면 시각을 1 올려주기
        }
        
        for (int i = 0; i < length; i++) {
            boolean valid = false;
            
            for (int j = 0; j < 7; j++) { //주 7일
                if ((startday + j) % 7 == 6 || (startday + j) % 7== 0) continue; //주말 제외
                if (timelogs[i][j] > chk[i]) { //출근 인정 시각 넘김
                    valid = false;
                    break; 
                }
                valid = true;
            }
            
            if (valid) ans++;
        }
        return ans;
    }
}