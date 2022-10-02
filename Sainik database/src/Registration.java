
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Registration extends JFrame {

    ImageIcon Snk_Image, background, im;
    JPanel personal, official, id_img;
    JLabel snk_img, snk_id, snk_f_name, snk_m_name, snk_l_name, snk_dob, snk_gender, snk_blood, snk_email, snk_national_id, snk_father, snk_mother, snk_phn, snk_home, snk_address, snk_core, snk_rank, snk_region, snk_unit;
    JTextField snk_idf, snk_f_namef, snk_m_namef, snk_l_namef, snk_fatherf, snk_motherf, snk_phnf, snk_emailf, snk_national_idf, ddf, mmf, yyf;
    JTextArea snk_addressA;
    JButton submit, select_img, clear, back;
    JComboBox snk_homec, snk_bloodc, snk_corec, snk_rankc, snk_regionc, snk_unitc;
    JRadioButton male, female;
    JTabbedPane tb;
    Font F_r, F_w;
    Cursor cu;

    String ID, name, Father, Mother, bday, bmon, byear, Email, phnno, Address, Home, Blood, Core, Rank, Region, Unit, National_id;
    String path;
    String Gender, time;

    String Bloodgrp[] = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
    String homedis[] = {"Chittagong", "Rangamati", "Bandarban", "Khagrachori"};
    String core_name[] = {"EME", "ARTILARY"};
    String Ranksta[] = {"General", "Lieutenant general", "Major general", "Brigadier general", "Colonel", "Lieutenant colonel", "Major", "Captain", "Lieutenant", "Second lieutenant"};
    String regi[] = {"Bandarban Cantonment", "Chittagong Cantonment", "Khagrachori Cantonment"};
    String uni[] = {"121 w&c", "12 Field Battart", "22 Bir", "EME Head Quater", "Artilary Head Quater"};

//start of constructor
    Registration() {
        getContentPane().setBackground(Color.white);
        getContentPane().setLayout(null);
        this.setResizable(false);

        background = new ImageIcon(getClass().getResource("army_log.png"));
        this.setIconImage(background.getImage());

        F_r = new Font("Constantia", Font.PLAIN, 28);
        F_w = new Font("Arial Narrow", Font.PLAIN, 28);

        cu = new Cursor(Cursor.HAND_CURSOR);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        time = sdf.format(date);

        Desine();
        Tabview();
        submit();

    }
//end of constructor

//start of frame desine
    public void Desine() {

        JLabel text = new JLabel("Information");
        text.setBounds(600, 30, 600, 100);
        text.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        text.setFont(new Font("Arial", Font.PLAIN, 72));
        add(text);

        ImageIcon immt = new ImageIcon(getClass().getResource("bd_army.png"));
        JLabel label = new JLabel(immt);
        label.setBounds(00, 00, 300, 150);
        add(label);
    }
//end of frame desine

//end od main function
    public static void main(String[] args) {
        Registration jf = new Registration();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(10, 10, 1500, 1000);
    }
//end of main function

//start_of Tab view
    public void Tabview() {

        tb = new JTabbedPane();
        tb.setBounds(30, 150, 1400, 700);
        tb.setCursor(cu);
        tb.setFont(F_r);
        add(tb);

//id_img
        id_img = new JPanel();
        id_img.setLayout(null);
        id_img.setOpaque(true);
        id_img.setBackground(new Color(196, 154, 108));
        tb.addTab("Id & Image", id_img);
        id_img_function();

//personal        
        personal = new JPanel();
        personal.setLayout(null);
        personal.setOpaque(true);
        personal.setBackground(Color.gray);
        tb.addTab("Personal", personal);
        personal_function();

//official
        official = new JPanel();
        official.setLayout(null);
        official.setOpaque(true);
        official.setBackground(Color.white);
        tb.addTab("Official", official);
        official_function();

    }
//end of tab view

    //Start_of_id_img_function
    public void id_img_function() {

        //JLabel_Start id_img_function
        {
            snk_id = new JLabel("ID No.");
            snk_id.setBounds(500, 200, 100, 40);
            snk_id.setFont(F_r);
            snk_id.setForeground(Color.black);
            id_img.add(snk_id);

            im = new ImageIcon(getClass().getResource("se_img.png"));
            snk_img = new JLabel(im);
            snk_img.setBounds(575, 300, 250, 250);
            id_img.add(snk_img);

            ImageIcon img1 = new ImageIcon(getClass().getResource("images.png"));
            JLabel snk_img1 = new JLabel(img1);
            snk_img1.setBounds(50, 250, 300, 300);
            id_img.add(snk_img1);
        }
        //JLabel_End id_img_function

        //Brows_button for img id_img_function
        {
            select_img = new JButton("Browse");
            select_img.setBounds(575, 570, 100, 50);
            id_img.add(select_img);

            select_img.addActionListener((ActionEvent e) -> {
                JFileChooser file = new JFileChooser();
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                FileNameExtensionFilter filt = new FileNameExtensionFilter("*.images", "*.jpg", "*.png", "*.gif");
                file.addChoosableFileFilter(filt);
                int result = file.showSaveDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = file.getSelectedFile();
                    path = selectedFile.getAbsolutePath();
                    snk_img.setIcon(ResizeImage(path));
                } else {
                    JOptionPane.showMessageDialog(null, "No File Selected");
                }
            });
        }
        //end of brows button id_img_function

        //start of id input id_img_function
        {
            snk_idf = new JTextField("SNK-");
            snk_idf.setBounds(600, 200, 230, 40);
            snk_idf.setFont(new Font("Arial", Font.PLAIN, 28));
            snk_idf.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent evt) {
                    if (snk_idf.getText().length() < 9) {
                        snk_idf.setEditable(true);
                    } else {
                        snk_idf.setEditable(false);
                    }
                }
            });
            id_img.add(snk_idf);
        }
        //end of id input for id_img_function

    }
