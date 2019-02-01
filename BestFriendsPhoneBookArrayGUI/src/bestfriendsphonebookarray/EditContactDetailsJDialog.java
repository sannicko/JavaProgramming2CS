/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfriendsphonebookarray;

import javax.swing.JOptionPane;

public class EditContactDetailsJDialog extends javax.swing.JDialog {

    /**
     * Creates new form EditContactDetailsJDialog
     */
    public EditContactDetailsJDialog(java.awt.Frame parent, boolean modal) {
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

        editFriendButton = new javax.swing.JButton();
        emailtxtField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        contacttxtField = new javax.swing.JTextField();
        nickNametxtField = new javax.swing.JTextField();
        nickNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNametxtField = new javax.swing.JTextField();
        firstNametxtField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        editFriendButton.setText("Edit Friend");
        editFriendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFriendButtonActionPerformed(evt);
            }
        });

        emailLabel.setText("Email");

        contactLabel.setText("Contact");

        nickNameLabel.setText("Nick Name");

        lastNameLabel.setText("Last Name");

        firstNameLabel.setText("First Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstNameLabel)
                        .addGap(34, 34, 34)
                        .addComponent(firstNametxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nickNameLabel)
                            .addComponent(contactLabel)
                            .addComponent(emailLabel))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(emailtxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(contacttxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nickNametxtField, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lastNameLabel)
                        .addGap(34, 34, 34)
                        .addComponent(lastNametxtField)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(editFriendButton)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNametxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNametxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nickNameLabel)
                    .addComponent(nickNametxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLabel)
                    .addComponent(contacttxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editFriendButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    BestFriend friendToEdit;
//    public void setFriendToEdit(String firstName, String lastName, String nickName, String cellPhone, String email){
//        friendToEdit = new BestFriend(firstName, lastName, nickName, cellPhone, email);
//    }
    int index;
    public void setIndex(int i){
        index = i;
    }

    private void editFriendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFriendButtonActionPerformed
        // TODO add your handling code here:
        BestFriend friendToChange = new BestFriend(firstNametxtField.getText(), lastNametxtField.getText(), nickNametxtField.getText(), contacttxtField.getText(), emailtxtField.getText());
        PhoneBookForm.getFriendList().changeFriend(index, friendToChange);
        JOptionPane.showMessageDialog (null, "Contact Successfully Editted", "Success", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
    }//GEN-LAST:event_editFriendButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EditContactDetailsJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditContactDetailsJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditContactDetailsJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditContactDetailsJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditContactDetailsJDialog dialog = new EditContactDetailsJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contacttxtField;
    private javax.swing.JButton editFriendButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailtxtField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNametxtField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNametxtField;
    private javax.swing.JLabel nickNameLabel;
    private javax.swing.JTextField nickNametxtField;
    // End of variables declaration//GEN-END:variables
}
