
import java.util.Scanner;

public class Main {
    
    public static long gcd(long A, long B){
        if(A == 0 ){
            return B;
        }
        if(B==0){
            return A;
        }
        
        if(A==B){
            return A;
        }
        
        if(A>B){
            return gcd(A-B,B);
        }else{
            return gcd(A,B-A);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long A,B,M,i,num,count;
        int t,x = 1;
        
        t = scan.nextInt();

        while (t-- > 0) {
            A = scan.nextLong();
            B = scan.nextLong();
            M = scan.nextLong();

            count = 0;
            for (i = 0L; i <= M; i++) {
                num = gcd(A+i,B+i);
                if(num == 1){
                    count++;
                }
            }
            System.out.println("Case "+x+": "+count);
            x++;
        }

    }

}
