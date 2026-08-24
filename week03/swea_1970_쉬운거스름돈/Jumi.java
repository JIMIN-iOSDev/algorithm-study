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
		
			int money = sc.nextInt();
            int[] m_arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
            
                       
          System.out.println("#"+test_case);
                for(int i = 0; i < m_arr.length; i++){
                    int a = money / m_arr[i] ;
                    money = money % m_arr[i] ;
                    System.out.print(a+ " ");
           }
            System.out.println();
          

		}
	}
}