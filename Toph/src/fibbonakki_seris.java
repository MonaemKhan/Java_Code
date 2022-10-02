
import java.util.Scanner;


public class fibbonakki_seris {
    static int fib(int n){
        if(n<=1)
            return n;
        else
            return (fib(n-1)+fib(n-2));
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println(fib(scan.nextInt()));
    }
    
}
