
import java.util.*;

public class NewMain1 {

    public static int longs(String str) {
        int n = str.length();
        int res = 0;

        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];

            for (int j = i; j < n; j++) {
                if (visited[str.charAt(j)] == true) {
                    break;
                } else {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
            visited[str.charAt(i)] = false;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            System.out.println(longs(scan.next()));
        }

    }
}
