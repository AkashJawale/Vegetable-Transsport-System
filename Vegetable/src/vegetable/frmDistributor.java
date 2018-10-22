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
import java.sql.ResultSet;
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
public class frmDistributor extends javax.swing.JFrame {
       Connection con=null;
       OraclePreparedStatement pst=null;
       OracleStatement smt=null;
       OracleResultSet rs=null;
   DefaultTableModel model=new DefaultTableModel();
    Object[] row= new Object[5];
    
    /**
     * Creates new form frmDistributor
     */
    
          
       
    public frmDistributor() {
        initComponents();
        getDistributorId();
         
        showDate();
         showTime();
  
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

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCont = new javax.swing.JTextField();
        txtPin = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAdd = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 208, 217));
        jLabel4.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel4.setText("Vegetable Transport System");
        jLabel4.setOpaque(true);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 208, 217));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Distributor Details");
        jLabel2.setOpaque(true);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 200, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\photos\\potato onion tomato.jpg")); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, 0, 870, 100));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 100));

        jPanel5.setBackground(new java.awt.Color(192, 217, 218));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Address");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Contact No");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, 30));

        txtCont.setBackground(new java.awt.Color(255, 254, 240));
        txtCont.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContActionPerformed(evt);
            }
        });
        txtCont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContKeyPressed(evt);
            }
        });
        jPanel5.add(txtCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 200, 30));

        txtPin.setBackground(new java.awt.Color(255, 254, 240));
        txtPin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPinKeyPressed(evt);
            }
        });
        jPanel5.add(txtPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 160, 30));

        txtName.setBackground(new java.awt.Color(255, 254, 240));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        jPanel5.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 240, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Pin Code");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, 30));

        txtId.setBackground(new java.awt.Color(255, 254, 240));
        txtId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel5.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 60, 30));

        txtAdd.setBackground(new java.awt.Color(255, 254, 240));
        txtAdd.setColumns(20);
        txtAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAdd.setRows(5);
        jScrollPane3.setViewportView(txtAdd);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 260, 70));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Name");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("ID");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 17, -1, 30));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearch.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\search-button-png-hinew.jpg")); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel6.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\photos\\owner.jpg")); // NOI18N
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 50));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, 50));

        lblDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel5.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 100, 20));

        lblTime.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel5.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 100, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Date");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Time");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 630, 200));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\.jpg")); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 80, 30));

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\ICON\\clear-png-hinew.jpg")); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 90, 30));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("D:\\projects sample\\mobileshop project\\icons\\delete-png-hinew.jpg")); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 90, 30));

        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("D:\\projects sample\\mobileshop project\\icons\\update-png-hinew.jpg")); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 90, 30));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("D:\\projects sample\\mobileshop project\\icons\\save-png-hinew.jpg")); // NOI18N
        btnSave.setOpaque(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveKeyPressed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 80, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon("D:\\vegetable transport project\\photos\\owner.jpg")); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 630, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        con=ConnectDB.condb();

        try
        {
            pst=(OraclePreparedStatement)con.prepareStatement("Delete from DISTRIBUTOR where D_ID=?");
            pst.setInt(1,Integer.parseInt(txtId.getText()+""));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Deleted...");
            clearAllFields();
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
       
        txtName.setText("");
        txtAdd.setText("");
        txtPin.setText("");
        txtCont.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        con=ConnectDB.condb();
        try
        {
            pst=(OraclePreparedStatement)con.prepareStatement("update DISTRIBUTOR set D_NAME=?,D_ADD=?,D_PIN=?,D_CONTACT=? where Id=" +txtId.getText());
            pst.setInt(1, Integer.parseInt(txtId.getText()+""));
            pst.setString(1,txtName.getText()+"");
            pst.setString(2,txtAdd.getText()+"");
            pst.setString(3,txtPin.getText()+"");
            pst.setString(4,txtCont.getText()+"");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Updated...");
            pst.close();
          
        }
        catch(Exception e)
        {
        }
       
    }//GEN-LAST:event_btnUpdateActionPerformed

   
    
    
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveKeyPressed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        con=ConnectDB.condb();
        try
        {
            pst=(OraclePreparedStatement)con.prepareStatement("insert into DISTRIBUTOR values(?,?,?,?,?)");
            pst.setInt(1, Integer.parseInt(txtId.getText()+""));
            pst.setString(2,txtName.getText()+"");
            pst.setString(3,txtAdd.getText()+"");
            pst.setString(4,txtPin.getText()+"");
            pst.setString(5,txtCont.getText()+"");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Saved...");
            pst.close();
       
            clearAllFields();
            getDistributorId();
              // btnSave.setVisible(false);
          
           
        }

        catch(Exception e)
        {
      }
    }//GEN-LAST:event_btnSaveActionPerformed

     private void clearAllFields() {                                         
        // TODO add your handling code here:
       
        txtName.setText("");
        txtAdd.setText("");
        txtPin.setText("");
        txtCont.setText("");
    }                       
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        con=ConnectDB.condb();
        try
        {
            smt=(OracleStatement)con.createStatement();
            rs=(OracleResultSet)smt.executeQuery("select * from DISTRIBUTOR where d_id="+txtId.getText());
            while(rs.next())
            {
                txtName.setText(rs.getString(2)+"");
                txtAdd.setText(rs.getString(3)+"");
                txtPin.setText(rs.getString(4)+"");
                txtCont.setText(rs.getString(5)+"");
            }

        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContActionPerformed

     private void getDistributorId() {                                        
        // TODO add your handling code here:
        con=ConnectDB.condb();
        try
        {
            smt=(OracleStatement)con.createStatement();
            rs=(OracleResultSet)smt.executeQuery("select count(*) from DISTRIBUTOR");
            while(rs.next()){
                txtId.setText((Integer.parseInt(rs.getString(1))+1 )+"");
                System.out.println("rs.getString(1)  :"+rs.getString(1));
            }
        }
        catch(Exception e)
        {}
        
    } 
      
     
  
    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtPinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPinKeyPressed
        // TODO add your handling code here:
          int key=evt.getKeyCode();
         if ((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
         {
            txtPin.setEditable(true);
            txtPin.setBackground(Color.white);
            
         }
         else
         {    
            txtPin.setEditable(false);
        txtPin.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtPinKeyPressed

    private void txtContKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContKeyPressed
        // TODO add your handling code here:
         int key=evt.getKeyCode();
         if ((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
         {
            txtCont.setEditable(true);
           
         }
         else
         {    
            txtCont.setEditable(false);
           
        }
    }//GEN-LAST:event_txtContKeyPressed

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
            java.util.logging.Logger.getLogger(frmDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDistributor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextArea txtAdd;
    private javax.swing.JTextField txtCont;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPin;
    // End of variables declaration//GEN-END:variables
}
