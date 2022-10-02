
import java.util.Scanner;

public class Duplicateword {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        // s = s.toLowerCase(); //for ignoring uppercase lowercase problem
        char arr[] = s.toCharArray(); // use this to make a string into charecter array
        int count;
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            if (arr[i] != '0') {
                count++;
                for (int j = i+1; j < s.length(); j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = '0';
                    }
                }
            }
            if (count != 0) {
                System.out.println(arr[i] + " = " + count);
            }
        }
    }

}
