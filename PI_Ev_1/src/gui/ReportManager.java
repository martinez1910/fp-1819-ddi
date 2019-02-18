/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import logic.obj.Race;
import logic.persistance.RepositoryImp;
import logic.report.IReportRepository;
import logic.report.ReportRepositoryImp;
import util.MyUtil;

/**
 *
 * @author John Doe
 */
public class ReportManager extends javax.swing.JFrame {
    
    private static ReportManager instance = null;
    private File file;

    private ReportManager() {
        initComponents();
        myInitComponents();
    }
    
    public static ReportManager getInstance(){
        if(instance == null)
            instance = new ReportManager();
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

        pn_main = new javax.swing.JPanel();
        lbl_report = new javax.swing.JLabel();
        cb_report = new javax.swing.JComboBox<>();
        lbl_directory = new javax.swing.JLabel();
        btn_directory = new javax.swing.JButton();
        txt_directory = new javax.swing.JTextField();
        pn_buttons = new javax.swing.JPanel();
        btn_export = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(ReportManager.class, "ReportManager.title")); // NOI18N
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/gui/img/report_x16.png")).getImage());
        setResizable(false);

        lbl_report.setText(org.openide.util.NbBundle.getMessage(ReportManager.class, "ReportManager.lbl_report.text")); // NOI18N

        cb_report.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informe 1 - Carreras sin finalizar", "Informe 2 - Informe de carrera", "Informe 3 - Clasificación de carrera", "Informe 4 - Informe de corredor" }));

        lbl_directory.setText(org.openide.util.NbBundle.getMessage(ReportManager.class, "ReportManager.lbl_directory.text")); // NOI18N

        btn_directory.setMnemonic('e');
        btn_directory.setText(org.openide.util.NbBundle.getMessage(ReportManager.class, "ReportManager.btn_directory.text")); // NOI18N
        btn_directory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_directoryActionPerformed(evt);
            }
        });

        txt_directory.setEditable(false);
        txt_directory.setText(org.openide.util.NbBundle.getMessage(ReportManager.class, "ReportManager.txt_directory.text")); // NOI18N

        javax.swing.GroupLayout pn_mainLayout = new javax.swing.GroupLayout(pn_main);
        pn_main.setLayout(pn_mainLayout);
        pn_mainLayout.setHorizontalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_directory)
                    .addComponent(lbl_report))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_mainLayout.createSequentialGroup()
                        .addComponent(txt_directory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_directory))
                    .addComponent(cb_report, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pn_mainLayout.setVerticalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_report)
                    .addComponent(cb_report, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_directory)
                    .addComponent(btn_directory)
                    .addComponent(txt_directory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_buttons.setLayout(new java.awt.GridLayout(1, 4, 18, 0));

        btn_export.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/report_x16.png"))); // NOI18N
        btn_export.setMnemonic('x');
        btn_export.setText(org.openide.util.NbBundle.getMessage(ReportManager.class, "ReportManager.btn_export.text")); // NOI18N
        btn_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportActionPerformed(evt);
            }
        });
        pn_buttons.add(btn_export);

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/back_x12.png"))); // NOI18N
        btn_back.setMnemonic('v');
        btn_back.setText(org.openide.util.NbBundle.getMessage(ReportManager.class, "ReportManager.btn_back.text")); // NOI18N
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
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(pn_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(pn_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pn_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportActionPerformed
        if(this.file == null || !this.file.exists()){
            Utils.messageInformationSelectReport(this);
            return;
        }
        
        IReportRepository reportRepository = new ReportRepositoryImp(RepositoryImp.getInstance());
        String path;
        boolean success = false;
        
        try{
            path = this.file.getCanonicalPath();
        }catch(IOException e){
            Utils.messageErrorReport(this);
            return;
        }
        
        switch(cb_report.getSelectedIndex()){
            case 0:
                success = reportRepository.getReport1(path);
                break;
            case 1:
                Race race = askRace();
                if(race == null){
                    Utils.messageErrorReportNoRace(this);
                    return;
                } 
                    
                success = reportRepository.getReport2(race, path);
                break;
            case 2:
                Race race2 = askFinishedRace();
                if(race2 == null){
                    Utils.messageErrorReportNoRace(this);
                    return;
                } 
                
                success = reportRepository.getReport3(race2, path);
                break;
            case 3:
                success = reportRepository.getReport4(path);
                break;
            default:
                MyUtil.unreachableCode("Mustn't reach default case");
        }
        
        if(success)
            Utils.messageInformationReport(this);
        else
            Utils.messageErrorReport(this);
    }//GEN-LAST:event_btn_exportActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_directoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_directoryActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
            this.file = fc.getSelectedFile();
        
        txt_directory.setText(this.file.getPath());
    }//GEN-LAST:event_btn_directoryActionPerformed


    private void myInitComponents(){
        lbl_report.setDisplayedMnemonic('i');
        lbl_report.setLabelFor(cb_report);
        lbl_directory.setDisplayedMnemonic('c');
        lbl_directory.setLabelFor(txt_directory);
    }
    
    private Race askRace(){
        int numRace = -1;
        String str = JOptionPane.showInputDialog(this, "Inserte el número de la carrera:", "Informe", JOptionPane.PLAIN_MESSAGE);
        try{
            numRace = Integer.parseInt(str);
        }catch(NumberFormatException e){
            return null;
        }
        
        return RepositoryImp.getInstance().getRace(numRace);
    }
    
    private Race askFinishedRace(){
        int numRace = -1;
        String str = JOptionPane.showInputDialog(this, "Inserte el número de la carrera finalizada:", "Informe", JOptionPane.PLAIN_MESSAGE);
        try{
            numRace = Integer.parseInt(str);
        }catch(NumberFormatException e){
            return null;
        }
        
        return RepositoryImp.getInstance().getFinishedRace(numRace);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_directory;
    private javax.swing.JButton btn_export;
    private javax.swing.JComboBox<String> cb_report;
    private javax.swing.JLabel lbl_directory;
    private javax.swing.JLabel lbl_report;
    private javax.swing.JPanel pn_buttons;
    private javax.swing.JPanel pn_main;
    private javax.swing.JTextField txt_directory;
    // End of variables declaration//GEN-END:variables
}
