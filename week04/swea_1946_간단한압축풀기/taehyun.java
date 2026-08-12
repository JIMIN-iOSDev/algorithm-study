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
            int N = sc.nextInt();
            String[] s = new String[N];
            int[] num = new int[N];
            int sum = 0;
            int tmp = 0;
            
            for(int i=0; i<N; i++){
                s[i] = sc.next();
                num[i] = sc.nextInt();
            }
            
            for(int i=0; i<N; i++){
                sum += num[i];
            }
            
            String[] S = new String[sum];
            
            for(int i=0; i<N; i++){
                if(i>=1){
                    tmp = tmp + num[i-1];
                }
                for(int j=tmp; j<tmp+num[i]; j++){
                    S[j] = s[i];
                }
            }
            for(int i=0; i<S.length; i++){
                System.out.printf("%s", S[i]);
                if((i+1)%10==0){
                    System.out.println();
                }
            }
            System.out.println();
		}
	}
}