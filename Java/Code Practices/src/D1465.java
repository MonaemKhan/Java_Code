//https://codeforces.com/contest/1465/problem/D
import java.util.Scanner;

public class D1465 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        long x = scan.nextLong();
        long y = scan.nextLong();
        long c_x = 0,c_y = 0;
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(i==0 && c[i] == '?'){
                c[i] = '1';
            }else if(c[i] == '?'){
                c[i] = c[i-1];
            }
        }
       System.out.println(c);
        for (int i = 0; i < c.length-1; i++) {
            for (int j = i+1; j <c.length ; j++) {
                if(c[i]=='0' && c[j] == '1'){
                    c_x++;
                }else if(c[i]=='1' && c[j]=='0'){
                    c_y++;
                }
            }
        }
        System.out.println((c_x*x)+(c_y*y));
    }
}
