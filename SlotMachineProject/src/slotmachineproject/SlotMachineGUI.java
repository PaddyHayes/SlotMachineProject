package slotmachineproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paddy
 */
import java.awt.Image;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import javax.swing.*;
public class SlotMachineGUI  extends javax.swing.JFrame {
    SlotMachineMethods smm = new SlotMachineMethods();

    /**
     * Creates new form SlotMachineGUI
     */
    public SlotMachineGUI() {
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

        jFrame1 = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jFrame2 = new javax.swing.JFrame();
        insertCoinbtn = new javax.swing.JButton();
        slotMachinebtn = new javax.swing.JButton();

        jButton1.setText("Insert Coin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        jButton1.getAccessibleContext().setAccessibleName("insertCoinBtn");
        jButton1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insertCoinbtn.setBackground(new java.awt.Color(20, 20, 20));
        insertCoinbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachineproject/images/coin2.png"))); // NOI18N
        insertCoinbtn.setMaximumSize(new java.awt.Dimension(50, 50));
        insertCoinbtn.setMinimumSize(new java.awt.Dimension(50, 50));
        insertCoinbtn.setPreferredSize(new java.awt.Dimension(50, 50));
        insertCoinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCoinbtnActionPerformed(evt);
            }
        });

        slotMachinebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachineproject/images/leverUp.png"))); // NOI18N
        slotMachinebtn.setToolTipText("");
        slotMachinebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slotMachinebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(insertCoinbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 460, Short.MAX_VALUE)
                .addComponent(slotMachinebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slotMachinebtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(insertCoinbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        slotMachinebtn.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void insertCoinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCoinbtnActionPerformed
        // TODO add your handling code here:
        smm.addMoney(1);
    }//GEN-LAST:event_insertCoinbtnActionPerformed

    private void slotMachinebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slotMachinebtnActionPerformed
        // TODO add your handling code here:
        if(smm.getMoney()>=1)
        {
            //have money
            smm.addMoney(-1);
            JOptionPane.showMessageDialog(null,"Current money: " + smm.getMoney());
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "No money Fam");
        }
        
        if(evt.getSource()==slotMachinebtn){
        
        try
        {
            //slotMachinebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachineproject/images/leverUp.png")));
        Image leverDown = ImageIO.read(getClass().getResource("/slotmachineproject/images/leverDown.png"));
        slotMachinebtn.setIcon(new ImageIcon(leverDown));
        Thread.sleep(0);
        Image leverUp = ImageIO.read(getClass().getResource("/slotmachineproject/images/images/leverUp.png"));
        slotMachinebtn.setIcon(new ImageIcon(leverUp));
        
        
        }
        catch(Exception ex)
        {
            System.out.print(ex);
        }
        }
    }//GEN-LAST:event_slotMachinebtnActionPerformed

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
            java.util.logging.Logger.getLogger(SlotMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlotMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlotMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlotMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlotMachineGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertCoinbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JButton slotMachinebtn;
    // End of variables declaration//GEN-END:variables
}
