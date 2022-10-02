//https://www.hackerrank.com/challenges/phone-book/problem?h_r=next-challenge&h_v=zen

import java.util.*;

class Solution {

    public static void main(String[] argh) {
        int n,num;
        String s,name;
        boolean flag;
        
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        scan.nextLine();
        HashMap<String,Integer> map = new HashMap();
        while(n-->0){
            name = scan.nextLine();
            num = scan.nextInt();
            map.put(name, num);
            scan.nextLine();
        }
        while(scan.hasNext()){
            s = scan.nextLine();
            if(map.containsKey(s)){
                System.out.println(s+"="+map.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        scan.close();
    }
}
