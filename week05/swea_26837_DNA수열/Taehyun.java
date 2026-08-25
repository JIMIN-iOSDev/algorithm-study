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
            String S = sc.next();
            int[] arr = new int[N];
            
            int count = 0;
            
            for(int i=0; i<N; i++){
                int tmp = 0;
                switch (S.charAt(i)){
                    case 'A': tmp = 1;
                        break;
                    case 'T': tmp = 9999;
                        break;
                    case 'G': tmp = 2;
                        break;
                    case 'C': tmp = 9998;
                        break;
                    default:
                        tmp = 0;
                }
                arr[i] = tmp;
            }
                
                for(int i=2; i<=N; i++){
                    int sum = 0;
                    if(i%2==0){
                        for(int j=0; j<i; j++){
                            sum += arr[j];
                        }
                        
                        if(sum%10000==0 && sum/10000==i/2){
                            count++;
                        }
                        
                        for(int j=i; j<N; j++){
                            sum -= arr[j-i];
                            sum += arr[j];
                            if(sum%10000==0 && sum/10000==i/2){
                                count++;
                            }
                        }
                    }
                }
            System.out.println(count);
		}
	}
}