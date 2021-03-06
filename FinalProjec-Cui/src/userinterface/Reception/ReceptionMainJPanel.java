/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Reception;

import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author 27246
 */
public class ReceptionMainJPanel extends javax.swing.JPanel {

    private EcoSystem system;
    JPanel container;
    /**
     * Creates new form ReceptionMainJPanel
     */
    public ReceptionMainJPanel(JPanel container) {
        initComponents();
        this.container = container;
        
    }
    
    public void paintComponent(Graphics g){
        int x = 0;
        int y = 0;
        ImageIcon icon = new ImageIcon("qiantai.jpg");
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

        btnStc = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnCourse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnStc.setText("Sign In Stc");
        btnStc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStcActionPerformed(evt);
            }
        });

        jButton1.setText("Customer Manager");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCourse.setText("Course Manage");
        btnCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Welcome to reception system!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStc, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCourse, btnStc, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCourse)
                .addGap(18, 18, 18)
                .addComponent(btnStc)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCourse, btnStc, jButton1});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseActionPerformed
                CardLayout layout=(CardLayout)this.container.getLayout();
                this.container.add("workArea",new CourseJPanel(container));
                layout.next(container);
    }//GEN-LAST:event_btnCourseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout layout=(CardLayout)this.container.getLayout();
        this.container.add("workArea",new CustomerJPanel(container));
        layout.next(container);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnStcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStcActionPerformed
        CardLayout layout=(CardLayout)this.container.getLayout();
        this.container.add("workArea",new SignInStcJPanel(container));
        layout.next(container);        
    }//GEN-LAST:event_btnStcActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourse;
    private javax.swing.JButton btnStc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
