package gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;
import javax.swing.JOptionPane;
import logic.persistance.RepositoryImp;

public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        myInitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_main = new javax.swing.JPanel();
        btn_runner = new javax.swing.JButton();
        btn_race = new javax.swing.JButton();
        btn_race_finished = new javax.swing.JButton();
        btn_settings = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(MainWindow.class, "MainWindow.title")); // NOI18N
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/gui/img/podium_x512.png")).getImage());
        setMinimumSize(new java.awt.Dimension(550, 300));
        setPreferredSize(new java.awt.Dimension(300, 100));

        pn_main.setLayout(new java.awt.GridLayout(2, 3, 12, 12));

        btn_runner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/runner_woman_x64.png"))); // NOI18N
        btn_runner.setMnemonic('g');
        btn_runner.setText(org.openide.util.NbBundle.getMessage(MainWindow.class, "MainWindow.btn_runner.text")); // NOI18N
        btn_runner.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_runner.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_runner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_runnerActionPerformed(evt);
            }
        });
        pn_main.add(btn_runner);

        btn_race.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/runner_group_x64.png"))); // NOI18N
        btn_race.setMnemonic('e');
        btn_race.setText(org.openide.util.NbBundle.getMessage(MainWindow.class, "MainWindow.btn_race.text")); // NOI18N
        btn_race.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_race.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_race.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raceActionPerformed(evt);
            }
        });
        pn_main.add(btn_race);

        btn_race_finished.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/flag_finish_x64.png"))); // NOI18N
        btn_race_finished.setMnemonic('c');
        btn_race_finished.setText(org.openide.util.NbBundle.getMessage(MainWindow.class, "MainWindow.btn_race_finished.text")); // NOI18N
        btn_race_finished.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_race_finished.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_race_finished.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_race_finishedActionPerformed(evt);
            }
        });
        pn_main.add(btn_race_finished);

        btn_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/settings_x64.png"))); // NOI18N
        btn_settings.setMnemonic('a');
        btn_settings.setText(org.openide.util.NbBundle.getMessage(MainWindow.class, "MainWindow.btn_settings.text")); // NOI18N
        btn_settings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_settings.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_settingsActionPerformed(evt);
            }
        });
        pn_main.add(btn_settings);

        jButton5.setText(org.openide.util.NbBundle.getMessage(MainWindow.class, "MainWindow.jButton5.text")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pn_main.add(jButton5);

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/exit_x64.png"))); // NOI18N
        btn_exit.setMnemonic('s');
        btn_exit.setText(org.openide.util.NbBundle.getMessage(MainWindow.class, "MainWindow.btn_exit.text")); // NOI18N
        btn_exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        pn_main.add(btn_exit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_runnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_runnerActionPerformed
        Utils.allignAndShowWindow(RunnerManager.getInstance(), this);        
    }//GEN-LAST:event_btn_runnerActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_settingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_settingsActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        exit();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_raceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_raceActionPerformed
        Utils.allignAndShowWindow(RaceManager.getInstance(), this);
    }//GEN-LAST:event_btn_raceActionPerformed

    private void btn_race_finishedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_race_finishedActionPerformed
        Utils.allignAndShowWindow(FinishedRaceManager.getInstance(), this);
    }//GEN-LAST:event_btn_race_finishedActionPerformed

    
    private void myInitComponents() {
        Locale locale = new Locale("es", "ES"); 
        Locale.setDefault(locale);
        JOptionPane.setDefaultLocale(locale);
        
        this.setLocationRelativeTo(null); //center window
        jButton5.setVisible(false);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                exit();
            }
        });
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    private void exit() {
        if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cerrar la aplicación?", "Salir", JOptionPane.YES_NO_OPTION)){
            RepositoryImp.getInstance().persist();
            System.exit(0);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_race;
    private javax.swing.JButton btn_race_finished;
    private javax.swing.JButton btn_runner;
    private javax.swing.JButton btn_settings;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel pn_main;
    // End of variables declaration//GEN-END:variables
}
