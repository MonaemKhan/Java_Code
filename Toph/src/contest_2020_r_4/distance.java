package contest_2020_r_4;

import java.util.Scanner;
import java.util.Stack;

public class distance {

    static Stack<Integer> A = new Stack<Integer>();
    static Stack<Integer> B = new Stack<Integer>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int t = scan.nextInt();
        int t = 1;
        for (int i = 1; i <= t; i++) {

            int n = scan.nextInt();
            int m = scan.nextInt();

            while (m-- > 0) {
                A.push(scan.nextInt());
                B.push(scan.nextInt());
            }
            System.out.println(A.capacity());
            for (int j = 0; j < A.capacity(); j++) {
                
            }
        }

    }

}
