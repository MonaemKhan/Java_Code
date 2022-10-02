
import java.awt.*;
import javax.swing.*;

public class jpanel extends JFrame {
    
    private Container c;
    jpanel(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocation(200,300);//L-R && U-D
        setTitle("JPanel");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        JPanel j = new JPanel();
        j.setOpaque(true);
        j.setBackground(Color.yellow);
        j.setBounds(10,10,300,200);
        add(j);
    }
    public static void main(String[] args) {
        jpanel Frame = new jpanel();
        Frame.setVisible(true);
    }
    
}
