
package infinitadd;

public class NewMain1 {

    public static void main(String[] args) {
        int base,height;
        double area;
        
        base=12;
        height=14;
        area = 0.5 * (base*height);
        System.out.println(area);
        
        base=10;
        height=12;
        area = 0.5 * (base*height);
        System.out.println(area);
        
        result(12,14);
        result(10,12);
        
    }
    
    static void result(int base,int height){
        System.out.println(0.5*base*height);
    }
}
