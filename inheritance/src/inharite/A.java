package inharite;

public class A {

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
