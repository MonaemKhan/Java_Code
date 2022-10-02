
import java.math.BigInteger;
import java.util.Scanner;

public class demo3 {

    public static void main(String[] args) {
        long n, num, count;
        BigInteger f;
        boolean b;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        while (n-- > 0) {
            num = scan.nextInt();
            count = 0;
            for (int i = 2; i <= num; i++) {
                f = new BigInteger(i + "");
                b = f.isProbablePrime(1000000);
                if (b) {
                    count = count + i;
                }
            }
            System.out.println(count);

        }
    }

}