//end of id_img_fundtion

    //get_img_start for id_img_function    
    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(snk_img.getWidth(), snk_img.getHeight(), Image.SCALE_SMOOTH);
        Snk_Image = new ImageIcon(newImg);
        return Snk_Image;
    }
    //get_img_end for id_img_function

//end of id_img_function class
//start of personal Function
    public void personal_function() {

        //JLabel work start presonal_function
        {
            snk_f_name = new JLabel("First Name");
            snk_f_name.setBounds(40, 50, 200, 30);
            snk_f_name.setFont(F_r);
            snk_f_name.setForeground(Color.white);
            personal.add(snk_f_name);

            snk_m_name = new JLabel("Middle Name");
            snk_m_name.setBounds(40, 125, 200, 30);
            snk_m_name.setFont(F_r);
            snk_m_name.setForeground(Color.white);
            personal.add(snk_m_name);

            snk_l_name = new JLabel("Last Name");
            snk_l_name.setBounds(40, 200, 200, 30);
            snk_l_name.setFont(F_r);
            snk_l_name.setForeground(Color.white);
            personal.add(snk_l_name);

            snk_dob = new JLabel("Date OF Birth");
            snk_dob.setBounds(40, 275, 200, 30);
            snk_dob.setFont(F_r);
            snk_dob.setForeground(Color.white);
            personal.add(snk_dob);

            JLabel dd = new JLabel("*dd");
            dd.setBounds(300, 300, 50, 40);
            personal.add(dd);

            JLabel mm = new JLabel("*mm");
            mm.setBounds(370, 300, 50, 40);
            personal.add(mm);

            JLabel yy = new JLabel("*yyyy");
            yy.setBounds(470, 300, 50, 40);
            personal.add(yy);

            snk_gender = new JLabel("Gender");
            snk_gender.setBounds(40, 350, 200, 30);
            snk_gender.setFont(F_r);
            snk_gender.setForeground(Color.white);
            personal.add(snk_gender);

            snk_blood = new JLabel("Blood Group");
            snk_blood.setBounds(40, 425, 200, 30);
            snk_blood.setFont(F_r);
            snk_blood.setForeground(Color.white);
            personal.add(snk_blood);

            snk_email = new JLabel("Email");
            snk_email.setBounds(40, 500, 200, 30);
            snk_email.setFont(F_r);
            snk_email.setForeground(Color.white);
            personal.add(snk_email);

            snk_national_id = new JLabel("National Id No.");
            snk_national_id.setBounds(40, 575, 200, 30);
            snk_national_id.setFont(F_r);
            snk_national_id.setForeground(Color.white);
            personal.add(snk_national_id);

            snk_father = new JLabel("Father's Name ");
            snk_father.setBounds(750, 50, 200, 30);
            snk_father.setFont(F_r);
            snk_father.setForeground(Color.white);
            personal.add(snk_father);

            snk_mother = new JLabel("Mother's Name ");
            snk_mother.setBounds(750, 125, 200, 30);
            snk_mother.setFont(F_r);
            snk_mother.setForeground(Color.white);
            personal.add(snk_mother);

            snk_phn = new JLabel("Phone Number");
            snk_phn.setBounds(750, 200, 200, 30);
            snk_phn.setFont(F_r);
            snk_phn.setForeground(Color.white);
            personal.add(snk_phn);

            snk_home = new JLabel("Home District ");
            snk_home.setBounds(750, 275, 200, 30);
            snk_home.setFont(F_r);
            snk_home.setForeground(Color.white);
            personal.add(snk_home);

            snk_address = new JLabel("Address ");
            snk_address.setBounds(750, 350, 200, 30);
            snk_address.setFont(F_r);
            snk_address.setForeground(Color.white);
            personal.add(snk_address);
        }
        //end of JLabel work for personal_function

        //start of JTextField for personal_function
        {
            snk_f_namef = new JTextField();
            snk_f_namef.setBounds(300, 40, 350, 50);
            snk_f_namef.setFont(F_w);
            snk_f_namef.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent evt) {
                    if (snk_f_namef.getText().length() < 11) {
                        snk_f_namef.setEditable(true);
                    } else {
                        snk_f_namef.setEditable(false);
                    }
                }
            });
            personal.add(snk_f_namef);

            snk_m_namef = new JTextField();
            snk_m_namef.setBounds(300, 115, 350, 50);
            snk_m_namef.setFont(F_w);
            snk_m_namef.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent evt) {
                    if (snk_m_namef.getText().length() < 11) {
                        snk_m_namef.setEditable(true);
                    } else {
                        snk_m_namef.setEditable(false);
                    }
                }
            });
            personal.add(snk_m_namef);

            snk_l_namef = new JTextField();
            snk_l_namef.setBounds(300, 190, 350, 50);
            snk_l_namef.setFont(F_w);
            snk_l_namef.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent evt) {
                    if (snk_l_namef.getText().length() < 11) {
                        snk_l_namef.setEditable(true);
                    } else {
                        snk_l_namef.setEditable(false);
                    }
                }
            });
            personal.add(snk_l_namef);

            snk_emailf = new JTextField("@gmail.com");
            snk_emailf.setBounds(300, 490, 350, 50);
            snk_emailf.setFont(F_w);
            snk_emailf.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent evt) {
                    if (snk_emailf.getText().length() < 30) {
                        snk_emailf.setEditable(true);
                    } else {
                        snk_emailf.setEditable(false);
                    }
                }
            });
            personal.add(snk_emailf);

            snk_national_idf = new JTextField();
            snk_national_idf.setBounds(300, 565, 350, 50);
            snk_national_idf.setFont(F_w);
            snk_national_idf.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent evt) {
                    char c = evt.getKeyChar();
                    if (Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) && snk_national_idf.getText().length() < 10) {
                        snk_national_idf.setEditable(true);
                    } else {
                        snk_national_idf.setEditable(false);
                    }
                }
            });
            personal.add(snk_national_idf);

            snk_fatherf = new JTextField();
            snk_fatherf.setBounds(1000, 40, 350, 50);
            snk_fatherf.setFont(F_w);
            snk_fatherf.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent evt) {
                    if (snk_fatherf.getText().length() < 33) {
                        snk_fatherf.setEditable(true);
                    } else {
                        snk_fatherf.setEditable(false);
                    }
                }
            });
            personal.add(snk_fatherf);

            snk_motherf = new JTextField();
            snk_motherf.setBounds(1000, 115, 350, 50);
            snk_motherf.setFont(F_w);
            snk_motherf.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent evt) {
                    if (snk_motherf.getText().length() < 33) {
                        snk_motherf.setEditable(true);
                    } else {
                        snk_motherf.setEditable(false);
                    }
                }
            });
            personal.add(snk_motherf);

            snk_phnf = new JTextField("+880");
            snk_phnf.setBounds(1000, 190, 350, 50);
            snk_phnf.setFont(F_w);
            snk_phnf.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent evt) {
                    char c = evt.getKeyChar();
                    if (Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
                        snk_phnf.setEditable(true);
                    } else {
                        snk_phnf.setEditable(false);
                    }
                    if (snk_phnf.getText().length() < 15) {
                        snk_phnf.setEditable(true);
                    } else {
                        snk_phnf.setEditable(false);
                    }

                }
            });
            personal.add(snk_phnf);

            ddf = new JTextField();
            ddf.setFont(F_w);
            ddf.setBounds(300, 265, 50, 40);
            ddf.setToolTipText("Birth Day Date");
            ddf.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent evt) {
                    char c = evt.getKeyChar();
                    if (Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
                        ddf.setEditable(true);
                    } else {
                        ddf.setEditable(false);
                    }

                    if (ddf.getText().length() < 2) {
                        ddf.setEditable(true);
                    } else {
                        ddf.setEditable(false);
                    }

                }
            });
            personal.add(ddf);

            mmf = new JTextField();
            mmf.setBounds(370, 265, 70, 40);
            mmf.setFont(F_w);
            mmf.setEditable(true);
            mmf.setToolTipText("Birth Day Month");
            mmf.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent evt) {
                    char c = evt.getKeyChar();
                    if (Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
                        mmf.setEditable(true);
                    } else {
                        mmf.setEditable(false);
                    }
                    if (mmf.getText().length() < 3 || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
                        mmf.setEditable(true);
                    } else {
                        mmf.setEditable(false);
                    }

                }
            });
            personal.add(mmf);

            yyf = new JTextField();
            yyf.setFont(F_w);
            yyf.setBounds(470, 265, 90, 40);
            yyf.setToolTipText("Birth Day Year");
            yyf.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent evt) {
                    char c = evt.getKeyChar();
                    if (Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
                        yyf.setEditable(true);
                    } else {
                        yyf.setEditable(false);
                    }

                    if (yyf.getText().length() < 4) {
                        yyf.setEditable(true);
                    } else {
                        yyf.setEditable(false);
                    }

                }
            });
            personal.add(yyf);
        }
        //end ofJTextField for personal_function

        //start JTextArea of Address personal_function
        {
            snk_addressA = new JTextArea();
            snk_addressA.setFont(F_w);
            snk_addressA.setLineWrap(true);
            snk_addressA.setWrapStyleWord(true);
            snk_addressA.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent evt) {
                    if (snk_addressA.getText().length() < 50) {
                        snk_addressA.setEditable(true);
                    } else {
                        snk_addressA.setEditable(false);
                    }
                }
            });
            personal.add(snk_addressA);

            JScrollPane js = new JScrollPane(snk_addressA, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            js.setBounds(1000, 340, 350, 300);
            personal.add(js);
        }
        //end JTextArea of adress personal_function

        //start JComboBox of personal_function
        {

            snk_bloodc = new JComboBox(Bloodgrp);
            snk_bloodc.setBounds(300, 415, 100, 40);
            snk_bloodc.setFont(F_w);
            snk_bloodc.setEditable(true);
            snk_bloodc.setToolTipText("Birth Day Month");
            personal.add(snk_bloodc);

            Arrays.sort(homedis);
            snk_homec = new JComboBox(homedis);
            snk_homec.setBounds(1000, 265, 300, 40);
            snk_homec.setFont(F_w);
            snk_homec.setEditable(true);
            snk_homec.setToolTipText("Birth Day Month");
            personal.add(snk_homec);
        }
        //end JComboBox of personal_function

        //start of jRadiobutton personal_function
        {
            male = new JRadioButton("Male");
            male.setBounds(300, 340, 100, 40);
            male.setFont(F_w);
            male.setOpaque(true);
            male.setBackground(Color.gray);
            male.setForeground(Color.white);
            personal.add(male);

            female = new JRadioButton("Female");
            female.setBounds(400, 340, 150, 40);
            female.setFont(F_w);
            female.setOpaque(true);
            female.setBackground(Color.gray);
            female.setForeground(Color.white);
            personal.add(female);

            ButtonGroup grup = new ButtonGroup();
            grup.add(male);
            grup.add(female);

            Gen gen = new Gen();
            male.addActionListener(gen);
            female.addActionListener(gen);
        }
        //start of jRadiobutton personal_function

    }
