package Ramadan_contest;

import java.util.Scanner;

class pyramid {

    public static void printpyramid(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j = n - 1; j >= 0; j--) {
                if (i <= j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int x = scan.nextInt();
            if (x < 1 || x > 8) {
               
            } else {
                printpyramid(x);
            }
        }
    }
}
