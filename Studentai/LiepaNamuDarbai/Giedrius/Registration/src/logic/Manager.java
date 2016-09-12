/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import abstracts.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Giedrius
 */
public class Manager {


   // public User cm = new User();
    public static void createSql(Statement stmt) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS"
                + " User (Id INT AUTO_INCREMENT,"
                + "Name VARCHAR(100),"
                + "Email VARCHAR(150),"
                + "Password VARCHAR(150),"
                + "Gender VARCHAR(50),"
                + "Adress VARCHAR(150),"
                + "BirthDate VARCHAR(20),"
                + "PRIMARY KEY (id));";      
        stmt.executeUpdate(sql);
    }
    // log in
    public static int logInSql(String email, String password, Statement stmt) throws SQLException {
        String logIn = "SELECT Email, Password FROM User WHERE Email='"+email+"' and Password='"+password+"'";
        ResultSet rs = stmt.executeQuery(logIn);
        int count =0;
        while (rs.next()){
            count = count+1;
        }
        return count;
    }
    // registration
    public static void insertSql(String username, String useremail, String userpassword, String usergender, 
        Statement stmt) throws SQLException {
        String insertSql = "INSERT INTO User(Name, Email, Password, Gender) "
                + "VALUES ("
                + "'"+username+"',"
                + "'"+useremail+"',"
                + "'"+userpassword+"',"
                + "'"+usergender+"')";
        stmt.executeUpdate(insertSql);
    }
    //Update info with Birthdate abd Adress
    public static void updateSql(String date, String adress, String email, Statement stmt) throws SQLException {
        String updateSql = "UPDATE User SET BirthDate='"+date+"', Adress='"+adress+"' WHERE Email='"+email+"'";
        stmt.executeUpdate(updateSql);
    }
    //Getting data from SQL in Info page
    public static String displayAll(String email, String dataName, Statement stmt) throws SQLException {
        
        String temp = "";
        ResultSet rs = stmt.executeQuery("SELECT * FROM User WHERE Email='"+email+"'");
        while (rs.next()){
            temp = rs.getString(dataName);
        }
        return temp;
    }
    
    //BirthDay validation
    
    public static boolean isValidDate(String text) {
    if (text == null || !text.matches("\\d{4}-[01]\\d-[0-3]\\d"))
        return false;
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    df.setLenient(false);
    try {
        df.parse(text);
        return true;
    } catch (ParseException ex) {
        return false;
    }
}
    
    //Email validation
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,10}$", Pattern.CASE_INSENSITIVE);

    public static boolean checkEmail(String email) {
        if (email.equals("example@gmail.com")) {
            return false;
        }
        else{
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
        return matcher.find();
        }
    }
     public static int emailDubSearch(String email, Statement stmt) throws SQLException {
        String dbEmail = "SELECT Email FROM User WHERE Email='"+email+"'";
        ResultSet rs = stmt.executeQuery(dbEmail);
        int count =0;
        while (rs.next()){
            count = count+1;
        }
        return count;
    }
    //Password validation
    private static final Pattern VALID_PASSWORD_REGEX = 
    Pattern.compile("^(?=.*[a-z])(?=\\S+$).{1,}$", Pattern.CASE_INSENSITIVE);

    public static boolean checkPass(String pass) {
        Matcher matcher = VALID_PASSWORD_REGEX .matcher(pass);
        return matcher.find();
    }
}
