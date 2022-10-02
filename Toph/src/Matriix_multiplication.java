
import java.util.Scanner;

public class Matriix_multiplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        int[][] re = new int[2][2];
        int count = 0;
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    count = count + (a[i][k] * b[k][j]);
                }
                re[i][j] = count;
                count = 0;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(re[i][j] + " ");
            }
            System.out.println();
        }
    }
}
