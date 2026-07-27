package d2;

import java.util.Scanner;

class Jimin
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();
            int B = 0;
            
            if(W > R) {
             P *= W;
             B = Q + (W - R) * S;   
            } else {
             P *= W;
             B = Q;   
            }
            
            if(P >= B) {
             System.out.println("#" + test_case + " " + B);   
            } else {
             System.out.println("#" + test_case + " " + P);   
            }
		}
	}
}
