//https://www.hackerrank.com/challenges/simple-array-sum/problem
package nickwhite;

import java.util.Scanner;

public class Simple_Array_Sum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum+ scan.nextInt();
        }
        System.out.println(sum);
    }
    
}
