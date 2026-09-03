package algo.swea;

import java.util.Scanner;

public class swea1216 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int test = Integer.parseInt(sc.nextLine());
			String[][] list = new String[100][];
			for (int i = 0; i < 100; i++) {
				list[i] = sc.nextLine().split("");
			}
			
			int max = 0;
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 99; j++) {
					StringBuilder org = new StringBuilder();
					StringBuilder org1 = new StringBuilder();
					org.append(list[i][j]);
					org1.append(list[j][i]);
					for (int k = j + 1; k < 100; ++k) {
						org.append(list[i][k]);
						org1.append(list[k][i]);
						if (list[i][j].equals(list[i][k])) {
							String orgs = org.toString();
							String rev = new StringBuilder(org).reverse().toString();
							if (orgs.toString().equals(rev)) {
								max = Math.max(max, org.length());
							}
						}
						if (list[j][i].equals(list[k][i])) {
							String orgs1 = org1.toString();
							String rev1 = new StringBuilder(org1).reverse().toString();
							if (orgs1.toString().equals(rev1)) {
								max = Math.max(max, org1.length());
							}
						}
					}
				}
			}
			System.out.println("#" + test + " " + max);
		}
	}

}
