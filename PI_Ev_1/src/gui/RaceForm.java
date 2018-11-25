package gui;

import gui.tablemodel.RunnerInRaceTableModel;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.TableRowSorter;
import logic.obj.Race;
import logic.obj.Runner;
import logic.obj.RunnerInRace;
import logic.persistance.RepositoryImp;
import org.netbeans.validation.api.builtin.stringvalidation.CapitalValidator;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;

public class RaceForm extends javax.swing.JDialog {
    private final RaceManager parent;
    private final Race race;
    private final List<RunnerInRace> runnersInRace;
    
    /**
     * Creates new form RaceForm (modal). It is used to add and to update a race.
     * @param parent
     * @param race If null adds a new race, otherwise updates.
     */
    public RaceForm(Frame parent, Race race) {
        super(parent, true);
        this.parent = (RaceManager) parent;
        this.race = race;
        this.runnersInRace = RepositoryImp.getInstance().getRunnersInRace(race);
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

        pn_form = new javax.swing.JPanel();
        vpn_validation = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        pn_form_fields = new javax.swing.JPanel();
        lbl_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        lbl_location = new javax.swing.JLabel();
        txt_location = new javax.swing.JTextField();
        lbl_date = new javax.swing.JLabel();
        spn_date = new javax.swing.JSpinner();
        lbl_maxRunners = new javax.swing.JLabel();
        spn_maxRunners = new javax.swing.JSpinner();
        pn_buttons = new javax.swing.JPanel();
        btn_add_update = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        pn_runners = new javax.swing.JPanel();
        scrpn_runners = new javax.swing.JScrollPane();
        tb_runners = new javax.swing.JTable();
        btn_add_runner = new javax.swing.JButton();
        btn_remove_runner = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceForm.title")); // NOI18N
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/gui/img/add_x12.png")).getImage());
        setResizable(false);

        lbl_name.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_name.setText(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceForm.lbl_name.text")); // NOI18N

        txt_name.setText(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceForm.txt_name.text")); // NOI18N
        txt_name.setName(org.openide.util.NbBundle.getMessage(RaceForm.class, "RunnerForm.lbl_name.text")); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        lbl_location.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_location.setText(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceForm.lbl_location.text")); // NOI18N

        txt_location.setText(org.openide.util.NbBundle.getMessage(RaceForm.class, "RunnerForm.DNI/NIE.text")); // NOI18N
        txt_location.setName("Lugar"); // NOI18N

        lbl_date.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_date.setText(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceForm.lbl_date.text")); // NOI18N

        spn_date.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(), null, java.util.Calendar.MINUTE));
        spn_date.setName("Fecha"); // NOI18N

        lbl_maxRunners.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_maxRunners.setText(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceForm.lbl_maxRunners.text")); // NOI18N

        spn_maxRunners.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spn_maxRunners.setName(""); // NOI18N

        javax.swing.GroupLayout pn_form_fieldsLayout = new javax.swing.GroupLayout(pn_form_fields);
        pn_form_fields.setLayout(pn_form_fieldsLayout);
        pn_form_fieldsLayout.setHorizontalGroup(
            pn_form_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_form_fieldsLayout.createSequentialGroup()
                .addGroup(pn_form_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(pn_form_fieldsLayout.createSequentialGroup()
                        .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_name))
                    .addGroup(pn_form_fieldsLayout.createSequentialGroup()
                        .addComponent(lbl_location, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_location))
                    .addGroup(pn_form_fieldsLayout.createSequentialGroup()
                        .addGroup(pn_form_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(pn_form_fieldsLayout.createSequentialGroup()
                                .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(spn_date, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_form_fieldsLayout.createSequentialGroup()
                                .addComponent(lbl_maxRunners)
                                .addGap(2, 2, 2)
                                .addComponent(spn_maxRunners, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_form_fieldsLayout.setVerticalGroup(
            pn_form_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_form_fieldsLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(pn_form_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_name))
                .addGap(18, 18, 18)
                .addGroup(pn_form_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_location))
                .addGap(19, 19, 19)
                .addGroup(pn_form_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_date)
                    .addComponent(spn_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pn_form_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_maxRunners)
                    .addComponent(spn_maxRunners, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pn_formLayout = new javax.swing.GroupLayout(pn_form);
        pn_form.setLayout(pn_formLayout);
        pn_formLayout.setHorizontalGroup(
            pn_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vpn_validation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_form_fields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_formLayout.setVerticalGroup(
            pn_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_formLayout.createSequentialGroup()
                .addComponent(vpn_validation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pn_form_fields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pn_buttons.setLayout(new java.awt.GridLayout(1, 2, 18, 0));

        btn_add_update.setText(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceForm.btn_add_update.text")); // NOI18N
        btn_add_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_updateActionPerformed(evt);
            }
        });
        pn_buttons.add(btn_add_update);

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/remove_x12.png"))); // NOI18N
        btn_cancel.setText(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceForm.btn_cancel.text")); // NOI18N
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        pn_buttons.add(btn_cancel);

        pn_runners.setToolTipText(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceForm.pn_runners.toolTipText")); // NOI18N

        tb_runners.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_runners.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        scrpn_runners.setViewportView(tb_runners);

        btn_add_runner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/add_x12.png"))); // NOI18N
        btn_add_runner.setText(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceForm.btn_add_runner.text")); // NOI18N
        btn_add_runner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_runnerActionPerformed(evt);
            }
        });

        btn_remove_runner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/remove_x12.png"))); // NOI18N
        btn_remove_runner.setText(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceForm.btn_remove_runner.text")); // NOI18N
        btn_remove_runner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_remove_runnerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_runnersLayout = new javax.swing.GroupLayout(pn_runners);
        pn_runners.setLayout(pn_runnersLayout);
        pn_runnersLayout.setHorizontalGroup(
            pn_runnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_runnersLayout.createSequentialGroup()
                .addComponent(scrpn_runners, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_runnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_add_runner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_remove_runner, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn_runnersLayout.setVerticalGroup(
            pn_runnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_runnersLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pn_runnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_runnersLayout.createSequentialGroup()
                        .addComponent(btn_add_runner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_remove_runner))
                    .addComponent(scrpn_runners, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pn_runners, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_runners, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pn_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void btn_add_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_updateActionPerformed
        int numRace = this.race == null ? RepositoryImp.getInstance().getAvailableNumRace() : this.race.getNumRace();
        String name = txt_name.getText();
        Date date = (Date) spn_date.getValue();
        String location = txt_location.getText();        
        int maxRunners = (int) spn_maxRunners.getValue();
        Race newRace = new Race(numRace, name, date, location, maxRunners, false);
        
        if(this.race == null){
            if(!RepositoryImp.getInstance().addRace(newRace)){
                Utils.messageErrorAddRace(this);
                return;
            }
        }
        else{
            RepositoryImp.getInstance().updateRace(this.race, newRace);
            RepositoryImp.getInstance().removeRunnersInRace(newRace);
        }
        
        for(RunnerInRace runnerInRace: runnersInRace)
            RepositoryImp.getInstance().addRunnerInRace(runnerInRace);
        
        this.parent.updateTable();
        this.dispose();
    }//GEN-LAST:event_btn_add_updateActionPerformed

    private void btn_add_runnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_runnerActionPerformed
        if((int) spn_maxRunners.getValue() <= runnersInRace.size()){
            Utils.messageErrorAddRunnerInRace(this);
            return;
        }
        Utils.allignAndShowFrame(new RunnerInRaceForm(parent, this, RepositoryImp.getInstance().getRunnersNotInList(this.runnersInRace)), this);
    }//GEN-LAST:event_btn_add_runnerActionPerformed

    private void btn_remove_runnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_remove_runnerActionPerformed
        int[] selectedRows = tb_runners.getSelectedRows();
        if(selectedRows.length == 0){
            Utils.messageInformationSelectRunner(this);
            return;
        }
        if(Utils.messageConfirmationRemoveRunner(this) == JOptionPane.YES_OPTION){
            for(int i : selectedRows)
                runnersInRace.remove(tb_runners.convertRowIndexToModel(i));
            updateTable();
        }
    }//GEN-LAST:event_btn_remove_runnerActionPerformed

    private void myInitComponents() {
        Date date = new Date();
        Date dateNextHour = new Date();
        dateNextHour.setTime(date.getTime()+(1000*60*60));
        spn_date.setModel(new javax.swing.SpinnerDateModel(dateNextHour, date, null, java.util.Calendar.MINUTE));
        
        if(race == null)
            initAddRace();
        else
            initUpdateRace();
        updateTable();
        
        addValidation();
        
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
//            java.util.logging.Logger.getLogger(RunnerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RunnerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RunnerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RunnerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                RunnerForm dialog = new RunnerForm(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    private void initAddRace() {
        this.setTitle(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceManager.btn_add.text") +" Carrera");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/gui/img/add_x12.png")).getImage());
        btn_add_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/add_x12.png")));
        btn_add_update.setText(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceManager.btn_add.text"));
        
        btn_add_update.setEnabled(false);
        
        spn_date.getEditor().setName("Máx. núm. corredores");
    }

    private void initUpdateRace() {
        this.setTitle(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceManager.btn_edit.text") +" Carrera");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/gui/img/edit_x12.png")).getImage());
        btn_add_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/edit_x12.png")));
        btn_add_update.setText(org.openide.util.NbBundle.getMessage(RaceForm.class, "RaceManager.btn_edit.text"));
        
        txt_name.setText(race.getName());
        txt_location.setText(race.getLocation());
        spn_date.setValue(race.getDate());
        spn_maxRunners.setValue(race.getMaxRunners());
    }
    
    private void addValidation() {
        ValidationGroup group = vpn_validation.getValidationGroup();
        //group.add(spn_maxRunners.getEditor(), new MaxRunnersLowerBoundValidator(this.race));
        group.add(txt_location, new CapitalValidator());
        group.add(txt_location, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(txt_name, new CapitalValidator());
        group.add(txt_name, StringValidators.REQUIRE_NON_EMPTY_STRING);

        vpn_validation.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (vpn_validation.getProblem() == null) {
                    btn_add_update.setEnabled(true);
                } else {
                    btn_add_update.setEnabled(false);
                }
            }
        });
    }
     
    private void updateTable(){
        Utils.lockCursor(this);
        spn_maxRunners.setModel(new javax.swing.SpinnerNumberModel((int)spn_maxRunners.getValue(),
                                                                   this.runnersInRace.size(),
                                                                   null,
                                                                   1));
        RunnerInRaceTableModel runnerInRaceTableModel = new RunnerInRaceTableModel(this.runnersInRace);
        tb_runners.setModel(runnerInRaceTableModel);
        TableRowSorter<RunnerInRaceTableModel> sorter = new TableRowSorter<>(runnerInRaceTableModel);
        tb_runners.setRowSorter(sorter);
        /*
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
        */
        Utils.unlockCursor(this);
    }
    
    protected void addRunners(List<Runner> runners){
        for(Runner runner : runners)
            this.runnersInRace.add(new RunnerInRace(RepositoryImp.getInstance().getRunners().indexOf(runner),
                                                    this.race == null ? RepositoryImp.getInstance().getAvailableNumRace() : this.race.getNumRace(), 
                                                    getFirstAvailableNumber(),
                                                    0, 
                                                    0));
        updateTable();
    }
    
    private int getFirstAvailableNumber(){
        List<Integer> notAvailableNumbers = new ArrayList<>();
        for(RunnerInRace runnerInRace : runnersInRace)
            notAvailableNumbers.add(runnerInRace.getNumber());
        for(int i=1; true; i++)
            if(!notAvailableNumbers.contains(i))
                return i;
    }
    
    protected int getRunnersInRaceSize(){
        return this.runnersInRace.size();
    }
    
    protected int getMaxRunnersInRace(){
        return (int) spn_maxRunners.getValue();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_runner;
    private javax.swing.JButton btn_add_update;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_remove_runner;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_location;
    private javax.swing.JLabel lbl_maxRunners;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JPanel pn_buttons;
    private javax.swing.JPanel pn_form;
    private javax.swing.JPanel pn_form_fields;
    private javax.swing.JPanel pn_runners;
    private javax.swing.JScrollPane scrpn_runners;
    private javax.swing.JSpinner spn_date;
    private javax.swing.JSpinner spn_maxRunners;
    private javax.swing.JTable tb_runners;
    private javax.swing.JTextField txt_location;
    private javax.swing.JTextField txt_name;
    private org.netbeans.validation.api.ui.swing.ValidationPanel vpn_validation;
    // End of variables declaration//GEN-END:variables
}
