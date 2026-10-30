class 동영상재생기_340213 {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        String[] temp = pos.split(":");
        int time = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);

        temp = video_len.split(":");
        int video = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);

        temp = op_start.split(":");
        int start = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);

        temp = op_end.split(":");
        int end = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);

        for (int i = 0; i < commands.length; i++) {
            if (start <= time && time <= end) {
                    time = end;
                }
            if (commands[i].equals("next")) {
                if ((time + 10) > video) {
                    time = video;
                } else {
                    time = time + 10;
                }
            } else if (commands[i].equals("prev")) {
                if ((time - 10) < 0) {
                    time = 0;
                } else {
                    time = time - 10;
                }
            } 
            
        }
        if (start <= time && time <= end) {
                    time = end;
                }
        answer = String.format("%02d:%02d", time / 60, time % 60);
        return answer;
    }
}