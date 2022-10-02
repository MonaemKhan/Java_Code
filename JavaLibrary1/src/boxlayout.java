
import java.awt.*;
import javax.swing.*;

public class boxlayout extends JFrame {
    private Container c;
    JButton j[];
    BoxLayout box;
    boxlayout(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocation(200,300);//L-R && U-D
        setTitle("Box Layout");
    
        c = this.getContentPane();
        box = new BoxLayout(c,BoxLayout.X_AXIS);
        c.setLayout(box);
        c.setBackground(Color.CYAN);
        
        j = new JButton[9];
        
        for(int i = 0 ; i<9 ;i++){
            j[i] = new JButton(""+(i+1));
            c.add(j[i]);
            c.add(Box.createHorizontalStrut(10));
            c.add(Box.createVerticalStrut(10));
        }
        
    }
    public static void main(String[] args) {
        boxlayout Frame = new boxlayout();
        Frame.setVisible(true);
    }
    
}
