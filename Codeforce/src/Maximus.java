
import java.util.Scanner;
/*
input:

5
0 1 1 -2 1
3
1000 999999000 -1000000000
5
2 1 2 2 3

output:

0 1 2 0 3 
1000 1000000000 0 
2 3 5 7 10 
*/

public class Maximus {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, i,a;
        long output, temp;

        n = scan.nextInt();

        a = scan.nextInt();

        System.out.print(a+ " ");
        output = a;
        while(n-->1) {
            a = scan.nextInt();
            temp = output + a;
            if (temp != 0) {
                output = temp;
            }
            System.out.print(temp + " ");
        }
        System.out.print("\n");
    }

}
