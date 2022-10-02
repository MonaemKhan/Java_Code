
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-arraylist/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

/*
Bad solution Of this problem;
*/
public class Arraysearch {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int m = scan.nextInt();
        String[] input = new String[m];
        for (int i = 0; i < m; i++) {
            input[i] = monaem();
        }
        
        int test = scan.nextInt();
        while(test-->0){
            int line = scan.nextInt();
            int colume = scan.nextInt();
            try{
                String s1 = extract(input[line-1],colume); 
                if(!"".equals(s1)){
                    System.out.print(s1+"\n");
                }else{
                    System.out.print("ERROR!\n");
                }
            }catch(Exception e){
                    System.out.print("ERROR!\n");
            }
            
        }
        
    }
    static String extract(String str,int col){
        
        try{
            String[] ss = str.split(" ");
            return ss[col-1];
        }catch(Exception e){
            return "";
        }
        
    }
    static String monaem() {
        int n = scan.nextInt();
        
        String str = "";
        try{
        for (int i = 0; i < n; i++) {
            str = str+scan.next()+" ";
            
        }
        return str;
        }catch(Exception e){
            return "";
        }
    }

}
