/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfriendsphonebookarray;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PhoneBookForm extends javax.swing.JFrame {
//    BestFriend[]myBFFs = new BestFriend[10];
    static BFFHelperArray friendList = new BFFHelperArray();

    public static BFFHelperArray getFriendList(){
        return friendList;
    }

    /**
     * Creates new form PhoneBookForm
     */
    public PhoneBookForm() {
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

        addFriendButton = new javax.swing.JButton();
        changeInfoButton = new javax.swing.JButton();
        displaySpecificButton = new javax.swing.JButton();
        displayAllButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        removeFriendButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Best Friend Phonebook");

        addFriendButton.setText("Add Best Friend");
        addFriendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFriendButtonActionPerformed(evt);
            }
        });

        changeInfoButton.setText("Change Info");
        changeInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeInfoButtonActionPerformed(evt);
            }
        });

        displaySpecificButton.setText("Display Specific");
        displaySpecificButton.setActionCommand("");
        displaySpecificButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaySpecificButtonActionPerformed(evt);
            }
        });

        displayAllButton.setText("Display All");
        displayAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        removeFriendButton.setText("Remove Friend");
        removeFriendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFriendButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeFriendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeInfoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addFriendButton, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayAllButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displaySpecificButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFriendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displaySpecificButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeFriendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addFriendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFriendButtonActionPerformed
        // TODO add your handling code here:
        AddFriendJDialog addFriend = new AddFriendJDialog(this, rootPaneCheckingEnabled);
        addFriend.setVisible(true);

    }//GEN-LAST:event_addFriendButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void displayAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<BestFriend> theFriends = new ArrayList<BestFriend>();
        theFriends = friendList.displayAllFriends();
        String contacts = "";

        for(int i = 0; i < theFriends.size(); i++){
            contacts += theFriends.get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, contacts, "Printing Contacts", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_displayAllButtonActionPerformed

    private void displaySpecificButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaySpecificButtonActionPerformed
        // TODO add your handling code here:
        DisplaySpecificFriendJDialog displaySpecific = new DisplaySpecificFriendJDialog(this, rootPaneCheckingEnabled);
        displaySpecific.setVisible(true);
    }//GEN-LAST:event_displaySpecificButtonActionPerformed

    private void changeInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeInfoButtonActionPerformed
        // TODO add your handling code here:
        ChangeFriendJDialog changeFriend = new ChangeFriendJDialog(this, rootPaneCheckingEnabled);
        changeFriend.setVisible(true);
    }//GEN-LAST:event_changeInfoButtonActionPerformed

    private void removeFriendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFriendButtonActionPerformed
        // TODO add your handling code here:
        DeleteContactJDialog deleteDialog = new DeleteContactJDialog(this, rootPaneCheckingEnabled);
        deleteDialog.setVisible(true);
    }//GEN-LAST:event_removeFriendButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PhoneBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhoneBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhoneBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhoneBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhoneBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFriendButton;
    private javax.swing.JButton changeInfoButton;
    private javax.swing.JButton displayAllButton;
    private javax.swing.JButton displaySpecificButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton removeFriendButton;
    // End of variables declaration//GEN-END:variables
}
