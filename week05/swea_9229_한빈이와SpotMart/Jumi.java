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
		
			int N = sc.nextInt();
            int M = sc.nextInt();
            int[] w_arr = new int[N];
            
            for (int i = 0; i <N; i++) {
                int w = sc.nextInt();
                w_arr[i] = w;
            }

            Arrays.sort(w_arr);
            
            int left = 0 ;
            int right = w_arr.length -1;
            int sum = 0;
            int max = -1;
            
            while(right > left ) {
                sum = w_arr[left] + w_arr[right];
            
                if (sum > M) {
                    right--;
                } else {
                    max = Math.max(max, sum);
                    left++;     
                    }  
            }
           
           System.out.printf("#%d %d%n", test_case, max);
        }
	}
}