/*
Sample input 1

1
3
Sample output 1

3

Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive
*/
import java.util.Scanner;

public class staticblock {

    static Scanner scan = new Scanner(System.in);
    static Boolean flag = true;
    static int B = scan.nextInt();
    static int H = scan.nextInt();

    static {
        try{
        if(B<=0 || H<=0){
            flag = false;
            throw new Exception("Breadth and height must be positive"); 
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        
        if (flag) {
            System.out.println(B * H);
        }

    }

}
