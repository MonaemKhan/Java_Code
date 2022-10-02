
import java.awt.*;
import javax.swing.*;

public class borderlayout extends JFrame {
    private Container c;
    JButton j1,j2,j3,j4,j5;
    BorderLayout border;
    borderlayout(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocation(200,300);//L-R && U-D
        setTitle("Border Layout");
    
        c = this.getContentPane();
        border = new BorderLayout(10,10);
        c.setLayout(border);
        c.setBackground(Color.CYAN);
        
        j1 = new JButton("1");
        j2 = new JButton("2");
        j3 = new JButton("3");
        j4 = new JButton("4");
        j5 = new JButton("5");
        
        add(j1,BorderLayout.NORTH);
        add(j2,BorderLayout.EAST);
        add(j3,BorderLayout.CENTER);
        add(j4,BorderLayout.WEST);
        add(j5,BorderLayout.SOUTH);
        
    }
    public static void main(String[] args) {
        borderlayout Frame = new borderlayout();
        Frame.setVisible(true);
    }
    
}
