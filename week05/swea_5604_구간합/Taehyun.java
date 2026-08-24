/*

제한시간 초과로 실패.

*/
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
            long A = sc.nextLong();
            long B = sc.nextLong();
            long ans = 0;
            long sum = 0;
            Map<Long, Long> arr = new HashMap<>();
            
            for(long i=0; i<=B; i++){
                long tmp = 0;
                long i_new = i;
                while(i_new>0){
                    tmp =  tmp + i_new%10;
                    i_new=i_new/10;
                }
                sum += tmp;
                arr.put(i, sum);
            }
            if(A>=1){
                ans = arr.get(B) - arr.get(A-1);
            } else{
                ans = arr.get(B);
            }
            System.out.printf("#%d %d%n", test_case, ans);

		}
	}
}