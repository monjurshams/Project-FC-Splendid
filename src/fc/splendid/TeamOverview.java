/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fc.splendid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Eternity
 */
public class TeamOverview extends javax.swing.JFrame {

     Connection conn=null;
     ResultSet rs=null;
     PreparedStatement pst=null;
     
        public TeamOverview() {
        initComponents();
        conn = sqlconnect.connectDB();
        fetch();
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
        TN = new javax.swing.JTextField();
        CN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        E = new javax.swing.JTextField();
        TP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CO = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        CH = new javax.swing.JTextField();
        C = new javax.swing.JTextField();
        M = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(961, 621));
        setPreferredSize(new java.awt.Dimension(1100, 650));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1420, 673));
        jPanel1.setLayout(null);

        TN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNActionPerformed(evt);
            }
        });
        jPanel1.add(TN);
        TN.setBounds(490, 100, 210, 40);
        jPanel1.add(CN);
        CN.setBounds(490, 320, 180, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("TEAM  NAME");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 100, 130, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("MANAGER");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 200, 102, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("CHAIRMAN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 280, 120, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("CONTACT NUMBER");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 330, 180, 22);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(470, 550, 149, 45);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("ESTABLISHED");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(250, 370, 138, 22);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("TOTAL PLAYER");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(250, 410, 150, 40);
        jPanel1.add(E);
        E.setBounds(490, 370, 90, 30);
        jPanel1.add(TP);
        TP.setBounds(490, 420, 97, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("COUNTRY");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(250, 470, 130, 40);
        jPanel1.add(CO);
        CO.setBounds(490, 470, 97, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(670, 550, 149, 45);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setText("SAVE ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(260, 550, 149, 45);

        jButton6.setBackground(new java.awt.Color(255, 102, 102));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(20, 550, 170, 50);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("COACH");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(250, 150, 130, 40);
        jPanel1.add(CH);
        CH.setBounds(490, 270, 300, 40);
        jPanel1.add(C);
        C.setBounds(490, 150, 300, 40);
        jPanel1.add(M);
        M.setBounds(490, 210, 300, 40);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("TEAM\"S OVERVIEW");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(445, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(487, 487, 487))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1290, 74);

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton7.setText("SET TEAM RERORDS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(870, 550, 180, 45);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1293, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNActionPerformed

    }//GEN-LAST:event_TNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String value1 = TN.getText();
            String value2 = C.getText();
            String value3 = M.getText();
            String value4 = CH.getText();
            String value5 = CN.getText();
            String value6 = E.getText();
            String value7 = TP.getText();
            String value8 = CO.getText();
            
            String sql= "update team_overview set team_name='"+value1+"',coach='"+value2+"',manager='"+value3+"',chairman='"+value4+"',contact_number='"+value5+"',established='"+value6+"',total_player='"+value7+"',country='"+value8+" ' ";
            pst=conn.prepareStatement(sql);
           
            pst.execute();
            JOptionPane.showMessageDialog(null, "UPDATED");
            
            
    }//GEN-LAST:event_jButton1ActionPerformed
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{    
            
            pst=conn.prepareStatement("DELETE FROM team_overview");
             pst.executeUpdate();
             
            JOptionPane.showMessageDialog(null, "DELETED");
            conn.close();
           dispose();
                 AdminPage AP = new AdminPage();
                 AP.setLocationRelativeTo(null);
                 AP.setVisible(true);
    }                                        
        catch(Exception E){
         JOptionPane.showMessageDialog(null,E);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       try{
            String query="Insert into team_overview (team_name,coach,manager,chairman,contact_number,established,total_player,country) values (?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(query);

            pst.setString(1,TN.getText());
            
            pst.setString(2,C.getText());
         
            pst.setString(3,M.getText());
            
            pst.setString(4,CH.getText());
            pst.setString(5,CN.getText());
            pst.setString(6,E.getText());
             pst.setString(7,TP.getText());
             pst.setString(8,CO.getText());
           if(TN.getText().isEmpty()||C.getText().isEmpty()||M.getText().isEmpty()||CH.getText().isEmpty()||CN.getText().isEmpty()||E.getText().isEmpty()||TP.getText().isEmpty()||CO.getText().isEmpty())
            { 
             JOptionPane.showMessageDialog(null, "Please Fill Up All the Fields");
             TN.setText("");
             C.setText("");
             M.setText("");
             CH.setText("");
             CN.setText("");
             TP.setText("");
             CO.setText("");
             E.setText("");
             
            } else {
                  pst.execute();
                  JOptionPane.showMessageDialog(null, "Saved");
                  rs.close();
                  pst.close();
                  dispose();
                 AdminPage AP = new AdminPage();
                 AP.setLocationRelativeTo(null);
                 AP.setVisible(true);
            }
            }
             catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
        AdminPage AP = new AdminPage();
        AP.setLocationRelativeTo(null);
        AP.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
        TeamRecords TR = new TeamRecords();
        TR.setLocationRelativeTo(null);
        TR.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed
         public void fetch()
    {      
        try{
          String Name="team_name";
          String Coach="coach";
          String Manager="manager";
          String Chairman="chairman";
          String ContactNumber="contact_number";
          String Estd="established";
          String TotalPlayer="total_player";
          String Country="country";
          String sql = "select * from team_overview";
          pst = conn.prepareStatement(sql);
          
          rs = pst.executeQuery();
          if(rs.next()){
             TN.setText(rs.getString("team_name"));
             
             C.setText(rs.getString("coach"));
             
             M.setText(rs.getString("manager"));
             
             CH.setText(rs.getString("chairman"));
             
             CN.setText(rs.getString("contact_number"));
             
             E.setText(rs.getString("established"));
            
             TP.setText(rs.getString("total_player"));
             
             CO.setText(rs.getString("country"));
             
          }
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null, E);
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
            java.util.logging.Logger.getLogger(TeamOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeamOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeamOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeamOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeamOverview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField C;
    private javax.swing.JTextField CH;
    private javax.swing.JTextField CN;
    private javax.swing.JTextField CO;
    private javax.swing.JTextField E;
    private javax.swing.JTextField M;
    private javax.swing.JTextField TN;
    private javax.swing.JTextField TP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
