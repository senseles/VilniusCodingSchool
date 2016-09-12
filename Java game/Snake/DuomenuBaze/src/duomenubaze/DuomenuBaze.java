/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duomenubaze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class DuomenuBaze {

    DuomenuBaze() throws ClassNotFoundException, SQLException {
         init();
        //example("karamba");
    }
 //   String name = "Vardenis";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new DuomenuBaze();

    }

    public void init() throws ClassNotFoundException, SQLException {
        Connection conn = Connection();
        Statement stmt = (Statement) conn.createStatement();
        System.out.println("susikure stmt");
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Login (id INT NOT NULL AUTO_INCREMENT,"
                + "UserName VARCHAR(100),"
                + "Password VARCHAR(100),"
                + "FirstNAme VARCHAR(50),"
                + "LastName VARCHAR(50),"
                + "Address VARCHAR(150),"
                + "PostalCode Varchar (50),"
                + "BirthDate Date,"
                + " PRIMARY KEY (id));");
        System.out.println("Sukurta Lenta Login");
        insertMethod(stmt, "Mark", "Vardenis", "root1", "2016-05-26", "vilnius", "45454", "root");
        updateAddress(stmt, "lijfklfsjkjk", "1");
        getUser("karamba", stmt);
    }

    void getUser(String username, Statement stmt) throws SQLException, ClassNotFoundException {

        String sql = "SELECT * FROM `login` where `UserName`='" + username + "'";
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();

        System.out.print("Naudotojas ");
        System.out.println(rs.getRow());
        String naudotojoVardas = rs.getString("FirstNAme");
        System.out.print(rs.getString("FirstNAme") + " ,");
        System.out.print(rs.getString("LastName") + " ,");
        System.out.print(rs.getString("UserName") + " ,");
        System.out.print(rs.getString("Password") + " ,");
        System.out.print(rs.getString("BirthDate") + " ,");
        System.out.print(rs.getString("Address") + " ,");
        System.out.println(rs.getString("PostalCode") + " ,");

    }

    private void updateAddress(Statement stmt, String address, String userId) throws SQLException {
        String sql = "UPDATE login SET Address =" + "'" + address + "'" + " where address = '" + userId + "'";
        stmt.executeUpdate(sql);
        System.out.println("padarytas update");
    }

    private void insertMethod(Statement stmt, String FirstName, String LastName, String UserName, String Date, String City, String PostalCode, String password) throws SQLException {
        String sql = "INSERT INTO `login`(`UserName`, `Password`,"
                + " `FirstNAme`, `LastName`, `Address`,"
                + " `PostalCode`, `BirthDate`) VALUES"
                + " ("
                + "'" + UserName + "',"
                + "'" + password + "',"
                + "'" + FirstName + "',"
                + "'" + LastName + "',"
                + "'" + City + "',"
                + "'" + PostalCode + "',"
                + "'" + Date + "')";

        stmt.executeUpdate(sql);
        System.out.println("Duomenys Insertinti");
    }

    private Connection Connection() throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Connection conn = null;
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=root&password=");
        System.out.println("Connected o database2");
        return conn;
    }

}
