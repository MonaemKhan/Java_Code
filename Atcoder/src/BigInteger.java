
import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        BigInteger sum = new BigInteger("1");
        BigInteger max = new BigInteger("1000000000000000000");
        int n = scan.nextInt();
        
        while(n-->0){
            String s = scan.next();
            BigInteger f = new BigInteger(s);
            
            sum = sum.multiply(f);
        }
        
        if(sum.min(max)){
            System.out.println(sum);
        }else {
            System.out.println("-1");
        }
    }
    
}
