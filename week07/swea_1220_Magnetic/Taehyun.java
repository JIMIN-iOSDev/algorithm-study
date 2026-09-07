import java.util.*;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int N = sc.nextInt();
            List<Integer>[] list = new ArrayList[N];
            int[][] arr = new int[N][N];
            int cnt = 0;
            
            for(int i=0; i<N; i++){
                list[i] = new ArrayList<>();
            }
            
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    int tmp = sc.nextInt();
                    if(tmp!=0){
                        list[j].add(tmp);
                    }
                }
            }
            
            for(int i=0; i<N; i++){
                for(int j=0; j<list[i].size()-1; j++){
                    if(list[i].get(j)==1&&list[i].get(j+1)==2){
                        cnt++;
                    }
                }
            }
            System.out.printf("#%d %d%n", test_case, cnt);
		}
	}
}