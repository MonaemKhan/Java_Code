/*
https://www.hackerrank.com/challenges/java-string-compare/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*/
import java.util.Scanner;

public class substring2 {

    public static String getSmallestAndLargest(String s, int n) {
        String smallest = (String) s.subSequence(0,  n);
        String largest = (String) s.subSequence(0, n);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j = j + n) {
                try {
                    String sub = (String) s.subSequence(j, j + n);
                    if(smallest.compareTo(sub)> 0){
                        smallest = sub;
                    }
                    if(largest.compareTo(sub)<0){
                        largest = sub;
                    }
                    
                } catch (Exception e) {
                    // do nothing
                }

            }
        }
        
        
        
        return smallest + "\n" + largest;
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}