package Sorting_Programming;

import java.util.Scanner;

public class MARG_SORT {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = scan.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i] = scan.nextInt();
        }
        MargeSort(Array,0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i]+"\t");
        }
    }

    static void merge(int arr[], int low, int mid, int high) {
        int LowerArraySize = mid - low + 1;
        int HigherArraySize = high - mid;
        int Left[] = new int[LowerArraySize];
        int Right[] = new int[HigherArraySize];
        for (int i = 0; i < LowerArraySize; ++i) {
            Left[i] = arr[low + i];
        }
        for (int j = 0; j < HigherArraySize; ++j) {
            Right[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = low;
        while (i < LowerArraySize && j < HigherArraySize) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < LowerArraySize) {
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < HigherArraySize) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    static void MargeSort(int ArrayToSort[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            MargeSort(ArrayToSort, low, mid);
            MargeSort(ArrayToSort, mid + 1, high);
            merge(ArrayToSort, low, mid, high);
        }
    }

}
