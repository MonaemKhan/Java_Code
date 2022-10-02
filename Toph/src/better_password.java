
import java.util.Scanner;

public class better_password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ss = scan.nextLine();
        String ne = "";
        if (ss.charAt(0) > 'a' && ss.charAt(0) < 'z') {
            int num = (int) ss.charAt(0) - 32;
            char c  =(char) num;
            ne = ne + c;
        }
        char[] str = ss.toCharArray();
        
        for (int i = 1; i < str.length; i++) {
            switch (str[i]) {
                case 's':
                    ne = ne + "$";
                    break;
                case 'S':
                    ne = ne + "$";
                    break;
                case 'i':
                    ne = ne + "!";
                    break;
                case 'I':
                    ne = ne + "!";
                    break;
                case 'O':
                    ne = ne + "()";
                    break;
                case 'o':
                    ne = ne + "()";
                    break;
                default:
                    ne = ne + str[i];
                    break;
            }
        }

        ne = ne + ".";
        System.out.println(ne);
    }
}
