import java.util.*;

public class 주유소
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
         int test_case = sc.nextInt();
         
         for(int t=1; t<=test_case; t++) {
             int N = sc.nextInt();
             int[][] arr = new int[31][31];
             int[][] home = new int[N][3];
            
             boolean onePossible = false;
             int ans = Integer.MAX_VALUE;
            
             for(int i=0; i<N; i++) {
                 for(int j=0; j<3; j++) {
                     home[i][j] = sc.nextInt();
                 }
             }
             
             for(int i=0; i<N; i++) {
                 home[i][0] += 15;
                 home[i][1] += 15;
             }
             
             for(int i=0; i<31; i++) {
                 for(int j=0; j<31; j++) {
                     for(int d=0; d<N; d++) {
                         if(i==home[d][0]&&j==home[d][1]) {
                             arr[i][j] = -Integer.MAX_VALUE;
                             for(int y=-home[d][2]; y<=home[d][2]; y++) {
                                 for(int x=-home[d][2]; x<=home[d][2]; x++) {
                                     if(i+y<0||i+y>=31||j+x<0||j+x>=31)continue;
                                     if(Math.abs(y)+Math.abs(x)<=home[d][2]) {
                                         arr[i+y][j+x]++;
                                     }
                                 }
                             }
                         }
                     }
                 }
             }
             
             for(int i=0; i<31; i++) {
            	 for(int j=0; j<31; j++) {
            		 if(arr[i][j]==N) {
            			onePossible = true;
            		 }
            	 }
             }
             
             if(onePossible) {
            	 for(int y=0; y<31; y++) {
            		 for(int x=0; x<31; x++) {
        				 int sum = 0; 
        				 boolean possible = true;
            			 for(int i=0; i<N; i++) {
            				 int dist = Math.abs(home[i][0] - y)+Math.abs(home[i][1]-x);
          
            				 if(dist<1||dist>home[i][2]) {
            					 possible = false;
            					 break;
            				 }
            				 
            				 sum += dist;
            			 }
            			 if(possible) {
                			 ans = Math.min(ans, sum);
            			 }
            		 }
            	 }
             }
             else {
            	 for(int y1=0; y1<31; y1++) {
            		 for(int x1=0; x1<31; x1++) {
            			 for(int y2=0; y2<31; y2++) {
            				 for(int x2=0; x2<31; x2++) {
                				 int sum = 0; 
                				 boolean possible = true;
                    			 for(int i=0; i<N; i++) {
                    				 int dist1 = Math.abs(home[i][0] - y1)+Math.abs(home[i][1]-x1);
                    				 int dist2 = Math.abs(home[i][0] - y2)+Math.abs(home[i][1]-x2);
                    				 
                    				 if(!(dist1>= 1&&dist1<=home[i][2])&&!(dist2>=1&&dist2<=home[i][2])) {
                    					 possible = false;
                    					 break;
                    				 }
                    				 
                    				 if((dist1>= 1&&dist1<=home[i][2])&&(dist2>=1&&dist2<=home[i][2])) {
                    					 sum += Math.min(dist1, dist2);
                    				 }else if(dist1>= 1&&dist1<=home[i][2]){
                    					 sum += dist1;
                    				 }else {
                    					 sum += dist2;
                    				 }
                    			 }
                    			 if(possible) {
                        			 ans = Math.min(ans, sum);
                    			 }
            				 }
            			 }
            		 }
            	 }
             }
             if(ans==Integer.MAX_VALUE) {
            	 System.out.printf("#%d %d%n", t, -1);
             }else {
            	 System.out.printf("#%d %d%n", t, ans);
             }
         }//test for 문
    }//main
}