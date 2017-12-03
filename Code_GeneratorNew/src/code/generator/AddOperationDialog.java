/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.generator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class AddOperationDialog extends javax.swing.JDialog {

    /**
     * Creates new form AddOperationDialog
     */
    public AddOperationDialog(javax.swing.JDialog parent, boolean modal ) {
        super(parent, modal);
        closedOK=false;
        initComponents();
       
    }
    public void setParams(String [] availableParams, int operationParams){
        this.params=availableParams;
        DefaultListModel lm=(DefaultListModel) paramList.getModel();
        for(int i=0;i<operationParams;i++){
            lm.addElement("param"+String.valueOf(i+1));
        }
        DefaultComboBoxModel mod1=new DefaultComboBoxModel();
        DefaultComboBoxModel mod2=new DefaultComboBoxModel();
        DefaultComboBoxModel mod3=new DefaultComboBoxModel();
        this.comboParamNames.setModel(mod1);
        this.comboStoring.setModel(mod3);
        for(int i=0;i<params.length;i++){
            mod1.addElement(params[i]);
            mod2.addElement(params[i]);
            mod3.addElement(params[i]);
            
        }
        mod1.addElement("Other");
        mod2.addElement("Other");
        mod3.addElement("Other");
        
    }
    public String[] getParams(){
        String [] params;
        int size=0;
        DefaultListModel lm=(DefaultListModel)paramList.getModel();
        params= new String[lm.getSize()];
        size=lm.getSize();
        for(int i=0;i<size;i++){
            if(lm.getElementAt(i).equals("Other")){
                params[i]=otherParamName.getText();
            }else{
                params[i] = (String)lm.getElementAt(i);
            }
            
        }
        return params;
        /*String paramsSelected[]=new String[3];
        String selectedValue1, selectedValue2;
        selectedValue1=String.valueOf(comboParam1.getSelectedItem());
        selectedValue2=String.valueOf(comboParamNames.getSelectedItem());
        
        if(selectedValue1.equals("Other")){
              paramsSelected[0]=this.other1.getText();
        }else{
              paramsSelected[0]=selectedValue1;
        }
      
         if(selectedValue2.equals("Other")){
              paramsSelected[1]=this.other2.getText();
        }else{
              paramsSelected[1]=selectedValue2;
        }
         
           if(selectedValueStoring.equals("Other")){
              paramsSelected[2]=this.otherStoring.getText();
        }else{
              paramsSelected[2]=selectedValueStoring;
        }
        return paramsSelected;*/
    }
    public String getInitialValue(){
        return this.initialValue.getText();
    }
    public String getStoringParam(){
        String selectedStoringParam;
        selectedStoringParam=(String)comboStoring.getSelectedItem();
        if(selectedStoringParam.equals("Other")){
            selectedStoringParam=otherStoring.getText();
        }
        return selectedStoringParam;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        comboParamNames = new javax.swing.JComboBox<>();
        otherParamName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboStoring = new javax.swing.JComboBox<>();
        otherStoring = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        initialValue = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        paramList = new javax.swing.JList<>();
        setName = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Parameter  names");

        ok.setText("OK");
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                okMouseReleased(evt);
            }
        });

        jLabel4.setText("Other");

        jLabel5.setText("Storing parameter name");

        jLabel6.setText("Other");

        jLabel7.setText("Storing parameter initial value ");

        initialValue.setText("0");

        DefaultListModel lm= new DefaultListModel<String>();
        paramList.setModel(lm);
        jScrollPane1.setViewportView(paramList);

        setName.setText("Set name");
        setName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                setNameMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(otherParamName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(comboParamNames, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setName))))
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(otherStoring, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(comboStoring, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(initialValue, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboStoring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(9, 9, 9)
                        .addComponent(otherStoring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(comboParamNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(otherParamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(setName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(initialValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseReleased

        // TODO add your handling code here:
        closedOK=true;
         dispose();
    }//GEN-LAST:event_okMouseReleased

    private void setNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setNameMouseReleased
        // TODO add your handling code here:
        String newName;
        int indexSelectedParam=0;
        if(paramList.isSelectionEmpty()){
             JOptionPane.showMessageDialog(this, "You must choose a parameter from the list");
             return;
        }
        indexSelectedParam = paramList.getSelectedIndex();
        DefaultListModel lm = (DefaultListModel)paramList.getModel();
        if(comboParamNames.getSelectedItem().equals("Other")){
            newName=otherParamName.getText();
        }else{
           newName=(String)comboParamNames.getSelectedItem(); 
        }
        
        lm.setElementAt(newName, indexSelectedParam);
        
    }//GEN-LAST:event_setNameMouseReleased
    public boolean getClosedOK(){
        return closedOK;
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddOperationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOperationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOperationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOperationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddOperationDialog dialog = new AddOperationDialog(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    private String params[];
    private boolean closedOK;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboParamNames;
    private javax.swing.JComboBox<String> comboStoring;
    private javax.swing.JTextField initialValue;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ok;
    private javax.swing.JTextField otherParamName;
    private javax.swing.JTextField otherStoring;
    private javax.swing.JList<String> paramList;
    private javax.swing.JButton setName;
    // End of variables declaration//GEN-END:variables
}