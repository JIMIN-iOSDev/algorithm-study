
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
		
			int N;
            N = sc.nextInt();
           	
            String M = sc.nextLine();
            
            List<Integer> list = new ArrayList();
            
            for (int i = 0; i < N; i++) {
                list.add(sc.nextInt());
            }
            
            Collections.sort(list);
            System.out.print("#" + test_case + " ");
            for (int i = 0 ; i < N ; i++)	{
           	 System.out.print(list.get(i)+ " ");
            }
            System.out.println();
            
            
            
            
            
            
		}
	}
}