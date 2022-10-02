
import java.util.Scanner;

/*

 */
public class goat_reasearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-->0) {
            String str = scan.next();
            String str2 = str.substring(1, str.length());
            if (str2.length() % 2 == 0) {
                System.out.printf("%s\n" ,str);
            } else {
                if (str2.length() > 1) {
                    String strr = str.substring(0,str.length()-1);
                    System.out.printf("%s\n",strr);
                    
                } else {
                    System.out.printf("%sa\n",str);
                }
            }
            
        }
    }
}
