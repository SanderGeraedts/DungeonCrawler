/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.classes;

/**
 *
 * @author Maxime, Thijs & Sander
 */
public class Mission {
    // <editor-fold defaultstate="collapsed" desc="Fields">
    private int id;
    private String name;
    private String description;
    private String questGiver;
    private int rewardGold;
    private int rewardExp;
    private boolean completed;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Mission(int id, String name, String description, String questGiver, int rewardGold, int rewardExp) 
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.questGiver = questGiver;
        this.rewardGold = rewardGold;
        this.rewardExp = rewardExp;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">
    /**
     * Gets the mission id.
     * 
     * @return the id of the mission.
     */
    public int getId() 
    {
        return id;
    }

    /**
     * Gets the mission name.
     * 
     * @return the name of the mission.
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Gets the mission description.
     * 
     * @return the description of the mission.
     */
    public String getDescription() 
    {
        return description;
    }

    /**
     * Gets the questgiver per mission.
     * 
     * @return the questgiver.
     */
    public String getQuestGiver() 
    {
        return questGiver;
    }

    /**
     * Gets the gold per mission.
     * 
     * @return the gold per mission.
     */
    public int getRewardGold() 
    {
        return rewardGold;
    }

    /**
     * Gets the experience reward per mission.
     * 
     * @return the experience.
     */
    public int getRewardExp() 
    {
        return rewardExp;
    }

    /**
     * This method makes a player can accept a mission.
     * 
     * @param player is the player that can accept the mission
     * @return true if the player has accepted the mission. Otherwise return false.
     */
    public boolean accept(Player player) 
    {
       return true;
    }

    /**
     * This method makes a player can decline a mission.
     * 
     * @param player is the player that can decline a mission.
     * @return true if the player has declines the mission. Otherwise return false.
     */
    public boolean decline(Player player) 
    {
        return true;
    }

    /**
     * This method makes the player finish/deliver a mission.
     * 
     * @param player is the player that can finish a mission.
     * @return true if the player has finished a mission. Otherwise return false.
     */
    public boolean finish(Player player) 
    {
        //Set mission to completed.
        completed = true;
        //Add rewards to the character
        return true;
        //Return true
    }
    // </editor-fold>
}
