package warp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Datetime {
    public static void main(String[] args) {
    
        Date d1 = new Date();
        
        DateFormat d2 = new SimpleDateFormat("dd/MM/YYYY");
        String d = d2.format(d1);
        System.out.println("Date ->\t"+d);
        
        LocalTime t1 = LocalTime.now();
        DateTimeFormatter t2 = DateTimeFormatter.ofPattern("hh:mm:ss");
        String t = t2.format(t1);
        System.out.println("time ->\t"+t);
    }
    
}
