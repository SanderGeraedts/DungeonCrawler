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
public class Item {
    // <editor-fold defaultstate="collapsed" desc="Fields">
    private int id;
    private String name;
    private String description;
    private int cost;
    private int lvlRequirement;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Item(int id, String name, String description, int cost, int lvlRequirement) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.lvlRequirement = lvlRequirement;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">
    // ...
    // </editor-fold>
}
