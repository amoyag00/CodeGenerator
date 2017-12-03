



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.generator;

import java.awt.Color;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.text.BadLocationException;

/**
 *
 * @author alex
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Interface() {
        initComponents();
        cG=new CodeGenerator();
        classCreated=false;
       // this.getContentPane().setBackground(new Color(255,160 , 66));
        //this.useOperation.setBackground(new Color(114, 198, 255));
        //this.newOperation.setBackground(new Color(114, 198, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        assign = new javax.swing.JMenuItem();
        negate = new javax.swing.JMenuItem();
        repeat = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        newOperation = new javax.swing.JButton();
        operationsL = new javax.swing.JLabel();
        useOperation = new javax.swing.JButton();
        generate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jPopupMenu1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        assign.setText("Assign");
        assign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                assignMouseReleased(evt);
            }
        });
        jPopupMenu1.add(assign);

        negate.setText("Negate");
        negate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negateActionPerformed(evt);
            }
        });
        jPopupMenu1.add(negate);

        repeat.setText("Repeat");
        repeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repeatActionPerformed(evt);
            }
        });
        jPopupMenu1.add(repeat);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Code Generator - Ingeniería del conocimiento - Alejandro Moya García");

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        textArea.setRows(5);
        textArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textAreaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(textArea);

        newOperation.setText("New operation");
        newOperation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newOperationMouseReleased(evt);
            }
        });

        operationsL.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        operationsL.setText("Operations");

        useOperation.setText("Use operation");
        useOperation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                useOperationMouseReleased(evt);
            }
        });

        generate.setText("Generate");
        generate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                generateMouseReleased(evt);
            }
        });

        DefaultListModel lm=new DefaultListModel<String>();
        lm.addElement("Addition");
        jList2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jList2.setModel(lm);
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(operationsL, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(324, 324, 324)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                            .addComponent(generate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(useOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(operationsL)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(useOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newOperationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newOperationMouseReleased
        // TODO add your handling code here:
        // Create operation:
        CreateOperationDialog dialog;
        dialog = new CreateOperationDialog(new javax.swing.JDialog(),true);
        dialog.setVisible(true);
        dialog.setLocationRelativeTo(this);
        if(dialog.getClosedOK()){
            className=dialog.getClassName();
            className=className.substring(0, 1).toUpperCase() + className.substring(1);
            textArea.setText(cG.createOperation(className, dialog.getClassType(),
                dialog.getParameterNames(),dialog.getParameterTypes(),dialog.getResultValue()));
            classCreated=true;
        }
                
       
        
        
    }//GEN-LAST:event_newOperationMouseReleased

    private void generateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseReleased
        // TODO add your handling code here:
       //Generate
       String code=textArea.getText();
       if(code.isEmpty()){
           JOptionPane.showMessageDialog(this,"You must create an operation");
           return;
       }
       cG.saveFile(className,code);
     
       
       DefaultListModel lm=(DefaultListModel) jList2.getModel();
       lm.addElement(className);
       jList2.setModel(lm);
        
       
        
    }//GEN-LAST:event_generateMouseReleased

    private void negateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negateActionPerformed
        // TODO add your handling code here:
        int init,end;
        String selectedText=textArea.getSelectedText();
        init=textArea.getSelectionStart();
        end=textArea.getSelectedText().length();
        try {
            textArea.getDocument().remove(init, end);
        } catch (BadLocationException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        textArea.insert(cG.generateNegation(selectedText), init);
        
       
    }//GEN-LAST:event_negateActionPerformed

    private void repeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repeatActionPerformed
        // TODO add your handling code here:
        //Repeat
        RepeatDialog dialog;
        dialog = new RepeatDialog(new javax.swing.JDialog(),true);
        dialog.setVisible(true);
        dialog.setLocationRelativeTo(this);
        String firstParameterName, secondParameterName,condition,times,code;
        if(dialog.getClosedOK()){
           if(dialog.getMode().equals("while")){
                firstParameterName=dialog.getFirstParameterName();
                secondParameterName=dialog.getSecondParameterName();
                condition=dialog.getCondition();
                code=cG.generateRepetitionCondition(firstParameterName,secondParameterName,condition);
            }else{
                times=dialog.getTimes();
                code=cG.generateRepetitionTimes(times);
            }
            int init,end;
            String selectedText=textArea.getSelectedText();
            init=textArea.getSelectionStart();
            end=textArea.getSelectedText().length();
            try {
                textArea.getDocument().remove(init, end);
            } catch (BadLocationException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
            textArea.insert(code+"\t"+selectedText+"\n\t\t}", init); 
        }
        
        
        
        
    }//GEN-LAST:event_repeatActionPerformed

    private void textAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAreaMousePressed
        // TODO add your handling code here:
        if(evt.isPopupTrigger()){
            if(textArea.getSelectedText()==null){
                repeat.setEnabled(false);
                negate.setEnabled(false);
                assign.setEnabled(false);
            }else{
                repeat.setEnabled(true);
                negate.setEnabled(true);
                assign.setEnabled(true);
            }
            jPopupMenu1.show(evt.getComponent(),evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_textAreaMousePressed

    private void useOperationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useOperationMouseReleased
        // TODO add your handling code here:
         AddOperationDialog dialog;
         String generatedOperation, storingParam;
         int pos;
         if(jList2.isSelectionEmpty()){
             JOptionPane.showMessageDialog(this, "You must choose an operation");
             return;
         }
         if(!classCreated){
            JOptionPane.showMessageDialog(this, "You must create an operation first");
         
             return; 
         }
        dialog = new AddOperationDialog(new javax.swing.JDialog(),true);
        dialog.setParams(cG.getAvailableParameters(),cG.getNumberOperationParams(jList2.getSelectedValue()));
        dialog.setVisible(true);
        dialog.setLocationRelativeTo(this);
        pos=textArea.getCaretPosition();
        if(dialog.getClosedOK()){
          String params[]=dialog.getParams();
          String initialValue=dialog.getInitialValue();
          storingParam=dialog.getStoringParam();
          String selectedOperation=jList2.getSelectedValue();
          textArea.insert(cG.generateOperation(selectedOperation, params,storingParam),pos);
          textArea.setText(cG.checkParameterExists(textArea.getText(),storingParam, initialValue));  
        }
        
        
       
    }//GEN-LAST:event_useOperationMouseReleased

    private void assignMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignMouseReleased
        // TODO add your handling code here:
            String code, assignedParameter, selectedText;
            int init,end=0;
            assignedParameter=JOptionPane.showInputDialog(this, "Assigned Parameter");
            if(assignedParameter!=null){
                code=textArea.getText();
                selectedText=textArea.getSelectedText();
                init=textArea.getSelectionStart();
                end=code.indexOf(';',init);
                try {
                    textArea.getDocument().remove(init, end-init);
                } catch (BadLocationException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            
                textArea.insert(selectedText+" = "+assignedParameter, init);  
            }
           
    }//GEN-LAST:event_assignMouseReleased
      
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
    private CodeGenerator cG;
    private String className;
    private boolean classCreated;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem assign;
    private javax.swing.JButton generate;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem negate;
    private javax.swing.JButton newOperation;
    private javax.swing.JLabel operationsL;
    private javax.swing.JMenuItem repeat;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton useOperation;
    // End of variables declaration//GEN-END:variables
}