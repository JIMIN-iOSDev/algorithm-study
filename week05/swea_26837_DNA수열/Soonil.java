package algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class swea26837 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		Map<Character, Integer> map = new HashMap<>();

		map.put('A', 1);
		map.put('T', -1);
		map.put('G', 10000);
		map.put('C', -10000);
		
		

		for (int test_case = 1; test_case <= T; test_case++) {

			int n = sc.nextInt();
			String str = sc.next();
			int count = 0;

			for (int i = 2; i <= n + 1; i += 2) {
				int sum = 0;
				for (int j = 0; j < n; j++) {
					sum += map.get(str.charAt(j));
					
					if (j < i - 1) continue;
					
					if (j >= i) sum -= map.get(str.charAt(j - i));
					if (sum == 0) {
						count++;
					}
					
				}
			}
			System.out.println(count);
		}
	}

}
