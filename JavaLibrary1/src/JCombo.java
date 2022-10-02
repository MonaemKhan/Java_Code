
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class JCombo extends JFrame {
    Container c;
    JComboBox cb;
    String pro[] = {"Java","Phython","Swift","C#","ASP.NET"};
    
    JCombo(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocation(200,300);//L-R && U-D
        setTitle("Frame");
    
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        cb = new JComboBox(pro);
        cb.setBounds(20,20,80,30);
        c.add(cb);
        cb.addActionListener((ActionEvent ae) -> {
            int s = cb.getSelectedIndex();
            System.out.println(s+1);
        });
    }
    public static void main(String[] args) {
        JCombo Frame = new JCombo();
        Frame.setVisible(true);
    }
    
}
