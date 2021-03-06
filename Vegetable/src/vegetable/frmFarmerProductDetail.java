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
import javax.swing.Timer;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OracleStatement;


/**
 *
 * @author heartless
 */
public class frmFarmerProductDetail extends javax.swing.JFrame {

    /**
     * Creates new form frmFarmerProductDetail
     */
    public frmFarmerProductDetail() {
        initComponents();
         Connection con =null;
       OraclePreparedStatement pst=null;
       OracleStatement smt=null;
       OracleResultSet rs=null;
       showDate();
         showTime();
         
         
          String str ="select * from VEGETABLE";
        try {
              con=ConnectDB.condb();
              smt=(OracleStatement)con.createStatement();
            rs=(OracleResultSet)smt.executeQuery("select * from VEGETABLE");
            while(rs.next())
            {
            cmbP1.addItem(rs.getString(2));
            cmbP2.addItem(rs.getString(2));
            cmbP3.addItem(rs.getString(2));
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFcont = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdd = new javax.swing.JTextArea();
        lblTime = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbP1 = new javax.swing.JComboBox<>();
        cmbP2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbP3 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 3));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 208, 217));
        jLabel5.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel5.setText("Vegetable Transport System");
        jLabel5.setOpaque(true);
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 208, 217));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Farmer Product Details");
        jLabel10.setOpaque(true);
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 250, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\photos\\potato onion tomato.jpg")); // NOI18N
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, 0, 870, 100));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 100));

        jPanel1.setBackground(new java.awt.Color(192, 217, 218));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Contact No");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Farmer ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Farmer Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        txtFcont.setBackground(new java.awt.Color(255, 254, 240));
        txtFcont.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFcont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFcontKeyPressed(evt);
            }
        });
        jPanel1.add(txtFcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 200, 30));

        txtId.setBackground(new java.awt.Color(255, 254, 240));
        txtId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 110, 30));

        txtName.setBackground(new java.awt.Color(255, 254, 240));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 250, 30));

        txtAdd.setBackground(new java.awt.Color(255, 254, 240));
        txtAdd.setColumns(20);
        txtAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAdd.setRows(5);
        jScrollPane1.setViewportView(txtAdd);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 250, 70));

        lblTime.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 100, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Time");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        lblDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 100, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 630, 230));

        jPanel2.setBackground(new java.awt.Color(192, 217, 218));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Product Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, 40));

        cmbP1.setBackground(new java.awt.Color(255, 254, 240));
        cmbP1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(cmbP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 200, -1));

        cmbP2.setBackground(new java.awt.Color(255, 254, 240));
        cmbP2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(cmbP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 200, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Product Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 100, 40));

        cmbP3.setBackground(new java.awt.Color(255, 254, 240));
        cmbP3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(cmbP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 200, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Product Name");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 100, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 630, 160));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\save-png-hinew.jpg")); // NOI18N
        btnSave.setOpaque(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 80, 30));

        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\update-png-hinew.jpg")); // NOI18N
        btnUpdate.setOpaque(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 80, 30));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\delete-png-hinew.jpg")); // NOI18N
        btnDelete.setOpaque(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 80, 30));

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\clear-png-hinew.jpg")); // NOI18N
        btnClear.setOpaque(false);
        jPanel3.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 80, 30));

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\.jpg")); // NOI18N
        btnExit.setOpaque(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel3.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 80, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\photos\\owner.jpg")); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 630, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtFcontKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFcontKeyPressed

int key=evt.getKeyCode();
         if ((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
         {
            txtFcont.setEditable(true);
            txtFcont.setBackground(Color.white);
             
            
         }
         else
         {    
            txtFcont.setEditable(false);
        txtFcont.setBackground(Color.red);
         
        }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_txtFcontKeyPressed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed


int key=evt.getKeyCode();
         if ((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
         {
            txtId.setEditable(true);
            txtId.setBackground(Color.white);
             
            
         }
         else
         {    
            txtId.setEditable(false);
        txtId.setBackground(Color.red);
         
        }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdKeyPressed

   
    
    
    
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
            java.util.logging.Logger.getLogger(frmFarmerProductDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFarmerProductDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFarmerProductDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFarmerProductDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFarmerProductDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbP1;
    private javax.swing.JComboBox<String> cmbP2;
    private javax.swing.JComboBox<String> cmbP3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextArea txtAdd;
    private javax.swing.JTextField txtFcont;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
