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
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Eternity
 */
public class Schedule extends javax.swing.JFrame {

    /**
     * Creates new form Update_Schedule
     */
       Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        ArrayList<user1> searchArray = new ArrayList<user1>();
        
    public Schedule() {
        initComponents();
        conn=sqlconnect.connectDB();
        getUsersList();
        ButtonGroup bg= new ButtonGroup();
                bg.add(jRadioButtonH);
                bg.add(jRadioButtonA);
                bg.add(jRadioButtonN);
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
            jTable1.setModel(mo);
            jTable1.setRowHeight(40);
           
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        YEAR = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        MN = new javax.swing.JTextField();
        jRadioButtonA = new javax.swing.JRadioButton();
        jRadioButtonN = new javax.swing.JRadioButton();
        jRadioButtonH = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 520));
        setPreferredSize(new java.awt.Dimension(1050, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 620));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("UPDATE SCHEDULE");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(220, 10, 390, 42);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-2, 0, 1040, 60);

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(500, 90, 510, 430);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("MONTH");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 300, 60, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("DAY");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 260, 40, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("FIELD");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 387, 50, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("YEAR");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 350, 70, 17);

        MV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(MV);
        MV.setBounds(170, 110, 160, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("DATE");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 210, 40, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(170, 260, 80, 20);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(170, 210, 80, 20);

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(170, 300, 80, 20);

        jLabel7.setBackground(new java.awt.Color(255, 255, 51));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("MATCH   VS");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 120, 90, 20);

        YEAR.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(YEAR);
        YEAR.setBounds(170, 340, 110, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 450, 149, 40);

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(330, 450, 149, 40);

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 450, 149, 40);

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(10, 570, 222, 42);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("MATCH NO");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 170, 90, 17);

        MN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(MN);
        MN.setBounds(170, 160, 110, 30);

        jRadioButtonA.setText("AWAY");
        jRadioButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonA);
        jRadioButtonA.setBounds(250, 390, 70, 23);

        jRadioButtonN.setText("NEUTRAL");
        jRadioButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonN);
        jRadioButtonN.setBounds(330, 390, 80, 23);

        jRadioButtonH.setText("HOME");
        jRadioButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonH);
        jRadioButtonH.setBounds(170, 390, 70, 23);

        jButton7.setBackground(new java.awt.Color(204, 255, 204));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("RESET");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(10, 510, 170, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1030, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try{
            String query="Insert into team_schedule (MatchVs,MatchNo,Date,Day,Month,Year,Field) values (?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(query);

            pst.setString(1,MV.getText());
            
            pst.setString(2,MN.getText());
         
            
            String value1=jComboBox1.getSelectedItem().toString();
            pst.setString(3,value1);
            
            String value3=jComboBox3.getSelectedItem().toString();
            pst.setString(4,value3);
            
            String value2=jComboBox2.getSelectedItem().toString();
            pst.setString(5,value2);
            
            pst.setString(6,YEAR.getText());
            pst.setString(7,Field);
            
           if(MV.getText().isEmpty()||MN.getText().isEmpty()||jComboBox1.getSelectedItem().toString().isEmpty()||jComboBox2.getSelectedItem().toString().isEmpty()||jComboBox3.getSelectedItem().toString().isEmpty()||YEAR.getText().isEmpty())
            { 
             JOptionPane.showMessageDialog(null, "Please Fill Up All the Fields");
             MV.setText("");
             MN.setText("");
             jComboBox3.setSelectedIndex(0);
             jComboBox1.setSelectedIndex(0);
             jComboBox2.setSelectedIndex(0);
             YEAR.setText("");
             
             
            } else {
                  pst.execute();
                  JOptionPane.showMessageDialog(null, "Saved");
                  
             MV.setText("");
             MN.setText("");
             jComboBox3.setSelectedIndex(0);
             jComboBox1.setSelectedIndex(0);
             jComboBox2.setSelectedIndex(0);
             YEAR.setText("");
             jRadioButtonH.setSelected(false);
             jRadioButtonA.setSelected(false);
             jRadioButtonN.setSelected(false);
                           
            }
            }
             catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null, e);
        } 
       getUsersList();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{    
            
            pst=conn.prepareStatement("DELETE FROM team_schedule where MatchNo=?");
            pst.setString(1,MN.getText());
            pst.executeUpdate();
             
            JOptionPane.showMessageDialog(null, "DELETED");
             getUsersList();
    }                                        
        catch(Exception E){
         JOptionPane.showMessageDialog(null,E);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            String value1 = MV.getText();
            String value2 = MN.getText();
            String value3=jComboBox1.getSelectedItem().toString();
            String value4=jComboBox3.getSelectedItem().toString();
            String value5=jComboBox2.getSelectedItem().toString();
            String value6 = YEAR.getText();
            String value7 = Field;
                        
            String sql= "update team_schedule set MatchVs='"+value1+"',MatchNo='"+value2+"',Date='"+value3+"',Day='"+value4+"',Month='"+value5+"',Year='"+value6+"',Field='"+value7+"' where MatchNo=' " +value2+" ' ";
            pst=conn.prepareStatement(sql);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "UPDATED");
            
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,E);
        }
        getUsersList();
                    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        AdminPage AP = new AdminPage();
        AP.setLocationRelativeTo(null);
        AP.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jRadioButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAActionPerformed
        Field= "AWAY";  // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAActionPerformed

    private void jRadioButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHActionPerformed
        Field= "HOME";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonHActionPerformed

    private void jRadioButtonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNActionPerformed
        Field= "NEUTRAL";  // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonNActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        MV.setText(model.getValueAt(i,0).toString());
        MN.setText(model.getValueAt(i,1).toString());
        String date= model.getValueAt(i,2).toString();
        if(date.equals("1"))
        {
            jComboBox1.setSelectedIndex(0);
        }
        else if(date.equals("2")){
            jComboBox1.setSelectedIndex(1);
        }
               
        else if(date.equals("3")){
            jComboBox1.setSelectedIndex(2);
        }
        else if(date.equals("4")){
            jComboBox1.setSelectedIndex(3);
        }
        else if(date.equals("5")){
            jComboBox1.setSelectedIndex(4);
        }
        else if(date.equals("6")){
            jComboBox1.setSelectedIndex(5);
        }else if(date.equals("7")){
            jComboBox1.setSelectedIndex(6);
        }else if(date.equals("8")){
            jComboBox1.setSelectedIndex(7);
        }else if(date.equals("9")){
            jComboBox1.setSelectedIndex(8);
        }else if(date.equals("10")){
            jComboBox1.setSelectedIndex(9);
        }else if(date.equals("11")){
            jComboBox1.setSelectedIndex(10);
        }else if(date.equals("12")){
            jComboBox1.setSelectedIndex(11);
        }else if(date.equals("13")){
            jComboBox1.setSelectedIndex(12);
        }else if(date.equals("14")){
            jComboBox1.setSelectedIndex(13);
        }else if(date.equals("15")){
            jComboBox1.setSelectedIndex(14);
        }else if(date.equals("16")){
            jComboBox1.setSelectedIndex(15);
        }else if(date.equals("17")){
            jComboBox1.setSelectedIndex(16);
        }else if(date.equals("18")){
            jComboBox1.setSelectedIndex(17);
        }else if(date.equals("19")){
            jComboBox1.setSelectedIndex(18);
        }else if(date.equals("20")){
            jComboBox1.setSelectedIndex(19);
        }else if(date.equals("21")){
            jComboBox1.setSelectedIndex(20);
        }else if(date.equals("22")){
            jComboBox1.setSelectedIndex(21);
        }else if(date.equals("23")){
            jComboBox1.setSelectedIndex(22);
        }else if(date.equals("24")){
            jComboBox1.setSelectedIndex(23);
        }else if(date.equals("25")){
            jComboBox1.setSelectedIndex(24);
        }else if(date.equals("26")){
            jComboBox1.setSelectedIndex(25);
        }else if(date.equals("27")){
            jComboBox1.setSelectedIndex(26);
        }else if(date.equals("28")){
            jComboBox1.setSelectedIndex(27);
        }else if(date.equals("29")){
            jComboBox1.setSelectedIndex(28);
        }else if(date.equals("30")){
            jComboBox1.setSelectedIndex(29);
        }else if(date.equals("31")){
            jComboBox1.setSelectedIndex(30);
        }
        
        String day= model.getValueAt(i,3).toString();
        if(day.equals("Sunday"))
        {
            jComboBox3.setSelectedIndex(0);
        }
        else if(day.equals("Monday")){
            jComboBox3.setSelectedIndex(1);
        }
               
        else if(day.equals("Tuesday")){
            jComboBox3.setSelectedIndex(2);
        }
        else if(day.equals("Wednesday")){
            jComboBox3.setSelectedIndex(3);
        }
        else if(day.equals("Thursday")){
            jComboBox3.setSelectedIndex(4);
        }
        else if(day.equals("Friday")){
            jComboBox3.setSelectedIndex(5);
        }else if(day.equals("Saturday")){
            jComboBox3.setSelectedIndex(6);
        }
        
        String month= model.getValueAt(i,4).toString();
        if(month.equals("January"))
        {
            jComboBox2.setSelectedIndex(0);
        }
        else if(month.equals("February")){
            jComboBox2.setSelectedIndex(1);
        }
               
        else if(month.equals("March")){
            jComboBox2.setSelectedIndex(2);
        }
        else if(month.equals("April")){
            jComboBox2.setSelectedIndex(3);
        }
        else if(month.equals("May")){
            jComboBox2.setSelectedIndex(4);
        }
        else if(month.equals("June")){
            jComboBox2.setSelectedIndex(5);
        }else if(month.equals("July")){
            jComboBox2.setSelectedIndex(6);
        }
         else if(month.equals("August")){
            jComboBox2.setSelectedIndex(7);
        }
        else if(month.equals("Spetember")){
            jComboBox2.setSelectedIndex(8);
        }
        else if(month.equals("October")){
            jComboBox2.setSelectedIndex(9);
        }
        else if(month.equals("November")){
            jComboBox2.setSelectedIndex(10);
        }else if(month.equals("December")){
            jComboBox2.setSelectedIndex(11);
        }
    
        YEAR.setText(model.getValueAt(i,5).toString());
        String field = model.getValueAt(i,6).toString();
            if(field.equals("HOME"))
            {
                jRadioButtonH.setSelected(true);
            }
            else if(field.equals("AWAY"))
            {
                jRadioButtonA.setSelected(true);
            }
            if(field.equals("NEUTRAL"))
            {
                jRadioButtonN.setSelected(true);
            }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
             MV.setText("");
             MN.setText("");
             jComboBox3.setSelectedIndex(0);
             jComboBox1.setSelectedIndex(0);
             jComboBox2.setSelectedIndex(0);
             YEAR.setText("");
             jRadioButtonH.setSelected(false);
             jRadioButtonA.setSelected(false);
             jRadioButtonN.setSelected(false);
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
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MN;
    private javax.swing.JTextField MV;
    private javax.swing.JTextField YEAR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonA;
    private javax.swing.JRadioButton jRadioButtonH;
    private javax.swing.JRadioButton jRadioButtonN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private String Field;
}