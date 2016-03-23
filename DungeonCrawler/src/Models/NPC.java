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
public class NPC extends Character {
    // <editor-fold defaultstate="collapsed" desc="Fields">
    private int expDrop;
    private int goldDrop;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public NPC(int id, String name, int health, int defence, int attack, int currentHealth, int currentTurns, int expDrop, int goldDrop) {
        super(id, name, health, defence, attack, currentHealth, currentTurns);
        this.expDrop = expDrop;
        this.goldDrop = goldDrop;
    }
    // </editor-fold>

    /**
     * Gets the experience per NPC.
     * 
     * @return the amount of experience.
     */
    public int getExpDrop() {
        return expDrop;
    }

    /**
     * Gets the gold drop per NPC.
     * 
     * @return the amount of gold dropped.
     */
    public int getGoldDrop() {
        return goldDrop;
    }

    // <editor-fold defaultstate="collapsed" desc="Methods">
    /**
     * This method makes the NPC drop loot.
     * 
     * @return true if there is loot being dropped. Otherwise it returns false.
     */
    public boolean dropLoot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method makes the NPC start moving trough the floor.
     * 
     * @return true if the NPC moves through the floor. Otherwise return false.
     */
    public boolean startMove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
