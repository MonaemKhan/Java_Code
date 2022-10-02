
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class hnyc7 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = scan.nextInt();
        String ss ;
        int k ;
        String ss1 = "";
        for (int m = 0; m < n; m++) {
            k = scan.nextInt();

            ss = br.readLine();
            
            for (int i = 0; i < ss.length(); i++) {

                if (ss.charAt(i) != ' ') {
                    int num = (int)(ss.charAt(i));
                    if (num + k >= 122) {
                        int re = (num + k) - 122;
                        int re2 = 96 + re;
                        ss1 = ss1 + (char)re2;
                    } else {
                        ss1 = ss1 + (char)(num + k);
                    }
                } else {
                    ss1 = ss1 + ' ';
                }
            }
            ss1= ss1+"\n";

        }
        System.out.println(ss1);

        
    }
}
