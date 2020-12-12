/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Reception;

import Business.Enterprise.Enterprise;
import Business.Logic.RecDic;
import Business.Models.VipCustomer;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import userinterface.MainJFrame;

/**
 *
 * @author Administrator
 */
public class CustomerJPanel extends javax.swing.JPanel {

    JPanel container;
    List<VipCustomer> listVipCustomer;
    /**
     * Creates new form CustomerJPanel
     */
    public CustomerJPanel(JPanel container) {
        initComponents();
        this.container = container;
        LoadUser();
        LoadTrainerData();
        LoadData();
    }
    
    public void paintComponent(Graphics g){
        int x = 0;
        int y = 0;
        ImageIcon icon = new ImageIcon("dalishi.jpg");
        //g.setColor(new Color(0,0,0,220));
        g.drawImage(icon.getImage(), x, y, getSize().width,getSize().height,this);
    }
    
    public void LoadUser(){
        for(Network network : MainJFrame.userAccount.system.getNetworkList()){
            for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList()){

                for(Enterprise cusEnterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getName().equals(MainJFrame.userAccount.Enterprise.getName())){
                        for(Organization org : cusEnterprise.getOrganizationDirectory().getOrganizationList()){
                            for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                                if(ua.getRole().getType().equals("CustomerWithTrainer")||ua.getRole().getType().equals("Customer")){
                                    this.comUser.addItem(ua);
                                }
                            }
                        }
                    }
                    
                }
                
            }
        }
        
    }
    public void LoadData(){
        listVipCustomer = RecDic.QueryVipCustomer(MainJFrame.userAccount.Enterprise.getName());
        DefaultTableModel tableModel = (DefaultTableModel)this.tableCustomer.getModel();
        String[] cols = new String[]{"username","Name","Role","Enterprise","Age","Sex","Height","Weight","Mobile","Private Trainer"};
        String[][] rows= new String[listVipCustomer.size()][10];
        for (int i = 0; i < listVipCustomer.size(); i++) {
            rows[i][0] = listVipCustomer.get(i).username;
            rows[i][1] = listVipCustomer.get(i).Name;
            rows[i][2] = listVipCustomer.get(i).Role;
            rows[i][3] = listVipCustomer.get(i).Enterprise;
            rows[i][4] = listVipCustomer.get(i).Age;
            rows[i][5] = listVipCustomer.get(i).Sex;
            rows[i][6] = listVipCustomer.get(i).Height;
            rows[i][7] = listVipCustomer.get(i).Weight;
            rows[i][8] = listVipCustomer.get(i).Mobile;
            rows[i][9] = listVipCustomer.get(i).PrivateTrainerUserName;    
        }
        tableModel.setDataVector(rows, cols);
        
        TableColumn column = null;
        column = tableCustomer.getColumnModel().getColumn(2);
        column.setPreferredWidth(150);
        
        TableColumn column2 = null;
        column2 = tableCustomer.getColumnModel().getColumn(8);
        column2.setPreferredWidth(100);
        
         TableColumn column3 = null;
        column3 = tableCustomer.getColumnModel().getColumn(9);
        column3.setPreferredWidth(100);
    }
        public void LoadTrainerData(){
        for (int i = 0; i < MainJFrame.userAccount.Enterprise.getOrganizationDirectory().getOrganizationList().size(); i++) {
            Organization o = MainJFrame.userAccount.Enterprise.getOrganizationDirectory().getOrganizationList().get(i);
            ArrayList<UserAccount> list = o.getUserAccountDirectory().getUserAccountList();
            for (int j = 0; j < list.size(); j++) {
               
                UserAccount u = list.get(j);
                 System.out.println(u.getRole().getType());
                if(u.getRole().getType().equals("PrivateTrainer")){
                    this.combTrainer.addItem(u.getUsername());
                }
            }
        }
       
//        List<User> list = UserDic.QueryUseyByTypes(new String[]{"4"});
//        for (int i = 0; i < list.size(); i++) {
//            this.comboTrainer.addItem(list.get(i));
//        }
    }
        
        static boolean checkNum(String str) {
        Pattern p = Pattern.compile("^[1-9]\\d*|0$");
        return p.matcher(str).matches();
    }
        
        static boolean checkPhone(String phone) {
        Pattern p = Pattern.compile("^[0-9]*$");
        return p.matcher(phone).matches();
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
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        combRole = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboSex = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        combTrainer = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        comUser = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Username:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Role:");

        combRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "CustomerWithTrainer" }));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Age:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Sex:");

        comboSex.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "male", "female" }));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Height(cm):");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Weight(kg):");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Mobile:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Trainer:");

        btnSave.setText("Save");
        btnSave.setPreferredSize(new java.awt.Dimension(69, 23));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomer);

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        comUser.setModel(new javax.swing.DefaultComboBoxModel<>());
        comUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comUserActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Customer Management System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comUser, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboSex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combTrainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(combRole, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comUser, combRole, combTrainer, comboSex, txtAge, txtHeight, txtMobile, txtName, txtWeight});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnDel, btnSave});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(comboSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(combTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comUser, combRole, combTrainer, comboSex, txtAge, txtHeight, txtMobile, txtName, txtWeight});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnDel, btnSave});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);         // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        VipCustomer  c= new VipCustomer();
        c.username = this.comUser.getSelectedItem().toString();
        //c.psw = this.txtPsw.getText();
        c.Name = this.txtName.getText();
        c.Role = this.combRole.getSelectedItem().toString();
        c.Age = this.txtAge.getText();
        c.Sex = this.comboSex.getSelectedItem().toString();
        c.Height = this.txtHeight.getText();
        c.Weight = this.txtWeight.getText();
        c.Mobile = this.txtMobile.getText();
        c.Enterprise = MainJFrame.userAccount.Enterprise.getName();
        c.PrivateTrainerUserName = this.combTrainer.getSelectedItem().toString();
        UserAccount u = (UserAccount)this.comUser.getSelectedItem();
        
        String name = this.txtName.getText();
        String age = this.txtAge.getText();
        String height = this.txtHeight.getText();
        String weight = this.txtWeight.getText();
        String mobile = this.txtMobile.getText();
        
        if (u.getRole().getType().equals("Customer")) {
            c.PrivateTrainerUserName = "";
        }
        
        if(name.isEmpty()||age.isEmpty()||height.isEmpty()||weight.isEmpty()||mobile.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter complete information!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!age.isEmpty()){
            if (!checkNum(age)){
                JOptionPane.showMessageDialog(this, "Age should be an integer between 0 and 100!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (Integer.parseInt(age)>100||Integer.parseInt(age)<=0) {    
                JOptionPane.showMessageDialog(this, "Age should be an integer between 0 and 100!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        if(!height.isEmpty()){
            if (!checkNum(height)) {
                JOptionPane.showMessageDialog(this, "Height should be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        if (!checkNum(weight)) {
            JOptionPane.showMessageDialog(this, "Weight should be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!checkPhone(mobile)) {
            JOptionPane.showMessageDialog(this, "Phone number format error!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        RecDic.SaveVipCoustomInfo(c);
        ReSet();
        LoadData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        int n = this.tableCustomer.getSelectedRow();
        if(n<0) return;
        RecDic.DelCustomer(this.tableCustomer.getValueAt(n, 0).toString());
        this.LoadData();
    }//GEN-LAST:event_btnDelActionPerformed

    private void tableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseClicked
        int n = this.tableCustomer.getSelectedRow();
        if(n<0) return;
        //this.txtUserName.setText(this.listVipCustomer.get(n).username);
        //this.txtPsw.setText(this.listVipCustomer.get(n).psw);
        this.txtName.setText(this.listVipCustomer.get(n).Name);
        this.txtAge.setText(this.listVipCustomer.get(n).Age);
        this.txtHeight.setText(this.listVipCustomer.get(n).Height);
        this.txtWeight.setText(this.listVipCustomer.get(n).Weight);
        this.txtMobile.setText(this.listVipCustomer.get(n).Mobile);
        //this.comUser.setSelectedItem(this.listVipCustomer.get(n).username);
        this.comboSex.setSelectedItem(this.listVipCustomer.get(n).Sex);
        UserAccount ua = new UserAccount();
        //Organization org;
        
        
        if(this.listVipCustomer.get(n).Role.equals("CustomerWithTrainer")){
            this.combTrainer.setEnabled(true);
            this.combTrainer.setSelectedItem((this.listVipCustomer.get(n).PrivateTrainerUserName));
            
        }
        else{
            this.combTrainer.setSelectedItem(this.combTrainer.getItemAt(0));
            this.combTrainer.setEnabled(false);
            
            
        }
    }//GEN-LAST:event_tableCustomerMouseClicked

    private void comUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comUserActionPerformed
        System.out.println(this.comUser.getSelectedItem().toString());
        UserAccount u = (UserAccount)this.comUser.getSelectedItem();
        this.combRole.removeAllItems();
        this.combRole.addItem(u.getRole().getType());
        if (u.getRole().getType().equals("Customer")) {
            this.combTrainer.setEnabled(false);
        }
        else{
            this.combTrainer.setEnabled(true);
        }
    }//GEN-LAST:event_comUserActionPerformed
    public void ReSet(){
        //this.txtUserName.setText("");
        //this.txtPsw.setText("");
        this.txtName.setText("");
        this.txtAge.setText("");
        this.txtHeight.setText("");
        this.txtWeight.setText("");
        this.txtMobile.setText("");
        this.comUser.setSelectedItem("this.comUser.getSelectedIndex(0)");
        this.comboSex.setSelectedItem("this.comboSex.getSelectedIndex(0)");
        this.combTrainer.setSelectedItem("this.combTrainer.getSelectedIndex(0)");
        

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<UserAccount> comUser;
    private javax.swing.JComboBox<String> combRole;
    private javax.swing.JComboBox<String> combTrainer;
    private javax.swing.JComboBox<String> comboSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCustomer;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
