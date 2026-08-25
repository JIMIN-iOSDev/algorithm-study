import java.util.*;
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
            String dna = sc.next();
            int cnt = 0;
            
            String[] s_arr = new String[N];
             int[] arr = new int[N];
                   
            for (int j = 0; j < N; j++) {
                 s_arr[j] = dna.substring(j, j+1);
                
                  if (s_arr[j].equals("A")) {
                    arr[j] = 1;
                } else if (s_arr[j].equals("T")) {
                    arr[j] = -1;
                } else if (s_arr[j].equals("C")) {
                    arr[j] = 5000;
                } else {
                    arr[j] = -5000;
                }
            }
                                                  
            for (int w = 2 ; w <=N ; w++ ) {
                  int sum = 0;
                
            	for (int i = 0; i < w; i++) {
                	sum += arr[i];
                }
                
              if (sum == 0) {
                  cnt++;
                }
           	 
              for (int i = w; i < N ; i++) {
                  sum -= arr[i-w];
                  sum+= arr[i];
                        
                  if (sum == 0) {
                    cnt++;
                    }
                }
            }           
           System.out.printf("%d%n", cnt);    
		}
	}
}