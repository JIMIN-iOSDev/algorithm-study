    class Solution {
        public int solution(int[] schedules, int[][] timelogs, int startday) {
            int answer = 0;
            for(int i=0; i<schedules.length; i++){
                int cnt = 0;
                for(int j=0; j<7; j++){
                    if((startday + j - 1) % 7 + 1==6 || (startday + j - 1) % 7 + 1==7) continue;
                    int tmp = timelogs[i][j]/100 * 60 + timelogs[i][j]%100 - (schedules[i]/100 * 60 + schedules[i]%100);
                    if(tmp<=10){
                        cnt++;
                    }
                }
                if(cnt==5){
                    answer++;
                }
            }
            return answer;
        }
    }