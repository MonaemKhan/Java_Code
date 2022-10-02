
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-2d-array/problem?h_r=next-challenge&h_v=zen
 */
public class java_2dArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int sum;
        int max = arr[0][0]+arr[0][1]+arr[0][2]+arr[1][1]+arr[2][0]+arr[2][1]+arr[2][2];
        try{
            for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                //System.out.println(sum);
                if(sum > max){
                    max = sum;
                    //System.out.println("Max =  "+max);
                }
            }
        }
        }catch(Exception e){
        
        }
        System.out.println(max);
    }
    
}
