
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Login_page extends javax.swing.JFrame {

    /**
     * Creates new form Login_page
     */
    public Login_page() {
        initComponents();

        ImageIcon background = new ImageIcon(getClass().getResource("army_log.png"));
        this.setIconImage(background.getImage());
        getContentPane().setBackground(Color.WHITE);

        this.setBounds(300, 50, 1200, 800);

        userfild.setText("SNK-");

        this.setResizable(false);

        this.setBounds(300, 50, 1150, 700);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        crpass = new javax.swing.JButton();
        fopass = new javax.swing.JButton();
        userlab = new javax.swing.JLabel();
        userfild = new javax.swing.JTextField();
        psslab1 = new javax.swing.JLabel();
        passfild1 = new javax.swing.JPasswordField();
        logbut1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 10, 300, 150);

        crpass.setBackground(new java.awt.Color(0, 102, 102));
        crpass.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        crpass.setForeground(new java.awt.Color(0, 0, 0));
        crpass.setText("Create Pasword");
        crpass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crpassActionPerformed(evt);
            }
        });

        fopass.setBackground(new java.awt.Color(0, 102, 102));
        fopass.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        fopass.setForeground(new java.awt.Color(0, 0, 0));
        fopass.setText("Forgate Password");
        fopass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fopass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fopassActionPerformed(evt);
            }
        });

        userlab.setBackground(new java.awt.Color(255, 255, 255));
        userlab.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        userlab.setForeground(new java.awt.Color(255, 255, 255));
        userlab.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        userlab.setText("User Name:");

        userfild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userfildActionPerformed(evt);
            }
        });

        psslab1.setBackground(new java.awt.Color(255, 255, 255));
        psslab1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        psslab1.setForeground(new java.awt.Color(255, 255, 255));
        psslab1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        psslab1.setText("Password :");

        logbut1.setBackground(new java.awt.Color(0, 153, 153));
        logbut1.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        logbut1.setForeground(new java.awt.Color(51, 51, 255));
        logbut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/report-key-icon.png"))); // NOI18N
        logbut1.setText("LOGIN");
        logbut1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        logbut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbut1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DialogInput", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USER");

        jDesktopPane2.setLayer(crpass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(fopass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(userlab, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(userfild, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(psslab1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(passfild1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(logbut1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crpass, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(fopass)
                .addContainerGap())
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(logbut1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userlab, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(psslab1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passfild1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userfild, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userfild, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userlab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passfild1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(psslab1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crpass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fopass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(logbut1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jDesktopPane2);
        jDesktopPane2.setBounds(330, 170, 472, 433);

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Actions-dialog-close-icon.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 590, 210, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userfildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userfildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userfildActionPerformed

    private void crpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crpassActionPerformed
        createpass op = new createpass();
        op.setBounds(300, 50, 871, 521);
        op.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_crpassActionPerformed

    private void logbut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbut1ActionPerformed
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sainik_data", "root", "");

            String valid = "SELECT `id`,`password` FROM `info` WHERE id='" + userfild.getText() + "'";
            PreparedStatement val = conn.prepareStatement(valid);
            ResultSet rs = val.executeQuery();

            String idd = null;
            String idpass = null;
            while (rs.next()) {
                idd = rs.getString("id");
                idpass = rs.getString("password");
            }

            if (idpass == null) {
                JOptionPane.showMessageDialog(null, "Pasword Not Set Yet");

            } else {
                if (passfild1.getText().equals(idpass)) {

                    up();

                    JOptionPane.showMessageDialog(null, "Login Succesfull");

                    userlog op = new userlog();
                    op.setVisible(true);
                    op.setBounds(300, 50, 1200, 870);

                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed");
                }

                if (passfild1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Pasword Box IS Blanck");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_logbut1ActionPerformed

    private void fopassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fopassActionPerformed
        forpass op = new forpass();
        op.setVisible(true);
        op.setBounds(300, 50, 900, 600);

        this.setVisible(false);
    }//GEN-LAST:event_fopassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Log_Page().setVisible(true);
        new Log_Page().setBounds(300, 50, 960, 700);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    public void up() {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sainik_data", "root", "");

            String qurey = "UPDATE `id` SET `idp`=? WHERE `num`=0";
            PreparedStatement pp = conn.prepareStatement(qurey);

            pp.setString(1, userfild.getText());
            pp.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Login_page.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

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
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crpass;
    private javax.swing.JButton fopass;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logbut1;
    private javax.swing.JPasswordField passfild1;
    private javax.swing.JLabel psslab1;
    private javax.swing.JTextField userfild;
    private javax.swing.JLabel userlab;
    // End of variables declaration//GEN-END:variables
}
