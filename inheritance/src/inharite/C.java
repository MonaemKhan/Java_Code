package inharite;

public class C extends B {

    @SuppressWarnings("FieldMayBeFinal")
    private int hisp;
    @SuppressWarnings("FieldMayBeFinal")
    private int gear;

    C(String c, int w, String co, String mo, int s, int gear) {
        super(c, w, co, mo);
        hisp = s;
        this.gear = gear;
    }

    @SuppressWarnings("override")
    void display() {
        super.display();
        System.out.println("Highest Speed\t:\t" + hisp);
        System.out.println("Car Total Gear\t:\t" + gear);
    }

}
