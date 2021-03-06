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

import java.awt.Dimension;
import java.util.Iterator;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import vn.paracel.pos.gui.actions.TableButtonAction;
import vn.paracel.pos.main.Constanst;
import vn.paracel.pos.models.Floor;
import vn.paracel.pos.models.Table;
import vn.paracel.pos.models.impl.FloorImpl;
import vn.paracel.pos.util.ImageUtil;

/**
 *
 * @author Huy Doan
 */
public class MainScreen extends javax.swing.JPanel {
    public final static String VIEW_NAME = "MAIN_VIEW";

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        add(FunctionalPanel.getInstance(), java.awt.BorderLayout.PAGE_END);
    }
    
    @Override
    public void show() {
        super.show();
        
        listFloors();
        
        FunctionalPanel.getInstance().getMainScreenButton().setEnabled(false);
        
    }
    
    private void listFloors() {
        floorTab.removeAll();
        List<Floor> floors = FloorImpl.getAllFloors();
        Iterator i = floors.iterator();
        while(i.hasNext()) {
            Floor floor = (Floor)i.next();
            JPanel panel = new JPanel(null);
            List<Table> tables = floor.getTables();
            for(Table table : tables) {
                JButton btn = new JButton(new TableButtonAction(table));
                btn.applyComponentOrientation(getComponentOrientation());
                btn.setFocusPainted(false);
                btn.setFocusable(false);
                btn.setRequestFocusEnabled(false);
                btn.setHorizontalAlignment(SwingConstants.LEADING);
                btn.setSize(100, 90);
                btn.setMaximumSize(new Dimension(90, 90));
                btn.setPreferredSize(new Dimension(90, 90));
                btn.setMinimumSize(new Dimension(90, 90));
                btn.setHorizontalAlignment(SwingConstants.CENTER);
                btn.setVerticalTextPosition(SwingConstants.BOTTOM);
                btn.setHorizontalTextPosition(SwingConstants.CENTER);
                
                
                btn.setBounds(table.getX(), table.getY(), 90, 90);
                panel.add(btn);
              
            }
            floorTab.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=10>" + floor.getName() + "</body></html>", ImageUtil.parseImage(floor.getIcon()), panel);
            if(floor.getState().equals(Constanst.STATE.CLOSED)) 
                floorTab.setEnabledAt(floorTab.getTabCount()-1, false);
        }
        floorTab.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        floorTab = new javax.swing.JTabbedPane();

        setLayout(new java.awt.BorderLayout());

        floorTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        add(floorTab, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane floorTab;
    // End of variables declaration//GEN-END:variables
}
