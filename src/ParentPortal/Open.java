
import ParentPortal.Login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author TRETEC
 */
public class Open extends javax.swing.JFrame {

    /**
     * Creates new form Open
     */
    public Open() {
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

        open = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        clickableHIBOO = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openMouseClicked(evt);
            }
        });
        open.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Chewy", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hello");
        open.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Londrina Solid", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Click on HIBOO!");
        open.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        jLabel12.setFont(new java.awt.Font("Londrina Solid", 0, 89)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("HIBOO");
        open.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        clickableHIBOO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/clickMe-08.png"))); // NOI18N
        open.add(clickableHIBOO, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/clickMe2-10.png"))); // NOI18N
        open.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, -1));

        getContentPane().add(open);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMouseClicked
        open.setVisible(false);
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_openMouseClicked

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
            java.util.logging.Logger.getLogger(Open.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Open.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Open.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Open.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Open().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clickableHIBOO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel open;
    // End of variables declaration//GEN-END:variables
}
