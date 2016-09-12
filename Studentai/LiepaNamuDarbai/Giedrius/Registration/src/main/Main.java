/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static abstracts.DbConnection.getStatement;
import gui.Index;
import java.sql.SQLException;
import java.sql.Statement;
import static logic.Manager.createSql;

/**
 *
 * @author Giedrius
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new Index().setVisible(true);
        Statement stmt = getStatement();

        createSql(stmt);
        
    }
}
