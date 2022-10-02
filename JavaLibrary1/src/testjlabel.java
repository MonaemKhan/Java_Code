
import java.awt.*;
import javax.swing.*;

public class testjlabel extends JFrame {
    
    Container c;
    JTabbedPane jp;
    testjlabel(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocation(200,300);//L-R && U-D
        setTitle("JPanel");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        Font lf = new Font("CalistoMT",Font.BOLD,20);
        
        jp = new JTabbedPane();
        jp.setBounds(20, 50, 200, 300);
        add(jp);
        
        JLabel f_name = new JLabel("First Name ");
        f_name.setBounds(30, 70, 200, 40);
        f_name.setFont(lf);
        f_name.setForeground(Color.WHITE);
        
        JLabel j1 = new JLabel();
        j1.add(f_name);
        JLabel j2 = new JLabel();
        
        jp.addTab("Home",j1);
        jp.addTab("Edit", j2);
        
    }
    public static void main(String[] args) {
        testjlabel Frame = new testjlabel();
        Frame.setVisible(true);
    }
    
}
