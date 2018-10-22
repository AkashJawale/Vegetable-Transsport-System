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
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OracleStatement;

/**
 *
 * @author heartless
 */
public class frmStock extends javax.swing.JFrame {
Connection con=null;
    OraclePreparedStatement pst=null;
     OracleStatement smt=null;
       OracleResultSet rs=null;
    /**
     * Creates new form frmStock
     */
    public frmStock() {
        initComponents();
        
         showDate();
         showTime();
         
        
       // String str ="select * from VEGETABLE";
        try {
              con=ConnectDB.condb();
              smt=(OracleStatement)con.createStatement();
            rs=(OracleResultSet)smt.executeQuery("select * from VEGETABLE");
            while(rs.next())
            {
           cmbPName.addItem(rs.getString(2));
           //txtCurStock.setText(rs.getString(4));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbPName = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSid = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNStock = new javax.swing.JTextField();
        txtCurStock = new javax.swing.JTextField();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 3));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 208, 217));
        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setText("Vegetable Transport System");
        jLabel1.setOpaque(true);
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 208, 217));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Stock Details");
        jLabel3.setOpaque(true);
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 160, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\photos\\potato onion tomato.jpg")); // NOI18N
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, 0, 820, 100));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 100));

        jPanel1.setBackground(new java.awt.Color(192, 217, 218));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Product Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 90, 30));

        cmbPName.setBackground(new java.awt.Color(255, 254, 240));
        cmbPName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbPName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPNameItemStateChanged(evt);
            }
        });
        cmbPName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbPNameKeyPressed(evt);
            }
        });
        jPanel1.add(cmbPName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 200, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("New Stock");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 80, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Current Stock");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 100, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Stock ID");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        txtSid.setBackground(new java.awt.Color(255, 254, 240));
        txtSid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSidActionPerformed(evt);
            }
        });
        jPanel3.add(txtSid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 100, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\photos\\owner.jpg")); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 210, 50));
        jPanel1.add(txtNStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 190, -1));
        jPanel1.add(txtCurStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 190, -1));
        jPanel1.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 70, 20));
        jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 70, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 580, 220));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\Addnew.jpg")); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 80, 30));

        btnUpdate.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\update-png-hinew.jpg")); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 100, 30));

        btnSave.setBackground(new java.awt.Color(204, 204, 204));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\.jpg")); // NOI18N
        jPanel4.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 80, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\photos\\owner.jpg")); // NOI18N
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 580, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed


         con=ConnectDB.condb();
        /*try
        {
            pst=(OraclePreparedStatement)con.prepareStatement("insert into STOCK values(?,?,?)");
            pst.setInt(1, Integer.parseInt(txtSid.getText()+""));
            pst.setString(2,cmbPName.getSelectedItem()+"");
            
            pst.setString(3,txtCurStock.getText()+"");
          pst.setString(4,txtNStock.getText()+"");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Added succesfull...");
            pst.close();
       
          
          
           
        }

        catch(Exception e)
        {
      }*/
        JOptionPane.showMessageDialog(this,"Added succesfull...");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSidActionPerformed

    private void cmbPNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPNameItemStateChanged


        con=ConnectDB.condb();
        try
        {
            smt=(OracleStatement)con.createStatement();
             rs=(OracleResultSet)smt.executeQuery("Select * from VEGETABLE where VNAME="+cmbPName.getSelectedItem());
            while(rs.next()){
                txtCurStock.setText(""+rs.getString(4));
            
            }
        }
        catch(Exception e)
        {}
        
        
       
       
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPNameItemStateChanged

    private void cmbPNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbPNameKeyPressed

      
        
        
       
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPNameKeyPressed

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
            java.util.logging.Logger.getLogger(frmStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbPName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextField txtCurStock;
    private javax.swing.JTextField txtNStock;
    private javax.swing.JTextField txtSid;
    // End of variables declaration//GEN-END:variables
}
