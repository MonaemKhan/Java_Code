/*
https://www.spoj.com/problems/DIVSUM2/fbclid=IwAR1PGIGcYODdcJ4alLJAW0Wdb6qMmENMN-hnDB1UOWQOZuPgz_dD7Qr6YCE
Not slove yet
*/
import java.util.Scanner;

public class divbisor_sum {

    static int div(long num) {
        int count = 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                //System.out.println(i);
                if (num / i == i) {
                    count += i;
                } else {

                    count += (num / i) + i;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            System.out.println(div(scan.nextLong()));
        }

    }

}
