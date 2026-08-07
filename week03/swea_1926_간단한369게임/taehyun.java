import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int N;
		N=sc.nextInt();
        String[] arr = new String[N];

		for(int i=0; i<N; i++)
		{
            arr[i] = String.valueOf(i+1);
		}
        
        for(int i=0; i<N; i++){
            for(int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j)=='3'){
                    System.out.printf("-");
                } else if(arr[i].charAt(j)=='6'){
                    System.out.printf("-");
                } else if(arr[i].charAt(j)=='9'){
                    System.out.printf("-");
                }
            }
            if(!(arr[i].contains("3")||arr[i].contains("6")||arr[i].contains("9"))) {
                System.out.printf("%s", arr[i]);
            }
            System.out.printf(" ");
        }
	}
}