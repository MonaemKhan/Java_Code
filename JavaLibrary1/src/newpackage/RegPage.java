
package newpackage;

import javax.swing.*;
import java.awt.*;

public class RegPage extends JFrame{
    JLabel background,f_name,l_name;
    JTextField name1,name2;
    Font lf,tff;
    ImageIcon bk_img;
    Container c;
    
    RegPage(){
        c = this.getContentPane();
        c.setLayout(null);
        
        lf = new Font("CalistoMT",Font.BOLD,20);
        tff = new Font("Arial",Font.BOLD,20);
        
        JL();
        JTA();
        
        bk_img = new ImageIcon(getClass().getResource("bk_img.jpg"));
        background = new JLabel(bk_img);
        background.add(f_name);
        background.setSize(bk_img.getIconWidth(),bk_img.getIconHeight());
        add(background);
    }
    
    public void JL(){
            
        f_name = new JLabel("First Name ");
        f_name.setBounds(770, 50, 200, 40);
        f_name.setFont(lf);
        f_name.setForeground(Color.WHITE);
        //add(f_name);
        
        l_name = new JLabel("Last Name ");
        l_name.setBounds(770, 100, 200, 40);
        l_name.setFont(lf);
        l_name.setForeground(Color.WHITE);
        add(l_name);
    }
    
    public void JTA(){
    
        name1 = new JTextField();
        name1.setBounds(900, 50, 200, 40);
        name1.setFont(tff);
        name1.setForeground(Color.BLACK);
        add(name1);
        
        name2 = new JTextField();
        name2.setBounds(900, 100, 200, 40);
        name2.setFont(tff);
        name2.setForeground(Color.BLACK);
        add(name2);
    }

    public static void main(String[] args) {
        RegPage im = new RegPage();
        im.setVisible(true);
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        im.setSize(1200,1050);
        im.setResizable(false);
    }
    
}
