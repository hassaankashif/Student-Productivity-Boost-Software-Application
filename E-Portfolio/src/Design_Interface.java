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
public class Design_Interface extends javax.swing.JFrame {

    /**
     * Creates new form Design_Interface
     */
    public Design_Interface() {
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
        DesignVideo = new javax.swing.JButton();
        DesignSong = new javax.swing.JButton();
        HomeButtonRight = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        HomeButtonLeft = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Football_Interface.setBackground(new java.awt.Color(207, 226, 243));
        Football_Interface.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 4));
        Football_Interface.setPreferredSize(new java.awt.Dimension(920, 442));
        Football_Interface.setSize(new java.awt.Dimension(3333, 100));

        jLabel6.setFont(new java.awt.Font("Hiragino Sans GB", 1, 36)); // NOI18N
        jLabel6.setText("Design; Function Meets Innovation");
        jLabel6.setAutoscrolls(true);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GreenHorizontalLine.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jLabel16.setText("<html> <center> “Design Creativity is nothing but a mind set free.<br> Open Up and Don't be Afraid ” - Upcoming Artist, <i> Torrie T.</i> </center> </html>\n\n");

        FootballVideo_Hyperlink.setBorder(null);
        FootballVideo_Hyperlink.setBorderPainted(false);

        DesignVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DesignVideo.jpg"))); // NOI18N
        DesignVideo.setBorderPainted(false);
        DesignVideo.setContentAreaFilled(false);
        DesignVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesignVideoActionPerformed(evt);
            }
        });

        DesignSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DesignSong.jpg"))); // NOI18N
        DesignSong.setBorderPainted(false);
        DesignSong.setContentAreaFilled(false);
        DesignSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesignSongActionPerformed(evt);
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

        jLabel17.setFont(new java.awt.Font("Myanmar MN", 0, 17)); // NOI18N
        jLabel17.setText("<html> <center> The above two graphics demonstrate how creativity can bring life changing innovations around us. Design ideas are endless. <b> Select the unique left idea for an uplifting design video, and the following outline for a design-themed song </b> </center> </html>");

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
                                .addComponent(DesignVideo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGroup(Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                        .addGap(328, 328, 328)
                                        .addComponent(FootballVideo_Hyperlink))
                                    .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DesignSong, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(203, 203, 203)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Football_InterfaceLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(HomeButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Football_InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel6))
                            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Football_InterfaceLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
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
                            .addComponent(DesignSong, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(DesignVideo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
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
                                .addGap(12, 12, 12)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
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

    private void DesignVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesignVideoActionPerformed
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://www.youtube.com/watch?v=9uOMectkCCs"));
        }
        catch (URISyntaxException | IOException test) {
        }
    }//GEN-LAST:event_DesignVideoActionPerformed

    private void DesignSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesignSongActionPerformed
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://www.youtube.com/watch?v=3p5QqKANMWo&t=37s"));
        }
        catch (URISyntaxException | IOException test) {
        }
    }//GEN-LAST:event_DesignSongActionPerformed

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
            java.util.logging.Logger.getLogger(Design_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Design_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Design_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Design_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Design_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DesignSong;
    private javax.swing.JButton DesignVideo;
    private javax.swing.JButton FootballVideo_Hyperlink;
    private javax.swing.JPanel Football_Interface;
    private javax.swing.JButton HomeButtonLeft;
    private javax.swing.JButton HomeButtonRight;
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
