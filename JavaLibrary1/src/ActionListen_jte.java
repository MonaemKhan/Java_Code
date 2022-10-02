import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListen_jte extends JFrame {

    ImageIcon icon;
    Container c;
    Font f ;

    ActionListen_jte(){

        jframe();

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f = new Font("Arial",Font.ITALIC + Font.BOLD,18);
        
        JPasswordField j1 = new JPasswordField();
        j1.setBounds(10,10,200,50);
        j1.setToolTipText("Write Name");
        j1.setForeground(Color.red);
        j1.setOpaque(true);
        j1.setBackground(Color.green);
        j1.setFont(f);
        j1.setEchoChar('#');

        c.add(j1);

        /*j1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){ 
           String s = j1.getText();
           JOptionPane.showMessageDialog(null, s);
        }});*/
    
        j1.addActionListener((ActionEvent e) ->{
           String s = j1.getText();
           JOptionPane.showMessageDialog(null, s);

        });
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
        ActionListen_jte j = new ActionListen_jte();
        j.setVisible(true);
    }
    
}
