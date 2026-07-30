
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		for(int test_case = 1; test_case <= T; test_case++)
		{
            
            
			int N = sc.nextInt();
            
            List<String> list = new ArrayList<>();
            
            String ans = null;
                       
            for (int i = 1; i < 100; i++) {
                String n = String.valueOf(N*i);
                ans = n;
                String arr[] = n.split("");
                
                for (String s : arr) {
                    if (!(list.contains(s))) {
                    list.add(s);
                    }
                }
                
               if (list.size() == 10) {
                   break;
               }
                
                    
                    
            }
            System.out.printf("#%d %s%n", test_case, ans);
            
                

		}
            
	}
}

        