/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.classes;

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
    
    
    // Tryout..
    public int Coordx;
    public int Coordy;
    public int CoordDx = 3;
    public int CoordDy = 3;
    
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
        
        this.Coordx = 50;
        this.Coordy = 50;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">  
    /**
     * Gets the id per character.
     * 
     * @return character id.
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Gets the name per character.
     * 
     * @return character name.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the health per character.
     * 
     * @return the characters health.
     */
    public int getHealth()
    {
        return health;
    }
    
    public int setHealth(int health)
    {
        this.health -= health;
        return health;
    }
    
    /**
     * Gets the characters defence.
     * 
     * @return the defence per character.
     */
    public int getDefence()
    {
        return defence;
    }
    
    /**
     * Gets the attack per character.
     * 
     * @return characters attack.
     */
    public int getAttack()
    {
        return attack;
    }
    
    /**
     * Gets the current health per character.
     * 
     * @return the current health.
     */
    public int getCurrentHealth()
    {
        return currentHealth;
    }
    
    /**
     * Gets the current turns per character.
     * 
     * @return character turns.
     */
    public int getCurrentTurns()
    {
        return currentTurns;
    }
    
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
     * This method moves a character to a specified tile.
     *
     * @param tile The tile to which the character wants to move.
     * @return Return true if the character is able to move to the
     * specified tile. Otherwise return false.
     */
    public boolean move(Tile tile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method applies a specified effect to the character
     *
     * @param effect The effect which should be applied to the character.
     * @return Return true if the effect has been successfully applied.
     * Otherwise return false;
     */
    public boolean applyEffect(Effect effect) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
