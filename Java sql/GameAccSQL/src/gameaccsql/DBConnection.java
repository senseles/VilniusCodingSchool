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
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2305.840119306592!2d25.275911215400235!3d54.69484108055067!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x46dd940472bbfdcd%3A0x6aacb2bb753c2a02!2sKonstitucijos+pr.+12%2C+Vilnius+09309!5e0!3m2!1slt!2slt!4v1459844325267" width="540" height="260" frameborder="0" style="border:0" allowfullscreen></iframe>("Sukurta Lenta Login");
        return stmt;
    }

    private Connection connectTODB() throws ClassNotFoundException, SQLException {
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
