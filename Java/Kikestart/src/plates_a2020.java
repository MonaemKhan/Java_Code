
import java.util.*;

/*
https://codingcompetitions.withgoogle.com/kickstart/round/000000000019ffc7/00000000001d40bb
 */
/**
 *
 * @author khanm
 *  unsloved
 */
public class plates_a2020 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        int x = 0;
        while (test-- > 0) {
            x++;
            int n = scan.nextInt();
            int k = scan.nextInt();
            int p = scan.nextInt();

            Vector<Vector<Integer>> vec = new Vector<>();

            int max = 0;
            int a = 0, b = 0;

            for (int i = 0; i < n; i++) {
                Vector<Integer> rr = new Vector<>();
                vec.add(rr);
                for (int j = 0; j < k; j++) {
                    rr.add(scan.nextInt());
                    if (max <= vec.get(i).get(j)) {
                        max = vec.get(i).get(j);
                        a = i;
                        b = j;
                    }
                }
            }
            //System.out.println("Max = " + max + " a = " + a + " b = " + b);

            int sum = 0;
            for (int i = 0; i <= b; i++) {
                sum += vec.get(a).get(i);
                p--;
            }

            for (int i = 2; i >= 0; i--) {
                try {
                    vec.get(a).remove(i);
                } catch (Exception e) {
                }
            }

            //System.out.println("Sum1 = " + sum);

            //System.out.println("p = " + p);
            while (p > 0) {

                max = 0;
                for (int i = 0; i < n; i++) {
                    if (vec.get(i).isEmpty()) {
                        
                    } else {
                        for (int j = 0; j < vec.get(i).size(); j++) {
                            //System.out.println("Size  = "+vec.get(i).size()+" i = "+i);
                            if (max <= vec.get(i).get(j)) {
                                a = i;
                                b = j;
                                max = vec.get(i).get(j);
                            }
                        }
                    }

                }
               // System.out.println("hi");
                if (p < (b + 1)) {
                    try {
                        vec.get(a).remove(b);
                    } catch (Exception e) {
                    }
                } else {
                    for (int j = b; j >= 0; j--) {
                        sum += vec.get(a).get(j);
                        p--;
                    }
                    for (int j = b; j >= 0; j--) {
                        try {
                            vec.get(a).remove(j);
                        } catch (Exception e) {
                        }
                    }
                }
                
               // System.out.println("P1 = "+p);
            }

            System.out.println("Case #" + x + ": " + sum);
        }
    }
}

