
import java.util.Scanner;

public class datatype {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            String s = scan.next();
            try {
                long a = Long.parseLong(s);
                System.out.println(a + " can be fitted in:");
                if (a <= Math.pow(2, 7) - 1 && a >= -Math.pow(2, 7)) {
                    System.out.println("* byte");
                }
                if (a <= Math.pow(2, 15) - 1 && a >= -Math.pow(2, 15)) {
                    System.out.println("* sort");
                }
                if (a <= Math.pow(2, 31) - 1 && a >= -Math.pow(2, 31)) {
                    System.out.println("* int");
                }
                if (a <= Math.pow(2, 63) - 1 && a >= -Math.pow(2, 63)) {
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                System.out.println(s + " can't be fitted anywhere.");
            }
        }
    }

}
