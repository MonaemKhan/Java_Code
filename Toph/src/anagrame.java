
import java.util.Arrays;
import java.util.Scanner;


public class anagrame {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String ss = scan.next();
        char[] name = new char[s.length()];
        char[] name1 = new char[ss.length()];
        for (int i = 0; i < s.length(); i++) {
            name[i] = s.charAt(i);
        }
        for (int i = 0; i < ss.length(); i++) {
            name1[i] = ss.charAt(i);
        }
        Arrays.sort(name);
        Arrays.sort(name1);
        if(Arrays.toString(name).equals(Arrays.toString(name1)))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}
