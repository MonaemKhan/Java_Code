
import java.util.Scanner;

public class leap_year {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%4==0 && num%400!=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
