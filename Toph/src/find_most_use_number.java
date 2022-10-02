
import java.util.Scanner;

public class find_most_use_number {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] arr = s.toCharArray();
        char[] str = s.toCharArray();
        int max = 0;
        int temp = 0;
        
        for (int i = 0; i < arr.length; i++) {
          int count = 0;  
            for (int j = 0; j < str.length; j++) {
                if(arr[i] == str[j]){
                    str[j] = '#';
                    count += 1;
                }
            }
            if(count>max){
                max = count;
                temp = i;
            }
        }
        System.out.println(arr[temp]);
        
    }
}
