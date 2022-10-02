/*
https://www.hackerrank.com/challenges/java-string-compare/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;




public class substring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        String s = scan.next();
        int n = scan.nextInt();

        for (int i = 0; i < (s.length() + 1) / 2; i++) {
            for (int j = i; j < s.length() + 1 / 2; j = j + n) {
                try {
                    String sub = (String) s.subSequence(j, j + n);

                    if (!list.isEmpty()) {
                        Boolean flag = true;
                        for (String list1 : list) {
                            if (sub.equals(list1)) {
                                flag = false;
                            }
                        }
                        if (flag) {
                            list.add(sub);
                        }
                    } else {
                        list.add(sub);
                    }
                } catch (Exception e) {
                    // do nothing
                }

            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
    }

}
