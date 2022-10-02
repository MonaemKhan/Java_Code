
import java.util.Scanner;

/*
https://codingcompetitions.withgoogle.com/codejam/round/000000000019ffc8/00000000002d82e6
 */
public class biketour {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        int i = 1;
        while (n-- > 0) {
            int t = scan.nextInt();
            scan.nextLine();
            int[] arr = new int[t];
            for (int j = 0; j < t; j++) {
                arr[j] = scan.nextInt();
               
            }
            int peek = 0;
            for (int j = 1; j < t - 1; j++) {
                if (arr[j - 1] < arr[j] && arr[j + 1] < arr[j]) {
                    peek++;
                }
            }
            System.out.println("Case #" + i + ": " + peek);
            i++;
        }
    }

}
