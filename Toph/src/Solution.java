
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, t, start, end, flag, count, i;
        long alice, bob;
        n = scan.nextInt();
        t = scan.nextInt();

        long arr[] = new long[n];

        for (i = 0; i < n; i++) {
            arr[i] = scan.nextLong();
        }

        while (t-- > 0) {
            start = scan.nextInt() - 1;
            end = scan.nextInt();

            alice = 0;
            bob = 0;
            flag = 0;
            count = 0;

            while (start != n) {
                if (flag == 0) {
                    alice += arr[start];
                    count++;
                } else {
                    bob += arr[start];
                    count++;
                }
                if (count == end) {
                    flag = Math.abs(flag - 1);
                    count = 0;
                }
                start++;
            }

            //System.out.println("Alice = "+alice+" Bob = "+bob);
            if (alice > bob) {
                System.out.println("Alice");
            } else if (bob > alice) {
                System.out.println("Bob");
            } else {
                System.out.println("Draw");
            }
        }
    }

}
