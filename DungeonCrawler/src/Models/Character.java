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
public class Character {
    // <editor-fold defaultstate="collapsed" desc="Fields">
    // ...
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Character() {

    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">
    /**
     * This method uses a skill to attack, putting the skill on a cooldown and
     * dealing damage to the enemies hit by the attack.
     *
     * @param skill The skill used to attack.
     */
    public void attack(Skill skill) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method moves a player to a specified tile.
     *
     * @param tile The tile to which the player wants to move.
     * @return Return true if the player has been successfully moved to the
     * specified tile. Otherwise return false.
     */
    public boolean move(Tile tile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method applies a specified effect to the player
     *
     * @param effect The effect which should be applied to the player.
     */
    public void applyEffect(Effect effect) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
