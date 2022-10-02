
import static java.lang.Character.toLowerCase;
import java.util.Scanner;

public class heavy_alphabate {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        while (n-- > 0) {
            String str = scan.next();
            char[] arr = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (toLowerCase(str.charAt(i)) == toLowerCase(arr[j])) {
                        arr[j] = '#';
                    } else {
                        break;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}
