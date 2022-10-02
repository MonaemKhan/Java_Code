
import java.util.Scanner;

public class encodeco2 {

    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in);
        System.out.print("Press 1 For encode your Massage & 0 to Decode Your Massage :  ");
        int a = inpu.nextInt();

        if (a == 1) {
            encode();
        } else {
            decode();
        }

    }

    public static void encode() {
        Scanner inpu = new Scanner(System.in);
        String s, r;
        s = inpu.nextLine();
        r = " ";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int j = (int) ch + 3;
            r = r + (char) j;
        }
        StringBuffer s1 = new StringBuffer(r);
        s1.reverse();
        String s2 = s1.toString();
        int n = Integer.parseInt(s2);
        String m = Integer.toBinaryString(n);
       /* String[] s2 = s1.toString().split(" ");
        for (String i : s2){
            binarry(i);
            System.out.print(" ");
        }*/
        
        System.out.println("\n->"+m);
    }
    
   /* public static void binarry(String s){
        String t = " ";
        for (int i = 0; i < s.length(); i++) {
            int j = (char)s.charAt(i);
            String k = Integer.toBinaryString(j);
            t = t.concat(k);
        }
        System.out.print(t);
    }*/
    
    public static void decode() {
        Scanner inpu = new Scanner(System.in);
        String s, r;
        s = inpu.nextLine();
        r = " ";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int j = (int) ch - 3;
            r = r + (char) j;
        }
        StringBuffer s1 = new StringBuffer(r);
        s1.reverse();
        int n = Integer.parseInt(s1.toString());
        String m = Integer.toBinaryString(n);
        System.out.println(m);
    }
}
