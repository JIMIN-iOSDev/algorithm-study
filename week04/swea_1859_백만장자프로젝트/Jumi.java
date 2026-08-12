import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

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
            int K = sc.nextInt();

		List<Double> total = new ArrayList<>();
            
 
            for(int i = 0 ; i < N ; i++) {
                int mid_s = sc.nextInt();
                int fin_s = sc.nextInt();
                int task_s = sc.nextInt();
                
                total.add(mid_s * 0.35 + fin_s * 0.45 + task_s * 0.2);
            }

    List<Double> sort_total = new ArrayList<>(total);
            
    Collections.sort(sort_total, Collections.reverseOrder());
    String[] arr = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
            
          Map <Double, String> map = new HashMap<>();
            
              for(int j = 0 ; j < arr.length ; j++) {
                  for( int i = 0; i< N/10; i++) {
                    map.put(sort_total.get(j * (N/10) + i), arr[j]);
                                           
              }
          } 
          System.out.printf("#%d %s%n", test_case, map.get(total.get(K-1)));                
		}
	}
}