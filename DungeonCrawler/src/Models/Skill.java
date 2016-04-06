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
public class Skill {
    // <editor-fold defaultstate="collapsed" desc="Fields">
    private int id;
    private String name;
    private int cooldown;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Skill(int id, String name, int cooldown) {
        this.id = id;
        this.name = name;
        this.cooldown = cooldown;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">
    // ...
    // </editor-fold>

    /**
     * Gets the skill's id
     * 
     * @return Returns the skill's id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the skill's name
     * 
     * @return Return the skill's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the skill's cooldown
     * 
     * @return Return the skill's cooldown
     */
    public int getCooldown() {
        return cooldown;
    }
}
