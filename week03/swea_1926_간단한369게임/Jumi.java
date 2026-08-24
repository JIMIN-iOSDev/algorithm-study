
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
          
            for(int i = 1; i <= N ; i++) {
                String s = String.valueOf(i);
                int count = 0;
                
                for(int j = 0; j < s.length() ; j++) {
                    char num = s.charAt(j);
                    
                    if ( num == '3' || num == '6' || num == '9') {
                        count++;
                    }  
                }
                
               if (count > 0) {
                for(int k = 0; k < count ; k++) {
                    System.out.print("-");
                }
                   System.out.print(" ");
                                     } else {
                   System.out.print(i + " ");
               }
                    
            }
           
		}
	}
