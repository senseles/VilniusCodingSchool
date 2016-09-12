/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameaccsql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class dbHelper {

    Statement stmt;

    boolean isNotNull;

    public  ResultSet executeQuery(String sql) throws SQLException {
        ResultSet rs = stmt.executeQuery(sql);
        isNotNull = rs.next();
        return rs;
    }
    
    dbHelper(Statement stmt) {
        this.stmt = stmt;
    }

    public dbHelper() {
    }
}
