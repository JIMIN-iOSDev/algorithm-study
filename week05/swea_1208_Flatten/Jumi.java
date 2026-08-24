import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=10;
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int dump_count = sc.nextInt();
      int[] arr = new int[100];
                
          for(int i = 0 ; i < 100; i++){
              int height = sc.nextInt();
              arr[i] = height;
             } 

            for(int i = 0; i < dump_count ; i++) {
                int max = 0;
            	  int min = 101;
                int max_idx = 0;
                int min_idx =0;
                
                for(int j = 0; j < 100; j ++) {
                    
                    if(arr[j] > max) {
                        max = arr[j];
                        max_idx = j;
                    } 
                    
                    if(arr[j] < min) {
                        min = arr[j];
                        min_idx = j;
                    }
                } 
                
                  if ( max - min > 1) {
                    arr[max_idx]--;
                    arr[min_idx]++;
                            
                  } else {
                    break;
                }
            }
      int max = 0;
      int min = 101;
            
      for (int j =0 ; j <100; j++) {
            max = Math.max(max, arr[j]);
            min = Math.min(min, arr[j]);
            }
         
     System.out.printf("#%d %d%n", test_case, max-min);
		}
	}
}