package warp;

import java.util.Random;

public class random_num {

    public static void main(String[] args) {
        Random num = new Random();
        int rand = (num.nextInt(9) + 1);
        System.out.println(rand);
    }
    
}
