/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Engineer;

import Business.Logic.EngDic;
import Business.Models.Equipment;
import Business.Models.Maintenance;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import userinterface.MainJFrame;

/**
 *
 * @author 27246
 */
public class MaintenanceJPanel extends javax.swing.JPanel {

    private JPanel container;
    String Enterprise;
    /**
     * Creates new form MaintenanceJPanel
     */
    public MaintenanceJPanel(JPanel container) {
        initComponents();
        this.container = container;
        Enterprise =  MainJFrame.userAccount.Enterprise.getName();
        LoadE();
        LoadData();
    }
    
    public void paintComponent(Graphics g){
        int x = 0;
        int y = 0;
        ImageIcon icon = new ImageIcon("dalishi.jpg");
        //g.setColor(new Color(0,0,0,220));
        g.drawImage(icon.getImage(), x, y, getSize().width,getSize().height,this);
    }
    
    public void LoadE(){
        List<Equipment> list = EngDic.QueryEquipment(Enterprise);
        for (int i = 0; i < list.size(); i++) {
            this.comEquipment.addItem(list.get(i));
        }
    }
    public void LoadData(){
        List<Maintenance> list = EngDic.QueryMaintenance(Enterprise);
        DefaultTableModel tableModel = (DefaultTableModel)this.tableMaintenance.getModel();
        String[] cols = new String[]{"ID","Equipment Name","Reason","Time","Status"};
        String[][] rows= new String[list.size()][5];
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).ID;
            rows[i][1] = list.get(i).EquipmentName;
            rows[i][2] = list.get(i).Reason;
            rows[i][3] = list.get(i).AddTime;
            rows[i][4] = list.get(i).Status;
        }
        tableModel.setDataVector(rows, cols);
        
        TableColumn column = null;
        column = tableMaintenance.getColumnModel().getColumn(0);
        column.setPreferredWidth(200);
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
        comEquipment = new javax.swing.JComboBox<Equipment>();
        jLabel2 = new javax.swing.JLabel();
        txtReason = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMaintenance = new javax.swing.JTable();
        btnComplete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        labImg = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        jLabel1.setText("Equipment:");

        comEquipment.setModel(new javax.swing.DefaultComboBoxModel<Equipment>());
        comEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comEquipmentActionPerformed(evt);
            }
        });

        jLabel2.setText("Reason:");

        tableMaintenance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableMaintenance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMaintenanceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMaintenance);

        btnComplete.setText("Set Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        labImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReason, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(labImg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comEquipment, txtReason});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnBack});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(comEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd))
                    .addComponent(labImg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComplete)
                    .addComponent(btnDelete))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comEquipment, txtReason});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnBack});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);  
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Maintenance m = new Maintenance();
        
        if(txtReason.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter the reason!","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        m.Enterprise = this.Enterprise;
        Equipment e = (Equipment)this.comEquipment.getSelectedItem();
        m.EquipmentID = e.EquipmentID;
        m.EquipmentName = e.EquipmentName;
        m.Reason = this.txtReason.getText();
        m.Status = "";
        EngDic.AddMaintenance(m);
        LoadData();
        this.txtReason.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        int n = this.tableMaintenance.getSelectedRow();
        if(n<0)return;
        String id = this.tableMaintenance.getValueAt(n, 0).toString();
        EngDic.SetComplete(id);
        this.LoadData();
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void tableMaintenanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMaintenanceMouseClicked
        
    }//GEN-LAST:event_tableMaintenanceMouseClicked

    private void comEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comEquipmentActionPerformed
        Equipment e = (Equipment)this.comEquipment.getSelectedItem();
        try{
                byte[] bytes = e.Image;
                ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
                Iterator<?> readers = ImageIO.getImageReadersByFormatName( "jpg" );
                ImageReader reader = (ImageReader) readers.next();
                Object source = bis;
                ImageInputStream iis = ImageIO.createImageInputStream(source);
                reader.setInput(iis, true );
                ImageReadParam param = reader.getDefaultReadParam();
                Image image = reader.read( 0 , param);
                
                ImageIcon pic1 = new ImageIcon(image);
                pic1.setImage(pic1.getImage().getScaledInstance(200,200,0));
                this.labImg.setIcon(pic1);
                
            }
            catch(IOException ex){}
    }//GEN-LAST:event_comEquipmentActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int n = this.tableMaintenance.getSelectedRow();
        if(n<0) return;
        String id = this.tableMaintenance.getValueAt(n, 0).toString();
        EngDic.DelMaintenance(id);
        LoadData();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<Equipment> comEquipment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labImg;
    private javax.swing.JTable tableMaintenance;
    private javax.swing.JTextField txtReason;
    // End of variables declaration//GEN-END:variables
}
