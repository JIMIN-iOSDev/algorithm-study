import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		for(int test_case = 1; test_case < 11; test_case++)
		{
            int N = sc.nextInt();
            int[] arr = new int[101];
            int top = 0;
            int bottom = 0;
            
            for(int i=0; i<100; i++){
                arr[sc.nextInt()]++;
            }
            
            for(int i=0; i<N; i++){
                for(int j=100; j>0; j--){
                    if(arr[j]!=0){
                        arr[j]--;
                        arr[j-1]++;
                        break;
                    }
                }
                for(int j=0; j<100; j++){
                    if(arr[j]!=0){
                        arr[j]--;
                        arr[j+1]++;
                        break;
                    }
                }
            }
             for(int j=100; j>0; j--){
                    if(arr[j]!=0){
                        top = j;
                        break;
                    }
                }
                for(int j=0; j<100; j++){
                    if(arr[j]!=0){
                        bottom = j;
                        break;
                    }
                }
            System.out.printf("#%d %d%n", test_case, top-bottom);
		}
	}
}