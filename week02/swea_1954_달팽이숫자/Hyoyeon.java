package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class swea_1954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			int cnt = sc.nextInt();
			System.out.println("#" + i);
			int[][] arr = new int[cnt][cnt];
			int num = 1;
			int a = 0;
			int b = cnt - 1;
			while (num <= cnt * cnt) {
				for (int j = a; j <= b; j++) {
					arr[a][j] = num;
					num++;
				}

				for (int j = a + 1; j <= b; j++) {
					arr[j][b] = num;
					num++;
				}

				for (int j = b - 1; j >= a; j--) {
					arr[b][j] = num;
					num++;
				}

				for (int j = b - 1; j > a; j--) {
					arr[j][a] = num;
					num++;
				}
				a++;
				b--;
			}
			for (int c = 0; c < cnt; c++) {
				for (int d = 0; d < cnt; d++) {
					System.out.print(arr[c][d] + " ");
				}
				System.out.println();
			}

		}
	}
}
