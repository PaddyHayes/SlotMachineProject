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

        firstSlotPlacelbl = new javax.swing.JLabel();
        slotMachinelbl = new javax.swing.JLabel();
        slotMachinebtn = new javax.swing.JButton();
        insertCoinbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(564, 524));
        setSize(new java.awt.Dimension(200, 200));
        getContentPane().setLayout(null);

        firstSlotPlacelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachineproject/images/slotNum7.png"))); // NOI18N
        firstSlotPlacelbl.setBounds(40, 20, 20, 20);
        getContentPane().add(firstSlotPlacelbl);
        firstSlotPlacelbl.setBounds(190, 220, 50, 64);

        slotMachinelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachineproject/images/slotMachine.png"))); // NOI18N
        getContentPane().add(slotMachinelbl);
        slotMachinelbl.setBounds(150, 130, 240, 200);

        slotMachinebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachineproject/images/leverUp.png"))); // NOI18N
        slotMachinebtn.setToolTipText("");
        slotMachinebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slotMachinebtnActionPerformed(evt);
            }
        });
        getContentPane().add(slotMachinebtn);
        slotMachinebtn.setBounds(390, 130, 81, 260);

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
        getContentPane().add(insertCoinbtn);
        insertCoinbtn.setBounds(150, 330, 50, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
            //got help from Ryan Madigan (3rd year games dev)
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

    private void insertCoinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCoinbtnActionPerformed
        // TODO add your handling code here:
        smm.addMoney(1);
    }//GEN-LAST:event_insertCoinbtnActionPerformed

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
    private javax.swing.JLabel firstSlotPlacelbl;
    private javax.swing.JButton insertCoinbtn;
    private javax.swing.JButton slotMachinebtn;
    private javax.swing.JLabel slotMachinelbl;
    // End of variables declaration//GEN-END:variables
}
