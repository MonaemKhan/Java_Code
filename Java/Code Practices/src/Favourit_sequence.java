//https://codeforces.com/contest/1462/problem/A
import java.util.Scanner;


public class Favourit_sequence {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int arr[] = new int[n];
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            if(n<=2){
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }else{
                int j = 0;
                for (int i = 0; i < n/2; i++) {
                    array[j] = arr[i];
                    array[j+1] = arr[n-1-i];
                    j = j+2;
                }
            if(n%2 == 0){
                
                for (int i = 0; i < n; i++) {
                    System.out.print(array[i]+" ");
                }
                System.out.println();
            }else{
                for (int i = 0; i < n-1; i++) {
                    System.out.print(array[i]+" ");
                }
                System.out.println(arr[n/2]);
            }
        }}
    }
    
}
