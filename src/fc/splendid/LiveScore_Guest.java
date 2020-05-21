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
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Eternity
 */
public class LiveScore_Guest extends javax.swing.JFrame {

    /**
     * Creates new form LiveScore_Guest
     */
    Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        ArrayList<user1> searchArray = new ArrayList<user1>();
    public LiveScore_Guest() {
        initComponents();
        conn=sqlconnect.connectDB();
        getUsersList();
    }
public ArrayList<user1> getUsersList()
   {
       String sql="select * from live_score";
       ArrayList<user1> usersList = new ArrayList<user1>();
       Statement st;    
       try {
           st = conn.createStatement();
           rs = st.executeQuery(sql);

           user1 user;

           while(rs.next())
           {
               user = new user1(rs.getString("MatchVs"),rs.getInt("MatchNo"),rs.getString("Half"),rs.getInt("Minute"),rs.getString("Event"),rs.getString("Description"));
               usersList.add(user);
           }
            Object [][]row = new Object[usersList.size()][6];
            String []name = {"MatchVs","MatchNo","Half","Minute","Event","Description"};
            Model mo;
           for(int i = 0; i<usersList.size();i++){
           row[i][0] = usersList.get(i).getmatchvs();
           row[i][1] = usersList.get(i).getmatchno();
           row[i][2] = usersList.get(i).gethalf();
           row[i][3] = usersList.get(i).getminute();
           row[i][4] = usersList.get(i).getevent();
           row[i][5] = usersList.get(i).getdescription();
           
           }
            mo = new Model(row,name,6);
            jTable1.setModel(mo);
            jTable1.setRowHeight(40);
            TableColumnModel CM=jTable1.getColumnModel();
            CM.getColumn(0).setPreferredWidth(20);
            CM.getColumn(1).setPreferredWidth(20);
            CM.getColumn(2).setPreferredWidth(20);
            CM.getColumn(3).setPreferredWidth(20);
            CM.getColumn(4).setPreferredWidth(100);
            CM.getColumn(5).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(2);
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
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(576, 374));
        setPreferredSize(new java.awt.Dimension(1400, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SCORE UPDATE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 1, 24))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 430));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(140, 60, 1210, 282);

        jButton7.setBackground(new java.awt.Color(255, 102, 102));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(20, 360, 170, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-3, 0, 1400, 430);

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
            java.util.logging.Logger.getLogger(LiveScore_Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LiveScore_Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LiveScore_Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LiveScore_Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LiveScore_Guest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
