/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnectionfirstexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class simpleDatabaseConnection {
    
    
     public static Statement getStatement() throws SQLException, ClassNotFoundException {
        Connection conn = getConnection();
        Statement stmt = conn.createStatement();
        System.err.println("Sukurtas stmt");
        return stmt;
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/");
        System.err.println("Connected o database");
        return conn;
    }
}