//end of personal_function

//start Gen class for personal_function
    public class Gen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == male) {
                Gender = "Male";
            } else if (ae.getSource() == female) {
                Gender = "Female";
            }
        }
    }
//end gen class personal_function

//end of personal_function
//start of official_function
    public void official_function() {
        //JLabel_work start for opfficial function
        {
            ImageIcon imm = new ImageIcon(getClass().getResource("bd.png"));
            JLabel lab = new JLabel(imm);
            lab.setBounds(100, 200, 200, 229);
            official.add(lab);

            ImageIcon imm1 = new ImageIcon(getClass().getResource("bdf.png"));
            JLabel lab1 = new JLabel(imm1);
            lab1.setBounds(1000, 200, 215, 340);
            official.add(lab1);

            snk_core = new JLabel("Core Name");
            snk_core.setBounds(400, 150, 200, 40);
            snk_core.setFont(F_r);
            official.add(snk_core);

            snk_rank = new JLabel("Rank");
            snk_rank.setBounds(400, 225, 200, 40);
            snk_rank.setFont(F_r);
            official.add(snk_rank);

            snk_region = new JLabel("Region");
            snk_region.setBounds(400, 300, 200, 40);
            snk_region.setFont(F_r);
            official.add(snk_region);

            snk_unit = new JLabel("Unit Name");
            snk_unit.setBounds(400, 375, 200, 40);
            snk_unit.setFont(F_r);
            official.add(snk_unit);

        }
        //end of JLabel work official function

        //start of JComboBox for officila_functio
        {
            snk_corec = new JComboBox(core_name);
            snk_corec.setBounds(600, 140, 300, 40);
            snk_corec.setFont(F_w);
            official.add(snk_corec);

            snk_rankc = new JComboBox(Ranksta);
            snk_rankc.setBounds(600, 215, 300, 40);
            snk_rankc.setFont(F_w);
            official.add(snk_rankc);

            Arrays.sort(regi);
            snk_regionc = new JComboBox(regi);
            snk_regionc.setBounds(600, 290, 300, 40);
            snk_regionc.setFont(F_w);
            official.add(snk_regionc);

            Arrays.sort(uni);
            snk_unitc = new JComboBox(uni);
            snk_unitc.setBounds(600, 365, 300, 40);
            snk_unitc.setFont(F_w);
            official.add(snk_unitc);

        }
        //end of JComboBox for official function

    }
