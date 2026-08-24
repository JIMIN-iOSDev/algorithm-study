package d2;

import java.util.ArrayList;
import java.util.Scanner;

public class swea_1859 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			long sum = 0;
			// 나보다 뒤에 제일 큰 날에 팔면 이득
			// 뒤부터 최고가를 파악하면 나보다 앞에가 최고가면 안삼. 내가 최고가면 앞에 사고 값 비교. 새롭게 최고값 나오면 변경
			for (int i = 1; i <= N; i++) {
				int input = sc.nextInt();
				list.add(input);
			}
			int max = list.get(list.size() - 1);
			for (int j = list.size() - 1; j >= 0; j--) {
				if (max > list.get(j)) {
					sum += max - list.get(j);
				} else {
					max = list.get(j);
				}
			}
			System.out.println("#" + test_case + " " + sum);
		}
	}
}