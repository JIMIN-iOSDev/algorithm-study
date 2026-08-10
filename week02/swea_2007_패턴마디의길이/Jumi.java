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
            
            String S = sc.next();
            int ans = 0;
            
            for(int i = 1; i <= 10 ; i++) {
                String same = S.substring(0,i);
                    
                    if (same.equals(S.substring(i , i*2)) && same.equals(S.substring(i*2 , i*3))) {
                        ans = i;
                        break;
                    }
            } 
            
            System.out.printf("#%d %d%n", test_case, ans);
        
       
           


		}
                           
            
	}
}