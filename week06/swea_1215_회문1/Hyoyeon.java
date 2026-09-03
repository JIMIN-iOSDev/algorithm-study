package algo_study;

import java.util.Scanner;

public class swea_1215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] pal = new char[8][8];
		for (int i = 1; i <= 10; i++) {
			int cnt = sc.nextInt();
			sc.nextLine(); // 남아있는 엔터 제거
			for (int a = 0; a < 8; a++) {
				String input = sc.nextLine();
				for (int b = 0; b < 8; b++) {
					pal[a][b] = input.charAt(b);
				}
			}

			int chk = 0;
			for (int c = 0; c < 8; c++) {
				for (int d = 0; d < 8-cnt+1; d++) {
					int f;
					for (f = 0; f  < cnt/2 ; f++) {
						if (pal[c][d + f] != pal[c][d + cnt-1 - f]) {
							break;
						}
					}
					if (f == cnt/2) {
						chk++;
					}
					int g;
					for (g = 0; g < cnt/2; g++) {
						if (pal[d + g][c] != pal[d + cnt-1 - g][c]) {
							break;
						}
					}
					if (g ==cnt/2) {
						chk++;
					}

				}
			}
			System.out.println("#" + i + " " + chk);
		}
	}
}
