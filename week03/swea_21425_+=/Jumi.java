import java.io.FileInputStream;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            long A = sc.nextLong();
            long B = sc.nextLong();
            long N = sc.nextLong();
            int count = 0;
            long sum = 0;

       while ( A <= N && B <= N )  {   
            if ( A > B ) {
                B += A;
            } else {
                A += B;
            }
           count++;
       }          
           System.out.println(count);
		}
	}
}