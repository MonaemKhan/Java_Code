
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class cardlayout extends JFrame implements ActionListener{
    private Container c;
    JButton j[];
    CardLayout card;
    cardlayout(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocation(200,300);//L-R && U-D
        setTitle("Grid Layout");
    
        c = this.getContentPane();
        card = new CardLayout();
        c.setLayout(card);
        c.setBackground(Color.CYAN);
        
        j = new JButton[10];
        
        for(int i = 9 ; i>=0 ;i--){
            j[i] = new JButton(""+i);
            c.add(j[i]);
            j[i].addActionListener(this);
        }
        
    }
    public static void main(String[] args) {
        cardlayout Frame = new cardlayout();
        Frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       card.previous(c);
    }
    
}
