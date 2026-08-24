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
            
      List<Integer> numlist = new ArrayList<>();
       
			for (int i = 0 ; i < 10; i++) {
                int n = sc.nextInt();
                numlist.add(n);
            }
            
            int min = 100000;
            int max = 0;
            double sum= 0;
            long avg = 0;
            
            for (int i = 0; i < 10; i++) {
                if (numlist.get(i) < min) {
                    min = numlist.get(i);
                } 
            }
            
            for (int i = 0; i < 10; i++) {
                if (numlist.get(i) > max) {
                    max = numlist.get(i);
                } 
            }
            
            numlist.remove((Integer) min);
            numlist.remove((Integer) max);
            
            for (int i = 0; i < numlist.size(); i++) {
                sum += numlist.get(i);
            }

            avg = Math.round(sum / numlist.size());
            System.out.printf("#%d %d%n", test_case, avg);
            
		}
	}
}