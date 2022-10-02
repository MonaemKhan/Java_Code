
import java.awt.*;
import javax.swing.*;

public class JLable extends JFrame {
    ImageIcon icon;
    ImageIcon img;
    Container c;
    JLabel Label;
    
    JLable(){
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
        
        Font f = new Font("Arial",Font.BOLD,15);
        
        img = new ImageIcon(getClass().getResource("images(5).jpg"));
        JLabel image = new JLabel(img);
        image.setBounds(10,10,img.getIconWidth(),img.getIconHeight());
        c.add(image);
        
        Label = new JLabel();
        Label.setText("Enter Your Name :");
        Label.setForeground(Color.CYAN);//change font coler
        Label.setOpaque(true);//change  background status
        Label.setBackground(Color.yellow);//change font background;
        Label.setBounds(10, 210, 700,20);//L-R && U-D && Width && Length
        Label.setFont(f);
        Label.setToolTipText("This Is Just A ....... ");
        c.add(Label);
        
        JLabel passjlab =new JLabel("Enter Your PassWord :");
        passjlab.setBounds(10, 240, 200, 20);
        passjlab.setForeground(Color.CYAN);
        passjlab.setOpaque(true);
        passjlab.setBackground(Color.yellow);
        passjlab.setFont(f);
        c.add(passjlab);
    }
    public static void main(String[] args) {
        JLable Frame = new JLable();
        Frame.setVisible(true);
    }
    
}
