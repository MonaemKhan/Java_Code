
import java.util.Scanner;

public class Array_matrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Row OF This Matrix : ");
        int m = scan.nextInt();
        System.out.print("Enter Col OF This Matrix : ");
        int n = scan.nextInt();
        int[][] data = new int[m][n];
        System.out.println("\n\nEnter Value Of Matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                data[i][j] = scan.nextInt();
            }
        }
        System.out.println("\n\nMatrix Is :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
