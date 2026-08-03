package d2;

import java.util.Scanner;

public class swea_1948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int result = 0;
			
			for (int i = 0; i < 4; i++) {
				int m1 = sc.nextInt();
				int d1 = sc.nextInt();
				int m2 = sc.nextInt();
				int d2 = sc.nextInt();
				int[] arr = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				
				if (m1 == m2) {
					result = d2 - d1 + 1;
					break;
				} else {
					for (int j = m1; j <= m2; j++) {
						if (j == m1) {
							result = arr[j - 1] - d1 + 1;
						} 
						if (j == m2) {
							result += d2;
							break;
						}
						if (j != m1 && j != m2) {
							result += arr[j - 1];
						}
					}
					break;
				}
			}
			
			System.out.printf("#%d %d%n", test_case, result);
		}
	}
}
