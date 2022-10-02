
import java.util.Scanner;


public class biust001 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test_case = scan.nextInt();
        for (int i = 0; i < test_case; i++) {
            int application = scan.nextInt();
            int max = 0;
            int input_num = 0;
            for (int j = 0; j < application; j++) {
                int input = scan.nextInt();
                input_num = input_num+input;
                for (int k = 0; k < input; k++) {
                    int num = scan.nextInt();
                    if(max<num)
                        max = num;
                    
                }
            }
            double result = ((input_num*1.0)/max)*100;
            System.out.printf("Application "+(i+1)+": %.2f",result);
        }
    }
    
}
