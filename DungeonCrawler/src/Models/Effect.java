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
}
