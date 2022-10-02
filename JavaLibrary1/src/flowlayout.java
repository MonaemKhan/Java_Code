
import java.awt.*;
import javax.swing.*;

public class flowlayout extends JFrame {
    private Container c;
    JButton j[];
    FlowLayout Flow;
    flowlayout(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocation(200,300);//L-R && U-D
        setTitle("Flow Layout");
    
        c = this.getContentPane();
        Flow = new FlowLayout(FlowLayout.LEADING);
        Flow.setHgap(10);
        Flow.setVgap(10);
        c.setLayout(Flow);
        c.setBackground(Color.CYAN);
        
        j = new JButton[9];
        
        for(int i = 0 ; i<9 ;i++){
            j[i] = new JButton(""+(i+1));
            c.add(j[i]);
        }
        
    }
    public static void main(String[] args) {
        flowlayout Frame = new flowlayout();
        Frame.setVisible(true);
    }
    
}
