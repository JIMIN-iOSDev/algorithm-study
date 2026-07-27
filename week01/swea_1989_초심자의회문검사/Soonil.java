import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			System.out.printf("#%d ", test_case);
			boolean isP = true;
			String s = sc.next();
			int len = s.length();
			
			char[] cList = new char[len];
			
			for (int i = 0; i < len; i++) {
				cList[i] = s.charAt(i);
			}
			
			for (int i = 0; i < len / 2; i++) {
				if (cList[i] == cList[len - 1 - i]) {
					continue;
				} else {
					isP = false;
				}
			}
			if (isP) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}