
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class displayrec extends Frame {

    displayrec() {
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
        int y1 = 100;
        int x2 = 51;
        int y2 = 100;
        try {
            for (int i = 0; i < 300; i++) {
                g.setColor(Color.RED);
                g.drawLine(x1, y1, x2, y2);
                

                x1 = x1 + 1;
                x2 = x2+1;
                Thread.sleep(10);
            }
            x1=50;
            for (int i = 0; i < 300; i++) {
                g.setColor(Color.red);
                g.drawLine(x1, y1, x2, y2);
                y2 = y2+1;
                Thread.sleep(10);
            }
            
            for (int i = 0; i < 300; i++) {
                g.setColor(Color.CYAN);
                g.drawLine(x1, y1, x2, y2);
                x2 = x2-1;
                Thread.sleep(10);
            }
            
            
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        displayrec f = new displayrec();

    }

}