//end of official_function

//Start Of Submit button
    public void submit() {

        submit = new JButton("Submit");
        submit.setBounds(400, 870, 150, 50);
        submit.setFont(F_r);
        submit.setOpaque(true);
        submit.setBorder(BorderFactory.createLineBorder(Color.gray));
        submit.setBackground(Color.green);
        submit.setForeground(Color.RED);
        submit.setCursor(cu);
        add(submit);
        submit.addActionListener((ActionEvent e) -> {
            ID = snk_idf.getText();
            name = snk_f_namef.getText() + " " + snk_m_namef.getText() + " " + snk_l_namef.getText();
            Father = snk_fatherf.getText();
            Mother = snk_motherf.getText();
            bday = ddf.getText();
            bmon = mmf.getText();
            byear = yyf.getText();
            Email = snk_emailf.getText();
            National_id = snk_national_idf.getText();
            phnno = snk_phnf.getText();
            Address = snk_addressA.getText();
            Home = snk_homec.getSelectedItem().toString();
            Blood = snk_bloodc.getSelectedItem().toString();
            Core = snk_corec.getSelectedItem().toString();
            Rank = snk_rankc.getSelectedItem().toString();
            Region = snk_regionc.getSelectedItem().toString();
            Unit = snk_unitc.getSelectedItem().toString();
            //path
            //gender

            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sainik_data", "root", "");

                String qureyy = "INSERT INTO `info`(`id`, `img`, `name`, `father`, `mother`, `phn`, `home`, `gender`, `email`, `national`, "
                        + "`address`,`dob`, `blood`, `core`, `rank`, `region`, `unit`,`join`) "
                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pp = conn.prepareStatement(qureyy);
                pp.setString(1, ID);
                pp.setString(2, path);
                pp.setString(3, name);
                pp.setString(4, Father);
                pp.setString(5, Mother);
                pp.setString(6, phnno);
                pp.setString(7, Home);
                pp.setString(8, Gender);
                pp.setString(9, Email);
                pp.setString(10, National_id);
                pp.setString(11, Address);
                pp.setString(12, bday + "-" + bmon + "-" + byear);
                pp.setString(13, Blood);
                pp.setString(14, Core);
                pp.setString(15, Rank);
                pp.setString(16, Region);
                pp.setString(17, Unit);
                pp.setString(18, time);

                pp.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data Succesfully Inserted");

                
            } catch (SQLException ae) {
                JOptionPane.showMessageDialog(null, ae);
            }

        });
