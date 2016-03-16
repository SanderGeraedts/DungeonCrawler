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
public class Dungeon
{
    // Fields
    private int id;
    private String name;
    private String type;
    private int lvlRequirement;
    
    // Constructor
    public Dungeon(int id, String name, String type, int lvlRequirement)
    {
        this.id = id;
        this.name = name;
        this.type = type;
        this.lvlRequirement = lvlRequirement;
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

    public String getType()
    {
        return type;
    }

    public int getLvlRequirement()
    {
        return lvlRequirement;
    }
    
    public void generateDungeon()
    {
        
    }
}
