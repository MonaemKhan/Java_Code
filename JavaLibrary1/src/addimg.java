import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

public class addimg extends JFrame{
    JButton button;
    JLabel label;
    Container c;
    addimg(){
        c = this.getContentPane();
        c.setLayout(null);
        
        button = new JButton("Browse");
        button.setBounds(180, 300, 100, 50);
        add(button);
        
        button.addActionListener((ActionEvent e) ->{
            JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter filt = new FileNameExtensionFilter("*.images","*.jpg","*.png","*.gif");
            file.addChoosableFileFilter(filt);
            int result = file.showSaveDialog(null);
            
            if(result == JFileChooser.APPROVE_OPTION){
                File selectedFile = file.getSelectedFile();
                String path = selectedFile.getAbsolutePath();
                label.setIcon(ResizeImage(path));
            }else{
                JOptionPane.showMessageDialog(null,"No File Selected");
            }
        });
        
        label = new JLabel("");
        label.setBounds(100, 20, 500, 500);
        label.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
        add(label);
    }
    
    public ImageIcon ResizeImage(String  ImagePath){
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Image = new ImageIcon(newImg);
        return Image;
    }
    public static void main(String[] args) {
        addimg im = new addimg();
        im.setVisible(true);
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        im.setSize(500,500);
    }
    
}
