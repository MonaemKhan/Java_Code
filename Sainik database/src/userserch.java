
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MONAEM
 */
public class userserch extends javax.swing.JFrame {

    /**
     * Creates new form userserch
     */
    public userserch() {
        initComponents();
        ImageIcon background = new ImageIcon(getClass().getResource("army_log.png"));
        this.setIconImage(background.getImage());
        getContentPane().setBackground(Color.DARK_GRAY);
        
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Forte", 3, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("~~::Search::~~");

        search.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Home District", "Blood Group", "Core", "Region", "Unit", "Rank" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(0, 102, 102));
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setRowHeight(30);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Rank", "Phnoe Number", "Address", "Unit", "Region"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton2.setFont(new java.awt.Font("Elephant", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 98, Short.MAX_VALUE)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userlog op = new userlog();
        op.setVisible(true);
        op.setBounds(300, 20, 1200, 850);

        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public ArrayList<User> UserList() {
        ArrayList<User> userList = new ArrayList<>();

        if(null == combo.getSelectedItem().toString()) {
            JOptionPane.showMessageDialog(null, "Search Error");
        }else switch (combo.getSelectedIndex()) {
            case 0:
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sainik_data", "root", "");
                    String qur = "SELECT * FROM `info` WHERE `name` = '"+search.getText()+"'";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(qur);
                    User user;
                    while (rs.next()) {
                        user = new User(rs.getString("name"), rs.getString("rank"), rs.getString("phn"), rs.getString("address"), rs.getString("unit"), rs.getString("region"));
                        userList.add(user);
                    }
                } catch (SQLException ae) {
                    System.out.println("fail");
                }   break;
            case 1:
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sainik_data", "root", "");
                    String qur = "SELECT * FROM `info` WHERE `home` = '"+search.getText()+"'";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(qur);
                    User user;
                    while (rs.next()) {
                        user = new User(rs.getString("name"), rs.getString("rank"), rs.getString("phn"), rs.getString("address"), rs.getString("unit"), rs.getString("region"));
                        userList.add(user);
                    }
                } catch (SQLException ae) {
                    System.out.println("fail");
                }   break;
            case 2:
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sainik_data", "root", "");
                    String qur = "SELECT * FROM `info` WHERE `blood` = '"+search.getText()+"'";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(qur);
                    User user;
                    while (rs.next()) {
                        user = new User(rs.getString("name"), rs.getString("rank"), rs.getString("phn"), rs.getString("address"), rs.getString("unit"), rs.getString("region"));
                        userList.add(user);
                    }
                } catch (SQLException ae) {
                    System.out.println("fail");
                }   break;
            case 3:
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sainik_data", "root", "");
                    String qur = "SELECT * FROM `info` WHERE `core` = '"+search.getText()+"'";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(qur);
                    User user;
                    while (rs.next()) {
                        user = new User(rs.getString("name"), rs.getString("rank"), rs.getString("phn"), rs.getString("address"), rs.getString("unit"), rs.getString("region"));
                        userList.add(user);
                    }
                } catch (SQLException ae) {
                    System.out.println("fail");
                }   break;
            case 4:
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sainik_data", "root", "");
                    String qur = "SELECT * FROM `info` WHERE `region` = '"+search.getText()+"'";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(qur);
                    User user;
                    while (rs.next()) {
                        user = new User(rs.getString("name"), rs.getString("rank"), rs.getString("phn"), rs.getString("address"), rs.getString("unit"), rs.getString("region"));
                        userList.add(user);
                    }
                } catch (SQLException ae) {
                    System.out.println("fail");
                }   break;
            case 5:
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sainik_data", "root", "");
                    String qur = "SELECT * FROM `info` WHERE `unit` = '"+search.getText()+"'";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(qur);
                    User user;
                    while (rs.next()) {
                        user = new User(rs.getString("name"), rs.getString("rank"), rs.getString("phn"), rs.getString("address"), rs.getString("unit"), rs.getString("region"));
                        userList.add(user);
                    }
                } catch (SQLException ae) {
                    System.out.println("fail");
                }   break;
            case 6:
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sainik_data", "root", "");
                    String qur = "SELECT * FROM `info` WHERE `rank` = '"+search.getText()+"'";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(qur);
                    User user;
                    while (rs.next()) {
                        user = new User(rs.getString("name"), rs.getString("rank"), rs.getString("phn"), rs.getString("address"), rs.getString("unit"), rs.getString("region"));
                        userList.add(user);
                    }
                    
                } catch (SQLException ae) {
                    System.out.println("fail");
                }   break;
            default:
                JOptionPane.showMessageDialog(null, "Search Error");
                break;
        }
        return userList;
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        ArrayList<User> List = UserList();
        DefaultTableModel tt = (DefaultTableModel) jTable1.getModel();
        tt.setRowCount(0);
        Object[] Row = new Object[6];
        for (int i = 0; i < List.size(); i++) {
            Row[0] = List.get(i).getname();
            Row[1] = List.get(i).getrank();
            Row[2] = List.get(i).getphn();
            Row[3] = List.get(i).getaddress();
            Row[4] = List.get(i).getunit();
            Row[5] = List.get(i).getregion();

            tt.addRow(Row);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

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
            java.util.logging.Logger.getLogger(userserch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userserch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userserch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userserch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userserch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
