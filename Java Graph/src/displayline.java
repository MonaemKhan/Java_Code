
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class displayline extends Frame {

    displayline() {
        setBounds(100, 100, 700, 700);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //setForeground(Color.yellow);
        //setBackground(Color.BLUE);
    }

    public void paint(Graphics g) {
        
        int x1 = 50;
        int y1 = 600;
        int x2 = 500;
        int y2 = 600;
        try{
        for (int i = 0; i < 12; i++) {
            if(i%2==0){
            g.setColor(Color.green);
            }else{
            g.setColor(Color.red);
            }
            g.drawLine(x1, y1, x2, y2);
            y1 = y1-50;
            y2=y1;
            
            x1=x1+20;
            x2=x2-20;
            Thread.sleep(500);
        }
        }catch(InterruptedException e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        displayline f = new displayline();

    }

}
