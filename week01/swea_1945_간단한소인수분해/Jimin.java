import java.util.Scanner;
 
public class Jimin {
	
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int a = 0, b = 0, c = 0, d = 0, e = 0;
   
            while(N % 11 == 0) {
             N /= 11;
             e++;              
            }
             
            while(N % 7 == 0) {
             N /= 7;
             d++;
            }
             
             while(N % 5 == 0) {
             N /= 5;
             c++;
            }
             
             while(N % 3 == 0) {
             N /= 3;
             b++;
            }
             
             while(N % 2 == 0) {
             N /= 2;
             a++;
            }
             
            System.out.println("#" + test_case + " " + a + " " + b + " " + c + " " + d + " " + e);
        }
    }
}