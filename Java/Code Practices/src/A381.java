//https://codeforces.com/contest/381/problem/A
import java.util.Arrays;
import java.util.Scanner;

public class A381 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int sum_1 = 0,sum_2=0;
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int l = 0;
        int r = n-1;
        int f = 0;
        while(l<=r){
            if(arr[l]>arr[r]){
                if(f !=0){
                    sum_1 += arr[l];
                }else{
                    sum_2 +=arr[l];
                }
                l++;
            }else{
                if(f !=0){
                    sum_1 += arr[r];
                }else{
                    sum_2 +=arr[r];
                }
                r--;
            }
            f = 1-f;
        }
        System.out.println(sum_2+ " " + sum_1);
    }

}
