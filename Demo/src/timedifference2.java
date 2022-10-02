
import java.util.Scanner;

public class timedifference2 {

    public static void main(String[] args) {
        int h1, m1, h2, m2, fh, fm;

        Scanner scan = new Scanner(System.in);
        h1 = scan.nextInt();
        m1 = scan.nextInt();
        h2 = scan.nextInt();
        m2 = scan.nextInt();

        fh = h2 - h1;
        fm = m2 - m1;
        if (fh <= 0) {
            fh = 24 - fh;
        }
        if (fm < 0) {
            fm = (int) (60 - Math.sqrt(Math.pow(fm,2)));
            fh--;
        }
        if (h1 == h2 && m1 == m2) {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", fh, fm);
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", fh, fm);
        }

    }

}
