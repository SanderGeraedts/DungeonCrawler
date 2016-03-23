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

    public int getExpDrop() {
        return expDrop;
    }

    public int getGoldDrop() {
        return goldDrop;
    }

    // <editor-fold defaultstate="collapsed" desc="Methods">
    public boolean dropLoot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean startMove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
