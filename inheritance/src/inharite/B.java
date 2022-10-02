package inharite;

public class B extends A {

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
