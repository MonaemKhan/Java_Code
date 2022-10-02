
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-stack/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class matching_brachess {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Character,Character> map = new HashMap();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        
        
            String ex = scan.next();
            System.out.println((isfunction(ex,map))? "Yes" : "No");
        
    }
    
    public static boolean isfunction(String str,HashMap<Character,Character> ma){
        if(str.length() %2 !=0){
            return false;
        }else{
            ArrayDeque<Character> deque = new ArrayDeque();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(ma.containsKey(ch)){
                    deque.push(ch);
                }else if(deque.isEmpty() || ch != ma.get(deque.pop())){
                    return false;
                }
            }
            return deque.isEmpty();
        }
    }
    
}
