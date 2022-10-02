
import java.util.Scanner;

public class neat_bracket {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ss = scan.next();

        char[] arr = ss.toCharArray();
        int l = arr.length;
        boolean flag = true;
        if (ss.length() % 2 != 0) {
            System.out.println("No");
        } else if (ss.charAt(0) == ')') {
            System.out.println("No");
        } else if (ss.charAt(ss.length() - 1) == '(') {
            System.out.println("No");
        } else {
            for (int i = 0; i < l - 1; i++) {
                if (arr[i] == '(' && arr[i + 1] == ')') {
                    arr[i] = '0';
                    arr[i + 1] = '0';
                }
            }
            //System.out.println(Arrays.toString(arr));
            for (int i = 0; i < l; i++) {

                for (int j = i+1; j < l ; j++) {
                    if (arr[i]=='(' && arr[j] == ')') {
                        arr[i] = '0';
                        arr[j] = '0';
                        break;
                    }
                }

            }
            //System.out.println(Arrays.toString(arr));
            for (int i = 0; i < l; i++) {
                if (arr[i] == ')' || arr[i] == '(') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
