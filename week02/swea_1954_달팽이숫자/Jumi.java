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
            int[][] arr = new int[N][N];
            int a = 0;
            int b = 0;
            int dir = 0;
            int num = 1;
            
            while ( num <= N * N ) {
                arr[a][b] = num;
                       num++;
               if ( dir == 0 ) {
                   if ( b+1 < N && arr[a][b+1] == 0) {
                       b++;
;
                   } else {
                       dir =1;
                       a++;
                   }
                   
               } else if ( dir ==1 ) {
                   if ( a+1 < N && arr[a+1][b] == 0) {
                       a++;

                       
                   } else {
                       dir =2;
                       b--;
                   }
               } else if (dir == 2) {
                   if ( b -1 >= 0 && arr[a][b-1] ==0) {
                       b--;

                       
                   } else {
                       dir =3;
                       a--;
                   }
               } else {
                   if ( a -1 >= 0 && arr[a-1][b] == 0 ) {
                       a--;

                   } else {
                       dir = 0;
                       b++;
                   }
               }
            }
         
            System.out.printf("#%d%n" , test_case);
            for (int i = 0; i < N ; i++) {
                for (int j = 0; j < N ; j++ ) {
                    System.out.print(arr[i][j] + " ");
            
        }   
                System.out.println();
            }
        }
	}
}