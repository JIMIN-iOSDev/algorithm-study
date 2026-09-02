

import java.util.Scanner;

public class Hyoyeon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] pal = new char[100][100];
		for (int i = 1; i <= 10; i++) {
			int cnt = sc.nextInt();
			sc.nextLine(); // 남아있는 엔터 제거
			for (int a = 0; a < 100; a++) {
				String input = sc.nextLine();
				for (int b = 0; b < 100; b++) {
					pal[a][b] = input.charAt(b);
				}
			}

			int max = 0;
			for (int c = 0; c < 100; c++) {
				for (int d = 0; d < 100; d++) {
					// 슬라이딩윈도우 크기

					for (int e = 0; e + d <=100; e++) {
						int chk = 0;
						int chk1 = 0;
						int f;
						for (f = 0; f < e / 2; f++) {
							if (pal[c][d + f] != pal[c][d + e - 1 - f]) {
								break;
							}
							
						}
						int g;
						for (g = 0; g < e / 2; g++) {
							if (pal[d + g][c] != pal[d + e - 1 - g][c]) {
								break;
							}
						}
						if (f == e / 2 || g == e / 2) {
							max = Math.max(max,e);
						}

					}
				}
			}
			System.out.println("#" + cnt + " " + max);
		}
	}
}
