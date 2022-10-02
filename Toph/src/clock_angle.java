
import java.util.Scanner;


public class clock_angle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minite = scan.nextInt();
        if(hour==12)
            hour = 0;
        if(minite == 60)
            minite = 0;
        float hour_angle = (float) (0.5*(hour*60+minite));
        float minite_angle = (minite*6);
        
        float angle = Math.abs(hour_angle-minite_angle);
        float r_angle = Math.min(360-angle, angle);
        
        System.out.println(r_angle);
    }
    
}
