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
			int N = sc.nextInt();
            int[][] arr = new int[N][N];
            int sum = 0;
            
          for(int i = 0; i<N ; i++) {
              String s = sc.next();
                for(int j = 0; j<N; j++) {
                  int n = Integer.parseInt(s.substring(j, j+1));
                  arr[i][j] = n;
                }
            }
            
            for(int i = 0; i < N; i++) {
				int k  = Math.abs(N/2 - i);
                for(int j = k ; j < N - k ; j ++) {
                    sum += arr[i][j];
                               
                }    
            }           
            System.out.printf("#%d %d%n", test_case, sum);		
		}
	}
}