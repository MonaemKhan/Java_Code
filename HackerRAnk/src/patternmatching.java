/*
https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?h_r=next-challenge&h_v=zen
*/
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class patternmatching {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        while (n-- > 0) {
            String s = scan.nextLine();

            try {
                Pattern.compile(s);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}
