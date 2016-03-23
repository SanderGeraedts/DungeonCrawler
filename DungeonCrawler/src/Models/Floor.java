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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    // <editor-fold defaultstate="collapsed" desc="Methods">
    public boolean generateFloor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
