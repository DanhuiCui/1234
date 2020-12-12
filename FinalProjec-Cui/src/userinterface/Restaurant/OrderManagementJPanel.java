/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Restaurant;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Order;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author 0
 */
public class OrderManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderManagementJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    Enterprise cusEnterprise;
    public OrderManagementJPanel(JPanel userProcessContainer, Enterprise enterprise, Enterprise cusEnterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.cusEnterprise = cusEnterprise;
        
        populateOrder();
        cbDelivery.removeAllItems();
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
            for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                if(ua.getRole().getType().equals("Delivery")){
                    cbDelivery.addItem(ua.toString());
                }           
            }
        }
        
    }
    
    public void paintComponent(Graphics g){
        int x = 0;
        int y = 0;
        ImageIcon icon = new ImageIcon("dalishi.jpg");
        //g.setColor(new Color(0,0,0,220));
        g.drawImage(icon.getImage(), x, y, getSize().width,getSize().height,this);
    }

    public void populateOrder(){
        DefaultTableModel dtm = (DefaultTableModel) tabOrder.getModel();
        dtm.setRowCount(0);
        for(Organization org : cusEnterprise.getOrganizationDirectory().getOrganizationList()){
            for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                for(Order order: ua.getWorkQueue().getOrderList()){
                    Object[] row = new Object[5];
                    row[0] = order;         
                    row[1] = order.getReceiver();
                    row[2] = order.getSender(); 
                    row[3] = order.getStatus(); 
                    row[4] = order.getRequestTime(); 
                    dtm.addRow(row);
                }
            }
        }
        
        TableColumn column1 = null;
        column1 = tabOrder.getColumnModel().getColumn(0);
        column1.setPreferredWidth(250);
        
        TableColumn column2 = null;
        column2 = tabOrder.getColumnModel().getColumn(4);
        column2.setPreferredWidth(150);    

        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabOrder = new javax.swing.JTable();
        cbDelivery = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        btnWaive = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Order management");

        tabOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "receiver", "sender", "status", "request time"
            }
        ));
        jScrollPane1.setViewportView(tabOrder);

        btnBack.setText("<<back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAccept.setText("accept");
        btnAccept.setPreferredSize(new java.awt.Dimension(100, 23));
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnWaive.setText("waive");
        btnWaive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWaiveActionPerformed(evt);
            }
        });

        jLabel2.setText("Select a delivery member:");
        jLabel2.setPreferredSize(new java.awt.Dimension(42, 23));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addGap(142, 142, 142)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnWaive)))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAccept, btnBack, btnWaive});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnBack)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWaive)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAccept, btnBack, btnWaive, cbDelivery});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnWaiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWaiveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabOrder.getSelectedRow();
        if(selectedRow >= 0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to waive this order?", "Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Order order = (Order) tabOrder.getValueAt(selectedRow, 0);
                order.setStatus("waived");
                
                Date resolveDate = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                order.setResolveTime(formatter.format(resolveDate));
                
                populateOrder();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnWaiveActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        String name = cbDelivery.getSelectedItem().toString();
        int selectedRow = tabOrder.getSelectedRow();
        if(selectedRow >= 0){
            Order order = (Order) tabOrder.getValueAt(selectedRow, 0);   
            if(order.getStatus().equals("waiting...")){
                order.setStatus("pending");
                for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                        if(ua.getRole().getType().equals("Delivery") && ua.getUsername().equals(name)){
                            order.setSender(ua);
                            ua.getWorkQueue().getOrderList().add(order);
                        }
                    }
                }

                JOptionPane.showMessageDialog(null, "New order has been accepted successfully!");
                populateOrder();
            }
            else
                JOptionPane.showMessageDialog(null, "This order cannot be assigned","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnAcceptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnWaive;
    private javax.swing.JComboBox<String> cbDelivery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabOrder;
    // End of variables declaration//GEN-END:variables
}
