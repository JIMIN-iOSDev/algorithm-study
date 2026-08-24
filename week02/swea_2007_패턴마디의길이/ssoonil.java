package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class swea2007 {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int T;
			T = sc.nextInt();
			/*
			 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
			 */

			for (int test_case = 1; test_case <= T; test_case++) {
				String[] sList = new String[30];
				sList = sc.next().split("");
				////////////////////////////////////////////////////////////////////////////////////////////
				/*
				 * 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
				 */
				////////////////////////////////////////////////////////////////////////////////////////////

				String ans = "";
				String com = "";
				for (int i = 0; i < 30; i++) {
					ans += sList[i];
					com = "";
					for (int j = i + 1; j < i + 1 + ans.length(); j++) {

						com += sList[j];
					}
					if (ans.equals(com)) {
						System.out.printf("$%d %d%n", test_case, i + 1);
						break;
					}
				}

			}
		}
}
