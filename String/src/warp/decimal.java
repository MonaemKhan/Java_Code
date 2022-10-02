package warp;

import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Decimal\t:\t");
        int de = scan.nextInt();
        
        String d = Integer.toBinaryString(de);
        String e = Integer.toOctalString(de);
        String f = Integer.toHexString(de);
        
        System.out.println("Binary\t:\t"+d);
        System.out.println("Octal\t:\t"+e);
        System.out.println("Hexa\t:\t"+f);
        
        ch();

    }

    public static void ch() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Binary\t:\t");
        String de = scan.next();
        int d = Integer.parseInt(de,2);
        System.out.println("Decimal\t:\t"+d);
        
        System.out.print("Octal\t:\t");
        de = scan.next();
        int e = Integer.parseInt(de,8);
        System.out.println("Decimal\t:\t"+e);
        
        System.out.print("Hexa\t:\t");
        de = scan.next();
        int f = Integer.parseInt(de,16);
        System.out.println("Decimal\t:\t"+f);
    }
}
