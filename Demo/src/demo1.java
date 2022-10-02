
import java.util.Scanner;

class demo1{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    private static class MyRegex {

        private String pattern;

        public MyRegex() {
        }
    }
}

//Write your code here