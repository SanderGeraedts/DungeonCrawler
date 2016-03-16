/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Maxime
 */
public class User
{
    // Fields
    private String username;
    private String password;
    private static User user;
    
    // Constructor
    public User()
    {
        
    }
    
    public static void register(String username, String password)
    {
        
    }
    
    // Methods
    public static User login(String username, String password) 
    {
        return user;
    }
    
    public void logout()
    {
        
    }
}
