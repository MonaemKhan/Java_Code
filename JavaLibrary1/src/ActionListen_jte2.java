import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListen_jte2 extends JFrame {
    ImageIcon icon;
    Container c;
    JPasswordField j1,j2; 
    Font f ;
    ActionListen_jte2(){
        jframe();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f = new Font("Arial",Font.ITALIC + Font.BOLD,18);
        
        j1 = new JPasswordField();
        j1.setBounds(10,10,200,50);
        j1.setEchoChar('@');//to set the input type of password
        j1.setToolTipText("Write Name");
        j1.setForeground(Color.red);
        j1.setOpaque(true);
        j1.setBackground(Color.green);
        j1.setFont(f);
        c.add(j1);
        
        handel Action = new handel();
        j1.addActionListener(Action);
        
        j2 = new JPasswordField();
        j2.setBounds(10,70,200,50);
        j2.setEchoChar('@');//to set the input type of password
        j2.setToolTipText("Write Name");
        j2.setForeground(Color.red);
        j2.setOpaque(true);
        j2.setBackground(Color.green);
        j2.setFont(f);
        c.add(j2);
        
        j2.addActionListener(Action);
    }
    class handel implements ActionListener{
    public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();//variable.getText()
            System.out.println(s);
        }
    }

    public void jframe(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);
        setLocationRelativeTo(null);//to make fram center
        setLocation(200,300);//L-R && U-D
        setTitle("ActionListener");
        
    icon = new ImageIcon(getClass().getResource("images.jpg"));
    this.setIconImage(icon.getImage());    
    }
    public static void main(String[] args) {
        ActionListen_jte2 j = new ActionListen_jte2();
        j.setVisible(true);
    }
    
}
