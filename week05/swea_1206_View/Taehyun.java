import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		for(int test_case = 1; test_case<11; test_case++)
		{
            int N = sc.nextInt();
            int[] arr = new int[N];
            int cnt = 0;
            
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
            }
            
            for(int i=2; i<N-2; i++){
                int max = 0;
                for(int j=-2; j<=2; j++){
                    if(j!=0){
                        if(arr[i+j]>max){
                            max = arr[i+j];
                        }
                    }
                }
                if(arr[i]>max){
                    cnt = cnt + arr[i] - max;
                }
            }
            System.out.printf("#%d %d%n", test_case, cnt);
		}
	}
}