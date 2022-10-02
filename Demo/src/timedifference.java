
import java.util.*;

public class timedifference {

    public static void main(String[] args) {
        int h1, m1, h2, m2, fh, fm;

        Scanner scan = new Scanner(System.in);
        h1 = scan.nextInt();
        m1 = scan.nextInt();
        h2 = scan.nextInt();
        m2 = scan.nextInt();
        //String b = scan.nextLine();

        if (h1 >= h2) {
            fh = ((24 - h1) + h2);
        } else {
            fh = ((h2) - h1);
        }
        if (m1 >= m2) {
            fm = ((60 - m1) + m2);
        } else {
            fm = ((m2) - m1);
        }
        if (fh >= (60 % fm)) {
            fh = (fh - (60 % fm));
        } else {
            fh = 0;
        }
        if (fm == 60) {
            fm = 0;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", fh, fm);
    }

}
