package infinitadd;

public class add {

    static void ad(int... num) {
        int sum = 0;
        for (int i : num) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
