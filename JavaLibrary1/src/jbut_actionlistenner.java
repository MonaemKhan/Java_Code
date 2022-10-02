import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class jbut_actionlistenner extends JFrame {
    ImageIcon icon;
    Container c;
    JButton j1;
    Font f ;
    Cursor cu;
    
    jbut_actionlistenner(){
        jframe();
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f = new Font("Arial",Font.ITALIC + Font.BOLD,18);
        cu = new Cursor(Cursor.HAND_CURSOR);
                
        j1 = new JButton("Submit");
        j1.setBounds(10,10,200,50);
        j1.setBorder(BorderFactory.createBevelBorder(WIDTH, Color.yellow, Color.black));
        //j1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        j1.setCursor(cu);
        j1.setToolTipText("Submit");
        j1.setForeground(Color.red);
        j1.setFont(f);
        j1.addActionListener((ActionEvent e)->{
            String  pass = JOptionPane.showInputDialog(null);
            System.out.println(pass);
        });
        c.add(j1);
    }
    public void jframe(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);
        setLocationRelativeTo(null);//to make fram center
        setLocation(200,300);//L-R && U-D
        setTitle("Frame");
        
    icon = new ImageIcon(getClass().getResource("images.jpg"));
    this.setIconImage(icon.getImage());    
    }
    public static void main(String[] args) {
        jbut_actionlistenner j = new jbut_actionlistenner();
        j.setVisible(true);
    }
    
}
