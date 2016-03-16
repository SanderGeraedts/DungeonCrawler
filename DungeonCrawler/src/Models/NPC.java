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
public class NPC
{
    // Fields
    private int expDrop;
    private int goldDrop;
    
    // Constructor
    public NPC(int expDrop, int goldDrop)
    {
        this.expDrop = expDrop;
        this.goldDrop = goldDrop;
    }
    
    // Methods
    public int getExpDrop()
    {
        return expDrop;
    }

    public int getGoldDrop()
    {
        return goldDrop;
    }
    
    public void dropLoot()
    {
        
    }
    
    public void startMove()
    {
        
    }
}
