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
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
            }
            
            for(int i=0; i<N-1; i++){
                for(int j=0; j<N-1; j++){
                    if(arr[j]>arr[j+1]){
                        int tmp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
            System.out.printf("#%d", test_case);
            for(int i=0; i<N; i++){
                System.out.printf(" %d", arr[i]);
            }
            System.out.println();
		}
	}
}