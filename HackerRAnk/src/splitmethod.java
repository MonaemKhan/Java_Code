/*
https://www.hackerrank.com/challenges/java-string-tokens/problem
*/
import java.util.*;

public class splitmethod {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String sp[] = s.split("[ !,?.@'_]+");
        int count = 0;
        for (String a : sp) {
            if(!a.isEmpty()){
                count++;
            }
        }
        System.out.println(count);
        for (String a : sp) {
            if(!a.isEmpty()){
                System.out.println(a);
            }
        }
        scan.close();
    }
}
