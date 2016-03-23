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
public class Spectator extends User {
    // <editor-fold defaultstate="collapsed" desc="Fields">
    // ...
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Spectator(int id, String name, String password) {
        super(id, name, password);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">    
    /**
     * This method allows a spectator to switch to the next player, watching
     * his/her movement and actions.
     *
     * @return Return the player to be spectated.
     */
    public Player nextPlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method allows a spectator to switch to the previous player, watching
     * his/her movement and actions.
     *
     * @return Return the player to be spectated.
     */
    public Player prevPlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
