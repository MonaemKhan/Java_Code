
import java.util.Arrays;
import java.util.Scanner;

public class set_union {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num1 = scan.nextInt();

        int[] arr = new int[num];
        int[] arr1 = new int[num1];

        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < num1; i++) {
            arr1[i] = scan.nextInt();
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num1; j++) {
                if (arr[i] == arr1[j]) {
                    arr1[j] = -1;
                }
            }
        }
        int length = num + num1;
        int[] final_arr = new int[length];
        for (int i = 0; i < num; i++) {
            final_arr[i] = arr[i];
        }
        for (int i = num, k = 0; i < length; i++, k++) {
            if (arr1[k] != -1) {
                final_arr[i] = arr1[k];
            }
        }
        Arrays.sort(final_arr);
        for (int i = 0; i < final_arr.length; i++) {
            if (i == final_arr.length - 1) {
                System.out.println(final_arr[i]);
                break;
            }
            if (final_arr[i] != 0) {
                System.out.print(final_arr[i]+" ");
            }
        }

    }
}