//end of submit button

//start of clear button
        clear = new JButton("Clear");
        clear.setBounds(600, 870, 150, 50);
        clear.setFont(F_r);
        clear.setBorder(BorderFactory.createLineBorder(Color.gray));
        clear.setForeground(Color.GRAY);
        
        add(clear);

//end of clear button
//start of back button
        back = new JButton("Back");
        back.setBounds(800, 870, 150, 50);
        back.setFont(F_r);
        back.setOpaque(true);
        back.setBackground(Color.red);
        back.setBorder(BorderFactory.createLineBorder(Color.gray));
        back.setForeground(Color.black);
        back.addActionListener((ActionEvent e) -> {
            Admin_page op = new Admin_page();
            op.setVisible(true);
            op.setBounds(300, 50, 960, 700);

            this.setVisible(false);
        });

        add(back);

//end of back button
    }
//end of submit Button

    public void cl() {
        snk_idf.setText("SNK-");
        snk_f_namef.setText("");
        snk_m_namef.setText("");
        snk_l_namef.setText("");
        snk_fatherf.setText("");
        snk_motherf.setText("");
        snk_phnf.setText("+880");
        snk_emailf.setText("@gmail.com");
        snk_national_idf.setText("");
        ddf.setText("");
        mmf.setText("");
        yyf.setText("");
        snk_addressA.setText("");
        snk_img.setIcon(im);

        snk_idf.setEditable(true);
        snk_f_namef.setEditable(true);
        snk_m_namef.setEditable(true);
        snk_l_namef.setEditable(true);
        snk_fatherf.setEditable(true);
        snk_motherf.setEditable(true);
        snk_phnf.setEditable(true);
        snk_emailf.setEditable(true);
        snk_national_idf.setEditable(true);
        ddf.setEditable(true);
        mmf.setEditable(true);
        yyf.setEditable(true);
        snk_addressA.setEditable(true);
    }
}//end_of_class
