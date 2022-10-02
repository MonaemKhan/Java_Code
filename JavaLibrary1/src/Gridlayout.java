
import java.awt.*;
import javax.swing.*;

public class Gridlayout extends JFrame {
    private Container c;
    JButton j[];
    GridLayout grid;
    Gridlayout(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocation(200,300);//L-R && U-D
        setTitle("Grid Layout");
    
        c = this.getContentPane();
        grid = new GridLayout(4,3,10,10 );
        c.setLayout(grid);
        c.setBackground(Color.CYAN);
        
        j = new JButton[10];
        
        for(int i = 9 ; i>=0 ;i--){
            j[i] = new JButton(""+i);
            c.add(j[i]);
        }
        
    }
    public static void main(String[] args) {
        Gridlayout Frame = new Gridlayout();
        Frame.setVisible(true);
    }
    
}
