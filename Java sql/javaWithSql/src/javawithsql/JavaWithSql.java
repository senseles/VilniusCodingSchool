/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javawithsql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class JavaWithSql {
   private Connection connect = null;
   private Statement statement = null;
   private PreparedStatement preparedStatement = null;
   private ResultSet resultSet = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException {
        // TODO code application logic here
    try {
      // this will load the MySQL driver, each DB has its own driver
      Class.forName("com.mysql.jdbc.Driver");
      // setup the connection with the DB.
      connect = DriverManager
          .getConnection("jdbc:mysql://localhost/feedback?"
              + "user=sqluser&password=sqluserpw");

      // statements allow to issue SQL queries to the database
      statement = connect.createStatement();
      // resultSet gets the result of the SQL query
      resultSet = statement
          .executeQuery("select * from FEEDBACK.COMMENTS");
      writeResultSet(resultSet);

      // preparedStatements can use variables and are more efficient
      preparedStatement = connect
          .prepareStatement("insert into  FEEDBACK.COMMENTS values (default, ?, ?, ?, ? , ?, ?)");
      // "myuser, webpage, datum, summary, COMMENTS from FEEDBACK.COMMENTS");
      // parameters start with 1
      preparedStatement.setString(1, "Test");
      preparedStatement.setString(2, "TestEmail");
      preparedStatement.setString(3, "TestWebpage");
      preparedStatement.setDate(4, new java.sql.Date(2009, 12, 11));
      preparedStatement.setString(5, "TestSummary");
      preparedStatement.setString(6, "TestComment");
      preparedStatement.executeUpdate();

      preparedStatement = connect
          .prepareStatement("SELECT myuser, webpage, datum, summary, COMMENTS from FEEDBACK.COMMENTS");
      resultSet = preparedStatement.executeQuery();
      writeResultSet(resultSet);

      // remove again the insert comment
      preparedStatement = connect
      .prepareStatement("delete from FEEDBACK.COMMENTS where myuser= ? ; ");
      preparedStatement.setString(1, "Test");
      preparedStatement.executeUpdate();
      
      resultSet = statement
      .executeQuery("select * from FEEDBACK.COMMENTS");
      writeMetaData(resultSet);
      
    } catch (Exception e) {
      throw e;
    } finally {
      close(
    }
    