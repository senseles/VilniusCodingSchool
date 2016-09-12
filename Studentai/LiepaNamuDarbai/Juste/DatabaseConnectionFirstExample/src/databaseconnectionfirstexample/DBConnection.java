/*
 * To change this template, choose Tools | Templates
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
public class DBConnection {
    public Statement getConnection() throws SQLException, ClassNotFoundException { //metodas
        Connection conn = connectTODB();
        Statement stmt = null;
     
        stmt = conn.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS Login2 (id INT,"
                + "UserName VARCHAR(100),"
                + "Password VARCHAR(100),"
                + "FirstNAme VARCHAR(50),"
                + "LastName VARCHAR(50),"
                + "Address VARCHAR(150),"
                + "PostalCode Varchar (50),"
                + "BirthDate Date);";
        
     
        stmt.executeUpdate(sql);
        System.out.println("Sukurta Lenta Login2");
        
        
        return stmt;
    }
    private Connection connectTODB() throws ClassNotFoundException, SQLException { // metodas
        Connection conn = null;
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "classicmodels";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "?user=root";
        String password = "";
        conn = (Connection) DriverManager.getConnection(url + dbName+userName);
        System.err.println("Connected o database");
        return conn;
    }
}
