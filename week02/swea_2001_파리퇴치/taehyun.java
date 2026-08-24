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
            int[][] arr = new int[N][N];
            
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<N-M+1; i++){
                for(int j=0; j<N-M+1; j++){
                    int total = 0;
                    for(int a=0; a<M; a++){
                        for(int b=0; b<M; b++){
                            total = total + arr[i+a][j+b];
                        }
                    }
                    if(max<total){
                        max = total;
                    }
                }
            }
            System.out.printf("#%d %d%n", test_case, max);
		}
	}
}