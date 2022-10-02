import javax.swing.*;
import java.awt.*;
public class Test extends JFrame{
    ImageIcon icon;
    Container con;
    Test(){
       JFrame frame = new JFrame();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        
        icon = new ImageIcon(getClass().getResource("images.jpg"));
        this.setIconImage(icon.getImage());
        
        con = this.getContentPane();
        con.setBackground(Color.red);
    }
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("C:\\Users\\MONAEM\\Desktop\\images11.jpg");
        String name1 = JOptionPane.showInputDialog(null,"F_Name","Name",JOptionPane.PLAIN_MESSAGE);
        String name2 = JOptionPane.showInputDialog(null,"L_Name","Name",JOptionPane.PLAIN_MESSAGE);
        String name = name1+" "+name2;
        JOptionPane.showMessageDialog(null,name,"Full_Name",JOptionPane.PLAIN_MESSAGE,img);
        
        Test Frame = new Test();
    }
    
}
