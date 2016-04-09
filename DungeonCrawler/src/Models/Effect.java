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
public class Effect {
    // <editor-fold defaultstate="collapsed" desc="Fields">
    private int id;
    private String name;
    private int duration;
    private Attribute attribute;
    private int effect;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Effect(int id, String name, int duration, Attribute attribute, int effect) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.attribute = attribute;
        this.effect = effect;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">
    // ...
    // </editor-fold>

    /**
     * Gets the effect's id
     * 
     * @return Returns the effect's id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the effect's name
     * 
     * @return Returns the effect's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the duration of the effect in miliseconds
     * 
     * @return Returns the duration of the effect
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Gets the effect's attribute
     * 
     * @return Returns the effect's attribute
     */
    public Attribute getAttribute() {
        return attribute;
    }

    /**
     * Returns the type of this effect. -1 resembles a debuff, +1 resembles a buff.
     * 
     * @return Returns the effect's type
     */
    public int getEffect() {
        return effect;
    }
}
