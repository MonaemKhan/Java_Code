
import java.util.Scanner;

//https://codeforces.com/contest/1506/problem/A
public class Codeforce01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long t, a, col, num, rim, rim2, temp, temp2, ans;
        t = scan.nextLong();
        while (t-- > 0) {
            a = scan.nextLong();
            col = scan.nextLong();
            num = scan.nextLong();

            if (a * col == num) {
                System.out.println(num);
            } else {

                rim = num / a;
                rim2 = rim + 1;

                temp = (a * rim) + 1;
                temp2 = (num - temp) + 1;

                ans = (temp2 * col) - (col - rim2);
                System.out.println(ans);
            }
        }
    }

}
