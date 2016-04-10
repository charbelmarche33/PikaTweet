
package pikatweet;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Macbook-Air
 */
public class tweetpopup extends javax.swing.JDialog {

    /**
     * Creates new form tweetpopup
     */
    public tweetpopup(java.awt.Frame parent, boolean modal){
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

        label1 = new java.awt.Label();
        tweet = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setBackground(new java.awt.Color(255, 0, 0));
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Type a tweet:");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        tweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tweetActionPerformed(evt);
            }
        });
        getContentPane().add(tweet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 380, 90));

        jButton1.setText("Tweet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("jLabel4");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 400, 30));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tweetActionPerformed

    }//GEN-LAST:event_tweetActionPerformed
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {                                         
            FileStorage fs = new FileStorage();
            ArrayList<Accounts> AllUsers = new ArrayList(0);
            try {
                AllUsers = fs.retrieveAllUserInfoInUniverse();
            } catch (IOException ex) {
                Logger.getLogger(tweetpopup.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(tweetpopup.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            PikaTweetLoggedin dialog = new PikaTweetLoggedin(new javax.swing.JFrame(), false);
            Login loginpage = new Login(new javax.swing.JFrame(), false);
            Login login = new Login();
            
            String name = login.getFullName();
            String username = login.getName();
            String password = login.getPassword();
            
            Accounts account = new Accounts(name, username, password);
            
            String tweet2 = tweet.getText();
            
            
            Tweet nub1 = new Tweet(tweet2, true, username);
            
            
            
            
            account.addNewTweet(nub1);
            
            ArrayList accounts = new ArrayList();
            
            accounts = account.getTweetsMadeByUser();
            for (int i = 0; i < accounts.size(); i++) {
                System.out.println(accounts.get(i));
            }
            
            
            AllUsers.add(account);
            
            fs.updateAllUsersInfoInUniverse(AllUsers);
            
            
            setVisible(false);
            
        } catch (IOException ex) {
            Logger.getLogger(tweetpopup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(tweetpopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tweetpopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tweetpopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tweetpopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tweetpopup dialog = new tweetpopup(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private java.awt.Label label1;
    private javax.swing.JTextField tweet;
    // End of variables declaration//GEN-END:variables
}
