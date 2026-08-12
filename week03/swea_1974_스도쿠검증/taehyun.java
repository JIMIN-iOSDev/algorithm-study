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
            int[][] arr = new int[9][9];
            int x_check = 1;
            int y_check = 1;
            int z_check = 1;
            
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            
            for(int i=0; i<9; i++){
                int[] check = new int[] {10,10,10,10,10,10,10,10,10};
                for(int j=0; j<9; j++){
                    for(int z=0; z<9; z++){
                        if(arr[i][j] == z+1){
                            check[z] = z+1;
                        }
                    }
                }
                for(int j=0; j<9; j++){
                    if(check[j]==10){
                        x_check=0;
                        break;
                    }
                }
            }
                
                for(int i=0; i<9; i++){
                    int[] check = new int[] {10,10,10,10,10,10,10,10,10};
                    for(int j=0; j<9; j++){
                        for(int z=0; z<9; z++){
                            if(arr[j][i] == z+1){
                                check[z] = z+1;
                            }
                        }
                    }
                    for(int j=0; j<9; j++){
                        if(check[j]==10){
                            y_check=0;
                            break;
                        }
                    }
                   
                }
                for(int i=1; i<8; i+=3){
                    for(int j=1; j<8; j+=3){
                        //int[][] check = new int[][] {{10,10,10},{10,10,10},{10,10,10}}; 
                        int[] check = new int[] {10,10,10,10,10,10,10,10,10};
                        for(int y=-1; y<=1; y++){
                            for(int x=-1; x<=1; x++){
                                for(int z=0; z<9; z++){
                                    if(arr[i+y][j+x]==z+1){
                                        check[z] = z+1;
                                    }
                                }
                            }
                        }
                        for(int z=0; z<9; z++){
                            if(check[z]==10){
                                z_check=0;
                                break;
                            }
                        }
                    }
                }
            if(x_check==1 && y_check==1 && z_check==1){
                System.out.printf("#%d 1%n", test_case);
            }else
                System.out.printf("#%d 0%n", test_case);

		}
	}
}