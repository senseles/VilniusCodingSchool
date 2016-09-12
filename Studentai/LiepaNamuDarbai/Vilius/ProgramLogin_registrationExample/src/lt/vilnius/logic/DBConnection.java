/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vilnius.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author vilius
 */
public class DBConnection {
    public Statement getConnection() throws SQLException, ClassNotFoundException {
        Connection conn = connectTODB();
        Statement stmt = null;
        stmt = conn.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS Login (id INT not null AUTO_INCREMENT ,"
                + "UserName VARCHAR(100),"
                + "Password VARCHAR(100),"
                + "FirstName VARCHAR(50),"
                + "LastName VARCHAR(50),"
                + "Address VARCHAR(150),"
                + "PostalCode VARCHAR(150),"
                + "PRIMARY KEY (id));";
        stmt.executeUpdate(sql);
        System.out.println("Sukurta Lenta Login");
        return stmt;
    }
    private Connection connectTODB() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://8889/";
        String dbName = "test";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/test?user=root&password=");
        System.err.println("Connected o database");
        return conn;
    }
}
