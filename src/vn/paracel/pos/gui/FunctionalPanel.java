/*
 * ##############################################################################
 * #
 * # Copyright (c) 2012 RiTH-Tech (http://rith-tech.com). All Right Reserved
 * #
 * # Author : Huy Doan (huy.doan@rith-tech.com)
 * #
 * ##############################################################################
 */
package vn.paracel.pos.gui;

import java.awt.FlowLayout;
import javax.swing.JButton;
import vn.paracel.pos.gui.dialogs.CancelOrderDialog;
import vn.paracel.pos.gui.dialogs.ExitConfirmDialog;
import vn.paracel.pos.gui.dialogs.PickCustomerDialog;
import vn.paracel.pos.main.Application;

/**
 *
 * @author Huy Doan
 */
public class FunctionalPanel extends javax.swing.JPanel {
    private static FunctionalPanel instance;

    /**
     * Creates new form FunctionalPanel
     */
    public FunctionalPanel() {
        initComponents();
        setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    public static FunctionalPanel getInstance() {
        if(instance == null) {
            instance = new FunctionalPanel();
        }
        return instance;
    }

    public JButton getCancelOrderButton() {
        return cancelOrderButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public JButton getLockScreenButton() {
        return lockScreenButton;
    }

    public JButton getMainScreenButton() {
        return mainScreenButton;
    }

    public JButton getMergeTableButton() {
        return mergeTableButton;
    }

    public JButton getMoveTableButton() {
        return moveTableButton;
    }

    public JButton getPickCustomerButton() {
        return pickCustomerButton;
    }

    public JButton getSplitOrderButton() {
        return splitOrderButton;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainScreenButton = new javax.swing.JButton();
        splitOrderButton = new javax.swing.JButton();
        mergeTableButton = new javax.swing.JButton();
        moveTableButton = new javax.swing.JButton();
        cancelOrderButton = new javax.swing.JButton();
        pickCustomerButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lockScreenButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        mainScreenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/paracel/pos/resources/images/grid_32.png"))); // NOI18N
        mainScreenButton.setText("Bàn");
        mainScreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainScreenButtonActionPerformed(evt);
            }
        });
        add(mainScreenButton);

        splitOrderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/paracel/pos/resources/images/split_32.png"))); // NOI18N
        splitOrderButton.setText("Tách");
        add(splitOrderButton);

        mergeTableButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/paracel/pos/resources/images/merge_32.png"))); // NOI18N
        mergeTableButton.setText("Gộp");
        mergeTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mergeTableButtonActionPerformed(evt);
            }
        });
        add(mergeTableButton);

        moveTableButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/paracel/pos/resources/images/move_32.png"))); // NOI18N
        moveTableButton.setText("Chuyển");
        moveTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveTableButtonActionPerformed(evt);
            }
        });
        add(moveTableButton);

        cancelOrderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/paracel/pos/resources/images/delete_32.png"))); // NOI18N
        cancelOrderButton.setText("Huỷ");
        cancelOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderButtonActionPerformed(evt);
            }
        });
        add(cancelOrderButton);

        pickCustomerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/paracel/pos/resources/images/user_32.png"))); // NOI18N
        pickCustomerButton.setText("Khách hàng");
        pickCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickCustomerButtonActionPerformed(evt);
            }
        });
        add(pickCustomerButton);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/paracel/pos/resources/images/money_32.png"))); // NOI18N
        jButton1.setText("Tiền");
        add(jButton1);

        lockScreenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/paracel/pos/resources/images/lock_32.png"))); // NOI18N
        lockScreenButton.setText("Khoá màn hình");
        lockScreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockScreenButtonActionPerformed(evt);
            }
        });
        add(lockScreenButton);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/paracel/pos/resources/images/shut_down_32.png"))); // NOI18N
        exitButton.setText("Thoát");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        add(exitButton);
    }// </editor-fold>//GEN-END:initComponents

    private void mainScreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainScreenButtonActionPerformed
        RootView.getInstance().showView(MainScreen.VIEW_NAME);
    }//GEN-LAST:event_mainScreenButtonActionPerformed

    private void mergeTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mergeTableButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mergeTableButtonActionPerformed

    private void moveTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveTableButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moveTableButtonActionPerformed

    private void cancelOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderButtonActionPerformed
        // TODO cancel the order
        Application.getInstance().getWindow().showJDialogAsSheet(new CancelOrderDialog(Application.getInstance().getWindow(), true));
    }//GEN-LAST:event_cancelOrderButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        Application.getInstance().getWindow().showJDialogAsSheet(new ExitConfirmDialog(Application.getInstance().getWindow(), true));
    }//GEN-LAST:event_exitButtonActionPerformed

    private void lockScreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockScreenButtonActionPerformed
        LockScreen.getInstance().activate();
    }//GEN-LAST:event_lockScreenButtonActionPerformed

    private void pickCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickCustomerButtonActionPerformed
        PickCustomerDialog d = new PickCustomerDialog(Application.getInstance().getWindow(), true);
        d.setLocationRelativeTo(Application.getInstance().getWindow());
        d.setVisible(true);
    }//GEN-LAST:event_pickCustomerButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelOrderButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton lockScreenButton;
    private javax.swing.JButton mainScreenButton;
    private javax.swing.JButton mergeTableButton;
    private javax.swing.JButton moveTableButton;
    private javax.swing.JButton pickCustomerButton;
    private javax.swing.JButton splitOrderButton;
    // End of variables declaration//GEN-END:variables
}
