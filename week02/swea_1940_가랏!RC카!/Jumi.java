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
            int total = 0;
            int tot_speed = 0;
               
                
            for(int i = 0; i < N; i++) {
                int c = sc.nextInt();
                

                
                
                
                if ( c ==1) {
                    
                    int speed = sc.nextInt();
                    tot_speed += speed;
                    total  += tot_speed;
                    
                    
                    
                } else if (c == 0) {
                    
                    total += tot_speed;
                    
                    
                }else{
                    
                    int speed = sc.nextInt();
                    if (tot_speed - speed < 0) {
                    speed = 0;
                        
                        
                } else {
                        tot_speed -= speed;
                    }
                    
                    
                    total += tot_speed;
                    
                    
                }
            }
            System.out.printf("#%d %d%n", test_case , total);
                
		

		}
	}
}