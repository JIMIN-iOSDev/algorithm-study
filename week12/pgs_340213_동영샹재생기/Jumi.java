class Solution {
	public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
		int mm_p = Integer.parseInt(pos.substring(0, 2));
		int ss_p = Integer.parseInt(pos.substring(3, 5));
		int mm_s = Integer.parseInt(op_start.substring(0, 2));
		int ss_s = Integer.parseInt(op_start.substring(3, 5));
		int mm_e = Integer.parseInt(op_end.substring(0, 2));
		int ss_e = Integer.parseInt(op_end.substring(3, 5));
		int mm_v = Integer.parseInt(video_len.substring(0, 2));
		int ss_v = Integer.parseInt(video_len.substring(3, 5));
		int video = mm_v * 60 + ss_v;
		int start = mm_s * 60 + ss_s;
		int end = mm_e * 60 + ss_e;

		for (int i = 0; i < commands.length; i++) {
			int pos_l = mm_p * 60 + ss_p;
			if (pos_l <= end && pos_l >= start) {
				mm_p = mm_e;
				ss_p = ss_e;
			}
			if (commands[i].equals("prev")) {
				ss_p -= 10;
				if (ss_p < 0) {
					mm_p -= 1;
					ss_p += 60;
				}

				if (mm_p < 0) {
					mm_p = 0;
					ss_p = 0;
				}

			} else if (commands[i].equals("next")) {

				ss_p += 10;
				if (ss_p >= 60) {
					mm_p += 1;
					ss_p -= 60;
				}
				pos_l = mm_p * 60 + ss_p;

				if (pos_l > video) {
					mm_p = mm_v;
					ss_p = ss_v;
				}

			}

			pos_l = mm_p * 60 + ss_p;
			if (pos_l <= end && pos_l >= start) {
				mm_p = mm_e;
				ss_p = ss_e;
			}

		}

		String str_mm = String.format("%02d", mm_p);
		String str_ss = String.format("%02d", ss_p);
		String answer = str_mm + ":" + str_ss;
		return answer;

	}

}