
import java.awt.*;
import javax.swing.*;

public class screen {

    private final GraphicsDevice vc;

    public screen() {
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        vc = env.getDefaultScreenDevice();

    }

    public void setfullscreen(DisplayMode dm, JFrame window) {
        window.setUndecorated(true);
        window.setResizable(false);
        vc.setFullScreenWindow(window);
        
        
        if(dm!= null && vc.isDisplayChangeSupported()){
            try{
                vc.setDisplayMode(dm);
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
    
    public Window getfullscreenwindow(){
        return vc.getFullScreenWindow();
    }
    
    public void restorescreen(){
        Window w = vc.getFullScreenWindow();
        if(w != null){
            w.dispose();
        }
        vc.setFullScreenWindow(null);
        
    }
}
