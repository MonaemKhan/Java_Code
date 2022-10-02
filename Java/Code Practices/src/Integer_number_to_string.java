//https://codeforces.com/contest/535/problem/A
import java.util.Scanner;

public class Integer_number_to_string {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen"};
        String[] num1 = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        int n = scan.nextInt();
        if (n < 20) {
            System.out.println(num[n]);
        } else {
            int f = n / 10;
            int l = n % 10;
            if (l != 0) {
                System.out.println(num1[f- 2]+"-"+num[l]);
            } else {
                System.out.println(num1[f - 2]);
            }
        }

    }

}
