import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int T=10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int N = sc.nextInt();
            int[] builds = new int[N];
            int sum = 0;
            int max;
            int max_other;
            
            for(int i = 0; i < N; i++) {
                int building = sc.nextInt();
               builds[i] = building;
            }
            
            for(int i =2; i < N-2 ; i++) {
                max = Math.max(builds[i-2], builds[i-1]);
                max = Math.max(max , builds[i]);
                max = Math.max(max , builds[i+1]);
                max = Math.max(max , builds[i+2]);
                
                if(max == builds[i]) {
                    max_other = Math.max(builds[i-2], builds[i-1]);
                    max_other = Math.max(max_other, builds[i+1]);
                    max_other = Math.max(max_other, builds[i+2]);

                    sum += max - max_other;
                }
            }
            System.out.printf("#%d %d%n", test_case, sum);
		}
	}
}