/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasql.helper;

import javasql.database.InterfaceImplementation;
import javasql.model.User;

/**
 *
 * @author Mr John
 */
public class Controller {
    
    private static Controller controller;
    private final InterfaceImplementation interfaceImplementation;
    
    private Controller() {
        this.interfaceImplementation = new InterfaceImplementation();
        this.interfaceImplementation.openConnection();
        
        
    }
    
    public static Controller getController() {
       if(controller == null) { 
          controller = new Controller(); 
    }
    return controller;
    
}

    public boolean signup(User user) {
        return this.interfaceImplementation.insert(user);
    }

    public User login(String username, String password) {
       return this.interfaceImplementation.getUser(username, password);
    
    }
    
}
