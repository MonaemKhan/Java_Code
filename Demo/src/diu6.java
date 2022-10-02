
import java.util.Scanner;

public class diu6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        String[] result = new String[t];
        String[] ss = new String[4];
        int[] num = new int[4];
        int seat, arms = 0, back = 0, seat_no = 0, struc = 0;

        for (int l = 0; l < t; l++) {

            seat = scan.nextInt();

            for (int j = 0; j < 4; j++) {
                ss[j] = scan.next();
                num[j] = scan.nextInt();
            }

            for (int i = 0; i < 4; i++) {
                if (ss[i].charAt(0) == 'A') {
                    arms = num[i];
                } else if (ss[i].charAt(0) == 'B') {
                    back = num[i];
                } else if (ss[i].charAt(0) == 'S' && ss[i].charAt(1) == 't') {
                    struc = num[i];
                } else {
                    seat_no = num[i];
                }
            }

            if (seat > struc * 2) {
                result[l] = "Abort! Abort!";
            } else {
                if (seat < struc) {
                    if (seat * 2 <= arms && seat * 2 <= back && seat * 2 <= seat_no) {
                        result[l] = "Carry On!";
                    } else {
                        result[l] = "Abort! Abort!";
                    }
                } else {
                    if (struc * 2 <= arms && struc * 2 <= back && struc * 2 <= seat_no) {
                        result[l] = "Carry On!";
                    } else {
                        result[l] = "Abort! Abort!";
                    }
                }
            }

        }
        for (int j = 0; j < t; j++) {
            System.out.println("Case " + (j + 1) + ": " + result[j]);
        }

    }

}
