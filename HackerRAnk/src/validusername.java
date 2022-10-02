/*
https://www.hackerrank.com/challenges/valid-username-checker/problem
*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validusername {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        int n = scan.nextInt();
        while (n-- > 0) {
            String s = scan.next();

            Pattern p = Pattern.compile(str);
            Matcher m = p.matcher(s);
            if (m.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

}
