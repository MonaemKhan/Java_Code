
public class String5 {

    public static void main(String[] args) {
        String sp = "Bangladesh is My";
        System.out.println(sp.length());
        StringBuilder k = new StringBuilder(sp);
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
