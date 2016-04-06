/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.classes;

import java.util.ArrayList;

/**
 *
 * @author Maxime & Sander
 */
public class Game {
    // <editor-fold defaultstate="collapsed" desc="Fields">
    private int id;
    private Hero partyLeader;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Game(int id, Hero partyLeader) {
        this.id = id;
        this.partyLeader = partyLeader;
    }
    // </editor-fold>

    /**
     * Gets the id of the game.
     * 
     * @return the id of the game.
     */
    public int getId() {
        return id;
    }
    
    /**
     * Gets the current partyleader.
     * 
     * @return the partyleader.
     */
    public Hero getPartyLeader()
    {
        return partyLeader;
    }

    // <editor-fold defaultstate="collapsed" desc="Methods">
    /**
     * Starts a game with the current amount of players in it.
     * 
     * @param player
     * @return the game with the players.
     */
    public Game startGame(ArrayList<Player> player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
