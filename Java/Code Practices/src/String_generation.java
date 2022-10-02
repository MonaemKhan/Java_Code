//https://codeforces.com/contest/1461/problem/A
import java.util.Scanner;

public class String_generation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str ;
        
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            str = "";
            
            for (int i = 0; i < k; i++) {
                   str = str +'a';
                }
                while(str.length() <= n){
                    str = str+"bca";
                }
                char arr[] = str.toCharArray();
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
        }
    }

}
