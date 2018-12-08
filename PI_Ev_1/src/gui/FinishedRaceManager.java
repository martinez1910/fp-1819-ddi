package gui;

import gui.tablemodel.RaceTableModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import logic.obj.Race;
import logic.obj.Runner;
import logic.persistance.RepositoryImp;

public class FinishedRaceManager extends javax.swing.JFrame {
    private static FinishedRaceManager instance = null;
    
    private FinishedRaceManager() {
        initComponents();
        myInitComponents();
    }
    
    public static FinishedRaceManager getInstance(){
        if(instance == null)
            instance = new FinishedRaceManager();
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrpn_table = new javax.swing.JScrollPane();
        tb_races = new javax.swing.JTable();
        pn_buttons = new javax.swing.JPanel();
        btn_view = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(FinishedRaceManager.class, "FinishedRaceManager.title")); // NOI18N
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/gui/img/flag_finish_x64.png")).getImage());
        setMinimumSize(new java.awt.Dimension(600, 300));

        scrpn_table.setPreferredSize(new java.awt.Dimension(350, 175));

        tb_races.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_races.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tb_races.setShowHorizontalLines(false);
        scrpn_table.setViewportView(tb_races);

        pn_buttons.setLayout(new java.awt.GridLayout(1, 4, 18, 0));

        btn_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/report_x16.png"))); // NOI18N
        btn_view.setText(org.openide.util.NbBundle.getMessage(FinishedRaceManager.class, "FinishedRaceManager.btn_view.text")); // NOI18N
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        pn_buttons.add(btn_view);

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/back_x12.png"))); // NOI18N
        btn_back.setText(org.openide.util.NbBundle.getMessage(FinishedRaceManager.class, "FinishedRaceManager.btn_back.text")); // NOI18N
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        pn_buttons.add(btn_back);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrpn_table, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pn_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrpn_table, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pn_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        int selectedRow = tb_races.getSelectedRow();
        if(selectedRow == -1){
            Utils.messageInformationSelectRace(this);
            return;
        }
        Race race = RepositoryImp.getInstance().getFinishedRace(tb_races.convertRowIndexToModel(selectedRow));
        Utils.allignAndShowWindow(new FinishedRaceForm(this, race), this);
    }//GEN-LAST:event_btn_viewActionPerformed

    private void myInitComponents(){
        updateTable();
    }
    
    protected void updateTable(){
        Utils.lockCursor(this);
        RaceTableModel raceTableModel = new RaceTableModel(RepositoryImp.getInstance().getFinishedRaces());
        tb_races.setModel(raceTableModel);
        TableRowSorter<RaceTableModel> sorter = new TableRowSorter<>(raceTableModel);
        tb_races.setRowSorter(sorter);
        /*
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
        */
        Utils.unlockCursor(this);
    }
    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FinishedRaceManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FinishedRaceManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FinishedRaceManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FinishedRaceManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FinishedRaceManager().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_view;
    private javax.swing.JPanel pn_buttons;
    private javax.swing.JScrollPane scrpn_table;
    private javax.swing.JTable tb_races;
    // End of variables declaration//GEN-END:variables
}
