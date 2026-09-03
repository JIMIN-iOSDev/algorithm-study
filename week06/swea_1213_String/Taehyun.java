import java.util.*;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            T = sc.nextInt();
            String s = sc.next();
            String total = sc.next();
            int cnt = 0;
            
            ArrayList<Character> totalList = new ArrayList<>();
            StringBuffer ans = new StringBuffer("");
            
            for(int i=0; i<total.length(); i++){
                totalList.add(total.charAt(i));
            }
            
            for(int i=0; i<s.length(); i++){
                ans.append(totalList.get(i));
            }
            if(s.equals(ans.toString())){
                cnt++;
            }
            for(int i=s.length(); i<total.length(); i++){
                ans.append(totalList.get(i));
                ans.deleteCharAt(0);
                if(s.equals(ans.toString())){
                    cnt++;
                }
            }
            System.out.printf("#%d %d%n", T, cnt);
		}
	}
}