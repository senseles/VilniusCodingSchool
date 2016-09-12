/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameaccsql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class GameAccSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        DBConnection db = new DBConnection();
        new Login(new entityPersons(new dbHelper(db.connectTODB().createStatement()))).setVisible(true);
    }
}
