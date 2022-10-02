import javax.swing.*;
import java.awt.*;

public class JBut extends JFrame {
    ImageIcon icon,img;
    Container c;
    JButton j1,j2;
    Font f ;
    Cursor cu;
    
    JBut(){
        jframe();
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f = new Font("Arial",Font.ITALIC + Font.BOLD,18);
        cu = new Cursor(Cursor.HAND_CURSOR);
                
        j1 = new JButton("Submit");
        j1.setBounds(10,10,200,50);
        j1.setBorder(BorderFactory.createBevelBorder(WIDTH, Color.yellow, Color.black));
        //j1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        j1.setCursor(cu);
        j1.setToolTipText("Submit");
        j1.setForeground(Color.red);
        j1.setFont(f);
        c.add(j1);
        
        img = new ImageIcon(getClass().getResource("images11.jpg"));
        j2 = new JButton(img);
        j2.setBounds(220, 10,img.getIconWidth(),img.getIconHeight());
        j2.setCursor(cu);
        c.add(j2);
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
        JBut j = new JBut();
        j.setVisible(true);
    }
    
}