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
		
			int tn = sc.nextInt();
            int[] count = new int[101];
            int count_max = 0;
            int score_max = 0;
          
            for (int i = 0; i < 1000; i++) {
                int s = sc.nextInt();
                count[s]++;
            }
            
            for(int i = 0; i<101; i++) {
                  if (count_max <= count[i] ) {
                      count_max = count[i];
                      score_max = i;   
                    }
            }
            System.out.printf("#%d %d%n", tn , score_max);
		}
	}
}