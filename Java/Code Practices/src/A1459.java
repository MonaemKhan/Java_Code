//https://codeforces.com/contest/1459/problem/A
import java.util.Scanner;


public class A1459 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int t = scan.nextInt();
       // char a = '7';
        //int x  = (int) a-48;
        //System.out.println(x);
        while(t-->0){
            int n = scan.nextInt();
            String s = scan.next();
            String s1 = scan.next();
            
            char arr[] = s.toCharArray();
            char arr1[] = s1.toCharArray();
            
            int r=0,b=0;
            
            for (int i = 0; i < n; i++) {
                if((int) arr[i]-48 > (int) arr1[i]-48){
                    r++;
                }
                if((int) arr[i]-48 < (int) arr1[i]-48){
                    b++;
                }
            }
            
            if(r == b){
                System.out.println("EQUAL");
            }else if(r<b){
                System.out.println("BLUE");
            }else if(r>b){
                System.out.println("RED");
            }
            
        }
    }
    
}
