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
            int K = sc.nextInt();
            int tot_count = 0;
            
            int[][] arr = new int[N][N];
            
            for (int i = 0 ; i < N ; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            
            for(int i = 0; i< N ; i++ ) {
                int count = 0;
                for (int j = 0 ; j < N ; j++) {
                    
                    if (arr[i][j] == 1) {
                        count ++;
                 
                    } else {
                        if (count == K) {
                        tot_count ++;
                        }
                            count = 0;
                        
                    }
                }
                             if (count == K) {
                                tot_count++;
                            }
            }
            
            
                        for(int i = 0; i< N ; i++ ) {
                            int count = 0;
                			for (int j = 0 ; j < N ; j++) {
                    		
                    		if (arr[j][i] == 1) {
                        	count ++;
                 
                   			 } else {
                            	if (count == K) {
                       				 tot_count ++;
                        } 
                                    count = 0;
                                
                    }
                }
                            if (count == K) {
                                tot_count++;
                            }
            }
            
            
            
            System.out.printf("#%d %d%n" , test_case, tot_count);
            
         
            
            
            
		}
	}
}