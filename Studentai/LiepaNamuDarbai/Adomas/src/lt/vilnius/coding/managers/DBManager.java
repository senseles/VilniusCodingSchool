/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vilnius.coding.managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Adam
 */
public class DBManager {

    public Statement stmt = null;

    private static Connection dbConnect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7132255";
        String userName = "sql7132255";
        String password = "WI2a565emg";
        //System.err.println("Connected to DB");
        return (Connection) DriverManager.getConnection(url, userName, password);
    }

    private static Statement getStatement() throws SQLException, ClassNotFoundException {
        return dbConnect().createStatement();
    }

    public void connection() throws SQLException, ClassNotFoundException {
        stmt = getStatement();
    }

}
