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
            int start_month = sc.nextInt();
            int start_day = sc.nextInt();
            int end_month = sc.nextInt();
            int end_day = sc.nextInt();
            int days = 0;
            int[] arr = new int[12];
            
            if(start_month == end_month){
                days = end_day - start_day + 1;
            } else {
                for(int i=0; i<end_month - start_month; i++ ){
                    arr[i] = start_month + i;
                }
                
                for(int i=0; i<end_month - start_month; i++ ){
                    switch(arr[i]){
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            days = days +31;
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            days = days +30;
                            break;
                        case 2:
                            days = days +28;
                    }
                }
                days = days + end_day - start_day +1;
            }
            System.out.printf("#%d %d%n", test_case, days);
		}
	}
}