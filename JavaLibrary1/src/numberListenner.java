


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.io.File;
import java.util.Arrays;
import javax.swing.filechooser.FileNameExtensionFilter;

public class numberListenner extends JFrame{
    
    JLabel core,rank,region,unit,join;
    JComboBox corec,rankc,regionc,unitc;
    JTextField joinday,joinmon,joinyear;
    
    
    String core_name[] ={"EME","ARTILARY"};
    String Rank[] = {"General","Lieutenant general","Major general","Brigadier general","Colonel","Lieutenant colonel","Major","Captain","Lieutenant","Second lieutenant"};
    String regi[] = {"Bandarban Cantonment","Chittagong Cantonment","Khagrachori Cantonment"};
    String uni[] = {};
    
    numberListenner(){
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.white);
        Font F_r = new Font("Constantia",Font.PLAIN,28);
        Font F_w = new Font("Arial Narrow",Font.PLAIN,28);
        
        ImageIcon imm = new ImageIcon(getClass().getResource("bd.png"));
        JLabel lab = new JLabel(imm);
        lab.setBounds(100,200,200,229);
        add(lab);
        
        ImageIcon imm1 = new ImageIcon(getClass().getResource("bdf.png"));
        JLabel lab1 = new JLabel(imm1);
        lab1.setBounds(1000,200,215,340);
        add(lab1);
        
        core = new JLabel("Core Name");
        core.setBounds(400, 150, 200, 40);
        core.setFont(F_r);
        add(core);
        
        rank = new JLabel("Rank");
        rank.setBounds(400, 225, 200, 40);
        rank.setFont(F_r);
        add(rank);
        
        region = new JLabel("Region");
        region.setBounds(400,300, 200, 40);
        region.setFont(F_r);
        add(region);
        
        unit = new JLabel("Unit Name");
        unit.setBounds(400,375, 200, 40);
        unit.setFont(F_r);
        add(unit);
        
        join = new JLabel("Joining Date");
        join.setBounds(400,450, 200, 40);
        join.setFont(F_r);
        add(join);
        
        corec = new JComboBox(core_name);
        corec.setBounds(600, 140, 300, 40);
        corec.setFont(F_w);
        add(corec);
    
        rankc = new JComboBox(Rank);
        rankc.setBounds(600, 215, 300, 40);
        rankc.setFont(F_w);
        add(rankc);
        
        Arrays.sort(regi);
        regionc = new JComboBox(regi);
        regionc.setBounds(600, 290, 300, 40);
        regionc.setFont(F_w);
        add(regionc);
        
        Arrays.sort(uni);
        unitc = new JComboBox(uni);
        unitc.setBounds(600,365, 300, 40);
        unitc.setFont(F_w);
        add(unitc);
        
        joinday = new JTextField();
        joinday.setBounds(600,440,50, 40);
        joinday.setFont(F_w);
        joinday.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                char c  =  evt.getKeyChar();
                if(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)){
                    joinday.setEditable(true);
                }else{
                joinday.setEditable(false);
                }            }
        });
        add(joinday);
        
        joinmon = new JTextField();
        joinmon.setBounds(660,440,50, 40);
        joinmon.setFont(F_w);
        add(joinmon);
        joinyear = new JTextField();
        joinyear.setBounds(720,440,100, 40);
        joinyear.setFont(F_w);
        add(joinyear);
        
        JButton sub = new JButton("Submit");
        sub.setBounds(600, 500, 100, 40);
        add(sub);
        sub.addActionListener((ActionEvent e)->{
            int i = Integer.parseInt(joinday.getText());
                System.out.println(i);
        });
        
    }

    public static void main(String[] args) {
        numberListenner jf = new numberListenner();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(30,150, 1400, 700);
    }
    
}
