package Sorting_Programming;

import java.util.Scanner;

public class BUBLE_SORT {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = scan.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i] = scan.nextInt();
        }

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                if (Array[i] < Array[j]) {
                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + "\t");
        }
    }

}
