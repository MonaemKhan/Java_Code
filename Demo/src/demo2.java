
import java.util.ArrayList;
import java.util.Scanner;

public class demo2 {

    static int MAX_SIZE = 10000000;
    static boolean[] IsPrime = new boolean[MAX_SIZE];

    static ArrayList<Integer> primes
            = new ArrayList<Integer>();

    static void prime() {

        // boolean[] IsPrime = new boolean[MAX_SIZE];
        for (int i = 0; i < MAX_SIZE; i++) {
            IsPrime[i] = true;
        }

        for (int p = 2; p * p < MAX_SIZE; p++) {

            if (IsPrime[p] == true) {

                for (int i = p * p; i < MAX_SIZE; i += p) {
                    IsPrime[i] = false;
                }
            }
        }

        for (int p = 2; p < MAX_SIZE; p++) {
            if (IsPrime[p] == true) {
                primes.add(p);
            }
        }
    }

    public static void main(String[] args) {
        prime();
        int n;
        long limit, count;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        while (n-- > 0) {
            limit = scan.nextInt();
            count = 0;
            for (int i = 2; i <= limit; i++) {
                if (IsPrime[i]) {
                    //System.out.print(i+" ");
                    count = count + i;
                }
            }
            System.out.println(count);
        }
    }

}
