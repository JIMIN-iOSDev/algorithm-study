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
            int[][] arr = new int[9][9];
            int m = 1;
            
            for (int i = 0; i < 9; i++) {              
                for(int j = 0 ; j < 9; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            
           
            for(int i = 0 ; i < 9 ; i++ ) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
                for(int j = 0; j < 9 ; j++) {
                    set1.add(arr[i][j]);
                    set2.add(arr[j][i]);
                    
                }
                if (set1.size() < 9 || set2.size() < 9) {
                    m = 0;
                    break;
            }
            }

        if (m == 1) {
            for (int r = 0; r <= 6 ;  r+=3) {
              for (int c = 0; c <=6 ; c+=3) {
                 Set<Integer> set3 = new HashSet<>();
                  for (int i = 0; i < 3; i++) {
                     for (int j = 0 ; j < 3 ; j++) {
                         set3.add(arr[r+i][c+j]);
                    }
                }
                if (set3.size() < 9) {
                    m = 0;
                    break;
                } 
            }
        }
                              
    }
            System.out.printf("#%d %d%n" , test_case, m);

		}
	}
}