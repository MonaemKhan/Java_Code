
import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MONAEM
 */
public class userlog extends javax.swing.JFrame {

    /**
     * Creates new form userlog
     */
    public userlog() {
        initComponents();
        ImageIcon background = new ImageIcon(getClass().getResource("army_log.png"));
        this.setIconImage(background.getImage());
        getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setResizable(false);

        serch();
    }
    String idpass ;

    public void serch() {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sainik_data", "root", "");

            String qurey = "SELECT * FROM `id` WHERE `num`=0";
            PreparedStatement pp = conn.prepareStatement(qurey);
            ResultSet rs = pp.executeQuery();
            while (rs.next()) {
                idpass = rs.getString("idp");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sainik_data", "root", "");

            String info = "SELECT * FROM `info` WHERE `id` ='" + idpass + "'";

            PreparedStatement info1 = conn.prepareStatement(info);

            ResultSet rsinfo = info1.executeQuery();

            while (rsinfo.next()) {

                name.setText(rsinfo.getString("name"));
                father.setText(rsinfo.getString("father"));
                mother.setText(rsinfo.getString("mother"));
                phone.setText(rsinfo.getString("phn"));
                gender.setText(rsinfo.getString("gender"));
                address.setText(rsinfo.getString("address"));
                dob.setText(rsinfo.getString("dob"));
                blood.setText(rsinfo.getString("blood"));

                core.setText(rsinfo.getString("core"));
                rank.setText(rsinfo.getString("rank"));
                region.setText(rsinfo.getString("region"));
                unit.setText(rsinfo.getString("unit"));
                joindate.setText(rsinfo.getString("join"));

                image.setIcon(ResizeImage(rsinfo.getString("img")));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img1 = MyImage.getImage();
        Image newImg = img1.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Snk_Image = new ImageIcon(newImg);
        return Snk_Image;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        unit = new javax.swing.JTextField();
        region = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        rank = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        core = new javax.swing.JLabel();
        blood = new javax.swing.JLabel();
        joindate = new javax.swing.JLabel();
        mother = new javax.swing.JLabel();
        father = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("~~::Sainik Information::~~");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 21, 1241, 70));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snk_image.png"))); // NOI18N
        image.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 47));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Rank:");
        jLabel4.setPreferredSize(new java.awt.Dimension(58, 24));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 47));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Unit:");
        jLabel5.setPreferredSize(new java.awt.Dimension(58, 24));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 42));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Date Of Birth:");
        jLabel6.setPreferredSize(new java.awt.Dimension(58, 24));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 180, 42));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Blood Group:");
        jLabel8.setPreferredSize(new java.awt.Dimension(58, 24));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 180, 47));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Phone Num:");
        jLabel9.setPreferredSize(new java.awt.Dimension(58, 24));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 180, 42));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Core:");
        jLabel10.setPreferredSize(new java.awt.Dimension(58, 24));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 180, 47));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Region:");
        jLabel11.setPreferredSize(new java.awt.Dimension(58, 24));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 180, 42));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Join Date:");
        jLabel12.setPreferredSize(new java.awt.Dimension(58, 24));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 180, 48));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Father Name:");
        jLabel14.setPreferredSize(new java.awt.Dimension(58, 24));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 180, 47));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Mother Name:");
        jLabel15.setPreferredSize(new java.awt.Dimension(58, 24));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 180, 47));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("Address:");
        jLabel16.setPreferredSize(new java.awt.Dimension(58, 24));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 103, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.gif"))); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 720, 210, 90));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appli.jpg"))); // NOI18N
        jButton2.setText("Application");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 720, 250, 90));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 720, 240, 90));

        unit.setBackground(new java.awt.Color(255, 255, 255));
        unit.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        unit.setForeground(new java.awt.Color(51, 51, 51));
        unit.setMaximumSize(new java.awt.Dimension(100, 32));
        unit.setMinimumSize(new java.awt.Dimension(100, 32));
        unit.setPreferredSize(new java.awt.Dimension(13, 32));
        unit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unitMouseClicked(evt);
            }
        });
        unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitActionPerformed(evt);
            }
        });
        unit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unitKeyReleased(evt);
            }
        });
        getContentPane().add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 450, 50));

        region.setBackground(new java.awt.Color(255, 255, 255));
        region.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        region.setForeground(new java.awt.Color(51, 51, 51));
        region.setMaximumSize(new java.awt.Dimension(100, 32));
        region.setMinimumSize(new java.awt.Dimension(100, 32));
        region.setPreferredSize(new java.awt.Dimension(13, 32));
        region.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regionMouseClicked(evt);
            }
        });
        region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionActionPerformed(evt);
            }
        });
        region.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                regionKeyReleased(evt);
            }
        });
        getContentPane().add(region, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 450, 50));

        phone.setBackground(new java.awt.Color(255, 255, 255));
        phone.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        phone.setForeground(new java.awt.Color(51, 51, 51));
        phone.setMaximumSize(new java.awt.Dimension(100, 32));
        phone.setMinimumSize(new java.awt.Dimension(100, 32));
        phone.setPreferredSize(new java.awt.Dimension(13, 32));
        phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneMouseClicked(evt);
            }
        });
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneKeyReleased(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 450, 50));

        name.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name.setMaximumSize(new java.awt.Dimension(100, 32));
        name.setMinimumSize(new java.awt.Dimension(100, 32));
        name.setPreferredSize(new java.awt.Dimension(13, 32));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 450, 50));

        rank.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        rank.setForeground(new java.awt.Color(0, 0, 0));
        rank.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rank.setMaximumSize(new java.awt.Dimension(100, 32));
        rank.setMinimumSize(new java.awt.Dimension(100, 32));
        rank.setPreferredSize(new java.awt.Dimension(13, 32));
        getContentPane().add(rank, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 450, 50));

        dob.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        dob.setForeground(new java.awt.Color(0, 0, 0));
        dob.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dob.setMaximumSize(new java.awt.Dimension(100, 32));
        dob.setMinimumSize(new java.awt.Dimension(100, 32));
        dob.setPreferredSize(new java.awt.Dimension(13, 32));
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 450, 50));

        core.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        core.setForeground(new java.awt.Color(0, 0, 0));
        core.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        core.setMaximumSize(new java.awt.Dimension(100, 32));
        core.setMinimumSize(new java.awt.Dimension(100, 32));
        getContentPane().add(core, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 450, 50));

        blood.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        blood.setForeground(new java.awt.Color(0, 0, 0));
        blood.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        blood.setMaximumSize(new java.awt.Dimension(100, 32));
        blood.setMinimumSize(new java.awt.Dimension(100, 32));
        getContentPane().add(blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 450, 50));

        joindate.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        joindate.setForeground(new java.awt.Color(0, 0, 0));
        joindate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        joindate.setMaximumSize(new java.awt.Dimension(100, 32));
        joindate.setMinimumSize(new java.awt.Dimension(100, 32));
        getContentPane().add(joindate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, 450, 50));

        mother.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        mother.setForeground(new java.awt.Color(0, 0, 0));
        mother.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mother.setMaximumSize(new java.awt.Dimension(100, 32));
        mother.setMinimumSize(new java.awt.Dimension(100, 32));
        getContentPane().add(mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 450, 50));

        father.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        father.setForeground(new java.awt.Color(0, 0, 0));
        father.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        father.setMaximumSize(new java.awt.Dimension(100, 32));
        father.setMinimumSize(new java.awt.Dimension(100, 32));
        getContentPane().add(father, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 450, 50));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel27.setText("Gender :");
        jLabel27.setPreferredSize(new java.awt.Dimension(58, 24));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 100, 50));

        gender.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 0, 0));
        gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gender.setPreferredSize(new java.awt.Dimension(58, 24));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, 230, 50));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.gif"))); // NOI18N
        jButton4.setText("BACK");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 180, 90));

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setColumns(20);
        address.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        address.setForeground(new java.awt.Color(51, 51, 51));
        address.setRows(5);
        address.setLineWrap(true);
        jScrollPane1.setViewportView(address);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 510, 270, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitKeyReleased

    }//GEN-LAST:event_unitKeyReleased

    private void unitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unitMouseClicked

    }//GEN-LAST:event_unitMouseClicked

    private void phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneKeyReleased

    private void phoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneMouseClicked

    private void regionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_regionKeyReleased

    private void regionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_regionMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sainik_data", "root", "");

            String qurey = "UPDATE `info` SET `phn`=?,`region`=?,`unit`=? , `address`=? WHERE `id` ='" + idpass + "'";
            PreparedStatement pp = conn.prepareStatement(qurey);

            pp.setString(1, phone.getText());
            pp.setString(2, region.getText());
            pp.setString(3, unit.getText());
            pp.setString(4, address.getText());
            pp.executeUpdate();

            JOptionPane.showMessageDialog(null, "Suscessfully Update");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Login_page op = new Login_page();
        op.setVisible(true);
        op.setBounds(300, 50, 1150, 700);

        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        userserch op = new userserch();
        op.setVisible(true);
        op.setBounds(300, 50, 1200, 700);

        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        appli op = new appli();
        op.setVisible(true);
        op.setBounds(300, 20, 1250, 1000);

        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitActionPerformed

    private void regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(userlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userlog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JLabel blood;
    private javax.swing.JLabel core;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel father;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel joindate;
    private javax.swing.JLabel mother;
    private javax.swing.JLabel name;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel rank;
    private javax.swing.JTextField region;
    private javax.swing.JTextField unit;
    // End of variables declaration//GEN-END:variables
}
