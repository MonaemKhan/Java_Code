
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class frame1 extends Frame{

    frame1() {
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
        g.setColor(Color.BLACK);
        g.fillRect(100, 100, 500, 500);
        try{
        Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
        g.setColor(Color.BLUE);
        g.fillRect(150, 150, 400, 400);
        
        try{
        Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
        g.setColor(Color.red);
        g.fillRect(200, 200, 300, 300);
        
        try{
        Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
        g.setColor(Color.green);
        g.fillRect(250, 250, 200, 200);
        
        try{
        Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
        g.setColor(Color.orange);
        g.fillRect(300, 300, 100, 100);
        
        try{
        Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
        g.setColor(Color.MAGENTA);
        g.fillRect(325, 325, 50, 50);
        
        try{
        Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
        g.setColor(Color.WHITE);
        g.fillRect(338, 338, 25, 25);
        
    }

    public static void main(String[] args) {
        frame1 f = new frame1();

    }

}
