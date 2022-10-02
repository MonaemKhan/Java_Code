package newpackage;


import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class bdflag extends Frame {

    bdflag() {
        this.setVisible(true);
        this.setBounds(50, 00, 1200, 1000);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setForeground(Color.green);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Constantia", Font.PLAIN, 72));
        g.drawString("Flag Of Bangladesg",250,600);
        
        g.setColor(new Color(51, 51, 0));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        g.fillRoundRect(100, 50, 30, 900, 5, 10);
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
        }

        g.fillRoundRect(75, 940, 80, 20, 5, 5);
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
        }

        g.fillRoundRect(50, 950, 130, 20, 5, 5);
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
        }
//draw rect
        int x1 = 130;
        int y1 = 70;
        int x2 = 131;
        int y2 = 70;
        try {
            for (int i = 0; i < 800; i++) {
                g.setColor(new Color(0, 153, 0));
                g.drawLine(x1, y1, x2, y2);

                x1 = x1 + 1;
                x2 = x2 + 1;
                Thread.sleep(3);
            }
            x1 = 130;
            for (int i = 0; i < 400; i++) {
                //g.setColor(Color.red);
                g.drawLine(x1, y1, x2, y2);
                y2 = y2 + 1;
                Thread.sleep(10);
            }

            for (int i = 0; i <= 801; i++) {
                //g.setColor(Color.CYAN);
                g.drawLine(x1, y1, x2, y2);
                x2 = x2 - 1;
                Thread.sleep(3);
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
//draw round
        int x = 400;
        int y = 155;
        int w = 250;
        int h = 250;
        int sa = 0;
        int ma = 1;
        try {
            for (int i = 0; i < 360; i++) {
                g.setColor(Color.red);
                g.fillArc(x, y, w, h, sa, ma);
                sa = sa + 1;
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        bdflag f = new bdflag();
    }

}
