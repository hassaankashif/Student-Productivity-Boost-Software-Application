import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usmankashif
 */
public class Volleyball_Interface extends javax.swing.JFrame {

    /**
     * Creates new form Volleyball_Interface
     */
    public Volleyball_Interface() {
        initComponents();
        setLocation(270,170); 
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Football_Interface = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        FootballVideo_Hyperlink = new javax.swing.JButton();
        VolleyballVideo = new javax.swing.JButton();
        VolleyballSong = new javax.swing.JButton();
        HomeButtonRight = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        HomeButtonLeft = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Football_Interface.setBackground(new java.awt.Color(207, 226, 243));
        Football_Interface.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 4));
        Football_Interface.setPreferredSize(new java.awt.Dimension(920, 442));
        Football_Interface.setSize(new java.awt.Dimension(3333, 100));

        jLabel6.setFont(new java.awt.Font("Hiragino Sans GB", 1, 32)); // NOI18N
        jLabel6.setText("Volleyball; Power of the Net and the Ball");
        jLabel6.setAutoscrolls(true);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GreenHorizontalLine.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel16.setText("<html> <center> “Don't ever let the ball hit the ground without a body hitting <br> the ground with it” - Volleyball Champion, <i> Earvin N'Gapeth </i> </center> </html>  ");

        FootballVideo_Hyperlink.setBorder(null);
        FootballVideo_Hyperlink.setBorderPainted(false);

        VolleyballVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VolleyballVideo.jpg"))); // NOI18N
        VolleyballVideo.setBorderPainted(false);
        VolleyballVideo.setContentAreaFilled(false);
        VolleyballVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolleyballVideoActionPerformed(evt);
            }
        });

        VolleyballSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VolleyballSong.jpg"))); // NOI18N
        VolleyballSong.setBorderPainted(false);
        VolleyballSong.setContentAreaFilled(false);
        VolleyballSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolleyballSongActionPerformed(evt);
            }
        });

        HomeButtonRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeButton1.png"))); // NOI18N
        HomeButtonRight.setBorderPainted(false);
        HomeButtonRight.setContentAreaFilled(false);
        HomeButtonRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonRightActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Myanmar MN", 0, 18)); // NOI18N
        jLabel17.setText("<html> <center> <u> Click on the ambitious scenes on the left for an uplifting volleyball video, <br> and the tremendously competitive plays on the right for a volleyball song </u> </center> </html>");

        HomeButtonLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeButton1.png"))); // NOI18N
        HomeButtonLeft.setBorderPainted(false);
        HomeButtonLeft.setContentAreaFilled(false);
        HomeButtonLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonLeftActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Football_InterfaceLayout = new javax.swing.GroupLayout(Football_Interface);
        Football_Interface.setLayout(Football_InterfaceLayout);
        Football_InterfaceLayout.setHorizontalGroup(
            Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                .addGroup(Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Football_InterfaceLayout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(jLabel8)
                        .addGap(762, 762, 762))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Football_InterfaceLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(799, 799, 799)))
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                .addGroup(Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Football_InterfaceLayout.createSequentialGroup()
                        .addGroup(Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                .addGap(863, 863, 863)
                                .addComponent(jLabel12))
                            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(VolleyballVideo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGroup(Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                        .addGap(328, 328, 328)
                                        .addComponent(FootballVideo_Hyperlink))
                                    .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(VolleyballSong, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(203, 203, 203)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Football_InterfaceLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(HomeButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Football_InterfaceLayout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80))))
                            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addGap(26, 26, 26)
                        .addComponent(HomeButtonRight, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Football_InterfaceLayout.setVerticalGroup(
            Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HomeButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HomeButtonRight, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Football_InterfaceLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Football_InterfaceLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel3))
                    .addGroup(Football_InterfaceLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(VolleyballSong, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(VolleyballVideo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Football_InterfaceLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel4))
                            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94)
                        .addGroup(Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FootballVideo_Hyperlink, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(100, 100, 100)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Football_Interface, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 912, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Football_Interface, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolleyballVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolleyballVideoActionPerformed
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://www.youtube.com/watch?v=7U56DMWsprk"));
        }
        catch (URISyntaxException | IOException test) {
        }
    }//GEN-LAST:event_VolleyballVideoActionPerformed

    private void VolleyballSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolleyballSongActionPerformed
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://www.youtube.com/watch?v=SJNPuxyR1EU"));
        }
        catch (URISyntaxException | IOException test) {
        }
    }//GEN-LAST:event_VolleyballSongActionPerformed

    private void HomeButtonRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonRightActionPerformed
        // TODO add your handling code here:
        new Welcome_Interface().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeButtonRightActionPerformed

    private void HomeButtonLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonLeftActionPerformed
        // TODO add your handling code here:
        new Welcome_Interface().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeButtonLeftActionPerformed

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
            java.util.logging.Logger.getLogger(Volleyball_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Volleyball_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Volleyball_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Volleyball_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Volleyball_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FootballVideo_Hyperlink;
    private javax.swing.JPanel Football_Interface;
    private javax.swing.JButton HomeButtonLeft;
    private javax.swing.JButton HomeButtonRight;
    private javax.swing.JButton VolleyballSong;
    private javax.swing.JButton VolleyballVideo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
