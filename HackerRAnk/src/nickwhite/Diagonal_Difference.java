//https://www.hackerrank.com/challenges/diagonal-difference/problem
package nickwhite;

import java.util.Scanner;

public class Diagonal_Difference {
    static int[][] num = new int[100][100];
    
    static int cal(int x,int y,int n){
        if(x == n || y == n){
            return 0;
        } else {
            return num[x][y]+cal(x+1,y+1,n);
        }
    }
    
    static int cal2(int x,int y){
        if(x == -1 || y == -1){
            return 0;
        } else {
            return num[x][y]+cal2(x+1,y-1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =  scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = scan.nextInt();
            }
        }
        int din_1 = cal(0,0,n);
        int din_2 = cal2(0,n-1);
        System.out.println(Math.abs(din_1-din_2));
    }
    
}
