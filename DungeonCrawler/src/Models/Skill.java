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
}
