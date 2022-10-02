
import javax.swing.JFrame;


public class jfram extends JFrame {

    public static void main(String[] args) {
        jfram fram = new jfram();//with extends
        //JFrame fram = new JFrame();
        fram.setVisible(true);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fram.setSize(500,400);
        //fram.setLocationRelativeTo(null);//to make fram center
        //fram.setLocation(200,300);//L-R && U-D
        fram.setBounds(100,200,500,400);//L-R && U-D && Width Length
        fram.setTitle("Frame");
        fram.setResizable(false);
    }
    
}
