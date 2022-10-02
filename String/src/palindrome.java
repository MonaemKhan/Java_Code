
import java.util.Scanner;


public class palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s;
        s = scan.next();
        StringBuffer k = new StringBuffer(s);
        String s1 = k.reverse().toString();
        if(s.equals(s1))
            System.out.println("Palindome");
        else
            System.out.println("This is not a palindome");
    }

}
