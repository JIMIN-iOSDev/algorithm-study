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
            int x = sc.nextInt();
            int y = sc.nextInt();
            int N = sc.nextInt();
            int cnt = 0;
            
            while(true){
                if(x<=y){
                    x += y;
                    cnt++;
                } else if (x>y){
                    y += x;
                    cnt++;
                }
                if(N<x || N<y){
                    break;
                }
            }
            System.out.println(cnt);
		}
	}
}