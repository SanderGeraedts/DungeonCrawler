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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLvlRequirement() {
        return lvlRequirement;
    }

    // <editor-fold defaultstate="collapsed" desc="Methods">
    public boolean generateDungeon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
