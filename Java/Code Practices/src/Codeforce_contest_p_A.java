//https://codeforces.com/contest/1453/problem/A
import java.util.Scanner;


public class Codeforce_contest_p_A {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t,n,m,count,i,j;
        int[] n_arr,m_arr;
        t = scan.nextInt();
        while(t-->0){
            n = scan.nextInt();
            m= scan.nextInt();
            
            n_arr = new int[n];
            m_arr = new int[m];
            for (i = 0; i < n; i++) {
                n_arr[i] = scan.nextInt();
            }
            for (i = 0; i < m; i++) {
                m_arr[i] = scan.nextInt();
            }
            count = 0;
            for (i = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    if(n_arr[i] == m_arr[j]){
                        count++;
                    }
                }
            }
            System.out.print(count+"\n");
        }
        
    }
    
}
