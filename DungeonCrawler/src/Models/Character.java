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
public abstract class Character {

    // <editor-fold defaultstate="collapsed" desc="Fields">
    private int id;
    private String name;
    private int health;
    private int defence;
    private int attack;
    private int currentHealth;
    private int currentTurns;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Character(int id, String name, int health, int defence, int attack, int currentHealth, int currentTurns) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.defence = defence;
        this.attack = attack;
        this.currentHealth = currentHealth;
        this.currentTurns = currentTurns;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">  
    /**
     * This method uses a skill to attack, putting the skill on a cooldown and
     * dealing damage to the enemies hit by the attack.
     *
     * @param skill The skill used to attack.
     * @return Return true if the attack has been successfully executed.
     * Otherwise return false;
     */
    public boolean attack(Skill skill) {
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
     * @return Return true if the effect has been successfully applied.
     * Otherwise return false;
     */
    public boolean applyEffect(Effect effect) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
