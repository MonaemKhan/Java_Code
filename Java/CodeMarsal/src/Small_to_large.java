//https://algo.codemarshal.org/problems/556a0cb1a843fc851d47b4cd
import java.util.*;

class Small_to_large {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t  = scan.nextInt();
        scan.nextLine();
        int n = 0;
        while (t-- > 0) {
            n++;
            //System.out.println("OK");
            String str = scan.nextLine();
            //System.out.println("ok");
            String st = str.toUpperCase();
            System.out.println("Case "+n+": "+st);
        }
    }
    
}
