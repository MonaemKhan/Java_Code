
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Jsinner extends JFrame{
    Container c;
    JSpinner cb;
    
    Jsinner(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocation(200,300);//L-R && U-D
        setTitle("Frame");
    
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);
        SpinnerNumberModel value = new SpinnerNumberModel(5,1,31,1);
        cb = new JSpinner(value);
        cb.setBounds(20,20,40,30);
        c.add(cb);
        cb.addChangeListener((ChangeEvent ce) -> {
            int a = (int) cb.getValue();
            System.out.println(a);
        });
    }
    public static void main(String[] args) {
        Jsinner Frame = new Jsinner();
        Frame.setVisible(true);
    }
    
}
