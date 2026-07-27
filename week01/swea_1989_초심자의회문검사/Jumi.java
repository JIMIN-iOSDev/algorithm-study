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
            
            String var = sc.next();
            
         for (int i = 0 ; i < var.length() / 2 ; i++) {
               	 if (var.substring(i, i+1).equals(var.substring(var.length()-i-1, var.length()-i)))
                 {
                     System.out.printf("#%d %d%n", test_case, 1);
                     break;
                 } else {
                     System.out.printf("#%d %d%n", test_case, 0);
                     break;
                 }
         }
		
			

		}
	}
}