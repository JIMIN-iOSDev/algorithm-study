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
            int money = sc.nextInt();
            int[] arr = new int[]{0,0,0,0,0,0,0,0};
            
            while(money/50000>0){
                money = money -50000;
                arr[0]++;
            }
            while(money/10000>0){
                money = money -10000;
                arr[1]++;
            }
            while(money/5000>0){
                money = money -5000;
                arr[2]++;
            }
            while(money/1000>0){
                money = money -1000;
                arr[3]++;
            }
            while(money/500>0){
                money = money -500;
                arr[4]++;
            } 
            while(money/100>0){
                money = money -100;
                arr[5]++;
            }
            while(money/50>0){
                money = money -50;
                arr[6]++;
            }
            while(money/10>0){
                money = money -10;
                arr[7]++;
            }
            System.out.printf("#%d%n", test_case);
            for(int i=0; i<8; i++){
                System.out.printf("%d ", arr[i]);
            }
            System.out.println();
		}
	}
}