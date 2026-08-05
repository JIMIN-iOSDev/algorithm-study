import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
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
            System.out.printf("#%d%n", test_case);
            int[][] arr = new int[N][N];
            
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    arr[i][j] = 1;
                }
            }
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(i>=2 && j>=1 && j<i){
                        arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    }
                }
            }
            
            for(int i=0; i<N; i++){
                for(int j=0; j<=i; j++){
                    System.out.printf("%d ", arr[i][j]);
                }
                System.out.println();
            }
		}
	}
}