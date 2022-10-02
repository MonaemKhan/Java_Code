
import java.util.Scanner;


public class Prime_Number {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count=0;
        if(num<3)
            System.out.println("Yes");
        for (int i = 2; i <num; i++) {
            if(num%i==0)
                count+=1;
        }
        if(count==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}
