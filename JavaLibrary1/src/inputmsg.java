
import javax.swing.JOptionPane;


public class inputmsg {

    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog(null,"Enter Your Name :","f_name",JOptionPane.QUESTION_MESSAGE);
        String name2 = JOptionPane.showInputDialog("Enter Your Name :");
        String name = name1+" "+name2;
        JOptionPane.showMessageDialog(null,name,"Full Name",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
