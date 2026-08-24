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
            int A = sc.nextInt();
            int B = sc.nextInt();
            int[] arrA = new int[A];
            int[] arrB = new int[B];
            int max = 0;
            for(int i=0; i<A; i++){
                arrA[i] = sc.nextInt();
            }
            for(int i=0; i<B; i++){
                arrB[i] = sc.nextInt();
            }
            if(A<=B){
                for(int i=0; i<(B-A)+1; i++){
                    int total = 0;
                    for(int j=0; j<A; j++){
                        total = total + arrA[j] * arrB[j+i];
                    }
                    if(max<total){
                        max = total;
                    }
                }
            }
            if(A>B){
                for(int i=0; i<(A-B)+1; i++){
                    int total = 0;
                    for(int j=0; j<B; j++){
                        total = total + arrB[j] * arrA[j+i];
                    }
                    if(max<total){
                        max = total;
                    }
                }
            }
            System.out.printf("#%d %d%n", test_case, max);
		}
	}
}