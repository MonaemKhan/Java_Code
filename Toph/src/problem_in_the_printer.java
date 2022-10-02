
import java.util.Scanner;

public class problem_in_the_printer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            String ss  ="";
            if (str.equals("the end.")) {
                break;
            } else {
                char[] arr = str.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    switch (arr[i]) {
                        case 'b':
                           ss += '6';
                            break;
                        case 'g':
                            ss += '9';
                            break;
                        case 'l':
                            ss += '1';
                            break;
                        case 'o':
                            ss += '0';
                            break;
                        case 's':
                            ss += '5';
                            break;
                        case 'z':
                            ss += '2';
                            break;
                        case '6':
                           ss += 'b';
                            break;
                        case '9':
                            ss += 'g';
                            break;
                        case '1':
                            ss += 'l';
                            break;
                        case '0':
                            ss += 'o';
                            break;
                        case '5':
                            ss += 's';
                            break;
                        case '2':
                            ss += 'z';
                            break;
                        default :
                            ss += arr[i];
                    }
                }
                System.out.println(ss);
            }
        }
    }
}
