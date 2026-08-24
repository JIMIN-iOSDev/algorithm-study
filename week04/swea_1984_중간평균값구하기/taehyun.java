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
            int[] arr = new int[10];
            int sum = 0;
            
            for(int i=0; i<10; i++){
                arr[i] = sc.nextInt();
            }
            
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    if(arr[j] > arr[j+1]){
                        int tmp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
            
            for(int i=1; i<9; i++){
                sum += arr[i];
            }
            double avg = (double)sum/8;
            
            System.out.printf("#%d %d%n", test_case, Math.round(avg));
		}
	}
}