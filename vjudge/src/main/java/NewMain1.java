
import java.util.Arrays;
import java.util.Scanner;

public class NewMain1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        double s, t, cr, c, icr, ica, tra;
        int[] a = new int[3];
        for (i = 0; i < 3; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);

        s = (a[0] + a[1] + a[2]) / 2;
        t = Math.sqrt(s * (s - a[0]) * (s - a[1]) * (s - a[2]));
        cr = (a[0] * a[1] * a[2]) / (4 * t);
        c = Math.PI * Math.pow(cr, 2);
        icr = t / s;
        ica = Math.PI * Math.pow(icr, 2);
        tra = t - ica;
        c -= t;
        System.out.printf("%.4f %.4f %.4f\n", c, tra, ica);
    }

}
