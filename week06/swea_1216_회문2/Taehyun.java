import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            T=sc.nextInt();
            char[][] arr = new char[100][100];
            int chk_x= 0;
            int chk_y=0;
            int max = 0;
            
            for(int i=0; i<100; i++){
                String tmp = sc.next();
                for(int j=0; j<100; j++){
                    arr[i][j] = tmp.charAt(j);
                }
            }
            
            for(int i=0; i<100; i++){
                for(int j=100; j>0; j--){
                    for(int a=0; a<=100-j; a++){
                        chk_x=1;
                        chk_y=1;
                        int start = a;
                        int end = a+j-1;
                        while(start < end){
                            if(arr[i][start]!=arr[i][end]){
                                chk_x =0;
                            }
                            if(arr[start][i]!=arr[end][i]){
                                chk_y =0;
                            }
                            start++;
                            end--;
                        }
                        if((chk_x==1 || chk_y==1)&& max<j){
                            max = j;
                        }
                    }
                }
            }
            System.out.printf("#%d %d%n", T, max);
		}
	}
}