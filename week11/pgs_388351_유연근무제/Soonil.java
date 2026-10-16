class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for (int i = 0; i < schedules.length; i++){
            int schedule = schedules[i];
            schedule += 10;
            if (schedule % 100 >= 60) {
                schedule += 40;
            }
            if (schedule > 1200) {
                schedule -= 1200;
            }
            int h = schedule / 100;
            int m = schedule % 100;
            int count = 0;
            int sday = startday;
            for (int j = 0; j < timelogs[i].length; j++) {
                System.out.println(sday);
                int h1 = timelogs[i][j] / 100;
                int m1 = timelogs[i][j] % 100;
                if (sday == 6 || sday == 7) {
                    sday++;
                    if (sday == 8) sday = 1;
                    continue;
                }
                System.out.println(h + ":" + m + " " + h1 + ":" + m1);
                if (h > h1 || (h == h1 && m >= m1)) {
                    System.out.println("dd");
                    count += 1;
                }
                sday++;
                if (sday == 8) {
                    sday = 1;
                }
                
            }
            if (count == 5) {
                answer++;
            }
            
        }
        return answer;
    }
}
