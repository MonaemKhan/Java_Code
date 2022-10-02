
import java.awt.*;

import javax.swing.*;

public class JTabbed extends JFrame {

    Container c;
    
    JTabbed(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocation(200,300);//L-R && U-D
        setTitle("Frame");
        
        
    
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        JTabbedPane tb = new JTabbedPane();
        tb.setBounds(10, 10, 200, 200);
        tb.setOpaque(true);
        tb.setBackground(Color.yellow);
        add(tb);

    }
    public static void main(String[] args) {
        JTabbed Frame = new JTabbed();
        Frame.setVisible(true);
    }
    
}
