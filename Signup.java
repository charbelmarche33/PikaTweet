/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikatweet;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Macbook-Air
 */
public class Signup extends javax.swing.JDialog {

    /**
     * Creates new form Signup
     */
    public Signup(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        uname = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        p2 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        label1.setBackground(new java.awt.Color(255, 0, 0));
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText(" Login:");

        label2.setBackground(new java.awt.Color(255, 0, 0));
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Password:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("jLabel4");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 400, 30));

        fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameActionPerformed(evt);
            }
        });
        getContentPane().add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 200, 40));

        label3.setBackground(new java.awt.Color(255, 0, 0));
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("  Full Name:");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, -1));

        label4.setBackground(new java.awt.Color(255, 0, 0));
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("  Username:");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 200, 40));

        label5.setBackground(new java.awt.Color(255, 0, 0));
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Password:");
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 70, -1));

        label6.setBackground(new java.awt.Color(255, 0, 0));
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText(" Confirm Password:");
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 160, 130, -1));

        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 140, 40));
        getContentPane().add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 380, -1));

        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 200, 40));

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 200, 40));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed
    ArrayList<Accounts> Accountsarray = new ArrayList();
     ArrayList<Accounts> Accountsarraytest = new ArrayList();
    FileStorage fs = new FileStorage();
    
    String checkuname;
    
    boolean taken = false;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Accountsarray = fs.retrieveAllUserInfoInUniverse();
        } catch (IOException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        password = jPasswordField2.getText();
           cpassword = p2.getText();
           name = fullname.getText();
           username = uname.getText();
           
          
        
          
           Accounts nub1 = new Accounts (name, username, password);
         
          
          boolean taken2 =  checkusername(username);
           
          if (taken2 == false){
           
          
         if (!password.equals( cpassword)){
             error.setText("Passwords do not match!");
             jPasswordField2.setText(null);
             p2.setText(null);
         
         }else{
    
            try {
                 
                Accountsarray.add(nub1);
                
               fs.updateAllUsersInfoInUniverse(Accountsarray);
                
                for (int i = 0; i < Accountsarray.size(); i++) {

                    Accounts search = Accountsarray.get(i);

                    
                    // error.setText(search.getName() + " " + search.getUsername() + " " + search.getPassword());
                    System.out.println(search.getName() + " " + search.getUsername() + " " + search.getPassword());
                    //setVisible(false);
                }  
                
         } catch (IOException ex) {
                System.out.println("there is no file");
            }
         }
          } else{
              System.out.println("Username is taken");
          }
           
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public boolean checkusername(String checkuname){
        taken = false;
        for (int i = 0; i < Accountsarray.size(); i++) {
                Accounts accounts = Accountsarray.get(i);
                
                if (accounts.getUsername().equals(username)) {
                
                 taken = true; 
                 
                 return taken;
                
             }
              
             }
        
       
        return taken;
    }
    
    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2ActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Signup dialog = new Signup(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
   public String name;
   public String password;
    public String cpassword;
    public String username;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel error;
    private javax.swing.JTextField fullname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JPasswordField p2;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
