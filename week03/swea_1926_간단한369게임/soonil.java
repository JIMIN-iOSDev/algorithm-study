package algo;

import java.util.Scanner;

public class swea1926 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				int tmp = i;
				int cnt = 0;
				while (tmp > 0) {
					if (tmp % 10 == 0) {
						
					}
					else if ((tmp % 10) % 3 == 0) {
						cnt++;
					}
					tmp = tmp / 10;
				}
				if (cnt > 0) {
					for (int j = 0; j < cnt; j++) {
						System.out.print("-");
					}
					System.out.print(" ");
				} else {
					System.out.printf("%d ", i);
				}
			}
			
			

	}


}
