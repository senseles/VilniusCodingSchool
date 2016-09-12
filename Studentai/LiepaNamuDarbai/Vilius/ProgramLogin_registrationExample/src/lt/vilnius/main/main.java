/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vilnius.main;

import java.sql.Statement;
import lt.vilnius.ui.LoginPageUI;

/**
 *
 * @author vilius
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Statement stmt = null;
        new LoginPageUI(stmt).setVisible(true);
        
        
    }
    
}
