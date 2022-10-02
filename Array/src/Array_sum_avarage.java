
import java.util.Scanner;

public class Array_sum_avarage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] data = new int[5];
        for (int i = 0; i < data.length; i++) {
            System.out.printf("[%d] = ", i);
            data[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i : data) { //using For Each loop
            sum = sum + i;
        }
        double av = sum / data.length;
        System.out.println("Sum Of The Following number are :- " + sum + "\nAvarage Of This Number Is :- " + av);
    }
}
