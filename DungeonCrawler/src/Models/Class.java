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
    // ... 
    // </editor-fold>
}
