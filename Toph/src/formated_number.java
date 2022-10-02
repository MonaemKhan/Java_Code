
import java.text.DecimalFormat;
import java.util.Scanner;


public class formated_number {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        DecimalFormat ft = new DecimalFormat("##,###,###,###,###,###,###");
        System.out.println(ft.format(num));
        
        
    }
    
}
