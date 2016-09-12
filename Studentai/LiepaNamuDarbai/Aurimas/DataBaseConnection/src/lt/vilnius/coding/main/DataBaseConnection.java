/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vilnius.coding.main;

import lt.vilnius.coding.GUI.MainPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import lt.vilnius.coding.methods.AllMethods;

/**
 *
 * @author Aurimas
 */
public class DataBaseConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        new MainPage().setVisible(true);

        Statement stmt = AllMethods.getStatment();

        AllMethods.creatTable(stmt);

       // insertUserData(stmt);

    }

    

}
