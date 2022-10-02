import javax.swing.*;
import java.awt.*;

public class JText extends JFrame {
    ImageIcon icon;
    Container c;
    JTextField j1,j2;
    Font f ;
    Cursor cu;
    
    JText(){
        jframe();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f = new Font("Arial",Font.ITALIC + Font.BOLD,18);
        cu = new Cursor(Cursor.TEXT_CURSOR);
        
        j1 = new JTextField();
        j1.setBounds(10,10,200,50);
        j1.setToolTipText("Write Name");
        j1.setForeground(Color.red);
        j1.setOpaque(true);
        j1.setBackground(Color.green);
        j1.setCursor(cu);
        j1.setFont(f);
        c.add(j1);
    }
    public void jframe(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);
        setLocationRelativeTo(null);//to make fram center
        setLocation(200,300);//L-R && U-D
        setTitle("Frame");
        
    icon = new ImageIcon(getClass().getResource("images.jpg"));
    this.setIconImage(icon.getImage());    
    }
    public static void main(String[] args) {
        JText j = new JText();
        j.setVisible(true);
    }
    
}
