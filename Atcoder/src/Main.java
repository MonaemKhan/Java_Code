
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int helth = scan.nextInt();
        int num = scan.nextInt();
        int[] demage = new int[num];
        int[] spell = new int[num];
        for (int i = 0; i < num; i++) {
            demage[i] = scan.nextInt();
            spell[i] = scan.nextInt();
        }
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num-1; j++) {
                if(demage[i] < demage[i+1]){
                    int temp = demage[i];
                    demage[i] = demage[i+1];
                    demage[i+1] = temp;
                    
                    temp = spell[i];
                    spell[i] = spell[i+1];
                    spell[i+1] = temp;
                }
            }
        }
        
        int spell_count = 0;
        int demage_count = 0;
        
        while(demage_count < helth){
            for (int i = 0; i < num; i++) {
                demage_count = demage_count+demage[i];
                if(demage_count < helth){
                    demage_count = demage_count-demage[i];
                    break;
                }
                spell_count = spell_count+spell[i];
                
                
            }
        }
        int count;
        if(demage_count>helth){
            count = (spell_count)-(demage_count-helth);
            System.out.println(count); 
        }else{
            System.out.println(spell_count);
        }
    }

}

