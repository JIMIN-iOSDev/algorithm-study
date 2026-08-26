

import java.util.Scanner;

public class Hyoyeon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int cnt = sc.nextInt();
			String s = sc.next();
			int chk = 0;

			for (int w = 0; w < s.length(); w++) {
				int at = 0;
				int cg = 0;
				for (int k = w; k < s.length(); k++) {
					// 체크 기준 : A,T 와 C,G의 개수가 같은지
					if (s.charAt(k) == 'A') {
						at++;
					} else if (s.charAt(k) == 'T') {
						at--;
					} else if (s.charAt(k) == 'C') {
						cg++;
					} else if (s.charAt(k) == 'G') {
						cg--;
					}
					// 반전관계에 있다면 chk++;
					if (at == 0 && cg == 0) {
						chk++;
					}

				}
			}
			System.out.println(chk);
		}
	}
}
