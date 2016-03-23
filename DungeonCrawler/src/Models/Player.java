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
public class Player extends User{
    // <editor-fold defaultstate="collapsed" desc="Fields">
    private int gold;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Player(int id, String name, String password, int gold) {
        super(id, name, password);
        this.gold = gold;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">
    /**
     * This method allows the player to buy a hero, removing gold equal to the
     * value of the hero from the players possession and adding the hero to the
     * players heroes.
     *
     * @param hero The hero which should be bought.
     * @return Return true if the hero has been successfully bought and added to
     * the players heroes. Otherwise return false.
     */
    public boolean buyHero(Hero hero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method allows a player to switch between heroes, making the
     * specified hero the active hero.
     *
     * @param hero The hero which the player wants to play with.
     */
    public void switchHero(Hero hero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
