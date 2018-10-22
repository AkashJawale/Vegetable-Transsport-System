/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class frmFarmerbill extends javax.swing.JFrame {
    
      Connection con=null;
       OraclePreparedStatement pst=null;
       OracleStatement smt=null;
       OracleResultSet rs=null;
   DefaultTableModel model=new DefaultTableModel();
    Object[] row= new Object[4];

    /**
     * Creates new form frmFarmerbill
     */
    public frmFarmerbill() {
        initComponents();
        getBillId();
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
        
         String str1 ="select * from FARMER";
        try {
              con=ConnectDB.condb();
              smt=(OracleStatement)con.createStatement();
            rs=(OracleResultSet)smt.executeQuery("select * from FARMER");
            while(rs.next())
            {
            cmbFarmer.addItem(rs.getString(2));
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAdd = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        cmbFarmer = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cmbVegname = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(370, 160, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 208, 217));
        jLabel4.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel4.setText("Vegetable Transport System");
        jLabel4.setOpaque(true);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 208, 217));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Farmer Bill  Details");
        jLabel2.setOpaque(true);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 210, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\photos\\potato onion tomato.jpg")); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1140, 110));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 110));

        jPanel2.setBackground(new java.awt.Color(192, 217, 218));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.setBackground(new java.awt.Color(255, 253, 240));
        txtId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 110, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Bill ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 40, 30));

        txtAdd.setBackground(new java.awt.Color(255, 253, 240));
        txtAdd.setColumns(20);
        txtAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAdd.setRows(5);
        jScrollPane2.setViewportView(txtAdd);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 250, 60));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Address");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 70, 20));

        btnSearch.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\search-button-png-hinew.jpg")); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 80, 30));

        lblTime.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 100, 20));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Time");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Date");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, -1));

        lblDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 100, 20));

        jPanel2.add(cmbFarmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 250, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 190));

        jPanel4.setBackground(new java.awt.Color(192, 217, 218));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 900, 160));

        jPanel4.add(cmbVegname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 150, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vegatible name");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 100, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 40, 30));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        jPanel4.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 80, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quantity");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 60, 30));

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        jPanel4.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 80, 30));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\photos\\flo.jpg")); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 900, 190));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 900, 180));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\.jpg")); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel6.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 80, 30));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("D:\\projects sample\\mobileshop project\\icons\\save-png-hinew.jpg")); // NOI18N
        btnSave.setOpaque(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel6.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 80, 30));

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\print-button-png-hinew.jpg")); // NOI18N
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 90, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\photos\\owner.jpg")); // NOI18N
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 50));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 900, 50));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Total");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 50, 30));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 482, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

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

                          
    
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
       
        
          con=ConnectDB.condb();
        try
        {
            pst=(OraclePreparedStatement)con.prepareStatement("insert into FARMERBILL values(?,?,?,?,?,?,?,?)");
                      
             pst.setInt(1, Integer.parseInt(txtId.getText()+""));
             pst.setString(2,lblDate.getText()+"");
             pst.setString(3,cmbFarmer.getSelectedItem()+"");
            pst.setString(4,txtAdd.getText()+"");
            pst.setString(5,cmbVegname.getSelectedItem()+"");
            pst.setString(6,txtPrice.getText()+"");
            pst.setString(7,txtQty.getText()+"");
            pst.setString(8,txtTotal.getText()+"");
            pst.executeUpdate();                 
                    
            JOptionPane.showMessageDialog(this,"Saved...");
            pst.close();   
          clearAllFields();
            getBillId();
           
        }

        catch(Exception e)
        {}
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

      private void clearAllFields() {                                         
        // TODO add your handling code here:
       
      
        txtAdd.setText("");
        txtPrice.setText("");
        txtQty.setText("");
         txtTotal.setText("");
    }                       
    
    
    
    private void getBillId() {                                        
        // TODO add your handling code here:
        con=ConnectDB.condb();
        try
        {
            smt=(OracleStatement)con.createStatement();
            rs=(OracleResultSet)smt.executeQuery("select count(*) from Farmerbill");
            while(rs.next()){
                txtId.setText((Integer.parseInt(rs.getString(1))+1 )+"");
                System.out.println("rs.getString(1)  :"+rs.getString(1));
            }
        }
        catch(Exception e)
        {}
        
    } 
    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_txtIdKeyPressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
         con=ConnectDB.condb();
        try
        {
            smt=(OracleStatement)con.createStatement();
            rs=(OracleResultSet)smt.executeQuery("select * from Farmerbill where B_ID="+txtId.getText());
            while(rs.next())
            {
               
               
                txtAdd.setText(rs.getString(3)+"");
               
                
                txtPrice.setText(rs.getString(6)+"");
                txtQty.setText(rs.getString(7)+"");
                txtTotal.setText(rs.getString(8)+"");
                
            }

        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(frmFarmerbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFarmerbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFarmerbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFarmerbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFarmerbill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbFarmer;
    private javax.swing.JComboBox<String> cmbVegname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextArea txtAdd;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
