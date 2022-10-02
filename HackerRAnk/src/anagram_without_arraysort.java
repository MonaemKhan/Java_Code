/*
https://www.hackerrank.com/challenges/java-anagrams/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*/
import java.util.Scanner;

public class anagram_without_arraysort {

    static boolean isAnagram(String s, String ss) {

        if (s.length() != ss.length()) {
            return false;
        } else {
            String one = sort(s);
            String two = sort(ss);
            if(one.equals(two)){
                return true;
            }else{
                return false;
            }
        }
    }
    
    public static String sort(String str){
        String strx = str.toLowerCase();
        char arr[] = strx.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    char c =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        }
        String str1 = "";
        for (int i = 0; i < arr.length; i++) {
            str1 += arr[i];
        }
        System.out.println(str1);
        return str1;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
