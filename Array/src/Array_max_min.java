
import java.util.Scanner;

public class Array_max_min {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] data = new int[5];
        for (int i = 0; i < data.length; i++) {
            System.out.printf("[%d] = ", i);
            data[i] = scan.nextInt();
        }
        int max = data[0];
        int min = data[0];
        for (int i : data) { //using For Each Loop
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Max value Is : " + max + "\nMin value Is : " + min);
    }
}
