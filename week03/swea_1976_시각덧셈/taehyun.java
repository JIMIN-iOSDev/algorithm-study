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
            int start_t = sc.nextInt();
            int start_m = sc.nextInt();
            int end_t = sc.nextInt();
            int end_m = sc.nextInt();
            int last_t = 0;
            int last_m = 0;
            
            if(start_m+end_m>=60){
                last_t = last_t + 1;
                last_m = start_m + end_m - 60;
            } else{
                last_m = start_m + end_m;
            }
            
            if(start_t+end_t+last_t>12){
                last_t = last_t + start_t + end_t - 12;
            } else{
                last_t = last_t + start_t +end_t;
            }
            
            System.out.printf("#%d %d %d%n", test_case, last_t, last_m);
            
		}
	}
}