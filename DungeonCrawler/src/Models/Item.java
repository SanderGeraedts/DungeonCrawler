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
    private int ID;
    private String name;
    private String description;
    private int cost;
    private int lvlRequirement;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Item(int ID, String name, String description, int cost, int lvlRequirement) {
        this.ID = ID;
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
