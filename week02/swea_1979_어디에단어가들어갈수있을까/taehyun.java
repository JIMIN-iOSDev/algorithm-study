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
            int length = sc.nextInt();
            int[][] arr = new int[N][N];
            int count = 0;
            
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            
            for(int i=0; i<N; i++){
                int cnt = 0;
                for(int j=0; j<N; j++){
                    if(arr[i][j]==1){
                        cnt++;
                        if(cnt==length){
                            if((j+1<N&&arr[i][j+1]==0) || j+1==N){
                                count++;
                            }
                        }
                    } else if(arr[i][j]==0){
                        cnt=0;
                    } 
                }
            }
            for(int i=0; i<N; i++){
                int cnt = 0;
                for(int j=0; j<N; j++){
                    if(arr[j][i]==1){
                        cnt++;
                        if(cnt==length){
                            if((j+1<N&&arr[j+1][i]==0) || j+1==N){
                                count++;
                            }
                        }
                    } else if(arr[j][i]==0){
                        cnt=0;
                    } 
                }
            }
            
            System.out.printf("#%d %d%n", test_case, count);
		}
	}
}