
import java.awt.*;
import javax.swing.*;

public class bucky extends JFrame {

    public static void main(String[] args) {
        DisplayMode dm = new DisplayMode(800, 600, 32, DisplayMode.REFRESH_RATE_UNKNOWN);
        //  perameter 1&2 is resolution,3 is bit depth(8,16,32,64)

        bucky b = new bucky();
        b.run(dm);

    }

    public void run(DisplayMode dm) {
        setBackground(Color.BLACK);
        setForeground(Color.white);
        setFont(new Font("Arial", Font.PLAIN, 24));

        screen s = new screen();
        try {
            s.setfullscreen(dm, this);
            try {
                Thread.sleep(5000);
            } catch (Exception exx) {
                System.out.println(exx);
            }
        } finally {
            s.restorescreen();
        }
    }
    
    public void paint(Graphics g){
        if(g instanceof Graphics2D){
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            
        }
        
         g.drawString("This Is My Program", 200,200);
    }

}
