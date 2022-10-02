//https://codeforces.com/contest/1462/problem/B
import java.util.Scanner;

public class Last_year_substring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            if (s.charAt(0) == '2') {
                if (s.substring(0, 4).equals("2020")) {
                    System.out.println("YES");
                } 
                else if (s.substring(0, 3).equals("202")) {
                    //System.out.println("sub1 = " + s.substring(n, n));
                    if (s.substring(n - 1, n).equals("0")) {
                        System.out.println("YES");
                    } else {
                        System.out.println("No");
                    }
                } 
                else if (s.substring(0, 2).equals("20")) {
                    // System.out.println("sub1 = " + s.substring(n - 2, n));
                    if (s.substring(n - 2, n).equals("20")) {
                        System.out.println("YES");
                    } else {
                        System.out.println("No");
                    }
                } 
                else if (s.substring(n - 3, n).equals("020")) {
                    // System.out.println("sub1 = " + s.substring(n - 3, n));
                    System.out.println("YES");
                } 
                else {
                    System.out.println("No");
                }
            } else {
                //System.out.println("sub2 = " + s.substring(n - 4, n));
                if (s.substring(n - 4, n).equals("2020")) {
                    System.out.println("YES");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

}
