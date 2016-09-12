/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnectionfirstexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class DatabaseConnectionFirstExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
            // TODO code application logic here
           Connection conn = null;
        conn = GetConnection();
        
        Statement stmt = conn.createStatement(); // metodas, kuris grazina statement // rankos
        System.err.println("Sukurtas STMT");
        
        CreateTable(stmt);
        
        InsertRow(stmt);
        
        UpdateRow(stmt);
      
        DeleteSmth(stmt);
       
       ResultSet rs = stmt.executeQuery("select * from Login4 where id=12");
       while (rs.next()) {
           System.out.println(rs.getString("Username"));
           System.out.println(rs.getString("FirstName"));
           System.out.println(rs.getString("LastName"));
       }
           

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

    private static void DeleteSmth(Statement stmt) throws SQLException {
        String deleteSql = "delete from Login4 where id = 8";
        stmt.executeUpdate(deleteSql);
    }

    private static void UpdateRow(Statement stmt) throws SQLException {
        String sql = "update Login4 set FirstName = 'diena8' where FirstName = 'myOhmy'";
        stmt.executeUpdate(sql);
    }

    private static void InsertRow(Statement stmt) throws SQLException {
        String InsertRow = "insert into Login4 (UserName, Password, FirstName, LastName, Address, PostalCode)"
                + " values ('myOhmy', 'myOhmy', 'myOhmy','myOhmy',"
                + "'myOhmy', 'myOhmy')";
        stmt.executeUpdate(InsertRow);
    }
    private static void InsertUsernameAndPassw(Statement stmt) throws SQLException {
        String InsertUsernameAndPassw = "insert into Login4 (UserName, Password, FirstName, LastName, Address, PostalCode)"
                + " values ('+j.TextField1+', '+jTextField2+', 'myOhmy','myOhmy',"
                + "'myOhmy', 'myOhmy')";
        stmt.executeUpdate(InsertUsernameAndPassw);
    }
    
}
