import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.*;
import java.io.*;


public class addimg2 extends JFrame{
    JLabel j1;
    JButton b1;
    
    addimg2(){
        getContentPane().setLayout(null);
        
        j1 = new JLabel();
        j1.setBounds(10, 20, 300, 300);
        j1.setBorder(BorderFactory.createLineBorder(Color.blue,5));
        add(j1);
        
        b1 = new JButton("Browes");
        b1.setBounds(10,270,100,50);
        add(b1);
        
        b1.addActionListener((ActionEvent e)->{
            JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter fil = new FileNameExtensionFilter("*.image","*.jpg","*.png");
            file.addChoosableFileFilter(fil);
            int result = file.showSaveDialog(null);
            
            if(result == JFileChooser.APPROVE_OPTION){
                File fl = file.getSelectedFile();
               String path = fl.getAbsolutePath();
               j1.setIcon(Resize(path));
            }else if(result == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null,"NO Selected File");
            }
        
        });
    
    }
    
    public ImageIcon Resize(String path){
        ImageIcon img = new ImageIcon(path);
        Image myimage = img.getImage();
        Image newimg = myimage.getScaledInstance(j1.getWidth(),j1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Image = new ImageIcon(newimg);
        return Image;
    }

    public static void main(String[] args) {
        addimg2 im = new addimg2();
        im.setVisible(true);
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        im.setSize(500,500);
    }
    
}
