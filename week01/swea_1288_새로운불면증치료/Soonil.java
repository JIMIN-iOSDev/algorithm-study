import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int count = 0;
            int n = sc.nextInt();
            boolean[] nList = new boolean[10];
            System.out.printf("#%d ",test_case);
            
            while (true) {
                count++;
              	int nn = count * n;
                while (nn > 0) {
                	nList[nn % 10] = true;
                    nn = nn / 10;
                }
                if (nList[0] && nList[1] && nList[2] && nList[3] && nList[4] && nList[5] && nList[6] && nList[7] && nList[8] && nList[9]) break;
                
            }
            System.out.println(n * count);                                                                                                                                                                                        

		}
	}
}