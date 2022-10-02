
import java.util.Scanner;


public class removeduplicates {
    
    public static void test(String str){
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
       
        for (int i = 0; i < str.length(); i++) {
             int count = 1 ;
            if(arr[i] != '0'){
                for (int j = i+1; j < str.length(); j++) {
                    if(arr[i] == arr[j]){
                        count++;
                        arr[j] = '0';
                    }
                }
                System.out.println(arr[i]+" "+count);
            }
            
                
        }
        
            
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 1;
        while(n-->0){
//            String str = scan.next();
            System.out.println("Case #"+k+":");
            test(scan.next());
            k++;
        }
    }
    
}
