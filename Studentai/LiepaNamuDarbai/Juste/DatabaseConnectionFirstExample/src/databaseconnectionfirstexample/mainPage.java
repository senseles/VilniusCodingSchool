/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnectionfirstexample;

import com.sun.rowset.internal.InsertRow;
import static databaseconnectionfirstexample.DatabaseConnectionFirstExample.GetConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Justina
 */

public class mainPage extends javax.swing.JFrame {
  

        
    /**
     * Creates new form mainPage
     */
    public mainPage() throws ClassNotFoundException {
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
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Prisijungti");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registruotis");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField3.setText("Prisijungimo vardas");

        jTextField4.setText("Slaptazodis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addGap(28, 28, 28)))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addComponent(jTextField2))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try {
            // TODO add your handling code here:
            Connection conn = GetConnection();
            
       Statement stmt = conn.createStatement();
        System.err.println("Sukurtas stmt");
        
        ResultSet rs = stmt.executeQuery("select * from Login4 where UserName='"+jTextField1.getText()+"' && Password='"+jTextField2.getText()+"'");
       if (rs.next()){
           JOptionPane.showMessageDialog(null, "Prisiloginote");
        this.setVisible(false);
        new ReviewForm ().setVisible(true);
// new PreviewPage().setVisible(true);
    
       }
       else {
           JOptionPane.showMessageDialog(null, "Uzpildykite registracijos forma");
           this.setVisible(false);
           new RegisterForm().setVisible(true);
       }
       /*rs = stmt.executeQuery("select * from Login4 UserName=?");
       while (rs.next()){
      String Username = rs.getString("UserName");
       }
       if (rs.getString("Username").equals(jTextField1.getText()));
       {
       JOptionPane.showMessageDialog(null, "Toks vartotojas ja egzistuoja. Sugalvokite kita varda");
       this.setVisible(true);
       }*/
               }
        catch (SQLException ex) {
            Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        //new mainPage().setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
     String username = jTextField1.getText();
     
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        String password = jTextField2.getText();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
   
        this.setVisible(false);
    new RegisterForm().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new mainPage().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
     private void insertUserData(String username,String fistName, Statement stmt) throws SQLException {
        String insertSql = "INSERT INTO Login(UserName, Password,"
                + " FirstName, LastName, Address,"
                + " PostalCode) VALUES"
                + " ("
                + "'"+username+"',"
                + "'rootSkirtasKazkam',"
                + "'"+fistName+"',"
                + "'rootSkirtasKazkam',"
                + "'rootSkirtasKazkam',"
                + "'rootSkirtasKazkam'"
                + ")";// kintamojo deklaravimas
        stmt.executeUpdate(insertSql);//prsyciau ikelt i mysql
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables


    
    private static void CreateTable(Statement stmt) throws SQLException {
        String PirmasStringas = "CREATE TABLE IF NOT EXISTS Login4 (id INT AUTO_INCREMENT,"
                + "UserName VARCHAR(100),"
                + "Password VARCHAR(100),"
                + "FirstName VARCHAR(50),"
                + "LastName VARCHAR(50),"
                + "Address VARCHAR(150),"
                + "PostalCode Varchar (50),"
                + "BirthDate Date,"
                + "PRIMARY KEY (id));";
        stmt.executeUpdate(PirmasStringas);
    }
    
    public static Connection GetConnection() throws ClassNotFoundException, SQLException {
        Connection conn;
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "classicmodels";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "?user=root";
        String password = "";
        conn = (Connection) DriverManager.getConnection(url + dbName+userName); // "tunelis"
        System.err.println("Connected o database");
        return conn;
    }
      public void InsertRow(String username, String password, Statement stmt) throws SQLException {
        String InsertRow = "insert into Login4 (UserName, Password, FirstName, LastName, Address, PostalCode)"
                + " values ('"+username+"', '"+password+"', 'myOhmy','myOhmy',"
                + "'myOhmy', 'myOhmy')";
        stmt.executeUpdate(InsertRow);
    }

    
}
