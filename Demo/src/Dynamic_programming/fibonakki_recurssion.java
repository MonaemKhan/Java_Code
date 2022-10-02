
import java.util.Scanner;


public class fibonakki_recurssion {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fibo(n-1));
    }
    static long fibo(int num){
    if(num<=1){
        return num;
    }
    return fibo(num-1)+fibo(num-2);
    }
}
