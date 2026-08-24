package algo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class swea1974 {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */

		for (int test_case = 1; test_case <= T; test_case++) {
			boolean isValid = true;

			int[][] sudoku = new int[9][9];
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sudoku[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < 9; i++) {
				Set<Integer> set1 = new HashSet<>();
				Set<Integer> set2 = new HashSet<>();

				for (int j = 0; j < 9; j++) {
					set1.add(sudoku[i][j]);
					set2.add(sudoku[j][i]);
				}
				if (set1.size() != 9 || set2.size() != 9) {
					isValid = false;
					break;
				}
			}
			if (isValid) {
				for (int i = 0; i < 9; i += 3) {
					for (int j = 0; j < 9; j += 3) {
						Set<Integer> set3 = new HashSet<>();
						for (int k = 0; k < 3; k++) {
							for (int l = 0; l < 3; l++) {
								set3.add(sudoku[i + k][j + l]);
							}
						}
						if (set3.size() != 9) {
							isValid = false;
							break;
						}
					}
				}
			}
			if (isValid) {
				System.out.println("#" + test_case + " " + 1);
			}else {
				System.out.println("#" + test_case + " " + 0);

			}

		}

	}

}
