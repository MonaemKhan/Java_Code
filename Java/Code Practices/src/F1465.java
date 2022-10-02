
import java.util.Arrays;
import java.util.Scanner;

public class F1465 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, s, e, count, count1, mid, i;
        int t = scan.nextInt();
        while (t-- > 0) {
            n = scan.nextInt();
            int arr[] = new int[n];
            int ar[] = new int[n];
            for (i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
                ar[i] = arr[i];
            }
            Arrays.sort(arr);
            if (n % 2 != 0) {
                s = 0;
                e = n - 1;
                int arr1[] = new int[n];
                for (i = 1; i <= n; i++) {
                    if (i % 2 != 0) {
                        arr1[e] = arr[i - 1];
                        e--;
                    } else {
                        arr1[s] = arr[i - 1];
                        s++;
                    }
                }
                /*for (i = 0; i < n; i++) {
                    System.out.print(arr1[i] + " ");
                }
                System.out.println();*/
                count = 0;
                for (i = 0; i < n; i++) {
                    //System.out.println(ar[i] + " " + arr1[i]);
                    if (ar[i] != arr1[i]) {
                        //System.out.println("count = " + count);
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.print(n + " " + (count) + "\n");
                } else {
                    System.out.print(n + " " + (count - 1) + "\n");
                }
            } else {
                s = 0;
                e = n - 1;
                int flag = 0;
                int arr1[] = new int[n];
                for (i = 0; i < n; i = i + 2) {
                    if (flag == 0) {
                        arr1[e] = arr[i];
                        arr1[s] = arr[i + 1];
                        s++;
                        e--;
                        flag = 1;
                    } else {
                        arr1[s] = arr[i];
                        arr1[e] = arr[i + 1];
                        s++;
                        e--;
                        flag = 0;
                    }
                }
                //            for (i = 0; i < n; i++) {
                //              System.out.print(arr1[i] + " ");
                //        }
                //      System.out.println();
                int arr2[] = new int[n];
                mid = n / 2;
                s = 0;
                for (i = mid - 1; i >= 0; i--) {
                    arr2[s] = arr[i];
                    s++;
                }
                for (i = n - 1; i >= mid; i--) {
                    arr2[s] = arr[i];
                    s++;
                }
                //       for (i = 0; i < n; i++) {
                //          System.out.print(arr2[i] + " ");
                //    }
                //  System.out.println();
                count = 0;
                count1 = 0;
                for (i = 0; i < n; i++) {
                    if (ar[i] != arr1[i]) {
                        count++;
                    }
                    if (ar[i] != arr2[i]) {
                        count1++;
                    }
                }
                //int min = Math.min(count, count1);
                //System.out.println("count = " + count + " count1 = " + count1);
                if (count == 0 || count1 == 0) {
                    System.out.print(n + " 0\n");
                } else if (count == count1) {
                    System.out.print(n + " " + count / 2 + "\n");
                } else {
                    System.out.print(n + " " + Math.min(count, count1) / 2 + "\n");
                }

            }
        }
    }

}
