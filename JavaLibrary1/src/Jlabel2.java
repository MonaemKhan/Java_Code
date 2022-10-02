import javax.swing.*;
import java.awt.*;
public class Jlabel2 extends JFrame {
    ImageIcon icon,img;
    Container c;
    JLabel Label;
    
    Jlabel2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);
        setLocationRelativeTo(null);//to make fram center
        setLocation(200,300);//L-R && U-D
        setTitle("Frame");
        setResizable(true);
        
        
        icon = new ImageIcon(getClass().getResource("images.jpg"));
        this.setIconImage(icon.getImage());
    
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.lightGray);
        
        Font f = new Font("Arial",Font.BOLD,18);
        
        img = new ImageIcon(getClass().getResource("images(5).jpg"));
        Label = new JLabel(" Image",img,JLabel.LEFT);
        Label.setFont(f);
        Label.setBounds(10, 20, 100+img.getIconWidth(),100+img.getIconHeight());
        Label.setForeground(Color.BLACK);
        Label.setOpaque(true);
        Label.setBackground(Color.yellow);
        Label.setToolTipText("This Is Just A Image");
        c.add(Label);
    }
    public static void main(String[] args) {
    Jlabel2 Frame = new Jlabel2();
    Frame.setVisible(true);
    }
    
}
