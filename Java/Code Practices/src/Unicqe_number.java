//https://codeforces.com/contest/1462/problem/C
import java.util.Scanner;

public class Unicqe_number {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if(n>45){
                System.out.println("-1");
            }else{
                if(n<10){
                    System.out.println(n);
                }else{
                    String s = "";
                    
                    for (int i = 9; i > 0; i--) {
                        if(n-i >= 0){
                            n = n-i;
                            s = Integer.toString(i)+s;
                        }
                    }
                    System.out.println(s);
                }
                
            }
        }
    }

}
