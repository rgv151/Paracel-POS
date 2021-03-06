/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.paracel.pos.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import org.slf4j.Logger;
import vn.paracel.pos.gui.actions.EmployeeButtonAction;
import vn.paracel.pos.models.impl.EmployeeImpl;
import vn.paracel.pos.models.impl.UserImpl;
import vn.paracel.pos.main.AppGlobal;
import vn.paracel.pos.main.Session;
import vn.paracel.pos.models.Employee;

/**
 *
 * @author rgv151
 */
public class LoginScreen extends javax.swing.JPanel {
    public final static String VIEW_NAME = "LOGIN_VIEW";
    
    private static Logger logger = AppGlobal.getLogger(LoginScreen.class);
    private static Employee selectedEmployee;

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();
        
        photoPane.getHorizontalScrollBar().setPreferredSize(new Dimension(30, 30)); 
        listEmployees();
    }
    
    @Override
    public void show() {
        super.show();
    }
    
    public static void setSelectedEmployee(Employee emp) {
        LoginScreen.selectedEmployee = emp;
    }
    
    public static Employee getSelectedEmployee() {
        return LoginScreen.selectedEmployee;
    }
    
    private void listEmployees() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.applyComponentOrientation(getComponentOrientation());
        
        List<Employee> employees = EmployeeImpl.getAllEmployees();
        Iterator i = employees.iterator();
        while(i.hasNext()) {
            Employee e = (Employee)i.next();
            JButton btn = new JButton(new EmployeeButtonAction(e, txtLoginName));
            btn.applyComponentOrientation(getComponentOrientation());
            btn.setFocusPainted(false);
            btn.setFocusable(false);
            btn.setRequestFocusEnabled(false);
            btn.setHorizontalAlignment(SwingConstants.LEADING);
            btn.setSize(100, 90);
            btn.setMaximumSize(new Dimension(90, 90));
            btn.setPreferredSize(new Dimension(90, 90));
            btn.setMinimumSize(new Dimension(90, 90));
            panel.add(btn);
        }
        photoPane.getViewport().setView(panel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        photoPane = new javax.swing.JScrollPane();
        loginPanel = new javax.swing.JPanel();
        txtLoginName = new vn.paracel.pos.gui.components.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new vn.paracel.pos.gui.components.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/paracel/pos/images/poweredby.png"))); // NOI18N
        jLabel3.setToolTipText("Copyright (c) 2012 RiTH-Tech");

        loginPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        jLabel2.setText("PassWord");

        btnLogin.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginPanelLayout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                        .addComponent(txtLoginName, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                    .addContainerGap(87, Short.MAX_VALUE)))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginPanelLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtPassword))
                    .addGap(90, 90, 90)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(photoPane, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(photoPane, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Boolean isLoggedIn = UserImpl.authenticate(selectedEmployee.getLogin(), String.copyValueOf(txtPassword.getPassword()));
        if (isLoggedIn) {
            logger.warn("Success login from '" + selectedEmployee.getLogin() + "' using database '" + AppGlobal.getBackendDatabase() + "'");
            Session.setLoggedIn(true);
            Session.setEmployee(selectedEmployee);
            AppGlobal.setLocale(new Locale(selectedEmployee.getUser().getLanguage()));
            RootView.getInstance().showView(MainScreen.VIEW_NAME);
        } else {
            logger.warn("Bad login or password from '" + selectedEmployee.getLogin() + "' using database '" + AppGlobal.getBackendDatabase() + "'");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JScrollPane photoPane;
    private javax.swing.JTextField txtLoginName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
