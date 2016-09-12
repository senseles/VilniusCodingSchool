package lt.vilnius.coding.main;

import java.sql.SQLException;
import lt.vilnius.coding.gui.LoginPage;

/**
 *
 * @author Adam
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new LoginPage().setVisible(true);
    }

}
