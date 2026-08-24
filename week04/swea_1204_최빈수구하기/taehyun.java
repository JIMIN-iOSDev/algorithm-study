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
            int n = sc.nextInt();
            int[] arr = new int[1000];
            int[] score = new int[1000];
            int max = 0;
            int index = 0;
            
            for(int i=0; i<1000; i++){
                arr[i] = sc.nextInt();
                score[i] = 0;
            }
            
            for(int i=0; i<999; i++){
                for(int j=0; j<999; j++){
                    if(arr[j]<arr[j+1]){
                        int tmp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
            
            for(int i=0; i<1000; i++){
                int cnt = 0;
                for(int j=0; j<1000; j++){
                    if(arr[i] == arr[j]){
                        cnt++;
                    }
                }
                score[i] = cnt;
            }
            for(int i=0; i<1000; i++){
                if(max<score[i]){
                    max = score[i];
                }
            }
            for(int i=0; i<1000; i++){
                if(max==score[i]){
                    index = i;
                    break;
                }
            }
            System.out.printf("#%d %d%n", n, arr[index]);
		}
	}
}