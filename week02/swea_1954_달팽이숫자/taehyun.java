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
            int num = 2;
            int[][] arr = new int[N][N];
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    arr[i][j] = 0;
                }
            }
            int i=0;
            int j=0;
            arr[i][j] = 1;
            while(num<=N*N){
                while(true){
                    j++;
                    if(j==N){
                        j--;
                        break;
                    }
                    else if(j<N && arr[i][j]!=0){
                        j--;
                        break;
                    }
                    arr[i][j] = num++;
                }
                while(true){
                    i++;
                    if(i==N){
                        i--;
                        break;
                    }
                    else if(i<N && arr[i][j]!=0){
                        i--;
                        break;
                    }
                    arr[i][j] = num++;
                }
                while(true){
                    j--;
                    if(j==-1){
                        j++;
                        break;
                    }
                    else if(j>=0 && arr[i][j]!=0){
                        j++;
                        break;
                    }
                    arr[i][j] = num++;
                }
                while(true){
                    i--;
                    if(i==-1){
                        i++;
                        break;
                    }
                    else if(i>=0 && arr[i][j]!=0){
                        i++;
                        break;
                    }
                    arr[i][j] = num++;
                }
            }
            System.out.printf("#%d%n", test_case);
            for(int x=0; x<N; x++){
                for(int y=0; y<N; y++){
                    System.out.printf("%d ", arr[x][y]);
                }
                System.out.println();
            }
		}
	}
}