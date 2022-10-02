
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class frame extends Frame{

    frame() {
        setBounds(100, 100, 500, 500);
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
        //STRING,X,Y
        g.drawString("Java Graphical Work", 200, 300);
        
        //X1,Y1  X2,Y2
        g.drawLine(140, 350, 350, 140);
        
        //(X1,Y1) WIDTH,HIGHT
        g.drawRect(100, 100, 300, 300);
        
        //(X1,Y1) WIDTH,HIGHT,WIDTH_R,HIGHT_R
        //g.drawRoundRect(200, 100, 200, 300, 20, 50);
        
        //X,Y,W,H
        g.drawOval(100, 100, 300, 300);
        
        //x,y,w,h,starting angle,moving angle
        g.drawArc(160, 160, 100, 100, 30,310);
        
        
    }

    public static void main(String[] args) {
        frame f = new frame();

    }

}
