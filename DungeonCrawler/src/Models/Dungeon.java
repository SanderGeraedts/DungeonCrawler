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
public class Dungeon {
    // <editor-fold defaultstate="collapsed" desc="Fields">
    private int id;
    private String name;
    private String type;
    private int lvlRequirement;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Dungeon(int id, String name, String type, int lvlRequirement) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.lvlRequirement = lvlRequirement;
    }
    // </editor-fold>

    /**
     * Get the id of the dungeon.
     * 
     * @return the id of the dungeon.
     */
    public int getId() {
        return id;
    }

    /**
     * Get the name of the dungeon
     * 
     * @return the name of the dungeon
     */
    public String getName() {
        return name;
    }

    /**
     * Get the type of the dungeon
     * 
     * @return return the type of the dungeon
     */
    public String getType() {
        return type;
    }

    /**
     * Get the level requirement of the dungeon
     * 
     * @return the level requirement of the dungeon
     */
    public int getLvlRequirement() {
        return lvlRequirement;
    }

    // <editor-fold defaultstate="collapsed" desc="Methods">
    /**
     * Generates the dungeon
     * 
     * @return true is the dungeon can be generated. Otherwise returns false
     */
    public boolean generateDungeon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
