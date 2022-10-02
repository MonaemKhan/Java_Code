
import java.util.Scanner;

public class Matrix_Addition {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("For Matrix Addition We Need A Square Matrix,So The Row & Col OF Two matrixes Must"
                + " be Same\nEnter Row&Col OF This Matrix : ");
        int m = scan.nextInt();
        int[][] data = new int[m][m];
        int[][] data1 = new int[m][m];

        System.out.println("\n\nEnter Value Of Matrix 'A' ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                data[i][j] = scan.nextInt();
            }
        }

        System.out.println("\n\nEnter Value Of Matrix 'B' ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                data1[i][j] = scan.nextInt();
            }
        }

        System.out.println("\n\nMatrix A :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("\n\nMatrix B :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(data1[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("\n\nMatrix A+B :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(data[i][j] + data1[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
