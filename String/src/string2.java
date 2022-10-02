
public class string2 {


    public static void main(String[] args) {
       String s = "Monaem";
       String s1 = " Khan";
       
       System.out.println("S  = "+s);
       System.out.println("S1 = "+s1.trim());
       
       String full = s.concat(s1);
       System.out.println("full = "+full);
       
       System.out.println("toUpperCase = "+full.toUpperCase());
       
       System.out.println("toLowerCase = "+full.toLowerCase());
       
       System.out.println(s.replace('a', 'e'));
       
       System.out.println(s.replaceAll(s, s1).trim());
       
       String sp = "Bangladesh is my";
       String[] sp2 = sp.split(" ");
       for(String i : sp2)
       System.out.println(i);
       
       
       
    }
    
}
