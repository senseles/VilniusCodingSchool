/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasql.database;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javasql.model.User;

/**
 *
 * @author Mr John
 */
public class InterfaceImplementation implements NewInterface {

    @Override
    public boolean insert(User user) {
        try {
            String query = "INSERT INTO user values ('"+user.getUserName()+"', '"+user.getName1()+"', '"+user.getLastName()+"', '"+user.getPassword()+"')";
            Statement statement = (Statement) this.connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            return true;
        } catch (SQLException ex) {
        return false;
        }
    }
    
    
    
    private Connection connection;

    @Override
    public User getUser(String userName, String password) {
    
        try {
            String query = "SELECT * FROM user where username = '" + userName + "', and passwor = '" + password + "')";
            
            PreparedStatement preparedStatement = this.connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            User user = null;
            
            if(resultSet.next()) {
                user = new User();
                user.setUserName(resultSet.getString("username"));
                user.setName1(resultSet.getString("name"));
                user.setLastName(resultSet.getString("lastname"));
                user.setPassword(resultSet.getString("password"));
            }
           preparedStatement.close();
           resultSet.close();
            return user;
        } catch (SQLException ex) {
        return null;
        }
    }

   
    
    public void openConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
            System.out.println("Connection successfully with database server");
        }
        catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void openControllor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
