/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasql.database;

import javasql.model.User;

/**
 *
 * @author Mr John
 */
public interface NewInterface {
    
    boolean insert(User user);
    
    User getUser(String userName, String password);
    
}
