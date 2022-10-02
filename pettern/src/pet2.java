
public class pet2 {

    public static void main(String[] args) {
        int[] num = new int[5];
        int k = 0;
        for (int i = 0; i <= 4; i++) {
            num[i] = k;
            k++;
        }
        for (int j = 0; j <= 4; j++) {
            for (int i = 0; i <= 4; i++) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(" " + num[j]);
                }
            }
            System.out.println();
        }
    }

}
