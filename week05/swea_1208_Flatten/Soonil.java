package algo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class swea1208 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
			List<Integer> list = new ArrayList<>();
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                list.add(sc.nextInt());
            }
            for(int i = 0; i < n; i++) {
                list.sort(Comparator.naturalOrder());
                list.set(0, list.get(0) + 1);
                list.set(n - 1, list.get(n - 1) - 1);
                
            }
            
            System.out.printf("#%d %d%n", test_case, list.get(n - 1) - list.get(0));
            

		}
	}

}
