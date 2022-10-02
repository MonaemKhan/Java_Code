
import java.util.Scanner;


public class ifelse {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a%2 == 0){
            if((a>2 && a<5) || a>20){
                System.out.println("Not Weird");
            }else{
                System.out.println("Weird");
            }
        }else{
                System.out.println("Weird");
            }
    }
    
}
