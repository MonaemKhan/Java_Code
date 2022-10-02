
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        long mod,ans,count;
        int test,n;
        Scanner scan = new Scanner(System.in);
        test = scan.nextInt();
        while(test-->0){
        n = scan.nextInt();
        mod = scan.nextLong();
        ans = scan.nextLong();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        count =0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(arr[j]% mod == ans){
                    count = count+(n-j);
                    break;
                }
            }
        }
        System.out.print(count+"\n");
        }
    }

}
