package contest_2020_r_4;

import java.util.Scanner;

public class dubbu_enterprise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l,n,an;
        double broken_part,stand_part;
        n = scan.nextInt();
        while (n-- > 0) {
            l = scan.nextInt();
            an = scan.nextInt();
            broken_part = (l) / Math.sin(Math.toRadians(an));
            stand_part = (l) / Math.tan(Math.toRadians(an));
            System.out.printf("%.6f\n", broken_part + stand_part);
        }

    }

}
