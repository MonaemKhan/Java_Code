//https://codeforces.com/contest/1465/problem/B
import java.util.Scanner;

public class B1465 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        long l, flag;
        int t = scan.nextInt();
        while (t-- > 0) {
            s = scan.next();
            if (s.equals("1000000000000000000")) {
                System.out.print(s+"\n");
            } else {
                l = Long.parseLong(s);
                flag = 0;
                while (flag == 0 || Long.toString(l).equals("1000000000000000000")) {
                    if ((cheak(l))) {
                        flag = 1;
                    } else {
                        l++;
                    }
                }
                System.out.print(l+"\n");
            }
        }
    }

    public static boolean cheak(Long l) {
        long m = l,r;
        while (l != 0) {
            r = l % 10;
            if (r != 0) {
                if (m % r != 0) {
                    return false;
                }
            }
            l /= 10;
        }
        return true;

    }

}
