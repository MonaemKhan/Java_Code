package method;

import java.util.Scanner;


public class rectarea {
    public static void main(String[] args) {
        rect area = new rect(20,30);
        rect area1 = new rect(22);
        rect area2 = new rect();
        System.out.println("Constractor With 2 Perameters\nAREA = " +area.result()
                        +"\nConstractor With 1 Perameter\nAREA1 = "+area1.result()
                        +"\nConstractor With 0 Perameter\nAREA2 = "+area2.result());
        rect area3 = new rect();
        area3.getdata(20,21);
        System.out.println("Without Constractor & with Set Value"
                       + "\nAREA4 = "+area3.result());
        Scanner scan = new Scanner(System.in);
        rect area4 = new rect();
        System.out.println("Enter Length and Width Of Ractengale");
        
        int a = area4.length = scan.nextInt();
        int b = area4.width = scan.nextInt();
        System.out.println("With Methode & Given Values"
                       + "\nAREA3 = "+area4.result());
        rect area5 = new rect();
        area5.getdata(a,b);
        System.out.println("With Methode & with Given Values"
                       + "\nAREA4 = "+area5.result());        
    }
    
}
