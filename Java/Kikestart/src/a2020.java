
import java.util.*;

/*
https://codingcompetitions.withgoogle.com/kickstart/round/000000000019ffc7/00000000001d3f56
 */

public class a2020 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int k = 0;
        while(t-->0){
            k++;
            int n = scan.nextInt();
            int total = scan.nextInt();
            int count = 0;
            int sum = 0;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            for (int i : arr) {
                sum = sum+i;
                if(sum<= total){
                    count++;
                }
            }
            System.out.println("Case #"+k+": "+count);
        }
        
    }
    
}
