/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vilnius.coding.methods;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import static java.lang.String.valueOf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import lt.vilnius.coding.GUI.MainPage;
import lt.vilnius.coding.GUI.ProfileReview;
import lt.vilnius.coding.GUI.SimbolEntity;

/**
 *
 * @author Aurimas
 */
public class AllMethods {
    
    
     public static void insertUserData(String username, String pass, String firstname, String lastname, String date,String Sex, Statement stmt) throws SQLException {
        stmt.executeUpdate("INSERT INTO mydatabase(UserName, Password, FirstName, LastName, BirthDate, Sex)"
                + " VALUES "
                + "('"+ username + "','"+ pass + "', '"+ firstname + "', '"+ lastname + "', '"+ date + "', '"+ Sex + "')");
    }
    
    
    public static void creatTable(Statement stmt) throws SQLException {
        String sql111 = "CREATE TABLE IF NOT EXISTS MyDataBase (id INT AUTO_INCREMENT,"
                + "UserName VARCHAR(100),"
                + "Password VARCHAR(100),"
                + "FirstName VARCHAR(50),"
                + "LastName VARCHAR(50),"                
                + "BirthDate Date,"
                + "Sex VARCHAR(50),"
                + "PRIMARY KEY (id));";

        stmt.executeUpdate(sql111);
    }

    public static Statement getStatment() throws SQLException, ClassNotFoundException {
        Connection conn = getConection();
        Statement stmt = null;
        stmt = conn.createStatement();
        System.err.println("sukurtas stmt");
        return stmt;
    }

    public static Connection getConection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?user=root&password=");
        System.err.println("Connected to database");
        return conn;
    }
    
    public String actionPerformed(boolean checkBox, ActionEvent event) {
    String Box = null;
   // JCheckBox checkBox = (JCheckBox) event.getSource();
    if (checkBox == true) {
      Box = "MRS";
    }
    else {
    Box ="MS";
    }
    return Box;

    }
    
    
}