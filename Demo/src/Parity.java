
import java.util.Scanner;

public class Parity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 1;
        while(n-->0){
            
        long m = scan.nextLong();

        String str = Long.toBinaryString(m);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }
        if (count % 2 == 0) {
            
            System.out.println("Case "+k+": even");
        } else {
          
            System.out.println("Case "+k+": odd");
        }
        k++;
        }
    }

}
