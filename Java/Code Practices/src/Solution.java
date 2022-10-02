
import java.util.Scanner;

class GFG {

    static void lexicoSmallestPermuatation(int arr[], int n) {
        
        int cnt[] = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            ++cnt[arr[i]];
        }
        
        int ele = 1, replacement = 0;
        boolean vis[] = new boolean[n + 1];
        for (int i = 0; i < n; ++i) {

            
            if (cnt[arr[i]] == 1) {
                continue;
            }

            
            while (cnt[ele] > 0) {
                ++ele;
            }

            
            if (ele > arr[i] && !vis[arr[i]]) {
                vis[arr[i]] = true;
            } else {

                
                --cnt[arr[i]];
                arr[i] = ele;

                ++replacement;

                ++ele;
            }
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int arr[] = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = scan.nextInt();
        }
        int sz = arr.length;
        lexicoSmallestPermuatation(arr, sz);
        
    }
}

