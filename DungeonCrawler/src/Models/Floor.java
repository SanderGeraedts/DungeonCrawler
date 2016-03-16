/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Maxime
 */
public class Floor
{
    // Fields
    private int id;
    private String name;
    private int floorNumber;
    
    // Constructor
    public Floor(int id, String name, int floorNumber)
    {
        this.id = id;
        this.name = name;
        this.floorNumber = floorNumber;
    }
    
    // Methods
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getFloorNumber()
    {
        return floorNumber;
    }
    
    public void generateFloor()
    {
        
    }
}
