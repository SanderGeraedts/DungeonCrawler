/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.classes;

/**
 *
 * @author Maxime & Sander
 */
public class Floor {
    // <editor-fold defaultstate="collapsed" desc="Fields">

    private int id;
    private String name;
    private int floorNumber;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Floor(int id, String name, int floorNumber) {
        this.id = id;
        this.name = name;
        this.floorNumber = floorNumber;
    }
    // </editor-fold>

    /**
     * Gets the id of the floor
     * 
     * @return the id of the floor.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name of the floor
     * 
     * @return the name of the floor.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the floor number
     * 
     * @return the floornumber.
     */
    public int getFloorNumber() {
        return floorNumber;
    }

    /**
     * Generate a dungeon floor
     * 
     * @return true if the floor can be generated. Otherwise it returns false.
     */
    // <editor-fold defaultstate="collapsed" desc="Methods">
    public boolean generateFloor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
