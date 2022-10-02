import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class radiobutton extends JFrame{
    Container c;
    JRadioButton  male,female;
    JTextArea jf;
    ButtonGroup grp;
    radiobutton(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(20,20,400,400);
        this.setTitle("JRadioButton");
        this.setResizable(false);
        
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        
        grp = new ButtonGroup();
        
        male = new JRadioButton("Male");
        male.setBounds(50,30,80,30);
        male.setForeground(Color.BLACK);
        male.setOpaque(true);
        male.setBackground(Color.gray);
        //male.setSelected(true);//to set default point
        male.setFont(new Font("Arial",Font.BOLD,18));
        c.add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(200,30,100,30);
        female.setForeground(Color.BLACK);
        female.setOpaque(true);
        female.setBackground(Color.gray);
        //female.setEnabled(false); // to make a JRadioButton False
        female.setFont(new Font("Arial",Font.BOLD,18));
        c.add(female);
        
        grp.add(male);
        grp.add(female);
        
        handel hand = new handel();
        male.addActionListener(hand);
        female.addActionListener(hand);
        
        jf = new JTextArea();
        jf.setBounds(50,70,250,50);
        jf.setFont(new Font("Arial",Font.BOLD,18));
        c.add(jf);
    }
    
    class handel implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            jf.setText("");
            if(male.isSelected()){//(ae.getSource() == male){
                jf.append("You Select Male");
            }else{
                jf.append("You Select Female");
            }
        }
    

}
    
    public static void main(String[] args) {
        radiobutton rb = new radiobutton();
        rb.setVisible(true);
    }
    
}
