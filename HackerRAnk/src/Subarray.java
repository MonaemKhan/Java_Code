
import java.util.Scanner;

/*
 https://www.hackerrank.com/challenges/java-negative-subarray/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class Subarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum;
        int count = 0;
        for (int i = 0; i < n; i++) {
                sum  = 0;
            for (int j = i; j < n; j++) {
                sum +=arr[j];
                if(sum < 0){count++;}
            }
        }
        System.out.println(count);
    }
    
}
