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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Eternity
 */
public class ShowTransferRecords extends javax.swing.JFrame {

        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        ArrayList<user1> searchArray = new ArrayList<user1>();
         private int sp,bp,af,tb,aa;
         double tc,bpb,afb,ta;
    public ShowTransferRecords() {
        initComponents();
        conn=sqlconnect.connectDB();
        getUsersList();
        getUsersList1();
    }
         public ArrayList<user1> getUsersList()
   {
       String sql="select * from transfer_sell";
       ArrayList<user1> usersList = new ArrayList<user1>();
       Statement st;    
       try {
           st = conn.createStatement();
           rs = st.executeQuery(sql);

           user1 user;

           while(rs.next())
           {
               user = new user1(rs.getString("Name"),rs.getInt("JerseyNo"),rs.getString("SoldTo"),rs.getInt("SellingPrice"),rs.getInt("BuyingPrice"),rs.getInt("AgentFee"),rs.getInt("TeamBenefit"));
               usersList.add(user);
           }
            Object [][]row = new Object[usersList.size()][8];
            String []name = {"Name","JerseyNo","SoldTo","SellingPrice","BuyingPrice","AgentFee","TeamBenefit"};
            Model mo;
           for(int i = 0; i<usersList.size();i++){
           row[i][0] = usersList.get(i).getname();
           row[i][1] = usersList.get(i).getjersey();
           row[i][2] = usersList.get(i).getsoldto();
           row[i][3] = usersList.get(i).getsellingprice();
           row[i][4] = usersList.get(i).getbuyingprice();
           row[i][5] = usersList.get(i).getagentfee();
           row[i][6] = usersList.get(i).getteambenefit();
           
           }
            mo = new Model(row,name,8);
            jTable9.setModel(mo);
            jTable9.setRowHeight(40);
           
            jTable9.getColumnModel().getColumn(2);
       } 
      catch (Exception e) {
           e.printStackTrace();
       }
       return usersList;
   }
         public ArrayList<user1> getUsersList1()
   {
       String sql="select * from transfer_buy";
       ArrayList<user1> usersList1 = new ArrayList<user1>();
       Statement st;    
       try {
           st = conn.createStatement();
           rs = st.executeQuery(sql);

           user1 user01;

           while(rs.next())
           {
               user01 = new user1(rs.getString("Name"),rs.getInt("JerseyNo"),rs.getString("BoughtFrom"),rs.getDouble("BuyingPrice"),rs.getDouble("AgentFee"),rs.getDouble("Tax"),rs.getDouble("TotalCost"));
               usersList1.add(user01);
           }
            Object [][]row = new Object[usersList1.size()][8];
            String []name = {"Name","JerseyNo","BoughtFrom","BuyingPrice","AgentFee","Tax","TotalCost"};
            Model mo;
           for(int i = 0; i<usersList1.size();i++){
           row[i][0] = usersList1.get(i).getname();
           row[i][1] = usersList1.get(i).getjersey();
           row[i][2] = usersList1.get(i).getboughtfrom();
           row[i][3] = usersList1.get(i).getbuyingprice2();
           row[i][4] = usersList1.get(i).getagentfee2();
           row[i][5] = usersList1.get(i).gettax();
           row[i][6] = usersList1.get(i).gettotalcost();
           
           }
            mo = new Model(row,name,8);
            jTable10.setModel(mo);
            jTable10.setRowHeight(40);
           
            jTable10.getColumnModel().getColumn(2);
       } 
      catch (Exception e) {
           e.printStackTrace();
       }
       return usersList1;
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
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel24 = new javax.swing.JPanel();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        PN4 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        JN4 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        SP4 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        AF4 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        TB4 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        BP4 = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        ST4 = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        TA4 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        TC4 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        AFB4 = new javax.swing.JTextField();
        PNB = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        BF4 = new javax.swing.JTextField();
        BPB4 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        JNB9 = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(902, 442));
        setPreferredSize(new java.awt.Dimension(1032, 764));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 760));
        jPanel1.setLayout(null);

        jTabbedPane6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        jTabbedPane6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jPanel24.setBackground(new java.awt.Color(102, 0, 102));
        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel24.setLayout(null);

        jButton30.setBackground(new java.awt.Color(51, 51, 255));
        jButton30.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("UPDATE");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton30);
        jButton30.setBounds(490, 580, 149, 40);

        jButton31.setBackground(new java.awt.Color(255, 51, 51));
        jButton31.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("DELETE");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton31);
        jButton31.setBounds(670, 580, 149, 40);

        jButton32.setBackground(new java.awt.Color(255, 102, 102));
        jButton32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton32.setText("BACK");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton32);
        jButton32.setBounds(10, 580, 170, 40);

        jPanel23.setBackground(new java.awt.Color(251, 251, 251));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELLING INFOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel23.setLayout(null);

        jLabel58.setBackground(new java.awt.Color(255, 255, 51));
        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 51, 153));
        jLabel58.setText("PLAYER NAME");
        jPanel23.add(jLabel58);
        jLabel58.setBounds(30, 60, 120, 20);

        PN4.setEditable(false);
        PN4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel23.add(PN4);
        PN4.setBounds(210, 50, 160, 30);

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 51, 153));
        jLabel59.setText("JERSEY NO");
        jPanel23.add(jLabel59);
        jLabel59.setBounds(30, 110, 100, 17);

        JN4.setEditable(false);
        JN4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel23.add(JN4);
        JN4.setBounds(210, 100, 110, 30);

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 51, 153));
        jLabel60.setText("SELLING PRICE");
        jPanel23.add(jLabel60);
        jLabel60.setBounds(30, 200, 130, 20);
        jPanel23.add(SP4);
        SP4.setBounds(210, 190, 120, 30);

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 51, 153));
        jLabel61.setText("AGENT FEE");
        jPanel23.add(jLabel61);
        jLabel61.setBounds(30, 280, 90, 17);
        jPanel23.add(AF4);
        AF4.setBounds(210, 270, 120, 30);

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 51, 153));
        jLabel62.setText("TEAM BENEFIT");
        jPanel23.add(jLabel62);
        jLabel62.setBounds(30, 320, 110, 17);
        jPanel23.add(TB4);
        TB4.setBounds(210, 310, 120, 30);

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 51, 153));
        jLabel63.setText("BUYING PRICE");
        jPanel23.add(jLabel63);
        jLabel63.setBounds(30, 240, 130, 20);
        jPanel23.add(BP4);
        BP4.setBounds(210, 230, 120, 30);

        jButton33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton33.setText("=");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton33);
        jButton33.setBounds(150, 320, 50, 20);

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 51, 153));
        jLabel64.setText("SOLD TO");
        jPanel23.add(jLabel64);
        jLabel64.setBounds(30, 160, 70, 17);

        ST4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel23.add(ST4);
        ST4.setBounds(210, 150, 110, 30);

        jPanel24.add(jPanel23);
        jPanel23.setBounds(10, 20, 400, 460);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTable9);

        jPanel24.add(jScrollPane10);
        jScrollPane10.setBounds(420, 30, 590, 402);

        jButton7.setBackground(new java.awt.Color(204, 255, 204));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("RESET");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed1(evt);
            }
        });
        jPanel24.add(jButton7);
        jButton7.setBounds(320, 580, 140, 40);

        jTabbedPane6.addTab("SELL INFOS", jPanel24);

        jPanel26.setBackground(new java.awt.Color(0, 204, 204));
        jPanel26.setForeground(new java.awt.Color(0, 153, 153));
        jPanel26.setPreferredSize(new java.awt.Dimension(900, 900));
        jPanel26.setLayout(null);

        jButton34.setBackground(new java.awt.Color(255, 51, 51));
        jButton34.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("DELETE");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton34);
        jButton34.setBounds(440, 550, 149, 40);

        jButton35.setBackground(new java.awt.Color(51, 51, 255));
        jButton35.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("UPDATE");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton35);
        jButton35.setBounds(260, 550, 149, 40);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUYING INFOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel25.setLayout(null);

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 51, 153));
        jLabel65.setText("TAX");
        jPanel25.add(jLabel65);
        jLabel65.setBounds(30, 260, 90, 17);
        jPanel25.add(TA4);
        TA4.setBounds(210, 250, 120, 30);

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 51, 153));
        jLabel66.setText("TOTAL COST");
        jPanel25.add(jLabel66);
        jLabel66.setBounds(30, 310, 90, 17);
        jPanel25.add(TC4);
        TC4.setBounds(210, 300, 120, 30);

        jLabel67.setBackground(new java.awt.Color(255, 255, 51));
        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 51, 153));
        jLabel67.setText("PLAYER NAME");
        jPanel25.add(jLabel67);
        jLabel67.setBounds(30, 50, 120, 20);

        jButton36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton36.setText("=");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton36);
        jButton36.setBounds(140, 310, 50, 20);
        jPanel25.add(AFB4);
        AFB4.setBounds(210, 210, 120, 30);

        PNB.setEditable(false);
        PNB.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel25.add(PNB);
        PNB.setBounds(190, 40, 140, 30);

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 51, 153));
        jLabel68.setText("JERSEY NO");
        jPanel25.add(jLabel68);
        jLabel68.setBounds(30, 90, 100, 17);

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 51, 153));
        jLabel69.setText("AGENT FEE");
        jPanel25.add(jLabel69);
        jLabel69.setBounds(30, 220, 90, 17);

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 51, 153));
        jLabel70.setText(" BUYING PRICE");
        jPanel25.add(jLabel70);
        jLabel70.setBounds(30, 180, 130, 20);
        jPanel25.add(BF4);
        BF4.setBounds(190, 120, 140, 30);

        BPB4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel25.add(BPB4);
        BPB4.setBounds(190, 170, 140, 30);

        jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 51, 153));
        jLabel71.setText("BOUGHT FROM");
        jPanel25.add(jLabel71);
        jLabel71.setBounds(30, 130, 110, 17);

        JNB9.setEditable(false);
        JNB9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel25.add(JNB9);
        JNB9.setBounds(230, 80, 100, 30);

        jPanel26.add(jPanel25);
        jPanel25.setBounds(20, 10, 410, 460);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jTable10);

        jPanel26.add(jScrollPane11);
        jScrollPane11.setBounds(460, 10, 550, 460);

        jButton8.setBackground(new java.awt.Color(204, 255, 204));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setText("RESET");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton8);
        jButton8.setBounds(70, 550, 160, 40);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane6.addTab("BUY INFOS", jPanel27);

        jPanel1.add(jTabbedPane6);
        jTabbedPane6.setBounds(0, 60, 1030, 710);

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 255, 255));
        jLabel18.setText("TRANSFER RECORDS");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(220, 10, 390, 42);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(-2, 0, 1030, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1030, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int i = jTable10.getSelectedRow();
        TableModel model = jTable10.getModel();
        PNB.setText(model.getValueAt(i,0).toString());
        JNB9.setText(model.getValueAt(i,1).toString());
        BF4.setText(model.getValueAt(i,2).toString());
        BPB4.setText(model.getValueAt(i,3).toString());
        AFB4.setText(model.getValueAt(i,4).toString());
        TA4.setText(model.getValueAt(i,5).toString());
        TC4.setText(model.getValueAt(i,6).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String value4= BPB4.getText();
        bpb = Double.parseDouble(value4);

        String value5= AFB4.getText();
        afb = Double.parseDouble(value5);

        String value6= TA4.getText();
        ta = Double.parseDouble(value6);

        tc=bpb+afb+(ta/100*bpb) ;

        TC4.setText(Double.toString(tc));
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            String value1 = PNB.getText();
            String value2 = JNB9.getText();
            String value3 = BF4.getText();
            String value4 = BPB4.getText();
            String value5 = AFB4.getText();
            String value6 = TA4.getText();
            String value7 = TC4.getText();

            String sql= "update transfer_buy set Name='"+value1+"',JerseyNo='"+value2+"',BoughtFrom='"+value3+"',BuyingPrice='"+value4+"',AgentFee='"+value5+"',Tax='"+value6+"',TotalCost='"+Double.parseDouble(value7)+" ' where JerseyNo=' " +value2+" ' ";
            pst=conn.prepareStatement(sql);

            pst.execute();
            JOptionPane.showMessageDialog(null, "UPDATED");

        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,E);
        }
        getUsersList1();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{    
            
            pst=conn.prepareStatement("DELETE FROM transfer_buy where JerseyNo=?");
            pst.setString(1,JNB9.getText());
            pst.executeUpdate();
             
            JOptionPane.showMessageDialog(null, "DELETED");
             getUsersList1();
    }                                        
        catch(Exception E){
         JOptionPane.showMessageDialog(null,E);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        getUsersList();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable9.getSelectedRow();
        TableModel model = jTable9.getModel();
        PN4.setText(model.getValueAt(i,0).toString());
        JN4.setText(model.getValueAt(i,1).toString());
        ST4.setText(model.getValueAt(i,2).toString());
        SP4.setText(model.getValueAt(i,3).toString());
        BP4.setText(model.getValueAt(i,4).toString());
        AF4.setText(model.getValueAt(i,5).toString());
        TB4.setText(model.getValueAt(i,6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        String value1= SP4.getText();
        sp = Integer.parseInt(value1);

        String value2= BP4.getText();
        bp = Integer.parseInt(value2);

        String value3= AF4.getText();
        af = Integer.parseInt(value3);
        aa=(bp+af);
        tb=sp-aa;

        TB4.setText(Integer.toString(tb));
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
        AdminPage AP = new AdminPage();
        AP.setLocationRelativeTo(null);
        AP.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{    
            
            pst=conn.prepareStatement("DELETE FROM transfer_sell where JerseyNo=?");
            pst.setString(1,JN4.getText());
            pst.executeUpdate();
             
            JOptionPane.showMessageDialog(null, "DELETED");
            conn.close();
            getUsersList();
    }                                        
        catch(Exception E){
         JOptionPane.showMessageDialog(null,E);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            String value1 = PN4.getText();
            String value2 = JN4.getText();
            String value3 = ST4.getText();
            String value4 = SP4.getText();
            String value5 = BP4.getText();
            String value6 = AF4.getText();
            String value7 = TB4.getText();

            String sql= "update transfer_sell set Name='"+value1+"',JerseyNo='"+value2+"',SoldTo='"+value3+"',SellingPrice='"+value4+"',BuyingPrice='"+value5+"',AgentFee='"+value6+"',TeamBenefit='"+value7+" ' where JerseyNo=' " +value2+" ' ";
            pst=conn.prepareStatement(sql);

            pst.execute();
            JOptionPane.showMessageDialog(null, "UPDATED");

        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,E);
        }
        getUsersList();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed1
        PN4.setText("");
        JN4.setText("");
        ST4.setText("");
        SP4.setText("");
        BP4.setText("");
        AF4.setText("");
        TB4.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed1

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        PNB.setText("");
        JNB9.setText("");
        BF4.setText("");
        BPB4.setText("");
        AFB4.setText("");
        TA4.setText("");
        TC4.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(ShowTransferRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowTransferRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowTransferRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowTransferRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowTransferRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AF4;
    private javax.swing.JTextField AFB4;
    private javax.swing.JTextField BF4;
    private javax.swing.JTextField BP4;
    private javax.swing.JTextField BPB4;
    private javax.swing.JTextField JN4;
    private javax.swing.JTextField JNB9;
    private javax.swing.JTextField PN4;
    private javax.swing.JTextField PNB;
    private javax.swing.JTextField SP4;
    private javax.swing.JTextField ST4;
    private javax.swing.JTextField TA4;
    private javax.swing.JTextField TB4;
    private javax.swing.JTextField TC4;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable9;
    // End of variables declaration//GEN-END:variables

    
}
