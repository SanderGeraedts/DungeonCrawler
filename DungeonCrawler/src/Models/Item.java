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
    /**
     * Gets the id of the item.
     * 
     * @return Returns the item id.
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Gets the name of the item.
     * 
     * @return Returns the item name.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the description of the item.
     * 
     * @return Returns the item's description.
     */
    public String description()
    {
        return description;
    }
    
    /**
     * Gets the cost of the item.
     * 
     * @return Returns the cost of one item.
     */
    public int getCost()
    {
        return cost;
    }
    
    /**
     * Gets the level requirement of the item.
     * 
     * @return Returns the item's level requirement.
     */
    public int getLvlRequirement()
    {
        return lvlRequirement;
    }
    // </editor-fold>
}
