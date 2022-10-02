//https://codeforces.com/contest/1465/problem/A
import java.util.Scanner;

public class A1465 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == ')') {
                    count++;
                } else if ((int) s.charAt(i) >=97 && (int) s.charAt(i) <=122) {
                    count = 0;
                }
            }
            if(n%2 ==0 ){
                if(count > n/2){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                if(count >= (n+1)/2){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }

}
