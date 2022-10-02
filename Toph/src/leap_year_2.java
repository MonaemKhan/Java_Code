
import java.util.Scanner;

public class leap_year_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year % 4 == 0 && year % 100 !=0) {
            System.out.println("Yes");
        } else if (year % 400 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
