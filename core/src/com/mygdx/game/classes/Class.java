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
public abstract class Class {
    // <editor-fold defaultstate="collapsed" desc="Fields">
    private String name;
    private int baseHP;
    private int baseDefence;
    private int baseAttack;
    private int movement;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Class(String name, int baseHP, int baseDefence, int baseAttack, int movement) {
        this.name = name;
        this.baseHP = baseHP;
        this.baseDefence = baseDefence;
        this.baseAttack = baseAttack;
        this.movement = movement;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">
    /**
     * Gets the name of the class.
     * 
     * @return Returns the class name.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the base healthpool of the class.
     * 
     * @return Returns the base healthpool.
     */
    public int getBaseHP()
    {
        return baseHP;
    }
    
    /**
     * Gets the base defence of the class.
     * 
     * @return Returns the class's base defence.
     */
    public int getBaseDefence()
    {
        return baseDefence;
    }
    
    /**
     * Gets the base attack of the class.
     * 
     * @return Returns the class's base attack.
     */
    public int getBaseAttack()
    {
        return baseAttack;
    }
    
    /**
     * Gets the movement of the class.
     * 
     * @return Returns the amount of tiles a class can move over.
     */
    public int getMovement()
    {
        return movement;
    }
    // </editor-fold>
}
