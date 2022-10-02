
import java.util.*;

class Dem0 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char[] a = str.toCharArray();
        char[] b = str.toCharArray();

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length - 1; j++) {
                if (a[j] == 'M' && a[j + 1] == 'F') {

                    b[j] = 'F';
                    b[j + 1] = 'M';

                }
            }
            if (Arrays.equals(a, b)) {
                break;
            } else {

                a = b.clone();
                count++;

            }
        }
        System.out.println(count);

    }
}
