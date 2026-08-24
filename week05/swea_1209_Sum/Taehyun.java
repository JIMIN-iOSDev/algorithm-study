import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n = sc.nextInt();
            ArrayList<Integer> sums = new ArrayList<>();
            int[][] arr = new int[100][100];
            int sum_xy = 0;
            int sum_yx = 0;
            
            for(int i=0; i<100; i++){
                for(int j=0; j<100; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            
            for(int i=0; i<100; i++){
                int sum_x = 0;
                int sum_y = 0;
                for(int j=0; j<100; j++){
                    sum_x += arr[i][j];
                    sum_y += arr[j][i];
                    if(i==j){
                        sum_xy += arr[i][j];
                    }
                    if(i+j==99){
                        sum_yx += arr[i][j];
                    }
                }
                sums.add(sum_x);
                sums.add(sum_y);
            }
            sums.add(sum_xy);
            sums.add(sum_yx);
            
            System.out.printf("#%d %d%n", test_case, Collections.max(sums));
		}
	}
}