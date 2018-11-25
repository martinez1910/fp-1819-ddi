package gui;

import java.awt.Frame;
import java.util.Date;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import logic.obj.Runner;
import logic.persistance.RepositoryImp;
import org.netbeans.validation.api.builtin.stringvalidation.CapitalValidator;
import org.netbeans.validation.api.builtin.stringvalidation.SpanishIDValidator;
import org.netbeans.validation.api.builtin.stringvalidation.SpanishPhoneNumberValidator;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;

public class RunnerForm extends javax.swing.JDialog {
    private final RunnerManager parent;
    private final Runner runner;
    /**
     * Creates new form RunnerForm (modal). It is used to add and to update a runner.
     * @param parent
     * @param runner If null adds a new runner, otherwise updates.
     */
    public RunnerForm(Frame parent, Runner runner) {
        super(parent, true);
        this.parent = (RunnerManager) parent;
        this.runner = runner;
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
        lbl_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_date = new javax.swing.JLabel();
        dpk_date = new org.jdesktop.swingx.JXDatePicker();
        lbl_address = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        lbl_phone = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        pn_buttons = new javax.swing.JPanel();
        btn_add_update = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbl_name.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_name.setText(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerForm.lbl_name.text")); // NOI18N

        txt_name.setText(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerForm.txt_name.text")); // NOI18N
        txt_name.setName(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerForm.lbl_name.text")); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        lbl_id.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_id.setText(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerForm.lbl_id.text")); // NOI18N

        txt_id.setText(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerForm.DNI/NIE.text")); // NOI18N
        txt_id.setName("DNI/NIE"); // NOI18N

        lbl_date.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_date.setText(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerForm.lbl_date.text")); // NOI18N

        dpk_date.setName("Fecha de nacimiento"); // NOI18N

        lbl_address.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_address.setText(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerForm.lbl_address.text")); // NOI18N

        txt_address.setText(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerForm.Dirección.text")); // NOI18N
        txt_address.setName("Dirección"); // NOI18N

        lbl_phone.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_phone.setText(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerForm.lbl_phone.text")); // NOI18N

        txt_phone.setText(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerForm.Teléfono.text")); // NOI18N
        txt_phone.setName("Teléfono"); // NOI18N

        javax.swing.GroupLayout pn_form_fieldsLayout = new javax.swing.GroupLayout(pn_form_fields);
        pn_form_fields.setLayout(pn_form_fieldsLayout);
        pn_form_fieldsLayout.setHorizontalGroup(
            pn_form_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_form_fieldsLayout.createSequentialGroup()
                .addGroup(pn_form_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(pn_form_fieldsLayout.createSequentialGroup()
                        .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_form_fieldsLayout.createSequentialGroup()
                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_form_fieldsLayout.createSequentialGroup()
                        .addComponent(lbl_date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpk_date, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_form_fieldsLayout.createSequentialGroup()
                        .addComponent(lbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_form_fieldsLayout.createSequentialGroup()
                        .addComponent(lbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
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
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_id))
                .addGap(18, 18, 18)
                .addGroup(pn_form_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpk_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_date))
                .addGap(18, 18, 18)
                .addGroup(pn_form_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_address))
                .addGap(18, 18, 18)
                .addGroup(pn_form_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_phone))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout pn_formLayout = new javax.swing.GroupLayout(pn_form);
        pn_form.setLayout(pn_formLayout);
        pn_formLayout.setHorizontalGroup(
            pn_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_form_fields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(vpn_validation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_formLayout.setVerticalGroup(
            pn_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_formLayout.createSequentialGroup()
                .addComponent(vpn_validation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pn_form_fields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pn_buttons.setLayout(new java.awt.GridLayout(1, 2, 18, 0));

        btn_add_update.setText(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerForm.btn_add_update.text")); // NOI18N
        btn_add_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_updateActionPerformed(evt);
            }
        });
        pn_buttons.add(btn_add_update);

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/remove_x12.png"))); // NOI18N
        btn_cancel.setText(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerForm.btn_cancel.text")); // NOI18N
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        pn_buttons.add(btn_cancel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pn_buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        String name = txt_name.getText();
        String id = txt_id.getText();
        Date dateOfBirth = dpk_date.getDate();
        String address = txt_address.getText();
        String phoneNumber = txt_phone.getText();
        Runner newRunner = new Runner(name, id, dateOfBirth, address, phoneNumber, false);
        
        if(this.runner == null){
            if(!RepositoryImp.getInstance().addRunner(newRunner)){
                Utils.messageErrorAddRunner(this);
                return;
            }
        }
        else
            RepositoryImp.getInstance().updateRunner(this.runner, newRunner);
        
        this.parent.updateTable();
        this.dispose();
    }//GEN-LAST:event_btn_add_updateActionPerformed

    private void myInitComponents() {
        if(runner == null)
            initAddRunner();
        else
            initUpdateRunner();
        
        dpk_date.getMonthView().setUpperBound(new Date());
        
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

    private void initAddRunner() {
        this.setTitle(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerManager.btn_add.text") +" Corredor");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/gui/img/add_x12.png")).getImage());
        btn_add_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/add_x12.png")));
        btn_add_update.setText(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerManager.btn_add.text"));
        
        dpk_date.setDate(new Date());
        
        btn_add_update.setEnabled(false);
    }

    private void initUpdateRunner() {
        this.setTitle(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerManager.btn_edit.text") +" Corredor");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/gui/img/edit_x12.png")).getImage());
        btn_add_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/edit_x12.png")));
        btn_add_update.setText(org.openide.util.NbBundle.getMessage(RunnerForm.class, "RunnerManager.btn_edit.text"));
        
        txt_name.setText(runner.getName());
        txt_id.setText(runner.getId());
        dpk_date.setDate(runner.getDateOfBirth());
        txt_address.setText(runner.getAddress());
        txt_phone.setText(runner.getPhoneNumber());
    }
    
     private void addValidation() {
         ValidationGroup group = vpn_validation.getValidationGroup();
         group.add(txt_phone, new SpanishPhoneNumberValidator());
         group.add(txt_phone, StringValidators.REQUIRE_NON_EMPTY_STRING);
         group.add(txt_address, StringValidators.REQUIRE_NON_EMPTY_STRING);
         dpk_date.getEditor().setName("Fecha de nacimiento");
         group.add(dpk_date.getEditor(), StringValidators.REQUIRE_NON_EMPTY_STRING);
         group.add(txt_id, new SpanishIDValidator());
         group.add(txt_id, StringValidators.REQUIRE_NON_EMPTY_STRING);
         group.add(txt_name, new CapitalValidator());
         group.add(txt_name, StringValidators.REQUIRE_NON_EMPTY_STRING);
         
         vpn_validation.addChangeListener(new ChangeListener() {
             @Override
             public void stateChanged(ChangeEvent e) {
                 if(vpn_validation.getProblem() == null)
                     btn_add_update.setEnabled(true);
                 else
                     btn_add_update.setEnabled(false);
             }
         });
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_update;
    private javax.swing.JButton btn_cancel;
    private org.jdesktop.swingx.JXDatePicker dpk_date;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JPanel pn_buttons;
    private javax.swing.JPanel pn_form;
    private javax.swing.JPanel pn_form_fields;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    private org.netbeans.validation.api.ui.swing.ValidationPanel vpn_validation;
    // End of variables declaration//GEN-END:variables
}
