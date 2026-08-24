package d2;

import java.util.Scanner;

public class swea_2007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next();
			
			for (int i = 1; i < str.length(); i++) {
				int count = 0;
				if (str.charAt(i) == str.charAt(0)) {
					for (int j = 0; j < i; j++) {
						if (str.charAt(j) == str.charAt(i + j)) {
							count++;
						} else {
							break;
						}
					}
					if (count == i) {
						System.out.printf("#%d %d%n", test_case, count);
						break;
					}
				}
			}
		}
	}
}
KOKORAKOKORA