
package Ramadan_contest;

import java.util.Scanner;


public class read {
    
    public static int sentence(String str){
        
        
        String st[] = str.split("[!.]+");
        int length = st.length;
        //System.out.println(length);
        return length;
    }
    
     public static int word(String str){
        
        
        String st[] = str.split("[!., ]+");
        int length = st.length;
        int count = 0;
        //System.out.println(length);
        return length;
    }
    
     public static int letter(String str){
        
        
        String st[] = str.split("[!., ']+");
        int count = 0;
         for (String s : st) {
             count = count+s.length();
         }
         //System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ss = scan.nextLine();
        int sen = sentence(ss);
        int wo = word(ss);
        int lett = letter(ss);
        
        float s = (float) ((((lett*1.0)/wo)*100)*0.0588);
        //System.out.println(s);
        float l = (float) ((((sen*1.0)/wo)*100)*0.296);
        //System.out.println(l);
        int index = (int) Math.round(s-l-15.8);
        
        System.out.println("Grade: "+index);
    }
    
}
