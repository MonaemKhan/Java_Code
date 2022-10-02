public class string1 {

    public static void main(String[] args) {
        String s = "Monaem Khan";
        String s1 = "Monaem";
        String s2 = new String("Monaem Khan");
        String s3 = new String("monaem kHan");
        
        System.out.println(" S = "+s);
        System.out.println("S1 = "+s1);
        System.out.println("S2 = "+s2);
        System.out.println("S3 = "+s3);
        System.out.println("\n");
        
        boolean a = s.equals(s2);
        System.out.println("Using equals Method[s,s2]\t"+a);
        boolean b = s.matches(s3);
        System.out.println("Using matchs Method[s,s3]\t"+b);
        boolean c = s.contains(s1);
        System.out.println("Using contains Method[s,s2]\t"+c);
        boolean d = s.equals(s3);
        System.out.println("Using equals Method[s,s3]\t"+d);
        boolean e = s.equalsIgnoreCase(s3);
        System.out.println("Using equalsIgnorCase Method[s,s3]\t"+e);
        boolean f = s.isEmpty();
        System.out.println("Using isEmpty Method[s]\t"+f);
        boolean g = s.contentEquals(s2);
        System.out.println("Using contentEquals Method[s,s2]\t"+g);
        boolean h = s.endsWith("n");
        System.out.println("Using endsWith (n) Method[s]\t"+h);
        boolean i = s.startsWith("m");
        System.out.println("Using startWith (M) Method[s]\t"+i);
        
    }
    
}
