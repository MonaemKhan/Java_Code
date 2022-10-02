
import java.util.Scanner;

public class enco2  {

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
        StringBuffer s1 = new StringBuffer(s);
        s1.reverse();
        r = " ";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int j = (int) ch + 3;
            r = r + (char) j;
        }
        System.out.println(r);
    }

    public static void decode() {
        Scanner inpu = new Scanner(System.in);
        String s, r;
        s = inpu.nextLine();
        StringBuffer s1 = new StringBuffer(s);
        s1.reverse();
        r = " ";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int j = (int) ch + 3;
            r = r + (char) j;
        }
        System.out.println(r);
    }
}


    

