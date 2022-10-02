
import java.util.*;

/*
https://www.hackerrank.com/challenges/java-arraylist/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
 /*
Usong Arraylist
 */
public class Arraysearch2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> li = new ArrayList<>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int m = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                list.add(scan.nextInt());
            }
            li.add(list);
        }

        int test = scan.nextInt();

        while (test-- > 0) {
            int line = scan.nextInt();
            int col = scan.nextInt();

            try {
                System.out.println(li.get(line - 1).get(col - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

    }

}
