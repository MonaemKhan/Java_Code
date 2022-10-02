
public class pet6 {

    public static void main(String[] args) {

        int k = 0;

                    double q = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == i) {
                    int r = (int) Math.pow(2,k);
                    System.out.printf("%f  %d  %d",q,k,r);
                    k+=1;
                    q = q/k;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
