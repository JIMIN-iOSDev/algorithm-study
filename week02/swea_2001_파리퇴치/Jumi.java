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
		
			int N = sc.nextInt();
            int M = sc.nextInt();
            int max = 0;
            
            int[][] n_arr = new int[N][N];
            
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N ; j++) {
                    n_arr[i][j] = sc.nextInt();
                }
            }
            
                
                for(int i = 0; i< N ; i++) {
                    for(int j = 0; j <N;  j++) {
                        int sum = 0;
                        
                        if((i+M-1 < N) &&  (j+M-1 < N)) {
                            for(int k = 0; k< M; k++) { 
                               for(int l = 0; l < M ; l++) {
                                   sum += n_arr[i+k][j+l];
                               }
                            }
                        
                        
                         if( max < sum) {
                             max = sum;
                         }
                    }
                }
                
                
                
                
                
            } 
            
            System.out.printf("#%d %d%n" , test_case, max);
            
            
            
            
            

      
		}
	}
}