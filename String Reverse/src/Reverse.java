
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Massage to print :");
        String s = input.nextLine();
        String r = " ";
        for(int i = s.length()-1;i>=0;i--){
            r = r + s.charAt(i);        
        }
        System.out.println(r);
        
    }
    
}
