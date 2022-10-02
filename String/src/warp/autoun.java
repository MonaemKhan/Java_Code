package warp;

public class autoun {

    public static void main(String[] args) {
        int a = 10;
        Double d = (double) a ; //Double.valueOf(a);//autoboxing
        System.out.println(d);
        
        Integer k = new Integer (5);
        int b = k;//k.intValue()//outboxing
        System.out.println(b);
        
        String s = Integer.toString(a);
        System.out.println(s);
        
        int q = Integer.valueOf(s);//Integer.parseInt(s);
        System.out.println(q);
                
                
    }

}
