

import java.util.Scanner;
import java.io.FileInputStream;

public class Hyoyeon {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			String arr = sc.next();
			int result = 1;
			for (int i = 0; i < arr.length() / 2; i++) {

				if (arr.charAt(i) == arr.charAt(arr.length() - 1 - i)) {
					continue;
				} else {
					result = 0;
					break;
				}

			} // for
			System.out.println("#" + test_case + " " + result);
		} // for
	}
}
