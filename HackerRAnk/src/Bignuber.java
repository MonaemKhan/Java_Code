
import java.math.BigInteger;
import java.util.Scanner;

/*
 https://www.hackerrank.com/challenges/java-biginteger/problem
 */
public class Bignuber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String ss = scan.next();
        
        BigInteger f = new BigInteger(s);
        BigInteger ff = new BigInteger(ss);
        
        System.out.println(f.add(ff));
        System.out.println(f.multiply(ff));
    }
    
}
