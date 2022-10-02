
public class testinheritance {

    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.bark();
    }

}

class animal {

    public void eat() {
        System.out.println("Eat");
    }
}

class dog extends animal {

    public void bark() {
        System.out.println("Barking");
    }
}
