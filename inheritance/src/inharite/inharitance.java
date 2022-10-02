package inharite;

public class inharitance {

    public static void main(String[] args) {

        System.out.println("orginal\n");
        A r = new A("BMW", 300);
        r.display();
        r.hashCode();
        System.out.println("\n1st Upgrade\n");
        B q = new B("BMW", 300, "Red", "MK-427");
        q.display();

        System.out.println("\n2nd upgrade\n");
        C p = new C("BMW", 300, "Red", "MK-427s", 300, 12);
        p.display();
    }

}

class A {

    @SuppressWarnings("FieldMayBeFinal")
    private String car;
    @SuppressWarnings("FieldMayBeFinal")
    private int weight;

    A(String c, int weight) {
        car = c;
        this.weight = weight;
    }

    void display() {
        System.out.println("Car Name\t:\t" + car);
        System.out.println("Car weight\t:\t" + weight + "Kg");
    }
}

class B extends A {

    @SuppressWarnings("FieldMayBeFinal")
    private String color;
    @SuppressWarnings("FieldMayBeFinal")
    private String model;

    B(String c, int w, String co, String model) {
        super(c, w);
        color = co;
        this.model = model;
    }

    @SuppressWarnings("override")
    void display() {
        super.display();
        System.out.println("Car color\t:\t" + color);
        System.out.println("Car Model\t:\t" + model);
    }
}

class C extends B {

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


