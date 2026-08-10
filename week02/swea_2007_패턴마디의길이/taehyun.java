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
            String S = sc.next();
            char[] arrC = new char[30];
            int num = 0;
            for(int i=0; i<30; i++){
                arrC[i] = S.charAt(i);
            }
            for(int i=0; i<27; i++){
                for(int j=3; j<30; j++){
                    if(i+j+2<30){
                        if(arrC[i] == arrC[i+j] && arrC[i+1]==arrC[i+j+1] && arrC[i+2] == arrC[i+j+2]){
                            num = j;
                        }
                    }
                }
            }
            System.out.printf("#%d %d%n", test_case, num);
		}
	}
}
