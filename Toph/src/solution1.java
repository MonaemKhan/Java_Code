
import java.util.Scanner;

public class solution1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String str = scan.next();
        char[] arr = str.toCharArray();
        char ch = ' ';
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n - 1; j++) {

                if (str.charAt(i) == arr[j]) {
                    arr[j] = '0';
                    count++;
                }
            }
            if (count >= k && ch < str.charAt(i)) {
                ch = str.charAt(i);

            }
        }
        String ss = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
            if (count != k - 1 || str.charAt(i) != ch) {
                ss += str.charAt(i);
            }
        }
        //System.out.println(ss);

        String str1 = new StringBuilder(str).reverse().toString();
        String ss1 = "";
        count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ch) {
                count++;
            }
            if (count != k - 1 || str1.charAt(i) != ch) {
                ss1 += str1.charAt(i);
            }
        }
        String ss2 = new StringBuilder(ss1).reverse().toString();
       //System.out.println(ss2);

        for (int i = 0; i < n; i++) {
            if (ss.charAt(i) > ss2.charAt(i)) {
                System.out.println(ss2);
                break;
            } else if (ss.charAt(i) == ss2.charAt(i)) {
            } else {
                System.out.println(ss);
                break;
            }
        }
    }
}
