/*Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
*/
import java.text.*;
import java.util.*;

public class curencyformate {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        
        Locale ind = new Locale("en","IN");
        
        NumberFormat usf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaf = NumberFormat.getCurrencyInstance(ind);
        NumberFormat chinaf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat francef = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Write your code here.
        
        String us = usf.format(payment);
        String india = indiaf.format(payment);
        String china = chinaf.format(payment);
        String france = francef.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}