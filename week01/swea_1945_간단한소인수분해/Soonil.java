import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[] nList = {2, 3, 5, 7, 11};
		for(int test_case = 1; test_case <= T; test_case++)
		{
	        int[] nCnt = new int[5];
	        int num = sc.nextInt();
            System.out.printf("#%d ",test_case);
            for (int i = 0; i < nList.length; i++) {
            	    while (true) {
            	    	if (num % nList[i] == 0 ) {
            	    		num /= nList[i];
            	    		nCnt[i] += 1;
            	    	}
            	    	else {
            	    		break;
            	    	}
            	    }
        	    System.out.printf("%d ",nCnt[i]);
            }
            System.out.println();			

		}
	}
}