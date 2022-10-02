
import java.util.Arrays;
import java.util.Scanner;


public class SS1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        
        int test_case = scan.nextInt();
        
        for (int i = 0; i < test_case; i++) {
            int low = scan.nextInt();
            int high = scan.nextInt();
            for (int j = low-1; j < high; j++) {
                if(arr[j] == 0){
                    
                    arr[j] = 1;
                }else{
            
                    arr[j]=0;
                    
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
