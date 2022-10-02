
import java.util.Scanner;

public class full_pyramid {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > 0; j--) {
                if (i == j) {
                    System.out.print("*");
                } else if (i >= j) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
