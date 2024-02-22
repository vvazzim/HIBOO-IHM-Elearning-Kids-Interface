/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package minerva;

import ParentPortal.Home;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author TRETEC
 */
public class KidPortal extends javax.swing.JFrame {

    /**
     * Creates new form KidPortal
     */
    public KidPortal() {
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

        jPanel3 = new javax.swing.JPanel();
        eight = new javax.swing.JLabel();
        six = new javax.swing.JLabel();
        nine = new javax.swing.JLabel();
        Quiz = new javax.swing.JLabel();
        correct = new javax.swing.JLabel();
        incorrect = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        GameChanger = new javax.swing.JLabel();
        birthD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(886, 699));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eight.setBackground(new java.awt.Color(170, 218, 193));
        eight.setFont(new java.awt.Font("Chewy", 1, 24)); // NOI18N
        eight.setForeground(new java.awt.Color(255, 255, 255));
        eight.setText("Eight");
        eight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightMouseClicked(evt);
            }
        });
        jPanel3.add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 60, -1));

        six.setBackground(new java.awt.Color(170, 218, 193));
        six.setFont(new java.awt.Font("Chewy", 1, 24)); // NOI18N
        six.setForeground(new java.awt.Color(255, 255, 255));
        six.setText("Six");
        six.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixMouseClicked(evt);
            }
        });
        jPanel3.add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 40, -1));

        nine.setBackground(new java.awt.Color(170, 218, 193));
        nine.setFont(new java.awt.Font("Chewy", 1, 24)); // NOI18N
        nine.setForeground(new java.awt.Color(255, 255, 255));
        nine.setText("Nine");
        nine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineMouseClicked(evt);
            }
        });
        jPanel3.add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        Quiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/DailyQuiz-06.png"))); // NOI18N
        jPanel3.add(Quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        correct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/CorrectDailyQuiz-06.png"))); // NOI18N
        correct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correctMouseClicked(evt);
            }
        });
        jPanel3.add(correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        incorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/Incorrect-06.png"))); // NOI18N
        jPanel3.add(incorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/HelloFares-21.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        getContentPane().add(jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/FamilyIconNoir-19.png"))); // NOI18N
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/BackArrow-19.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Chewy", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(114, 193, 93));
        jLabel3.setText("Wanna Play?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        GameChanger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/bgKid-20.png"))); // NOI18N
        GameChanger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GameChangerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GameChangerMouseEntered(evt);
            }
        });
        jPanel2.add(GameChanger, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 490));

        birthD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/birthD-22.png"))); // NOI18N
        birthD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        birthD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birthDMouseClicked(evt);
            }
        });
        jPanel2.add(birthD, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightMouseClicked
        Quiz.setVisible(false);
        eight.setVisible(false);nine.setVisible(false);
        six.setVisible(false);
        
        
    }//GEN-LAST:event_eightMouseClicked

    private void correctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correctMouseClicked
        
    }//GEN-LAST:event_correctMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Home H = new Home();
        H.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void sixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixMouseClicked
        Quiz.setVisible(false);
        eight.setVisible(false);nine.setVisible(false);
        six.setVisible(false);correct.setVisible(false);
    }//GEN-LAST:event_sixMouseClicked

    private void nineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineMouseClicked
        Quiz.setVisible(false);
        eight.setVisible(false);nine.setVisible(false);
        six.setVisible(false);correct.setVisible(false);
    }//GEN-LAST:event_nineMouseClicked

    private void birthDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birthDMouseClicked
        JOptionPane.showMessageDialog(null, "It's Sarrah's Birthday! ", "Happy Birthday",JOptionPane.INFORMATION_MESSAGE);
            
    }//GEN-LAST:event_birthDMouseClicked

    private void GameChangerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GameChangerMouseClicked
        Game g = new Game();
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GameChangerMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        KidPortal k =new KidPortal();
        k.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void GameChangerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GameChangerMouseEntered
        GameChanger.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_GameChangerMouseEntered

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
            java.util.logging.Logger.getLogger(KidPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KidPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KidPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KidPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KidPortal j =new KidPortal();
                        j.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GameChanger;
    private javax.swing.JLabel Quiz;
    private javax.swing.JLabel birthD;
    private javax.swing.JLabel correct;
    private javax.swing.JLabel eight;
    private javax.swing.JLabel incorrect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nine;
    private javax.swing.JLabel six;
    // End of variables declaration//GEN-END:variables
}
