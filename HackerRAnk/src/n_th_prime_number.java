
import java.util.ArrayList;
import java.util.Scanner;

public class n_th_prime_number {

    static int MAX_SIZE = 10000005;
    static boolean[] IsPrime = new boolean[MAX_SIZE];

    static ArrayList<Integer> primes
            = new ArrayList<Integer>();

    static void SieveOfEratosthenes() {

       // boolean[] IsPrime = new boolean[MAX_SIZE];

        for (int i = 0; i < MAX_SIZE; i++) {
            IsPrime[i] = true;
        }

        for (int p = 2; p * p < MAX_SIZE; p++) {

            if (IsPrime[p] == true) {

                for (int i = p * p; i < MAX_SIZE; i += p) {
                    IsPrime[i] = false;
                }
            }
        }

        for (int p = 2; p < MAX_SIZE; p++) {
            if (IsPrime[p] == true) {
                primes.add(p);
            }
        }
    }

    public static void main(String[] args) {

        SieveOfEratosthenes();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n-->0){
            int num = scan.nextInt();
            int num1 = scan.nextInt();
            int sum = num+num1;
            int count = 0;
            for (int i = sum+1; i < MAX_SIZE; i++) {
                if(IsPrime[i] == true){
                    count++;
                    break;
                }else{
                    count++;
                }
            }
            System.out.println(count);
            
        }
    }
}
