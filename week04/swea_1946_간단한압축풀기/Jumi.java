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
            int N = sc.nextInt();
            int count = 0;

            System.out.printf("#%d%n" , test_case);
            
            for (int i = 0; i < N; i++) {
                String Ci = sc.next();
                int Ki = sc.nextInt();
                
                for(int j = 0; j < Ki; j++) {
                     System.out.print(Ci);
                    count++;

                    if(count % 10 == 0) {
                      System.out.println();
                    }
                }     
            }
               System.out.println();
		}
	}
}