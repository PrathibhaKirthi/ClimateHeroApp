package climateheroapp;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author idiltatar
 */
public class ClimateHeroTransportGUI extends javax.swing.JFrame {

    /**
     * Creates new form Transport
     */
    public ClimateHeroTransportGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        publicBtn = new javax.swing.JButton();
        carBtn = new javax.swing.JButton();
        bikeBth = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel1.setSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLbl.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 102, 102));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("TRANSPORT");
        jPanel1.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 192, -1));

        publicBtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        publicBtn.setForeground(new java.awt.Color(0, 153, 153));
        publicBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bus_icon.png"))); // NOI18N
        publicBtn.setText("Public");
        publicBtn.setIconTextGap(14);
        publicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicBtnActionPerformed(evt);
            }
        });
        jPanel1.add(publicBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 227, -1));

        carBtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        carBtn.setForeground(new java.awt.Color(0, 153, 153));
        carBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/car_icon.png"))); // NOI18N
        carBtn.setText("Personal Car");
        carBtn.setIconTextGap(14);
        carBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carBtnActionPerformed(evt);
            }
        });
        jPanel1.add(carBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 227, -1));

        bikeBth.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        bikeBth.setForeground(new java.awt.Color(0, 153, 153));
        bikeBth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bicycle_icon.png"))); // NOI18N
        bikeBth.setText("Bicycle");
        bikeBth.setIconTextGap(14);
        bikeBth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bikeBthActionPerformed(evt);
            }
        });
        jPanel1.add(bikeBth, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 227, -1));

        backBtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 102, 102));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back_icon.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 121, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        ClimateHeroCarbonGUI myGUI = new ClimateHeroCarbonGUI();
        myGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void bikeBthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bikeBthActionPerformed
        // TODO add your handling code here:
        ClimateHeroEmissionRecordGUI myGUI = new ClimateHeroEmissionRecordGUI(
                new String[] {Vehicle.BICYCLE}
        );
        myGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_bikeBthActionPerformed

    private void publicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicBtnActionPerformed
        // TODO add your handling code here:
        ClimateHeroEmissionRecordGUI myGUI = new ClimateHeroEmissionRecordGUI(Vehicle.PUBLIC_TRANSPORT_VEHICLES);
        myGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_publicBtnActionPerformed

    private void carBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carBtnActionPerformed
        // TODO add your handling code here:
        ClimateHeroEmissionRecordGUI myGUI = new ClimateHeroEmissionRecordGUI(Vehicle.PERSONAL_CARS);
        myGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_carBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ClimateHeroTransportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClimateHeroTransportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClimateHeroTransportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClimateHeroTransportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClimateHeroTransportGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bikeBth;
    private javax.swing.JButton carBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton publicBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
