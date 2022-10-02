
import java.util.Scanner;

public class Caesar_Cipher {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String ss = scan.nextLine();

        char[] arr = ss.toCharArray();
       // System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!= ' ') {
                int num  = (int) arr[i] - n;
                if(num<97){
                    arr[i] = (char) (num+26);
                }else{
                    arr[i] = (char) num;
                }
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}

