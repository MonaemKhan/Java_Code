//https://algo.codemarshal.org/problems/556a0cecd2406b030074ca7b
import java.util.Scanner;


public class A_B_op {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t,n=1;
        long A,B,re=0;
        char C;
        t = scan.nextInt();
        while(t-- >0){
            A = scan.nextLong();
            B = scan.nextLong();
            C = scan.next().charAt(0);
            //scan.nextLine();
            //n++;
            switch(C){
                case '+':
                    re = A+B;
                    System.out.println("Case "+n+": "+re);
                    break;
                case '-':
                    re = A-B;
                    System.out.println("Case "+n+": "+re);
                    break;
                case '*':
                    re = A*B;
                    System.out.println("Case "+n+": "+re);
                    break;
                case '/':
                    re = A/B;
                    System.out.println("Case "+n+": "+re);
                    break;
                case '%':
                    re = A%B;
                    System.out.println("Case "+n+": "+re);
                    break;
                default:
                    break;
            }
            n++;
        }
    }
    
}
