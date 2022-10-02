package Sorting_Programming;

import java.util.Scanner;

public class SELECTION_SORT {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = scan.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i] = scan.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
    		int temp = Array[i];
			for (int j = i+1; j < n; j++) {
				if(temp > Array[j]) {
				  Array[i] = Array[j];
				  Array[j] = temp;
				  temp = Array[i];
				}
			}
		}
        
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + "\t");
        }

    }

}
