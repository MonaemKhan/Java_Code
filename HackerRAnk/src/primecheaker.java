
/*

 */
import java.math.BigInteger;
import java.util.Scanner;

public class primecheaker {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        BigInteger f  = new BigInteger(n);
        boolean b = f.isProbablePrime(100);
        if(b){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    
}
