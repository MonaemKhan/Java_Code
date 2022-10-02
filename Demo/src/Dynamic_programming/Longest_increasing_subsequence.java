package Dynamic_programming;

import java.util.Scanner;


public class Longest_increasing_subsequence {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        int[] arr = {10,22,9,33,21,50,41,60};
        int n = arr.length;
        int[] lis = new int[n];
        /*for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }*/
        for (int i = 0; i < n; i++) {
           lis[i] = 1;
        }
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i]>arr[j] && lis[i] < lis[j]+1){
                    lis[i] = lis[j]+1;
                }
            }
        }
        int max = 0;
        System.out.print("{");
        for (int i = 0; i < n; i++) {
            if(max<lis[i]){
                max = lis[i];
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print("}");
    }
    
}
