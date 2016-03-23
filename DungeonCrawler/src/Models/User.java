/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Maxime & Sander
 */
public class User {

    // <editor-fold defaultstate="collapsed" desc="Fields">

    private int ID;
    private String name;

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public User(int ID, String username, String password) {
        this.ID = this.ID;
        this.name = name;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">
    /**
     * This method uses a username and password to create a user.
     *
     * @param username The username of an user (max. 32 alphanumeric
     * characters).
     * @param password The password of an user (min. 6. characters, max. 32
     * characters).
     * @return Return the user if the registration was successful.
     */
    public static User register(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method uses a username and password to log an user in.
     *
     * @param username The username of the user that wants to log in.
     * @param password The password of the user that wants to log in.
     * @return Return the user if the user was successfully logged in.
     */
    public static User login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method logs out the currently logged in user.
     */
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
