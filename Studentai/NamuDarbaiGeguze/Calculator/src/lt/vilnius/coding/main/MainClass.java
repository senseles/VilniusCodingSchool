/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vilnius.coding.main;

import java.awt.Color;
import lt.vilnius.coding.gui.HelpPage;
import lt.vilnius.coding.gui.MainPage;

/**
 *
 * @author simas
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainPage mainPage = new MainPage();
        mainPage.setVisible(true);
        
        mainPage.setTitle("Calculator");
        mainPage.setBackground(Color.red);
        /*HelpPage helppage = new HelpPage ();
        helppage.setVisible(true);
        helppage.setSize(200, 200);*/
        
    }
    
}
