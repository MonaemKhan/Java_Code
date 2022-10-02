//https://codeforces.com/contest/1459/problem/B
import java.util.Scanner;

public class B1459 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0, a, b;
        if (n % 2 != 0) {
            n = n + 2;
            a = n / 2;
            b = a + 1;
            sum = (a * b) * 2;

        } else {

            a = (n + 2) / 2;
            sum = a * a;
        }
        System.out.println(sum);
    }

}
