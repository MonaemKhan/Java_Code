
import java.util.Scanner;

public class Bitcoin {

    public static void main(String[] args) {
        double x,y,amount,price;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Amount Of Product :");
        price = scan.nextDouble();
        
        System.out.print("Enter Money Given :");
        amount = scan.nextDouble();
        
        x = (amount-price);

        System.out.printf("NOTES:\n");
        System.out.printf("%d Note Of R$ 100.00\n", (int) x / 100);
        y = (x % 100);
        System.out.printf("%d Note Of R$ 50.00\n", (int) y / 50);
        y = (y % 50);
        System.out.printf("%d Note Of R$ 20.00\n", (int) y / 20);
        y = (y % 20);
        System.out.printf("%d Note Of R$ 10.00\n", (int) y / 10);
        y = (y % 10);
        System.out.printf("%d Note Of R$ 5.00\n", (int) y / 5);
        y = (y % 5);
        System.out.printf("%d Note Of R$ 2.00\n", (int) y / 2);
        y = (y % 2);

        System.out.printf("Paisa:\n");
        System.out.printf("%d Note Of R$ 1.00\n", (int) y / 1);
        y = (y % 1);
        System.out.printf("%d Note Of R$ 0.50\n", (int) (y / 0.50));
        y = (float) (y % 0.50);
        System.out.printf("%d Note Of R$ 0.25\n", (int) (y / 0.25));
        y = (float) (y % 0.25);
        System.out.printf("%d Note Of R$ 0.10\n", (int) (y / 0.10));
        y = (float) (y % 0.10);
        System.out.printf("%d Note Of R$ 0.05\n", (int) (y / 0.05));
        y = (float) (y % 0.05);
        System.out.printf("%d Note Of R$ 0.01\n", (int) (y / 0.01));
    }
}
