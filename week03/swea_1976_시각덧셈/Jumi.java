import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt(); 
            int ah = 0;
            int am =0;
            
            if ( h1 + h2 > 12 ) {
                ah = h1 + h2 - 12;
            } else {
                ah = h1 + h2;
            } 

            if ( m1 + m2 < 60 ) {
                am = m1 + m2;
            } else {
                ah++;
                am = m1 + m2 -60;
            }

            System.out.printf("#%d %d %d%n" , test_case, ah, am);
		}
	}
}