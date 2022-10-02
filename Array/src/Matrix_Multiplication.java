
import java.util.Scanner;

public class Matrix_Multiplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r1, r2, c1, c2;
        System.out.print("Enter Row Matrix A : ");
        r1 = scan.nextInt();
        System.out.print("Enter Col Matrix A : ");
        c1 = scan.nextInt();
        System.out.print("Enter Row Matrix B : ");
        r2 = scan.nextInt();
        System.out.print("Enter Col Matrix B : ");
        c2 = scan.nextInt();
        while (c1 != r2) {
            System.out.println("OPPS!!!\tERROR!!!\t Enter Value Again");
            System.out.print("Enter Row Matrix A : ");
            r1 = scan.nextInt();
            System.out.print("Enter Col Matrix A : ");
            c1 = scan.nextInt();
            System.out.print("Enter Row Matrix B : ");
            r2 = scan.nextInt();
            System.out.print("Enter Col Matrix B : ");
            c2 = scan.nextInt();
        }
        int[][] data = new int[r1][c1];
        int[][] data1 = new int[r2][c2];
        int[][] result = new int[r1][c2];

        System.out.println("\n\nEnter Value Of Matrix 'A' ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                data[i][j] = scan.nextInt();
            }
        }

        System.out.println("\n\nEnter Value Of Matrix 'B' ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                data1[i][j] = scan.nextInt();
            }
        }

        System.out.println("\n\nMatrix A :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("\n\nMatrix B :");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(data1[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("\n\nMatrix A*B :");
        int sum = 0;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    sum = sum + data[i][k] * data1[k][j];
                }
                result[i][j] = sum;
                System.out.print(result[i][j] + "\t");
                sum = 0;
            }
            System.out.println("\n");
        }
    }
}
