package algo;

import java.util.Scanner;

public class swea1948 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int firstMonth = sc.nextInt();
			int firstDay = sc.nextInt();
			int secondMonth = sc.nextInt();
			int secondDay = sc.nextInt();
			
			int day = 0;
			for (int i = firstMonth; i < secondMonth; i++) {
				day += month[i];
			}
			day = day - firstDay + 1;
			day += secondDay;
			
			System.out.printf("#%d %d%n", test_case, day);

		}
	}

}
