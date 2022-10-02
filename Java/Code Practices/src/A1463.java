//https://codeforces.com/contest/1463/problem/A
import java.util.Scanner;

public class A1463 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a,b,c,sum;
        int t = scan.nextInt();
        while (t-- > 0) {
            a = scan.nextLong();
            b = scan.nextLong();
            c = scan.nextLong();
            sum = a+b+c;
            Long x = Math.min(a, b);
            Long min  = Math.min(x, c);
            
            if(min >=(sum/9) && sum%9 == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

}
