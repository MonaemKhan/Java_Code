
import java.util.Scanner;

public class bpl_masquat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) {
            ss[i] = scan.next();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < ss[i].length(); j++) {
                if (ss[i].charAt(j) >= '1' && ss[i].charAt(j) <= '6' || ss[i].charAt(j) == 'O') {
                    count += 1;
                }
            }
            if (count < 6) {
                if (count == 1) {
                    System.out.println(count + " BALL");
                } else {
                    System.out.println(count + " BALLS");
                }

            } else if (count % 6 != 0 && count > 6) {
                if (count % 6 == 1 && count / 6 == 1) {
                    System.out.println(count / 6 + " OVER " + count % 6 + " BALL");
                } else if (count % 6 == 1 && count / 6 > 1) {
                    System.out.println(count / 6 + " OVERS " + count % 6 + " BALL");
                } else if (count % 6 > 1 && count / 6 > 1) {
                    System.out.println(count / 6 + " OVERS " + count % 6 + " BALLS");
                } else {
                    System.out.println(count / 6 + " OVER " + count % 6 + " BALLS");
                }

            } else {
                if (count / 6 == 1) {
                    System.out.println(count / 6 + " OVER");
                } else {
                    System.out.println(count / 6 + " OVERS");
                }
            }
        }

    }
}
