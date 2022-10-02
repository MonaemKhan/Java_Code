
import java.math.BigInteger;
import java.util.Scanner;

public class problem_f {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long A,B,M,i;
        int t,count,x =1;
        String sa,sb;
        BigInteger A1,B1,num;
        
        t = scan.nextInt();

        while (t-- > 0) {
            A = scan.nextLong();
            B = scan.nextLong();
            M = scan.nextLong();

            count = 0;
            for (i = 0L; i <= M; i++) {
                sa = "" + (A + i);
                sb = "" + (B + i);

                A1 = new BigInteger(sa);
                B1 = new BigInteger(sb);

                num = A1.gcd(B1);

                if (num.toString().equals("1")) {
                    count++;
                }
            }
            System.out.print("Case "+x+": "+count+"\n");
            x++;
        }

    }

}
