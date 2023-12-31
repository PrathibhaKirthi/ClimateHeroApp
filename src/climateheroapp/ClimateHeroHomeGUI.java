package climateheroapp;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Vitor Colley
 */
public class ClimateHeroHomeGUI extends javax.swing.JFrame {

    /**
     * Creates new form ClimateHeroHomeGUI
     */
    public ClimateHeroHomeGUI() {
        initComponents();
        washingLbl.setVisible(false);
        washingTf.setVisible(false);
        clothesLbl.setVisible(false);
        clothesTf.setVisible(false);
        submitLaundryBtn.setVisible(false);

        durationLbl.setVisible(false);
        durationTf.setVisible(false);
        submitShowerBtn.setVisible(false);
        
        appliancesListLbl.setVisible(false);
        tvRb.setVisible(false);
        lightsRb.setVisible(false);
        microwaveRb.setVisible(false);
        ovenRb.setVisible(false);
        boilerRb.setVisible(false);
        chargerRb.setVisible(false);
        laptopRb.setVisible(false);
        heaterRb.setVisible(false);
        submitAppliancesBtn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        homeLbl = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        washingLbl = new javax.swing.JLabel();
        clothesLbl = new javax.swing.JLabel();
        submitLaundryBtn = new javax.swing.JButton();
        washingTf = new javax.swing.JTextField();
        clothesTf = new javax.swing.JTextField();
        durationLbl = new javax.swing.JLabel();
        durationTf = new javax.swing.JTextField();
        submitShowerBtn = new javax.swing.JButton();
        appliancesListLbl = new javax.swing.JLabel();
        tvRb = new javax.swing.JRadioButton();
        lightsRb = new javax.swing.JRadioButton();
        microwaveRb = new javax.swing.JRadioButton();
        ovenRb = new javax.swing.JRadioButton();
        boilerRb = new javax.swing.JRadioButton();
        chargerRb = new javax.swing.JRadioButton();
        laptopRb = new javax.swing.JRadioButton();
        heaterRb = new javax.swing.JRadioButton();
        submitAppliancesBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homeLbl.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        homeLbl.setForeground(new java.awt.Color(255, 153, 153));
        homeLbl.setText("HOME:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 153, 153));
        jRadioButton1.setText("Laundry");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 153, 153));
        jRadioButton2.setText("Shower");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 153, 153));
        jRadioButton3.setText("Appliances");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        washingLbl.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        washingLbl.setText("Washing Machine Capacity (kg):");

        clothesLbl.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        clothesLbl.setText("Amount of clothes (kg):");

        submitLaundryBtn.setBackground(new java.awt.Color(51, 255, 255));
        submitLaundryBtn.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        submitLaundryBtn.setText("Submit");
        submitLaundryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitLaundryBtnActionPerformed(evt);
            }
        });

        durationLbl.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        durationLbl.setText("Shower Duration (min):");

        submitShowerBtn.setBackground(new java.awt.Color(51, 255, 255));
        submitShowerBtn.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        submitShowerBtn.setText("Submit");
        submitShowerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitShowerBtnActionPerformed(evt);
            }
        });

        appliancesListLbl.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        appliancesListLbl.setText("Check the items you have turned off/unpluged:");

        tvRb.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tvRb.setText("TV");

        lightsRb.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lightsRb.setText("lights");

        microwaveRb.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        microwaveRb.setText("microwave");

        ovenRb.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        ovenRb.setText("oven");

        boilerRb.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        boilerRb.setText("boiler");

        chargerRb.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        chargerRb.setText("charger");

        laptopRb.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        laptopRb.setText("laptops/pcs");

        heaterRb.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        heaterRb.setText("heater");

        submitAppliancesBtn.setBackground(new java.awt.Color(51, 255, 255));
        submitAppliancesBtn.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        submitAppliancesBtn.setText("Submit");
        submitAppliancesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitAppliancesBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(204, 204, 255));
        backBtn.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(washingLbl)
                                    .addComponent(clothesLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(washingTf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clothesTf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(durationLbl)
                                    .addComponent(submitShowerBtn)
                                    .addComponent(submitAppliancesBtn)
                                    .addComponent(appliancesListLbl)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tvRb)
                                            .addComponent(lightsRb)
                                            .addComponent(microwaveRb)
                                            .addComponent(ovenRb))
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(heaterRb)
                                            .addComponent(laptopRb)
                                            .addComponent(chargerRb)
                                            .addComponent(boilerRb))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(durationTf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(homeLbl)
                                .addGap(268, 268, 268)
                                .addComponent(backBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButton1)
                                    .addGap(105, 105, 105)
                                    .addComponent(jRadioButton2)
                                    .addGap(73, 73, 73)
                                    .addComponent(jRadioButton3))
                                .addComponent(submitLaundryBtn)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homeLbl)
                    .addComponent(backBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(washingLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clothesLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(washingTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clothesTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitLaundryBtn)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(durationLbl)
                    .addComponent(durationTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitShowerBtn)
                .addGap(26, 26, 26)
                .addComponent(appliancesListLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvRb)
                    .addComponent(boilerRb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lightsRb)
                    .addComponent(chargerRb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(microwaveRb)
                    .addComponent(laptopRb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ovenRb)
                    .addComponent(heaterRb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitAppliancesBtn)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        washingLbl.setVisible(true);
        washingTf.setVisible(true);
        clothesLbl.setVisible(true);
        clothesTf.setVisible(true);
        submitLaundryBtn.setVisible(true);

        durationLbl.setVisible(false);
        durationTf.setVisible(false);
        submitShowerBtn.setVisible(false);
        
        appliancesListLbl.setVisible(false);
        tvRb.setVisible(false);
        lightsRb.setVisible(false);
        microwaveRb.setVisible(false);
        ovenRb.setVisible(false);
        boilerRb.setVisible(false);
        chargerRb.setVisible(false);
        laptopRb.setVisible(false);
        heaterRb.setVisible(false);
        submitAppliancesBtn.setVisible(false);
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        washingLbl.setVisible(false);
        washingTf.setVisible(false);
        clothesLbl.setVisible(false);
        clothesTf.setVisible(false);
        submitLaundryBtn.setVisible(false);
        
        durationLbl.setVisible(true);
        durationTf.setVisible(true);
        submitShowerBtn.setVisible(true);
        
        appliancesListLbl.setVisible(false);
        tvRb.setVisible(false);
        lightsRb.setVisible(false);
        microwaveRb.setVisible(false);
        ovenRb.setVisible(false);
        boilerRb.setVisible(false);
        chargerRb.setVisible(false);
        laptopRb.setVisible(false);
        heaterRb.setVisible(false);
        submitAppliancesBtn.setVisible(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        washingLbl.setVisible(false);
        washingTf.setVisible(false);
        clothesLbl.setVisible(false);
        clothesTf.setVisible(false);
        submitLaundryBtn.setVisible(false);
        
        durationLbl.setVisible(false);
        durationTf.setVisible(false);
        submitShowerBtn.setVisible(false);
        
        appliancesListLbl.setVisible(true);
        tvRb.setVisible(true);
        lightsRb.setVisible(true);
        microwaveRb.setVisible(true);
        ovenRb.setVisible(true);
        boilerRb.setVisible(true);
        chargerRb.setVisible(true);
        laptopRb.setVisible(true);
        heaterRb.setVisible(true);
        submitAppliancesBtn.setVisible(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void submitLaundryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitLaundryBtnActionPerformed
        // TODO add your handling code here:
        double washingMachine;
        double clothes;
        double carbon;
        
        //electricity 1hour 2.1 kw
        //carbon 350 kw hour
        
        washingMachine = Double.parseDouble(washingTf.getText());
        clothes = Double.parseDouble(clothesTf.getText());
        carbon = (washingMachine/clothes)*735.0;
        
        JOptionPane.showMessageDialog(null,"You have generated "+carbon+" grams of carbon. To minimize this amount, try washing at full capacity!");
        
        
    }//GEN-LAST:event_submitLaundryBtnActionPerformed

    private void submitShowerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitShowerBtnActionPerformed
        // TODO add your handling code here:
        double time;
        double carbon;
        
        //shower 9.5 kw per hour
        //carbon 350 kw hour
        time = Double.parseDouble(durationTf.getText());
        carbon = ((time/60)*(9.5/60))*350;
        
        JOptionPane.showMessageDialog(null,"You have generated "+carbon+" grams of carbon. To minimize this amount, try taking shorter showers!");
        
    }//GEN-LAST:event_submitShowerBtnActionPerformed

    private void submitAppliancesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitAppliancesBtnActionPerformed
        // TODO add your handling code here:
        int count = 0;
        
        if(tvRb.isSelected()){
            count++;
        }
        if(lightsRb.isSelected()){
            count++;
        }
        if(microwaveRb.isSelected()){
            count++;
        }
        if(ovenRb.isSelected()){
            count++;
        }
        if(boilerRb.isSelected()){
            count++;
        }
        if(chargerRb.isSelected()){
            count++;
        }
        if(laptopRb.isSelected()){
            count++;
        }
        if(heaterRb.isSelected()){
            count++;
        }
        
        if(count == 0){
            JOptionPane.showMessageDialog(null,"I am sure you can do better than that! It is hard to calculate how much electricity you saved by turning off these appliances, but scientists estimate you can reduce 10% of your total carbon generation per month, just by doing that!!");
        }
        else if(count > 0 && count < 5){
            JOptionPane.showMessageDialog(null,"That's a good start, but you can do more!! It is hard to calculate how much electricity you saved by turning off these appliances, but scientists estimate you can reduce 10% of your total carbon generation per month, just by doing that!!");
        }
        else if(count > 4 && count < 8){
            JOptionPane.showMessageDialog(null,"Very Good, keep this up!! It is hard to calculate how much electricity you saved by turning off these appliances, but scientists estimate you can reduce 10% of your total carbon generation per month, just by doing that!!");
        }
        else if(count == 8){
            JOptionPane.showMessageDialog(null,"Congratulations on your effort!! It is hard to calculate how much electricity you saved by turning off these appliances, but scientists estimate you can reduce 10% of your total carbon generation per month, just by doing that!!");
        }
        
    }//GEN-LAST:event_submitAppliancesBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        ClimateHeroCarbonGUI myGUI = new ClimateHeroCarbonGUI();
        myGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ClimateHeroHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClimateHeroHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClimateHeroHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClimateHeroHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClimateHeroHomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appliancesListLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JRadioButton boilerRb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton chargerRb;
    private javax.swing.JLabel clothesLbl;
    private javax.swing.JTextField clothesTf;
    private javax.swing.JLabel durationLbl;
    private javax.swing.JTextField durationTf;
    private javax.swing.JRadioButton heaterRb;
    private javax.swing.JLabel homeLbl;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton laptopRb;
    private javax.swing.JRadioButton lightsRb;
    private javax.swing.JRadioButton microwaveRb;
    private javax.swing.JRadioButton ovenRb;
    private javax.swing.JButton submitAppliancesBtn;
    private javax.swing.JButton submitLaundryBtn;
    private javax.swing.JButton submitShowerBtn;
    private javax.swing.JRadioButton tvRb;
    private javax.swing.JLabel washingLbl;
    private javax.swing.JTextField washingTf;
    // End of variables declaration//GEN-END:variables
}
