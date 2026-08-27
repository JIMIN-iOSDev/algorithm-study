package algo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class swea9229 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */

		for (int test_case = 1; test_case <= T; test_case++) {


			int n = sc.nextInt();
			int w = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}
			int sIdx = 0;
			int eIdx = n - 1;
			int max = 0;
			list.sort(Comparator.naturalOrder());
			
			while (sIdx < eIdx) {
				int a = list.get(sIdx);
				int b = list.get(eIdx);
				if (a + b < w) {
					max = Math.max(a + b, max);
					sIdx += 1;
				}
				else if(a + b > w) {
					eIdx -= 1;
				}
				else {
					max = a + b;
					break;
				}
			}
			System.out.println("#" + test_case + " " + (max == 0 ? "-1" : max));
		}
	}

}
