
import java.util.ArrayList;
import java.util.Scanner;

public class problem_e {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t,x,n,sum,i,move,dif,arr[];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        t = scan.nextInt();
        x = 1;

        while (t-- > 0) {
            n = scan.nextInt();
            arr = new int[n];
            for (i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            
            sum = 0;
            for (i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    sum = sum + arr[i];
                    list.add(i);
                }
            }
            
            move = 0;
            dif = 0;
            for (i = 0; i < list.size() - 1; i++) {
                dif = list.get(i + 1) - list.get(i);
                if (dif > 1) {
                    move++;
                }
            }
            
            System.out.println("Case "+x+": "+sum+" "+move);
            x++;
            list.clear();
        }

    }

}
