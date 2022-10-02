/*
https://www.hackerrank.com/challenges/java-strings-introduction/problem
*/
import java.util.*;

public class stringconvert {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s[] = new String[2];
        s[0] = scan.next();
        s[1] = scan.next();

        System.out.println(s[0].length() + s[1].length());
        if (s[0].charAt(0) <= s[1].charAt(0)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        for (int i = 0; i < 2; i++) {
            char c = s[i].charAt(0);
            c = (char) ((int) c - 32);
            System.out.print(c+ s[i].substring(1, s[i].length())+" ");
        }
        System.out.println();

    }
}
