
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khanm
 */
public class Main {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int max = 0;
            int temp = 0;
            String s = scan.next();
            //System.out.println("t = "+t+" S = "+s);
            for (int i = 0; i < s.length(); i++) {
                for (int j = i+1; j < s.length(); j++) {
                    if(s.charAt(i) == s.charAt(j)){
                        temp = j-i;
                       // System.out.println(" temp of "+i+" =" +temp);
                        break;
                    }
                }
                if(max<temp){
                    max=temp;
                }else if(temp == 0){
                    max = s.length();
                }
            }
            System.out.println(max);
        }
        }
    }
