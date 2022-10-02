
package Sorting_Programming;

import java.util.Scanner;


public class INSERTION_SORT {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = scan.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i] = scan.nextInt();
        }
        
        int j, temp;
    	for (int i = 1; i < Array.length; i++) {
		    temp = Array[i];
			j = i-1;
			while (j >= 0 && temp < Array[j]) {
				Array[j+1] = Array[j];
				j = j-1;
			}
			Array[j+1] = temp;
		}
        
        
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + "\t");
        }
    }
    
}
