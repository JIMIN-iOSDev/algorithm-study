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
            int[][] n_arr = new int[N][N];
            int[][] ans_arr1 = new int[N][N];
            int[][] ans_arr2 = new int[N][N];
            int[][] ans_arr3 = new int[N][N];
            
            for (int i = 0; i < N; i++){
                for(int j =0 ;j < N ; j++) {
                    
                    n_arr[i][j] = sc.nextInt();
                } 
            }
            
            for( int i = 0 ; i < N ; i++) {
                for(int j =0; j < N ; j++) {
                    
                    ans_arr1[i][j] = n_arr[N-j-1][i];
                    ans_arr2[i][j] = n_arr[N-i-1][N-j-1];
                    ans_arr3[i][j] = n_arr[j][N-i-1];
                }
            }
            
            System.out.println("#" + test_case);
            for (int i = 0; i < N ; i++) {
                for(int j = 0; j < N; j++) {
                    System.out.print(ans_arr1[i][j]);
                }
                System.out.print(" ");
                for(int j = 0; j < N; j++) {
                    System.out.print(ans_arr2[i][j]);
                } 
                System.out.print(" ");
                for(int j = 0; j < N; j++) {
                    System.out.print(ans_arr3[i][j]);
                }    
                System.out.println();
            }
            
            
            
      
            
            
			
			
	}
}
}
