import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class swea_1974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int[][] arr = new int[9][9];
			boolean valid = true;

			// 배열 만들기
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			// 1~9 한 번씩만 나오는지 set에 넣어서 체크
			for (int i = 0; i < 9; i++) {
				Set<Integer> set = new HashSet<>();
				Set<Integer> set2 = new HashSet<>();

				for (int j = 0; j < 9; j++) {
					set.add(arr[i][j]); // 행 고정, 열 변화
					set2.add(arr[j][i]); // 열 고정, 행 변화
				}

				// 가로, 세로 1~9 체크
				if (set.size() != 9 || set2.size() != 9) {
					System.out.printf("#%d %d%n", tc, 0);
					valid = false;
					break;
				}

				if (!valid) {
					break;
				}
			}

			//가로, 세로가 모두 오케이면
			if (valid) {
				for (int i = 0; i < 9; i += 3) {
					for (int j = 0; j < 9; j += 3) {
						Set<Integer> set = new HashSet<>();

						// 3 x 3 박스 1~9 체크
						for (int k = i; k < i + 3; k++) {
							for (int l = j; l < j + 3; l++) {
								set.add(arr[k][l]);
							}
						}

						if (set.size() != 9) {
							System.out.printf("#%d %d%n", tc, 0);
							valid = false;
							break;
						}
					}
					
					if (!valid) {
						break;
					}
				}
			}

			// 모두 통과
			if (valid) {
				System.out.printf("#%d %d%n", tc, 1);
			}
		}
		sc.close();
	}
}
