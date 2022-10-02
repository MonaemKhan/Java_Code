
import java.util.Arrays;

public class Array_sorting {

    public static void main(String[] args) {
        int[] data = {11, 12, 33, 123, 9, 44, 55, 65, 34, 23, 445, 5};
        String[] name = {"MONAEM", "KHAN", "ABU", "SAMA", "RAHAT", "AKANDA", "AZIZUL", "HAKIM", "AL", "MAMUN", "RANA"};
        System.out.println("int Size = " + data.length);
        System.out.println("\nBefore Sorting : ");
        for (int i : data) { //using For Each Loop
            System.out.print(" " + i + " ");
        }
        Arrays.sort(data);
        System.out.println("\nAfter Sorting : ");
        for (int i : data) { //using For Each Loop
            System.out.print(" " + i + " ");
        }
        System.out.println("\n\nString Size = " + name.length);
        System.out.println("\nBefore Sorting : ");
        for (String i : name) { //using For Each Loop
            System.out.print(i + "\t");
        }
        Arrays.sort(name);
        System.out.println("\nString Sorting : ");
        for (String i : name) { //using For Each Loop
            System.out.print(i + "\t");
        }
    }
}
