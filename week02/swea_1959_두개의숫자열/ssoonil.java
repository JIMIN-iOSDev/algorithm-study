package practice;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.List;
import java.util.ArrayList;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = 0;
			List<Integer> aList = new ArrayList<>();
			List<Integer> bList = new ArrayList<>();
			for (int i = 0; i < a; i++) {
				aList.add(sc.nextInt());
			}
			for (int i = 0; i < b; i++) {
				bList.add(sc.nextInt());
			}

			if (a > b) {
				int tmp = a;
				a = b;
				b = tmp;
				List<Integer> tmpList = aList;
				aList = bList;
				bList = tmpList;
			}
			int max = 0;
			for (int i = 0; i <= b - a; i++) {
                sum = 0;
				for (int j = 0; j < a ; j++) {
					sum += aList.get(j) * bList.get(i + j);
				}
				max = Math.max(max, sum);
			}
			System.out.println("#" + test_case + " " + max);

		}
	}
}