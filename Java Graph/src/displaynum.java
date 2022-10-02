
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class displaynum extends Frame {

    displaynum() {
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
        
        g.setFont(new Font("Constantia", Font.PLAIN, 28));
        int x = 50;
        int y = 100;
        try{
        for (int i = 1; i <= 100; i++) {
            g.drawString(" " + i, x, y);
            x = x + 50;
            if (i%10==0) {
                y = y+50;
                x = 50;
            }
            Thread.sleep(500);
        }
        }catch(InterruptedException e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        displaynum f = new displaynum();

    }

}
