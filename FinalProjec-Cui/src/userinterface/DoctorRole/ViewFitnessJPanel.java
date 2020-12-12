/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static userinterface.DoctorRole.FitnessListJPanel.checkBloodPressure;
import static userinterface.DoctorRole.FitnessListJPanel.checkPositiveIntger;
import static userinterface.DoctorRole.FitnessListJPanel.checkPositiveNumber;

/**
 *
 * @author 0
 */
public class ViewFitnessJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFitnessJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    public ViewFitnessJPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        
        txtId.setText(String.valueOf(userAccount.getEmployee().getId()));
        txtName.setText(userAccount.getEmployee().getName());
        txtContact.setText(userAccount.getEmployee().getPhone());
        txtTime.setText(userAccount.getFitnessList().getTime());
        
        txtBMI.setText(userAccount.getFitnessList().getBMI());
        comboBal.setSelectedItem(userAccount.getFitnessList().getBalance());
        txtBloodPressure.setText(userAccount.getFitnessList().getBloodPressure());
        comboCardio.setSelectedItem(userAccount.getFitnessList().getCardiopulmonary());
        txtFatRate.setText(userAccount.getFitnessList().getFatRate());
        comboFle.setSelectedItem(userAccount.getFitnessList().getFlexibility());
        txtHeartRate.setText(userAccount.getFitnessList().getHeartRate());
        txtHeight.setText(userAccount.getFitnessList().getHeight());
        comboBasal.setSelectedItem(userAccount.getFitnessList().getMetabolism());
        txtMuscle.setText(userAccount.getFitnessList().getMuscle());
        comboMuEndurance.setSelectedItem(userAccount.getFitnessList().getMuscleEndurance());
        comboMuStrength.setSelectedItem(userAccount.getFitnessList().getMuscleStrength());
        txtShoulder.setText(userAccount.getFitnessList().getShoulder());
        txtWeight.setText(userAccount.getFitnessList().getWeight());
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        
    }
    
    public void paintComponent(Graphics g){
        int x = 0;
        int y = 0;
        ImageIcon icon = new ImageIcon("dalishi.jpg");
        //g.setColor(new Color(0,0,0,220));
        g.drawImage(icon.getImage(), x, y, getSize().width,getSize().height,this);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtHeartRate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        txtBMI = new javax.swing.JTextField();
        txtShoulder = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        txtFatRate = new javax.swing.JTextField();
        txtMuscle = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        comboMuStrength = new javax.swing.JComboBox<>();
        comboMuEndurance = new javax.swing.JComboBox<>();
        comboFle = new javax.swing.JComboBox<>();
        comboCardio = new javax.swing.JComboBox<>();
        comboBal = new javax.swing.JComboBox<>();
        comboBasal = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Fitness");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Basic information");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtId.setEnabled(false);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Name:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtName.setEnabled(false);

        txtTime.setEnabled(false);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Test Time:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtContact.setEnabled(false);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Contact:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Physical data");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Height(cm):");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtHeight.setEnabled(false);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Heart rate(times/min):");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtHeartRate.setEnabled(false);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Basal metabolism:");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Shoulder width(cm):");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("BMI:");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Weight(kg):");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtWeight.setEnabled(false);

        txtBMI.setEnabled(false);

        txtShoulder.setEnabled(false);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Muscle rate(%):");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Fat rate(%):");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Blood pressure(mmHg):");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtBloodPressure.setEnabled(false);

        txtFatRate.setEnabled(false);

        txtMuscle.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Assessment of motor ability");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Muscle strength:");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Muscle endurance:");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Cardiopulmonary function:");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Flexisibility:");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Balance ability:");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnSave.setText("save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("<<back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdate.setText("update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        comboMuStrength.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Ordinary", "Poor" }));
        comboMuStrength.setEnabled(false);

        comboMuEndurance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Ordinary", "Poor" }));
        comboMuEndurance.setEnabled(false);

        comboFle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Ordinary", "Poor" }));
        comboFle.setEnabled(false);

        comboCardio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Ordinary", "Poor" }));
        comboCardio.setEnabled(false);

        comboBal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Ordinary", "Poor" }));
        comboBal.setEnabled(false);

        comboBasal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Abnormal" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMuscle, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFatRate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboBasal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtShoulder, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel21))
                                    .addComponent(btnBack))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboCardio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(comboMuStrength, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(comboFle, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(150, 150, 150)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(comboBal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(comboMuEndurance, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(255, 255, 255)
                                        .addComponent(jLabel1))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnUpdate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBMI, txtBloodPressure, txtContact, txtFatRate, txtHeartRate, txtHeight, txtMuscle, txtShoulder, txtWeight});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnSave, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtShoulder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel10)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtMuscle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFatRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(30, 30, 30)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(comboMuStrength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(comboMuEndurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(comboFle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(comboCardio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnSave, btnUpdate});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBasal, jLabel14, jLabel15, jLabel16, txtFatRate, txtShoulder});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel11, jLabel13, jLabel9, txtHeartRate, txtMuscle, txtWeight});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel12, jLabel8, txtHeight});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5, jLabel6, txtContact, txtId, txtName, txtTime});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String height = txtHeight.getText();
        String weight = txtWeight.getText();
        String bloodPressure = txtBloodPressure.getText();
        String heartRate = txtHeartRate.getText();
        String BMI = txtBMI.getText();
        String fatRate = txtFatRate.getText();
        String metaBolism = (String)comboBasal.getSelectedItem();
        String shoulderWidth = txtShoulder.getText();
        String muscle = txtMuscle.getText();
        String muscleStrength = (String)comboMuStrength.getSelectedItem();
        String muscleEndurance = (String)comboMuEndurance.getSelectedItem();
        String cardiopulmonary = (String)comboCardio.getSelectedItem();
        String flexibility = (String)comboFle.getSelectedItem();
        String balance = (String)comboBal.getSelectedItem();

        if(height.equals("") || weight.equals("") || bloodPressure.equals("") || heartRate.equals("") || BMI.equals("")
            || fatRate.equals("") || metaBolism.equals("") || shoulderWidth.equals("") || muscle.equals("") || muscleStrength.equals("") || muscleEndurance.equals("")
            || cardiopulmonary.equals("") || flexibility.equals("") || balance.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter complete information!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            if (!checkPositiveNumber(height)) {
                JOptionPane.showMessageDialog(null, "Height should be an positive number!","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!checkPositiveNumber(weight)) {
                JOptionPane.showMessageDialog(null, "Weight should be an positive number!","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!checkPositiveNumber(shoulderWidth)) {
                JOptionPane.showMessageDialog(null, "Shoulder width should be an positive number!","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!checkBloodPressure(bloodPressure)) {
                JOptionPane.showMessageDialog(null, "Blood pressure format error!","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!checkPositiveIntger(heartRate)) {
                JOptionPane.showMessageDialog(null, "Heart rate should be an positive integer!","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!checkPositiveNumber(BMI)) {
                JOptionPane.showMessageDialog(null, "BMI should be an positive number!","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!checkPositiveNumber(fatRate)||Double.valueOf(fatRate)>=(double)100) {
                JOptionPane.showMessageDialog(null, "Fat rate should be an positive number between 0-100!","Warning",JOptionPane.WARNING_MESSAGE);
                return; 
            }
            if (!checkPositiveNumber(muscle)||Double.valueOf(muscle)>=(double)100) {
                JOptionPane.showMessageDialog(null, "Muscle rate should be an positive number between 0-100!","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }else{
                userAccount.getFitnessList().setName(userAccount.getEmployee().getName());
                userAccount.getFitnessList().setId(userAccount.getEmployee().getId());
                userAccount.getFitnessList().setContact(userAccount.getEmployee().getPhone());
                userAccount.getFitnessList().setHeight(height);
                userAccount.getFitnessList().setWeight(weight);
                userAccount.getFitnessList().setBloodPressure(bloodPressure);
                userAccount.getFitnessList().setHeartRate(heartRate);
                userAccount.getFitnessList().setBMI(BMI);
                userAccount.getFitnessList().setFatRate(fatRate);
                userAccount.getFitnessList().setMetabolism(metaBolism);
                userAccount.getFitnessList().setShoulder(shoulderWidth);
                userAccount.getFitnessList().setMuscle(muscle);
                userAccount.getFitnessList().setMuscleStrength(muscleStrength);
                userAccount.getFitnessList().setMuscleEndurance(muscleEndurance);
                userAccount.getFitnessList().setCardiopulmonary(cardiopulmonary);
                userAccount.getFitnessList().setFlexibility(flexibility);
                userAccount.getFitnessList().setBalance(balance);

                JOptionPane.showMessageDialog(null, "fitness list is created successfully!");

                txtBMI.setText("");
                comboBal.setSelectedItem("Good");
                txtBloodPressure.setText("");
                comboCardio.setSelectedItem("Good");
                txtFatRate.setText("");
                comboFle.setSelectedItem("Good");
                txtHeartRate.setText("");
                txtHeight.setText("");
                comboBasal.setSelectedItem("Normal");
                txtMuscle.setText("");
                comboMuEndurance.setSelectedItem("Good");
                comboMuStrength.setSelectedItem("Good");
                txtShoulder.setText("");
                txtWeight.setText("");
                }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtBMI.setEnabled(true);
        comboBal.setEnabled(true);
        txtBloodPressure.setEnabled(true);
        comboCardio.setEnabled(true);
        txtFatRate.setEnabled(true);
        comboFle.setEnabled(true);
        txtHeartRate.setEnabled(true);
        txtHeight.setEnabled(true);
        comboCardio.setEnabled(true);
        txtMuscle.setEnabled(true);
        comboMuEndurance.setEnabled(true);
        comboMuStrength.setEnabled(true);
        txtShoulder.setEnabled(true);
        txtWeight.setEnabled(true);
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBal;
    private javax.swing.JComboBox<String> comboBasal;
    private javax.swing.JComboBox<String> comboCardio;
    private javax.swing.JComboBox<String> comboFle;
    private javax.swing.JComboBox<String> comboMuEndurance;
    private javax.swing.JComboBox<String> comboMuStrength;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBMI;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtFatRate;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMuscle;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtShoulder;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
