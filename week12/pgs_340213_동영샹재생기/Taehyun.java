class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {

        String[] arr_v = video_len.split(":");
        int a = Integer.parseInt(arr_v[0]);
        int b = Integer.parseInt(arr_v[1]);

        String[] arr_oe = op_end.split(":");
        int c = Integer.parseInt(arr_oe[0]);
        int d = Integer.parseInt(arr_oe[1]);

        String[] arr_p = pos.split(":");
        int e = Integer.parseInt(arr_p[0]);
        int f = Integer.parseInt(arr_p[1]);

        String[] arr_os = op_start.split(":");
        int g = Integer.parseInt(arr_os[0]);
        int h = Integer.parseInt(arr_os[1]);

        int video_len_min = a * 60 + b;
        int op_end_min = c * 60 + d;
        int pos_min = e * 60 + f;
        int op_start_min = g * 60 + h;

        for (int i = 0; i < commands.length; i++) {
            
            if (pos_min >= op_start_min && pos_min <= op_end_min) {
                pos_min = op_end_min;
            }

            if (commands[i].equals("next")) {
                if (pos_min + 10 > video_len_min) {
                    pos_min = video_len_min;
                } else {
                    pos_min += 10;
                }
            } else {
                if (pos_min - 10 < 0) {
                    pos_min = 0;
                } else {
                    pos_min -= 10;
                }
            }

            if (pos_min >= op_start_min && pos_min <= op_end_min) {
                pos_min = op_end_min;
            }
        }

        String answer = String.format("%02d:%02d", pos_min / 60, pos_min % 60);

        return answer;
    }
}