
import java.util.Scanner;

/* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
   Find the sum of all the primes below two million. */
public class enguler_10 {

    /* returns true if parameter n is a prime number, false if composite or neither */
    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        }
        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (n-- > 0) {
            long sum = 0;
            long limit = scan.nextLong();
            for (int i = 0; i <= limit; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }

            System.out.print(sum);
        }
    }
}
