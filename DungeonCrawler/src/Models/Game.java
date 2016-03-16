/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Maxime
 */
public class Game
{
    // Fields
    private int id;
    private int floorNumber;
    private Game game;
    
    // Constructor
    public Game(int id, int floorNumber, Game game)
    {
        this.id = id;
        this.floorNumber = floorNumber;
        this.game = game;
    }
    
    // Methods
    public int getId()
    {
        return id;
    }

    public int getFloorNumber()
    {
        return floorNumber;
    }

    public Game getGame()
    {
        return game;
    }
    
    public void startGame(ArrayList player)
    {
        
    }
    
    public Game players()
    {
        return game;
    }
}
