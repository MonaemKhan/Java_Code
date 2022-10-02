package Sorting_Programming;

import java.util.Scanner;

public class QUICK_SORT {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = scan.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i] = scan.nextInt();
        }
        QuickSort(Array, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + "\t");
        }
    }

    static void QuickSort(int[] ArrayToSort, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = ArrayToSort[high];
        int i = low, j = high;
        while (ArrayToSort[i] < pivot) {
            i++;
        }
        while (ArrayToSort[j] < pivot) {
            j--;
        }
        if (i <= j) {
            int temp = ArrayToSort[i];
            ArrayToSort[i] = ArrayToSort[j];
            ArrayToSort[j] = temp;
            i++;
            j--;
        }
        if (low < j) {
            QuickSort(ArrayToSort, low, j);
        }
        if (high > i) {
            QuickSort(ArrayToSort, i, high);
        }
    }

}
