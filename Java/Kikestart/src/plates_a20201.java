
import java.util.*;

/*
https://codingcompetitions.withgoogle.com/kickstart/round/000000000019ffc7/00000000001d40bb
 */
/**
 *
 * @author khanm
 */
public class plates_a20201 {
    static int n,k,p;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max,a,b,sum = 0,x=0;
        int test = scan.nextInt();
        
        while (test-- > 0) {
            x++;
            n = scan.nextInt();
            k = scan.nextInt();
            p = scan.nextInt();
            
            int val[][] = new int[n][k];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    if(j==0){
                        val[i][j] = scan.nextInt();
                    }else{
                        val[i][j] = scan.nextInt()+val[i][j-1];
                    }
                }
            }
            
            int arr[] = new int[n*k];
            
            for (int i = 0; i < n*k; i++) {
                
            }
            
            
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < k; j++) {
//                    System.out.print(val[i][j]+" ");
//                }
//                System.out.println();
//            }
            
            System.out.println("Case #" + x + ": " + sum);
        }
    }
    
}

