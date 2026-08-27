package algo;

import java.util.Scanner;

public class swea5604 {

	static int[] g;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */

		g = new int[10];
		for (int i = 1; i < 10; i++) {
			g[i] = g[i - 1] + i;
		}

		for (int test_case = 1; test_case <= T; test_case++) {

			long a = sc.nextLong();
			long b = sc.nextLong();
			System.out.println("#" + test_case + " " + (cal(b) - cal(a - 1)));
		}
	}

	public static long cal(long num) {
		long sum = 0;
		long cnt = 1;
		long lower = 0;
		
		while(num > 0) {
			
			int cur = (int) (num % 10);
			long higher = num / 10;
			
			sum += cnt * higher * g[9];
			
			if (cur > 0) {
				sum += cnt * g[cur - 1];
			}
			sum += cur * (lower + 1);
			
			lower += cur * cnt;
			
			num /= 10;
			cnt *= 10;
		}
		
		
		return sum;
	}
//	public static int cal(long num) {
//		int sum = 0;
//		int cnt = 1;
//		System.out.println("num : " + num);
//		while (num > 0) {
//			
//			
//			sum += g[(int)(num % 10)];
//			sum += cnt * (num / 10) * g[9];
//			sum += (num % 10 - 1) * ((num / 10) % 10);
//			for (int i = 1; i < (num / 10) % 10; i++) {
//				sum += i * 10;
//			}
//			num /= 10;
//			cnt *= 10;
//			
//			
//			System.out.println("midSum : " + sum);
//			
//		}
//		System.out.println("sum : " + sum);
//		return sum;
//	}

}
