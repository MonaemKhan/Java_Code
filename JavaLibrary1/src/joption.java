
import javax.swing.JOptionPane;


public class joption {


    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "ENter Your Choice","Title",JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
