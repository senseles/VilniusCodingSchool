/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skaiciuotuvas;

/**
 *
 * @author Mindaugas
 */
public class Calc_ui extends javax.swing.JFrame {

    private double store1 = 0;
    private double answer = 0;

    /**
     * Creates new form Calc_ui
     */
    public Calc_ui() {
        this.store1 = 0.0;
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

        btnPlus = new javax.swing.JButton();
        btnAnswer = new javax.swing.JButton();
        jDisplay = new javax.swing.JTextField();
        jNumber07 = new javax.swing.JButton();
        jNumber08 = new javax.swing.JButton();
        jNumber09 = new javax.swing.JButton();
        jNumber04 = new javax.swing.JButton();
        jNumber05 = new javax.swing.JButton();
        jNumber06 = new javax.swing.JButton();
        jNumber01 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        jNumber02 = new javax.swing.JButton();
        jNumber03 = new javax.swing.JButton();
        jNumber00 = new javax.swing.JButton();
        jClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnAnswer.setText("=");
        btnAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnswerActionPerformed(evt);
            }
        });

        jNumber07.setText("7");
        jNumber07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumber07ActionPerformed(evt);
            }
        });

        jNumber08.setText("8");
        jNumber08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumber08ActionPerformed(evt);
            }
        });

        jNumber09.setText("9");
        jNumber09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumber09ActionPerformed(evt);
            }
        });

        jNumber04.setText("4");
        jNumber04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumber04ActionPerformed(evt);
            }
        });

        jNumber05.setText("5");
        jNumber05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumber05ActionPerformed(evt);
            }
        });

        jNumber06.setText("6");
        jNumber06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumber06ActionPerformed(evt);
            }
        });

        jNumber01.setText("1");
        jNumber01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumber01ActionPerformed(evt);
            }
        });

        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        jNumber02.setText("2");
        jNumber02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumber02ActionPerformed(evt);
            }
        });

        jNumber03.setText("3");
        jNumber03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumber03ActionPerformed(evt);
            }
        });

        jNumber00.setText("0");
        jNumber00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumber00ActionPerformed(evt);
            }
        });

        jClear.setText("Clear");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDisplay, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jNumber07)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jNumber08)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNumber06)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jNumber09)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPlus)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jNumber00)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jClear))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jNumber01)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jNumber02)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jNumber03))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jNumber04)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jNumber05)
                                        .addGap(81, 81, 81)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAnswer)
                                    .addComponent(btnMinus))))
                        .addGap(96, 96, 96))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNumber07)
                    .addComponent(jNumber08)
                    .addComponent(jNumber09)
                    .addComponent(btnPlus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNumber04)
                    .addComponent(jNumber05)
                    .addComponent(jNumber06)
                    .addComponent(btnMinus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNumber01)
                    .addComponent(jNumber02)
                    .addComponent(jNumber03)
                    .addComponent(btnAnswer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNumber00)
                    .addComponent(jClear))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        store1 = store1 + Double.parseDouble(jDisplay.getText());
        jDisplay.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_btnPlusActionPerformed

    private void jNumber07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumber07ActionPerformed
        String number7 = jDisplay.getText() + jNumber07.getText();
        jDisplay.setText(number7);// TODO add your handling code here:
    }//GEN-LAST:event_jNumber07ActionPerformed

    private void jNumber08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumber08ActionPerformed
        String number8 = jDisplay.getText() + jNumber08.getText();
        jDisplay.setText(number8);// TODO add your handling code here:
    }//GEN-LAST:event_jNumber08ActionPerformed

    private void jNumber09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumber09ActionPerformed
        String number9 = jDisplay.getText() + jNumber09.getText();
        jDisplay.setText(number9);// TODO add your handling code here:
    }//GEN-LAST:event_jNumber09ActionPerformed

    private void jNumber04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumber04ActionPerformed
        String number4 = jDisplay.getText() + jNumber04.getText();
        jDisplay.setText(number4);// TODO add your handling code here:
    }//GEN-LAST:event_jNumber04ActionPerformed

    private void jNumber05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumber05ActionPerformed
        String number5 = jDisplay.getText() + jNumber05.getText();
        jDisplay.setText(number5);// TODO add your handling code here:
    }//GEN-LAST:event_jNumber05ActionPerformed

    private void jNumber06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumber06ActionPerformed
        String number6 = jDisplay.getText() + jNumber06.getText();
        jDisplay.setText(number6);// TODO add your handling code here:
    }//GEN-LAST:event_jNumber06ActionPerformed

    private void jNumber01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumber01ActionPerformed
        String number1 = jDisplay.getText() + jNumber01.getText(); //kad butu galima rasyti, ne tik 11, 111.
        jDisplay.setText(number1); //perduoda jNumbber01Text i ekrana
    }//GEN-LAST:event_jNumber01ActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        store1 = store1 - Double.parseDouble(jDisplay.getText());
        jDisplay.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_btnMinusActionPerformed

    private void jNumber02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumber02ActionPerformed
        String number2 = jDisplay.getText() + jNumber02.getText();
        jDisplay.setText(number2);
    }//GEN-LAST:event_jNumber02ActionPerformed

    private void jNumber03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumber03ActionPerformed
        String number3 = jDisplay.getText() + jNumber03.getText();
        jDisplay.setText(number3);// TODO add your handling code here:
    }//GEN-LAST:event_jNumber03ActionPerformed

    private void jNumber00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumber00ActionPerformed
        String number0 = jDisplay.getText() + jNumber00.getText();
        jDisplay.setText(number0);// TODO add your handling code here:
    }//GEN-LAST:event_jNumber00ActionPerformed

    private void btnAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnswerActionPerformed
        answer = store1 + Double.parseDouble(jDisplay.getText());
        jDisplay.setText(Double.toString(answer));// TODO add your handling code here:
        store1 = 0;
    }//GEN-LAST:event_btnAnswerActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        answer = 0;
        jDisplay.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jClearActionPerformed

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
            java.util.logging.Logger.getLogger(Calc_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc_ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnswer;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton jClear;
    private javax.swing.JTextField jDisplay;
    private javax.swing.JButton jNumber00;
    private javax.swing.JButton jNumber01;
    private javax.swing.JButton jNumber02;
    private javax.swing.JButton jNumber03;
    private javax.swing.JButton jNumber04;
    private javax.swing.JButton jNumber05;
    private javax.swing.JButton jNumber06;
    private javax.swing.JButton jNumber07;
    private javax.swing.JButton jNumber08;
    private javax.swing.JButton jNumber09;
    // End of variables declaration//GEN-END:variables
}