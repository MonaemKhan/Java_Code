package Dynamic_programming;

import java.util.*;

public class Coin_changeing {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Total Number Of Coin/Taka : ");
        int n = in.nextInt();

        int coin[] = new int[n];
        int coin_num[] = new int[n];

        System.out.println("Coin/Taka :");
        for (int i = 0; i < n; i++) {
            coin[i] = in.nextInt();
        }

        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(coin[i] + " coin are : ");
            coin_num[i] = in.nextInt();
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (coin[i] < coin[i + 1]) {
                    int temp = coin[i];
                    coin[i] = coin[i + 1];
                    coin[i + 1] = temp;

                    temp = coin_num[i];
                    coin_num[i] = coin_num[i + 1];
                    coin_num[i + 1] = temp;
                }
            }
        }

        String op = "1";
        int price, amount;
        while ("1".equals(op)) {
            System.out.print("\nEnter Price Of Product : ");
            price = in.nextInt();

            System.out.print("Enter Amount Given By The Customer : ");
            amount = in.nextInt();

            System.out.println("\nCoin Are :\n\t" + Arrays.toString(coin));
            System.out.println("\nBEfore Transection Total Coin Are :\n\t" + Arrays.toString(coin_num));
            change(coin, coin_num, (amount - price));

            System.out.print("\nIf You Want to Continue Press 1  to Terminate Press Anything: ");
            op = in.next();
        }
    }

    static void change(int con[], int con_num[], int re) {
        int index[] = new int[con.length];
        for (int i = 0; i < con.length; i++) {
            int j = 0;
            while (re >= con[i] && con_num[i] != 0) {
                j++;
                con_num[i]--;
                re = (re - con[i]);
            }
            index[i] = j;
        }

        System.out.println("Coin Taken :\n\t" + Arrays.toString(index));
        if (re > 0) {
            System.out.println("!!! Changing Unsuccesfull !!!");
        } else {
            System.out.println("After Transection Number Of Coin:\n\t" + Arrays.toString(con_num));
        }

    }

}
