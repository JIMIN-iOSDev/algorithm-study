import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
      int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();
            
			int [] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 , 31};
            
            int d1_sum = d1;
            int d2_sum = d2;
            
            for(int i = 0; i< m1-1; i++) {
                d1_sum = d1_sum + day[i];
            }
            
            for(int i = 0; i< m2-1; i++) {
                d2_sum = d2_sum + day[i];
            }         
            int ans = d2_sum - d1_sum + 1 ;
            
            System.out.printf("#%d %d%n", test_case, ans);
		}
	}
}