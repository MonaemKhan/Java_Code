
import java.util.ArrayList;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-list/problem
 */
public class ArrayList_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        int test = scan.nextInt();
        scan.nextLine();
        while (test-- > 0) {
            String str = scan.next();
            if (str.equals("Insert")) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                list.add(x, y);
            } else {
                int x = scan.nextInt();
                list.remove(x);
            }
        }
        
        list.forEach((a) -> {
            System.out.print(a+"  ");
        });
    }

}
