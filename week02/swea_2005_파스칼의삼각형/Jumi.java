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
            int[][] arr = new int[N][N];
            
            System.out.println("#" + test_case);
            for(int i = 0; i < N; i++) {
                for(int j = 0; j <=  i ; j++) {
                    
                    if ( (j == 0) || ( j == i )) {
                        arr[i][j] = 1;
                        
                    } else {
                        
                        arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                        
                    }
                    System.out.print(arr[i][j] + " ");
                    }
                System.out.println();
                
                    
            }
            
         
            
            
            
		}
	}
}