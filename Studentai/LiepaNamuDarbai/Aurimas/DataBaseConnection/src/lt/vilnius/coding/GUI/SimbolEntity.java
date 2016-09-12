/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vilnius.coding.GUI;

/**
 *
 * @author Aurimas
 */
public class SimbolEntity {
    static String UserName = null;
          static String Password = null; 
          static String FirstName = null; 
          static String LastName = null; 
          static String BirthDay = null;
          static String Sex = null; 

    public SimbolEntity() {
    }

    public static String getBirthDay() {
        return BirthDay;
    }

    public static void setBirthDay(String BirthDay) {
        SimbolEntity.BirthDay = BirthDay;
    }

    public static String getFirstName() {
        return FirstName;
    }

    public static void setFirstName(String FirstName) {
        SimbolEntity.FirstName = FirstName;
    }

    public static String getLastName() {
        return LastName;
    }

    public static void setLastName(String LastName) {
        SimbolEntity.LastName = LastName;
    }

    public static String getPassword() {
        return Password;
    }

    public static void setPassword(String Password) {
        SimbolEntity.Password = Password;
    }

    public static String getSex() {
        return Sex;
    }

    public static void setSex(String Sex) {
        SimbolEntity.Sex = Sex;
    }

    public static String getUserName() {
        return UserName;
    }

    public static void setUserName(String UserName) {
        SimbolEntity.UserName = UserName;
    }
          
          
          
}
