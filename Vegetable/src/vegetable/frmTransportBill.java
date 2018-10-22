/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetable;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OracleStatement;

/**
 *
 * @author heartless
 */
public class frmTransportBill extends javax.swing.JFrame {
Connection con=null;
       OraclePreparedStatement pst=null;
       OracleStatement smt=null;
       OracleResultSet rs=null;
       DefaultTableModel model=new DefaultTableModel();
    Object[] row= new Object[4];
    /**
     * Creates new form frmTransportBill
     */
    public frmTransportBill() {
        initComponents();
         showDate();
         showTime();
         


    
     Object[] columns={"VEGETABLE NAME","PRICE","QUANTITY","TOTAL"};
        model.setColumnIdentifiers(columns);
        jTable1.setModel(model);
         
        
        String str ="select * from VEGETABLE";
        try {
              con=ConnectDB.condb();
              smt=(OracleStatement)con.createStatement();
            rs=(OracleResultSet)smt.executeQuery("select * from VEGETABLE");
            while(rs.next())
            {
            cmbVegname.addItem(rs.getString(2));
            }
        }
        catch (Exception e)
                {
                }
    }

     void showDate()
         {
             Date d=new Date();
             SimpleDateFormat s=new SimpleDateFormat("dd-MM-YYYY");
             lblDate.setText(s.format(d));
             
             
         }
         void showTime()
         {
             new Timer(0,new ActionListener()
             {
                 @Override
                 public void actionPerformed(ActionEvent ae){
                     Date d=new Date();
                     SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss");
                     lblTime.setText(s.format(d));
                 }
                         
             }).start();
             
         }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtVtype = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtVno = new javax.swing.JTextField();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtTotdis = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPpkm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotalkm = new javax.swing.JTextField();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtRname = new javax.swing.JTextField();
        txtRcont = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtPrice = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cmbVegname = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 3));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 208, 217));
        jLabel5.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel5.setText("Vegetable Transport System");
        jLabel5.setOpaque(true);
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 208, 217));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Transport Bill");
        jLabel10.setOpaque(true);
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 150, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\photos\\potato onion tomato.jpg")); // NOI18N
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 820, 100));
        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 100));

        jPanel1.setBackground(new java.awt.Color(192, 217, 218));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehical Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Vehical Type-");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, 20));

        txtVtype.setBackground(new java.awt.Color(255, 254, 240));
        txtVtype.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtVtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 120, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Vehical No-");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, 20));

        txtVno.setBackground(new java.awt.Color(255, 254, 240));
        txtVno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVnoKeyReleased(evt);
            }
        });
        jPanel1.add(txtVno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 120, -1));
        jPanel1.add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 740, 70));

        jPanel4.setBackground(new java.awt.Color(192, 217, 218));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Route Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Total Distance");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        txtTotdis.setBackground(new java.awt.Color(255, 254, 240));
        txtTotdis.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.add(txtTotdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 100, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Transport to");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, -1));

        txtTto.setBackground(new java.awt.Color(255, 254, 240));
        txtTto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.add(txtTto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 110, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("KM");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, 20));

        jLabel3.setText("Price per KM");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txtPpkm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPpkmKeyReleased(evt);
            }
        });
        jPanel4.add(txtPpkm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 100, -1));

        jLabel4.setText("Total ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        txtTotalkm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalkmActionPerformed(evt);
            }
        });
        jPanel4.add(txtTotalkm, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 90, -1));
        jPanel4.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 70, 30));
        jPanel4.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 70, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 740, 90));

        jPanel8.setBackground(new java.awt.Color(192, 217, 218));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transport to", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Receiver's Name");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));

        txtRname.setBackground(new java.awt.Color(255, 254, 240));
        txtRname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel8.add(txtRname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 200, -1));

        txtRcont.setBackground(new java.awt.Color(255, 254, 240));
        txtRcont.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRcont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRcontActionPerformed(evt);
            }
        });
        txtRcont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRcontKeyPressed(evt);
            }
        });
        jPanel8.add(txtRcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 190, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Contact");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 60, 20));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 740, 60));

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Veg Name", "Price", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 740, 100));

        txtPrice.setForeground(new java.awt.Color(0, 51, 51));
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 80, 30));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 51, 51));
        jLabel25.setText("Price");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 50, 30));

        txtQty.setForeground(new java.awt.Color(0, 51, 51));
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        getContentPane().add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 80, 30));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 51, 51));
        jLabel26.setText("Quantity");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 60, 30));

        cmbVegname.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(cmbVegname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 150, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Vegatible name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 100, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Total");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 50, 30));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 110, 30));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\.jpg")); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel7.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 80, 30));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("D:\\projects sample\\mobileshop project\\icons\\save-png-hinew.jpg")); // NOI18N
        btnSave.setOpaque(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel7.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 80, 30));

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\print-button-png-hinew.jpg")); // NOI18N
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 90, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\photos\\owner.jpg")); // NOI18N
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 50));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 740, 50));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVnoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVnoKeyReleased

    private void txtRcontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRcontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRcontActionPerformed

    private void txtRcontKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRcontKeyPressed

       int key=evt.getKeyCode();
         if ((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
         {
            txtRcont.setEditable(true);
            txtRcont.setBackground(Color.white);
             
            
         }
         else
         {    
            txtRcont.setEditable(false);
        txtRcont.setBackground(Color.red);
         
        }
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_txtRcontKeyPressed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtTotalkmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalkmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalkmActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        con=ConnectDB.condb();
        try
        {
            pst=(OraclePreparedStatement)con.prepareStatement("insert into TRANSPORTBILL values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1,txtVno.getText()+"");
            pst.setString(2,txtVtype.getText()+""); 
            pst.setString(3,jXDatePicker1.getDate()+"");
             pst.setString(4,txtRname.getText()+"");
             pst.setString(5,txtRcont.getText()+"");
            pst.setString(6,cmbVegname.getSelectedItem()+"");
            pst.setString(7,txtPrice.getText()+"");
            pst.setString(8,txtQty.getText()+"");
            pst.setString(9,txtTotal.getText()+"");
            pst.setString(10,txtTto.getText()+"");
            pst.setString(11,txtTotdis.getText()+"");
           pst.setString(12,txtPpkm.getText()+"");
           pst.setString(13,txtTotalkm.getText()+"");
           
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this,"Saved...");
            pst.close();
            
            clearAllFields();

        }

        catch(Exception e)
        {}

    }//GEN-LAST:event_btnSaveActionPerformed

    
     private void clearAllFields() {                                         
        // TODO add your handling code here:
      
            txtVno.setText("");
           txtVtype.setText(""); 
          
           txtRname.setText("");
           txtRcont.setText("");
            cmbVegname.setSelectedItem("");
            txtPrice.setText("");
            txtQty.setText("");
            txtTotal.setText("");
            txtTto.setText("");
            txtTotdis.setText("");
           txtPpkm.setText("");
           txtTotalkm.setText("");
    }                 
    private void txtPpkmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPpkmKeyReleased

        int a,b,c;
        a=Integer.parseInt(txtTotdis.getText());
        b=Integer.parseInt(txtPpkm.getText());
        //c=Integer.parseInt(txtTotalkm.getText());
        c=a*b;
        c=Integer.valueOf(c);
        txtTotalkm.setText(String.valueOf(c));
        
         

        // TODO add your handling code here:
    }//GEN-LAST:event_txtPpkmKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        row[0]=cmbVegname.getSelectedItem();
        row[1]=txtPrice.getText();
        row[2]=txtQty.getText();
        int b=Integer.parseInt(txtPrice.getText())* Integer.parseInt(txtQty.getText());
        row[3]=String.valueOf(b);
        //row[4]=txtPrice.getText()* txtQty.getText();
        model.addRow(row);
        double total=0;
        for(int i=0;i<jTable1.getRowCount();i++)
        {
            int amount=Integer.parseInt((String) jTable1.getValueAt(i, 3));
            total+=amount;

        }
        txtTotal.setText(String.valueOf(total));

        String str ="select * from VRGRTABLE";
        try {
            con=ConnectDB.condb();
            smt=(OracleStatement)con.createStatement();
            rs=(OracleResultSet)smt.executeQuery("select * from VRGRTABLE");
            while(rs.next())
            {
                cmbVegname.addItem(rs.getString(2));
            }
        }
        catch (Exception e)
        {
        }

    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(frmTransportBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTransportBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTransportBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTransportBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTransportBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbVegname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextField txtPpkm;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtRcont;
    private javax.swing.JTextField txtRname;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalkm;
    private javax.swing.JTextField txtTotdis;
    private javax.swing.JTextField txtTto;
    private javax.swing.JTextField txtVno;
    private javax.swing.JTextField txtVtype;
    // End of variables declaration//GEN-END:variables
}