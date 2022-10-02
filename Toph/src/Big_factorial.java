
import java.util.Scanner;

public class Big_factorial {

    static long fac(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return (n * fac(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        String ss1 = "";
        if (num < 20) {
            long num1 = fac(num);
            String ss = String.valueOf(num1);

            if (ss.length() < 4) {
                System.out.println(ss);
            } else {
                for (int i = ss.length() - 4; i < ss.length(); i++) {

                    ss1 = ss1 + ss.charAt(i);
                }
                int length = ss1.length();
                if (ss1.charAt(0) == '0' && ss1.charAt(1) == '0' && ss1.charAt(2) == '0' && ss1.charAt(3) == '0') {
                    System.out.println(0);
                } else if (ss1.charAt(0) == '0' && ss1.charAt(1) == '0' && ss1.charAt(2) == '0') {
                    System.out.println(ss1.charAt(3));
                } else if (ss1.charAt(0) == '0' && ss1.charAt(1) == '0') {
                    System.out.println(ss1.charAt(2) + ss1.charAt(3));
                } else if (ss1.charAt(0) == '0') {
                    System.out.println(ss1.charAt(1) + ss1.charAt(2) + ss1.charAt(3));
                } else {
                    System.out.println(ss1);
                }
            }
        } else {
            System.out.println(0);
        }

    }

}
