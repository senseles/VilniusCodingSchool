/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author romuxaz
 */
public class MainPage extends javax.swing.JFrame {

    double skaicius = 0.0;
    double rezultatas = 0.0;
    char veiksmas;

    /**
     * Creates new form mainPage
     */
    public MainPage() {
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

        jTextField1 = new javax.swing.JTextField();
        tekstoLangelis3 = new javax.swing.JTextField();
        tekstoLangelis2 = new javax.swing.JTextField();
        mygtukas1 = new javax.swing.JButton();
        mygtukas2 = new javax.swing.JButton();
        mygtukasLygu = new javax.swing.JButton();
        mygtukasPlius = new javax.swing.JButton();
        mygtukas3 = new javax.swing.JButton();
        mygtukas5 = new javax.swing.JButton();
        mygtukas4 = new javax.swing.JButton();
        mygtukas8 = new javax.swing.JButton();
        mygtukas7 = new javax.swing.JButton();
        mygtukas9 = new javax.swing.JButton();
        mygtukas6 = new javax.swing.JButton();
        mygtukas0 = new javax.swing.JButton();
        mygtukasC = new javax.swing.JButton();
        mygtukasKablelis = new javax.swing.JButton();
        mygtukasDalinti = new javax.swing.JButton();
        mygtukasMinus = new javax.swing.JButton();
        mygtukasKart = new javax.swing.JButton();
        tekstoLangelis = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        tekstoLangelis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tekstoLangelis2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Academy Engraved LET", 1, 12)); // NOI18N
        setForeground(java.awt.Color.lightGray);

        mygtukas1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukas1.setText("1");
        mygtukas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukas1ActionPerformed(evt);
            }
        });

        mygtukas2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukas2.setText("2");
        mygtukas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukas2ActionPerformed(evt);
            }
        });

        mygtukasLygu.setBackground(new java.awt.Color(255, 204, 0));
        mygtukasLygu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukasLygu.setText("=");
        mygtukasLygu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukasLyguActionPerformed(evt);
            }
        });

        mygtukasPlius.setBackground(new java.awt.Color(255, 204, 0));
        mygtukasPlius.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukasPlius.setText("+");
        mygtukasPlius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukasPliusActionPerformed(evt);
            }
        });

        mygtukas3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukas3.setText("3");
        mygtukas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukas3ActionPerformed(evt);
            }
        });

        mygtukas5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukas5.setText("5");
        mygtukas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukas5ActionPerformed(evt);
            }
        });

        mygtukas4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukas4.setText("4");
        mygtukas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukas4ActionPerformed(evt);
            }
        });

        mygtukas8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukas8.setText("8");
        mygtukas8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukas8ActionPerformed(evt);
            }
        });

        mygtukas7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukas7.setText("7");
        mygtukas7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukas7ActionPerformed(evt);
            }
        });

        mygtukas9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukas9.setText("9");
        mygtukas9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukas9ActionPerformed(evt);
            }
        });

        mygtukas6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukas6.setText("6");
        mygtukas6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukas6ActionPerformed(evt);
            }
        });

        mygtukas0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukas0.setText("0");
        mygtukas0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukas0ActionPerformed(evt);
            }
        });

        mygtukasC.setBackground(new java.awt.Color(255, 153, 153));
        mygtukasC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukasC.setText("C");
        mygtukasC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukasCActionPerformed(evt);
            }
        });

        mygtukasKablelis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukasKablelis.setText(".");
        mygtukasKablelis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukasKablelisActionPerformed(evt);
            }
        });

        mygtukasDalinti.setBackground(new java.awt.Color(255, 204, 0));
        mygtukasDalinti.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukasDalinti.setText("/");
        mygtukasDalinti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukasDalintiActionPerformed(evt);
            }
        });

        mygtukasMinus.setBackground(new java.awt.Color(255, 204, 0));
        mygtukasMinus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukasMinus.setText("-");
        mygtukasMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukasMinusActionPerformed(evt);
            }
        });

        mygtukasKart.setBackground(new java.awt.Color(255, 204, 0));
        mygtukasKart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mygtukasKart.setText("*");
        mygtukasKart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mygtukasKartActionPerformed(evt);
            }
        });

        tekstoLangelis.setEditable(false);
        tekstoLangelis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tekstoLangelis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tekstoLangelisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mygtukasC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mygtukas0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(mygtukas1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mygtukas2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(mygtukas4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mygtukas5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mygtukas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mygtukas6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mygtukasKablelis, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mygtukasLygu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mygtukasMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mygtukasPlius, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mygtukas7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mygtukas8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mygtukas9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tekstoLangelis, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mygtukasDalinti, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mygtukasKart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mygtukasDalinti, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mygtukas9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mygtukasKart, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tekstoLangelis, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mygtukas7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mygtukas8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mygtukas6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mygtukasMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mygtukas3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mygtukasPlius, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mygtukasLygu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mygtukasKablelis, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mygtukas4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mygtukas5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mygtukas2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mygtukas1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mygtukas0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mygtukasC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mygtukas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukas2ActionPerformed
        String mygtuko2Tekstas = tekstoLangelis.getText() + mygtukas2.getText(); // kad isgaut teksta is mygtuko paspaudimo - mygtukas2.getText()
        tekstoLangelis.setText(mygtuko2Tekstas);                        //kad isgaut teksta is laukelio - tekstoLangelis.getText()
                                                                // juos du sudedam, ir tada mums leis rasyti po kelis tuos pacius skaiciu, o ne po viena

    }//GEN-LAST:event_mygtukas2ActionPerformed

    private void mygtukas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukas1ActionPerformed
        String mygtuko1Tekstas = tekstoLangelis.getText() + mygtukas1.getText();
        tekstoLangelis.setText(mygtuko1Tekstas);
    }//GEN-LAST:event_mygtukas1ActionPerformed
    
    private void gautiVeiksma(String mygtukoTextas) {
        try {
        veiksmas = mygtukoTextas.charAt(0); // bandomas suzinoti koks yra pirmasis stringo zenklas (+-*/)
        skaicius = skaicius + Double.parseDouble(tekstoLangelis.getText());
        tekstoLangelis.setText("");
        } catch (Exception e){      // cia kad nemestu klaidos, kai spaudziami mygtukai +-*/ po kelis kartus is eiles
            initComponents();
        }
    }
    
    private void mygtukasPliusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukasPliusActionPerformed
        String mygtukoTekstas = mygtukasPlius.getText();
        gautiVeiksma(mygtukoTekstas);
    }//GEN-LAST:event_mygtukasPliusActionPerformed

    

    private void mygtukasLyguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukasLyguActionPerformed
        
       try {
        switch (veiksmas) {     // kadangi visi skaiciai langelyje yra stringai, tai turim perverst juos i double tipa
            case '+':
                rezultatas = skaicius + Double.parseDouble(tekstoLangelis.getText());
                break;
            case '-':
                rezultatas = skaicius - Double.parseDouble(tekstoLangelis.getText());
                break;
            case '*':
                rezultatas = skaicius * Double.parseDouble(tekstoLangelis.getText());
                break;
            case '/':
                rezultatas = skaicius / Double.parseDouble(tekstoLangelis.getText());
                break;
            }
        } catch (Exception e){  
            initComponents();   // cia jeigu netycia juzeris nepaspaustu nereikalingo mygtuko(lygu), tada nuresetintu viska
        }
        
        tekstoLangelis.setText(Double.toString(rezultatas));  // graziname tipa i stringa, kad rodytu langelyje;
        skaicius = 0;      
    }//GEN-LAST:event_mygtukasLyguActionPerformed

    private void mygtukas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukas3ActionPerformed
        String mygtuko3Tekstas = tekstoLangelis.getText() + mygtukas3.getText();
        tekstoLangelis.setText(mygtuko3Tekstas);
    }//GEN-LAST:event_mygtukas3ActionPerformed

    private void tekstoLangelisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tekstoLangelisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tekstoLangelisActionPerformed

    private void mygtukas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukas4ActionPerformed
        String mygtuko4Tekstas = tekstoLangelis.getText() + mygtukas4.getText();
        tekstoLangelis.setText(mygtuko4Tekstas);
    }//GEN-LAST:event_mygtukas4ActionPerformed

    private void mygtukas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukas5ActionPerformed
        String mygtuko5Tekstas = tekstoLangelis.getText() + mygtukas5.getText();
        tekstoLangelis.setText(mygtuko5Tekstas);
    }//GEN-LAST:event_mygtukas5ActionPerformed

    private void mygtukas6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukas6ActionPerformed
        String mygtuko6Tekstas = tekstoLangelis.getText() + mygtukas6.getText();
        tekstoLangelis.setText(mygtuko6Tekstas);
    }//GEN-LAST:event_mygtukas6ActionPerformed

    private void mygtukas7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukas7ActionPerformed
        String mygtuko7Tekstas = tekstoLangelis.getText() + mygtukas7.getText();
        tekstoLangelis.setText(mygtuko7Tekstas);
    }//GEN-LAST:event_mygtukas7ActionPerformed

    private void mygtukas8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukas8ActionPerformed
        String mygtuko8Tekstas = tekstoLangelis.getText() + mygtukas8.getText();
        tekstoLangelis.setText(mygtuko8Tekstas);
    }//GEN-LAST:event_mygtukas8ActionPerformed

    private void mygtukas9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukas9ActionPerformed
        String mygtuko9Tekstas = tekstoLangelis.getText() + mygtukas9.getText();
        tekstoLangelis.setText(mygtuko9Tekstas);
    }//GEN-LAST:event_mygtukas9ActionPerformed

    private void mygtukas0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukas0ActionPerformed
        String mygtuko0Tekstas = tekstoLangelis.getText() + mygtukas0.getText();
        tekstoLangelis.setText(mygtuko0Tekstas);
    }//GEN-LAST:event_mygtukas0ActionPerformed

    private void mygtukasCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukasCActionPerformed
        initComponents(); // viskas prasideda is pradzios, nusiresetina
    }//GEN-LAST:event_mygtukasCActionPerformed

    private void mygtukasKablelisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukasKablelisActionPerformed
        String mygtukoKablelisTekstas = tekstoLangelis.getText() + mygtukasKablelis.getText();
        tekstoLangelis.setText(mygtukoKablelisTekstas);
    }//GEN-LAST:event_mygtukasKablelisActionPerformed

    private void mygtukasMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukasMinusActionPerformed
        String mygtukoTekstas = mygtukasMinus.getText();
        gautiVeiksma(mygtukoTekstas);
    }//GEN-LAST:event_mygtukasMinusActionPerformed

    private void mygtukasKartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukasKartActionPerformed
        String mygtukoTekstas = mygtukasKart.getText();
        gautiVeiksma(mygtukoTekstas);
    }//GEN-LAST:event_mygtukasKartActionPerformed

    private void mygtukasDalintiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mygtukasDalintiActionPerformed
        String mygtukoTekstas = mygtukasDalinti.getText();
        gautiVeiksma(mygtukoTekstas);
    }//GEN-LAST:event_mygtukasDalintiActionPerformed

    private void tekstoLangelis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tekstoLangelis2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tekstoLangelis2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton mygtukas0;
    private javax.swing.JButton mygtukas1;
    private javax.swing.JButton mygtukas2;
    private javax.swing.JButton mygtukas3;
    private javax.swing.JButton mygtukas4;
    private javax.swing.JButton mygtukas5;
    private javax.swing.JButton mygtukas6;
    private javax.swing.JButton mygtukas7;
    private javax.swing.JButton mygtukas8;
    private javax.swing.JButton mygtukas9;
    private javax.swing.JButton mygtukasC;
    private javax.swing.JButton mygtukasDalinti;
    private javax.swing.JButton mygtukasKablelis;
    private javax.swing.JButton mygtukasKart;
    private javax.swing.JButton mygtukasLygu;
    private javax.swing.JButton mygtukasMinus;
    private javax.swing.JButton mygtukasPlius;
    private javax.swing.JTextField tekstoLangelis;
    private javax.swing.JTextField tekstoLangelis2;
    private javax.swing.JTextField tekstoLangelis3;
    // End of variables declaration//GEN-END:variables
}
