
import java.util.Scanner;

public class EOF_pasword_crack {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {

            String ss = scan.next();
            int total_count = 0, small_letter_count = 0, big_letter_count = 0, num_count = 0, count = 0;
            for (int i = 0; i < ss.length(); i++) {

                if (ss.charAt(i) >= 'a' && ss.charAt(i) <= 'z' && small_letter_count == 0) {

                    total_count += 1;
                    small_letter_count += 1;
                } else if (ss.charAt(i) >= 'A' && ss.charAt(i) <= 'Z' && big_letter_count == 0) {

                    total_count += 1;
                    big_letter_count += 1;
                } else if (ss.charAt(i) >= '0' && ss.charAt(i) <= '9' && num_count == 0) {

                    total_count += 1;
                    num_count += 1;
                }
                if (total_count == 3) {
                    count += 1;

                    total_count = 0;
                    small_letter_count = 0;
                    big_letter_count = 0;
                    num_count = 0;
                }

            }
            System.out.println(count);

        }
    }
}
