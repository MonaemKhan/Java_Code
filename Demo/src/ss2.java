
import java.util.Arrays;
import java.util.Scanner;

public class ss2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        char[] arr = name.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        arr[j] = '-';
                        count++;
                    }
                }
                System.out.println(arr[i] + " = " + count);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
