import java.util.Scanner;
class Solution
{
    static int N, M;
    public static int Square(int N, int M){
        if(M==1){
            return N;
        }
        return N*Square(N, M-1);
    }
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            T=sc.nextInt();
            N = sc.nextInt();
            M = sc.nextInt();
            System.out.printf("#%d %d%n", T, Square(N, M));
		}
	}
}//