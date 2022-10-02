
import java.util.Scanner;


public class fibonakki_tabulation {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] fib = new long[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            
            fib[i] = fib[i-1]+fib[i-2];
        }
        System.out.println(fib[n-1]);
    }
    
}
