
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class displayround extends Frame {

    displayround() {
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

        int x = 50;
        int y = 100;
        int w = 300;
        int h = 300;
        int sa = 0;
        int ma = 2;
        try {
            for (int i = 0; i < 12; i++) {
                g.fillArc(x, y, w, h, sa, ma);
                sa = sa + 30;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        displayround f = new displayround();

    }

}
