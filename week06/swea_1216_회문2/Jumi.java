import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int T;
			T = sc.nextInt();

			int max = 0;
			

			String[][] arr = new String[100][100];
			for (int i = 0; i < 100; i++) {
				String all = sc.next();
				for (int j = 0; j < 100; j++) {
					arr[i][j] = String.valueOf(all.charAt(j));
				}
			}

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					for (int len = 1; j + len <= 100; len++) {
						StringBuilder sb = new StringBuilder();
						for (int k = 0; k < len; k++) {
							sb.append(arr[i][j + k]);
						}

						String str1 = sb.toString();
						String str2 = sb.reverse().toString();
						if (str1.equals(str2)) {
							max = Math.max(max, len);
						}

					}

				}
			}


			for (int i = 0; i < 100; i++) {

				for (int j = 0; j < 100; j++) {
					for (int len = 1; len + j <= 100; len++) {
						StringBuilder sb = new StringBuilder();
						for (int k = 0; k < len; k++) {
							sb.append(arr[j + k][i]);
						}

						String str1 = sb.toString();
						String str2 = sb.reverse().toString();
						if (str1.equals(str2)) {
							max = Math.max(max, len);
						}

					}

				}
			}

			System.out.printf("#%d %d%n", T, max);

		}
	}
}