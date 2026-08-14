
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.FileInputStream;

public class Hyoyeon {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			int num = sc.nextInt();
			int a = num;
			int cnt = 0;
			Set<Integer> set = new HashSet();
			while (set.size() != 10) {
				cnt += 1;
				num = a;
				num *= cnt;
				while (num != 0) {
					if (num < 10) {
						set.add(num);
					}
					set.add(num % 10);
					num /= 10;
				}

			}
			System.out.println("#" + test_case + " " + a * cnt);

		}
	}
}
