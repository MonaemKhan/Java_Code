
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        {
            if ((a < b + c && b < a + c && c < a + b) || (a < b + d && b < a + d && d < a + b) || (a < d + c && d < a + c && c < a + d) || (d < b + c && b < d + c && c < d + b)) {
                System.out.println("TRIANGLE");
            } else if ((a == b + c || b == a + c || c == a + b) || (a == b + d || b == a + d || d == a + b) || (a == d + c || d == a + c || c == a + d) || (d == b + c || b == d + c || c == d + b)) {
                System.out.println("SEGMENT");
            } else {
                System.out.println("IMPOSSIBLE");
            }

        }

    }

}
