/*


Sample Input

2
0 2 10
5 3 5

Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/
import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        while (p-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            int sum = a + (1 * b);
            System.out.print(sum);
            for (int i = 1; i < n; i++) {
                int x = (int) Math.pow(2, i);
                sum += x * b;
                System.out.print(" " + sum);
            }
            System.out.println();
        }
    }

}
