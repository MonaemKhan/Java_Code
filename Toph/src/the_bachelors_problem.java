
import java.util.Scanner;

public class the_bachelors_problem {

    static Scanner scan = new Scanner(System.in);

    static int bill() {

        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum = sum + scan.nextInt();
        }

        return sum;
    }

    public static void main(String[] args) {
        int ans,i=1;
        int test = scan.nextInt();
        while (test-- > 0) {
           ans = bill();
           
           ans -= scan.nextInt();
           
           ans += bill();
           if(ans<0){
           ans=0;
           }
            System.out.print("Case "+i+": "+ans+"\n");
        }
    }
}
