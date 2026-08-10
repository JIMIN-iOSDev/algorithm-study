package SWEA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class swea_1974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			int[][] arr = new int[9][9];
			for (int j = 0; j < 9; j++) {
				for (int h = 0; h < 9; h++) {
					arr[j][h] = sc.nextInt();
				}
			}
			Set<Integer> set1 = new HashSet<>();
			Set<Integer> set2 = new HashSet<>();
			int cnt = 1;
			for (int j = 0; j < 9; j++) {
				for (int h = 0; h < 9; h++) {
					set1.add(arr[j][h]);
					set2.add(arr[h][j]);
				}
				if (set1.size() != 9 || set2.size() != 9) {
					cnt = 0;
					break;
				}
				set1.clear();
				set2.clear();
			}
			Set<Integer> set3 = new HashSet<>();
			Set<Integer> set4 = new HashSet<>();
			Set<Integer> set5 = new HashSet<>();

			for (int j = 0; j < 9; j++) {
				for (int h = 0; h < 9; h++) {
					if (h < 3) {
						set3.add(arr[j][h]);
					} else if (h < 6) {
						set4.add(arr[j][h]);
					} else {
						set5.add(arr[j][h]);
					}
				}
				if (j == 2 || j == 5 || j == 8) {
					if (set3.size() != 9 || set4.size() != 9 || set5.size() != 9) {
						cnt = 0;
						break;
					}
					set3.clear();
					set4.clear();
					set5.clear();
				}
			}
			System.out.println("#" + i + " " + cnt);

		}
	}
}
