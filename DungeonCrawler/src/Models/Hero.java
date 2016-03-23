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
public class Hero {
    // <editor-fold defaultstate="collapsed" desc="Fields">
    // ...
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Hero() {

    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">
    /**
     * This method allows the player to pick up items, adding them to the
     * players possession.
     *
     * @param tile The tile containing the items, which should be picked up.
     * @return Return true if the items are picked up and added to the players
     * possession. Otherwise return false.
     */
    public boolean pickUpItems(Tile tile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method allows the player to buy an item, removing gold equal to the
     * value of the item from the players possession and adding the item to the
     * players possession.
     *
     * @param item The item which should be bought.
     */
    public void buyItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method allows the player to use an item, removing it from the
     * players possession and possibly applying an effect to the player
     * (depending on the type of item).
     *
     * @param item The item which should be used.
     */
    public void useItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method sells a specified item, removing it from the players
     * possession and granting that player gold equal to the value of the item.
     *
     * @param item The item which should be sold.
     */
    public void sellItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method drops a specified item, removing it from the players
     * possession.
     *
     * @param item The item which should be dropped.
     */
    public void dropItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method allows a player to attempt to flee from combat, removing the
     * player from combat. This is not guaranteed to be successful.
     */
    public void flee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
