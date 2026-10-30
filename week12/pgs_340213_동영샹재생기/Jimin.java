class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {        
        int cur = Integer.parseInt(pos.substring(0, 2)) * 60 + Integer.parseInt(pos.substring(3, 5));
        int start = Integer.parseInt(op_start.substring(0, 2)) * 60 + Integer.parseInt(op_start.substring(3, 5));
        int end = Integer.parseInt(op_end.substring(0, 2)) * 60 + Integer.parseInt(op_end.substring(3, 5));
        int length = Integer.parseInt(video_len.substring(0, 2)) * 60 + Integer.parseInt(video_len.substring(3, 5));
        
        //pos가 op_start ~ op_end 사이인지 확인 -> 사이이면 op_end로 이동
        if (cur >= start && cur <= end) cur = end;
        
        //commands 실행 -> command 끝날 때마다 오프닝 시간 내인지 체크
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("prev")) {
                cur -= 10;
            } else {
                cur += 10;
            }
            
            if (cur < 0) cur = 0; //처음 위치보다 작음
            if (cur > length) cur = length; //마지막 위치보다 큼
            if (cur >= start && cur <= end) cur = end;
        }
        
        return String.format("%02d:%02d", cur / 60, cur % 60);
    }
}
