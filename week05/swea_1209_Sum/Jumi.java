import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            T=sc.nextInt();
            int[][] arr = new int[100][100];
            int sum1 = 0;
            int sum2 = 0;
            int max = 0;
            
            for(int i =0; i<100; i++){
                for(int j =0; j<100; j++){
                    int n = sc.nextInt();
                    arr[i][j] = n;
                }
            }
            
            for(int i =0; i<100; i++) {
                int sum3 = 0;
                int sum4 = 0;
                
                for(int j =0; j<100; j++){
                    sum3 += arr[i][j]; 
                    sum4 += arr[j][i];  
                }
                sum1 += arr[i][i];
                sum2 += arr[i][100-i-1];
                
                 max = Math.max(max, sum3);
                 max = Math.max(max, sum4);     
            }
                max = Math.max(max, sum1);
                max = Math.max(max, sum2);                
           
            System.out.printf("#%d %d%n", T, max);	
		}
	}
}