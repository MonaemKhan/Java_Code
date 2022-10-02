
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class hnyc3 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = scan.nextInt();
        String[] ss = new String[n];
        int[] k = new int[n];
        for (int m = 0; m < n; m++) {
            k[m] = scan.nextInt();

            ss[m] = br.readLine();

        }
        String ss1 = "";
        for (int j = 0; j < n; j++) {

            
            for (int i = 0; i < ss[j].length(); i++) {

                if (ss[j].charAt(i) != ' ') {
                    int num = (int)(ss[j].charAt(i));
                    if (num + k[j] >= 122) {
                        int re = (num + k[j]) - 122;
                        int re2 = 96 + re;
                        ss1 = ss1 + (char)re2;
                    } else {
                        ss1 = ss1 + (char)(num + k[j]);
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
