/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ParentPortal;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import minerva.KidPortal;

/**
 *
 * @author TRETEC
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Vav
     */
    public Home() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        hibboMenu = new javax.swing.JPanel();
        Minerva = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Workload = new javax.swing.JLabel();
        Contact = new javax.swing.JLabel();
        Account = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        Achivement = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        His = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        Math = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        Tree = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Geo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        PerSocial = new javax.swing.JLabel();
        Calender1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        PerHome = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        perAttendance = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        PerAttention = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        CalendarI = new javax.swing.JLabel();
        Calender = new javax.swing.JLabel();

        jPopupMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupMenu1.setInvoker(jLabel3);
        jPopupMenu1.setLabel("");
        jPopupMenu1.setPopupSize(new java.awt.Dimension(50, 25));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(865, 730));
        setSize(new java.awt.Dimension(865, 697));

        hibboMenu.setBackground(new java.awt.Color(37, 64, 103));
        hibboMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Minerva.setFont(new java.awt.Font("Londrina Solid", 0, 60)); // NOI18N
        Minerva.setForeground(new java.awt.Color(255, 255, 255));
        Minerva.setText("HIBOO");
        hibboMenu.add(Minerva, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, -1));

        Home.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("Home");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        hibboMenu.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        Workload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Workload.setForeground(new java.awt.Color(255, 255, 255));
        Workload.setText("Workload");
        Workload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WorkloadMouseClicked(evt);
            }
        });
        hibboMenu.add(Workload, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        Contact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Contact.setForeground(new java.awt.Color(255, 255, 255));
        Contact.setText("Conttact");
        hibboMenu.add(Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        Account.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Account.setForeground(new java.awt.Color(255, 255, 255));
        Account.setText("Account");
        Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountMouseClicked(evt);
            }
        });
        hibboMenu.add(Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jPanel2.setBackground(new java.awt.Color(37, 64, 103));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParentPortal/Design-19.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParentPortal/gear-19-19.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParentPortal/extend-19.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);

        hibboMenu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 140, 30));

        getContentPane().add(hibboMenu, java.awt.BorderLayout.LINE_START);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new java.awt.GridLayout(4, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        Welcome.setFont(new java.awt.Font("Inter Medium", 0, 48)); // NOI18N
        Welcome.setForeground(new java.awt.Color(37, 64, 103));
        Welcome.setText("                Welcome Mr. Rabah!   ");
        jPanel3.add(Welcome);

        Achivement.setBackground(new java.awt.Color(64, 64, 64));
        Achivement.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Achivement.setForeground(new java.awt.Color(64, 64, 64));
        Achivement.setText("          Achivement");
        jPanel3.add(Achivement);

        bg.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        His.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParentPortal/Cards-14.png"))); // NOI18N
        jPanel10.add(His, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel4.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Math.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParentPortal/Cards-11.png"))); // NOI18N
        jPanel11.add(Math, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel4.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tree.setBackground(new java.awt.Color(255, 255, 255));
        Tree.setForeground(new java.awt.Color(255, 255, 255));
        Tree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParentPortal/Cards-13.png"))); // NOI18N
        jPanel12.add(Tree, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel4.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Geo.setForeground(new java.awt.Color(64, 64, 64));
        Geo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParentPortal/Cards-12.png"))); // NOI18N
        jPanel13.add(Geo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel4.add(jPanel13);

        bg.add(jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PerSocial.setForeground(new java.awt.Color(60, 63, 65));
        PerSocial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParentPortal/percentages-15.png"))); // NOI18N
        jPanel1.add(PerSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 80, 80));

        Calender1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Calender1.setForeground(new java.awt.Color(60, 63, 65));
        Calender1.setText("Progress");
        jPanel1.add(Calender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Social Skills");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jPanel6.add(jPanel1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PerHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParentPortal/percentages-16.png"))); // NOI18N
        jPanel5.add(PerHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Attention");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jPanel6.add(jPanel5);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        perAttendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParentPortal/percentages-14.png"))); // NOI18N
        jPanel8.add(perAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Attendance");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jPanel6.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PerAttention.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParentPortal/percentages-17.png"))); // NOI18N
        jPanel9.add(PerAttention, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Homework");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jPanel6.add(jPanel9);

        bg.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CalendarI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParentPortal/Calebdar-24.png"))); // NOI18N
        jPanel7.add(CalendarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 450, 80));

        Calender.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Calender.setForeground(new java.awt.Color(60, 63, 65));
        Calender.setText("Calendar");
        jPanel7.add(Calender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        bg.add(jPanel7);

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked

        
    }//GEN-LAST:event_HomeMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        KidPortal H = new KidPortal();
        H.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountMouseClicked
        Account n = new Account();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AccountMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void WorkloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WorkloadMouseClicked
        Workload m;
        m = new Workload();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_WorkloadMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if(this.getExtendedState () != this.MAXIMIZED_BOTH){
            this.setExtendedState (this.MAXIMIZED_BOTH);
        }else{this.setExtendedState (this.NORMAL);}
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home H = new Home();
                H.setVisible(true);
                
                H.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Account;
    private javax.swing.JLabel Achivement;
    private javax.swing.JLabel CalendarI;
    private javax.swing.JLabel Calender;
    private javax.swing.JLabel Calender1;
    private javax.swing.JLabel Contact;
    private javax.swing.JLabel Geo;
    private javax.swing.JLabel His;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Math;
    private javax.swing.JLabel Minerva;
    private javax.swing.JLabel PerAttention;
    private javax.swing.JLabel PerHome;
    private javax.swing.JLabel PerSocial;
    private javax.swing.JLabel Tree;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel Workload;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel hibboMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel perAttendance;
    // End of variables declaration//GEN-END:variables
}
