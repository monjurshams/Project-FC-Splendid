/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fc.splendid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Eternity
 */
public class Schedule_Guest extends javax.swing.JFrame {

    /**
     * Creates new form Schedule_Guest
     */Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        ArrayList<user1> searchArray = new ArrayList<user1>();
    public Schedule_Guest() {
        initComponents();
        conn=sqlconnect.connectDB();
        getUsersList();
    }
        public ArrayList<user1> getUsersList()
   {
       String sql="select * from team_schedule";
       ArrayList<user1> usersList = new ArrayList<user1>();
       Statement st;    
       try {
           st = conn.createStatement();
           rs = st.executeQuery(sql);

           user1 user;

           while(rs.next())
           {
               user = new user1(rs.getString("MatchVs"),rs.getInt("MatchNo"),rs.getInt("Date"),rs.getString("Day"),rs.getString("Month"),rs.getInt("Year"),rs.getString("Field"));
               usersList.add(user);
           }
            Object [][]row = new Object[usersList.size()][7];
            String []name = {"MatchVs","MatchNo","Date","Day","Month","Year","Field"};
            Model mo;
           for(int i = 0; i<usersList.size();i++){
           row[i][0] = usersList.get(i).getmatchvs();
           row[i][1] = usersList.get(i).getmatchno();
           row[i][2] = usersList.get(i).getdate();
           row[i][3] = usersList.get(i).getday();
           row[i][4] = usersList.get(i).getmonth();
           row[i][5] = usersList.get(i).getyear();
           row[i][6] = usersList.get(i).getfield();
           
           }
            mo = new Model(row,name,7);
            jTable2.setModel(mo);
            jTable2.setRowHeight(40);
           
            jTable2.getColumnModel().getColumn(2);
       } 
      catch (Exception e) {
           e.printStackTrace();
       }
       return usersList;
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(833, 419));
        setPreferredSize(new java.awt.Dimension(830, 550));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(56, 100, 121));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TEAM SCHEDULE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(204, 255, 0))); // NOI18N
        jPanel1.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(210, 70, 452, 350);

        jButton7.setBackground(new java.awt.Color(255, 102, 102));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(20, 450, 170, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 830, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
        GuestPage GP = new GuestPage();
        GP.setLocationRelativeTo(null);
        GP.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Schedule_Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Schedule_Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Schedule_Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Schedule_Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Schedule_Guest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}