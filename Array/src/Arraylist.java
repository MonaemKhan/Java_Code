
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int j = scan.nextInt();
            data.add(j);
        }
        System.out.println(data);
        data.remove(3);
        System.out.println(data);
        data.removeAll(data);
        System.out.println(data);
    }
}
