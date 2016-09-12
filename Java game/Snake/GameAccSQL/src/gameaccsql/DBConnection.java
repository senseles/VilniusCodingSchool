/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameaccsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class DBConnection {
    
    public Statement getConnection() throws SQLException, ClassNotFoundException {
        Connection conn = connectTODB();
        Statement stmt = null;
        stmt = conn.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS Login (id INT,"
                + "UserName VARCHAR(100),"
                + "Password VARCHAR(100),"
                + "FirstNAme VARCHAR(50),"
                + "LastName VARCHAR(50),"
                + "Address VARCHAR(150),"
                + "PostalCode Varchar (50),"
                + "BirthDate Date);";
        stmt.executeUpdate(sql);
        System.out.println("Sukurta Lenta Login");
        return stmt;
    }
    public Connection connectTODB() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "test";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        conn = (Connection) DriverManager.getConnection(url + dbName);
        System.err.println("Connected o database");
        return conn;
    }
}
