
import java.util.Scanner;


public class fibonakki_memorization {

    static long[] lookup;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        lookup = new long[max];
        for (int i = 2; i < max; i++) {
            lookup[i] = -1;
        }
        lookup[0]=0;
        lookup[1]=1;
        System.out.print(0+"\n"+1+"\n");
        fibo(max-1);
    }

    static long fibo(int n) {
        if (lookup[n] == -1) {
            if (n <= 1) {
                lookup[n] = n;
                System.out.print(lookup[n]+"\n");
            } else {
                lookup[n] = fibo(n - 1) + fibo(n - 2);
                System.out.print(lookup[n]+"\n");
            }
        }
            return lookup[n];
        

    }
}
