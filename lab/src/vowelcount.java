import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import  javax.swing.*;

public class vowelcount extends JFrame {
    int v = 0,v_a=0,v_e=0,v_i=0,v_o=0,v_u=0;
    vowelcount(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        
        getContentPane().setLayout(null);
        
        JLabel data = new JLabel("Enter Text : ");
        data.setBounds(20, 20, 100, 30);
        add(data);
        
        JTextArea text = new JTextArea();
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        
        JScrollPane js = new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        js.setBounds(130,05,300,100);
        add(js);
        
        JLabel vowel = new JLabel("Total Number Of Vowel : ");
        vowel.setBounds(40,110,200,30);
        add(vowel);
        
        JLabel vowel_a = new JLabel("Total Number Of Vowel A : ");
        vowel_a.setBounds(30,140,200,30);
        add(vowel_a);
        
        JLabel vowel_e = new JLabel("Total Number Of Vowel E : ");
        vowel_e.setBounds(30,170,200,30);
        add(vowel_e);
        
        JLabel vowel_i = new JLabel("Total Number Of Vowel I : ");
        vowel_i.setBounds(30,200,200,30);
        add(vowel_i);
        
        JLabel vowel_o = new JLabel("Total Number Of Vowel O : ");
        vowel_o.setBounds(30,230,200,30);
        add(vowel_o);
        
        JLabel vowel_u = new JLabel("Total Number Of Vowel U : ");
        vowel_u.setBounds(30,260,200,30);
        add(vowel_u);
        
        text.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {}

            @Override
            public void keyPressed(KeyEvent ke) {
                if(ke.getSource() == text){
                    if(ke.VK_A == ke.getKeyCode()){
                        v_a++;
                        v++;
                    }
                    if(ke.VK_E == ke.getKeyCode()){
                        v_e++;
                        v++;
                    }
                    if(ke.VK_I == ke.getKeyCode()){
                        v_i++;
                        v++;
                    }
                    if(ke.VK_0 == ke.getKeyCode()){
                        v_o++;
                        v++;
                    }
                    if(ke.VK_U == ke.getKeyCode()){
                        v_u++;
                        v++;
                    }
                    
                    vowel.setText("Total Number Of Vowel : "+v);
                    vowel_a.setText("Total Number Of Vowel : "+v_a);
                    vowel_e.setText("Total Number Of Vowel : "+v_e);
                    vowel_i.setText("Total Number Of Vowel : "+v_i);
                    vowel_o.setText("Total Number Of Vowel : "+v_o);
                    vowel_u.setText("Total Number Of Vowel : "+v_u);
                
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {}
        });
    }

    public static void main(String[] args) {
        vowelcount jf = new vowelcount();
        jf.setVisible(true);
    }
    
}
