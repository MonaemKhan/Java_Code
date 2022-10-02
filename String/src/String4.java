
public class String4 {

    public static void main(String[] args) {
        String sp = "Bangladesh is My";
        System.out.println(sp.length());
        StringBuffer k = new StringBuffer(sp);
        System.out.println(k);
        k.reverse();
        k.delete(5, 8);
        k.reverse();
        k.append(" Motherland");
        System.out.println(k + "\n" + k.length());
        k.setLength(18);
        System.out.println(k);
    }

}
