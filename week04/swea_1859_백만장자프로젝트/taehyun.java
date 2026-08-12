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
            int[] arr = new int[N];
            long sum = 0;
            int index = 0;
            int index_before = 0;
            
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
            }
            
            while(index_before<N){
                int max = 0;
                for(int i=index_before; i<N; i++){
                    if(max<=arr[i]){
                        max = arr[i];
                        index = i;
                    }
                }
                for(int i=index_before; i<index; i++){
                    sum = sum + arr[index] - arr[i];
                }
                index_before = index+1;
            }
            System.out.printf("#%d %d%n", test_case, sum);
		}
	}
}