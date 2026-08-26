import java.util.Scanner;
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
            List<Integer> list = new ArrayList<>();
            int N = sc.nextInt();
            int M = sc.nextInt();
            int start_i = 0;
            int end_i = N-1;
            int sum = 0;
            int sum_final = 0;
            
            for(int i=0; i<N; i++){
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            
            while(start_i != end_i){
                sum = list.get(start_i) + list.get(end_i);
                if(sum<=M){
                    if(sum>sum_final){
                        sum_final = sum;
                    }
                }
                if(sum == M){
                    break;
                } 
                else if(sum < M){
                    start_i++;
                }
                else if(sum > M){
                    end_i--;
                }
            }
            if(sum_final==0){
                System.out.printf("#%d %d%n", test_case, -1);
            } else{
                System.out.printf("#%d %d%n", test_case, sum_final);
            }
		}
	}
}