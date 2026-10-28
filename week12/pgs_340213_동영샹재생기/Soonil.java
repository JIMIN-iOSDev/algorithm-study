class Soonil {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        int lenI = toSec(video_len);
        int posI = toSec(pos);
        int startI = toSec(op_start);
        int endI = toSec(op_end);
        for (String s : commands) {
            if (posI >= startI && posI < endI) {
                posI = endI;
            }
            if (s.equals("prev")){
                if (posI < 10) {
                    posI = 0;
                    continue;
                }
                posI -= 10;
            } else if (s.equals("next")){
                if (posI > lenI - 10){
                    posI = lenI;
                    continue;
                }
                posI += 10;
            }
        }
        if (posI >= startI && posI < endI) {
            posI = endI;
        }
        int h = posI / 60;
        int m = posI % 60;
        String hh = null;
        if (h == 0){
            hh = "00";
        } else if (h < 10){
            hh = "0" + Integer.toString(h);
        } else {
            hh = Integer.toString(h);
        }
        String mm = null;
        if (m == 0){
            mm = "00";
        } else if (m < 10){
            mm = "0" + Integer.toString(m);
        } else {
            mm = Integer.toString(m);
        }
        answer = hh + ":" + mm;

        return answer;
    }
    public int toSec(String time){
        String[] tList = time.split(":");
        int sec = 0;
        sec += Integer.parseInt(tList[0]) * 60 + Integer.parseInt(tList[1]);

        return sec;
    }
}