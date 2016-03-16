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
public class Mission
{
    // Fields
    private int id;
    private String name;
    private String description;
    private String questGiver;
    private int rewardGold;
    private int rewardExp;
    
    // Constructor
    public Mission(int id, String name, String description, String questGiver, int rewardGold, int rewardExp)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.questGiver = questGiver;
        this.rewardGold = rewardGold;
        this.rewardExp = rewardExp;
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

    public String getDescription()
    {
        return description;
    }

    public String getQuestGiver()
    {
        return questGiver;
    }

    public int getRewardGold()
    {
        return rewardGold;
    }

    public int getRewardExp()
    {
        return rewardExp;
    }
    
    public void accept(Player player)
    {
        
    }
    
    public void decline(Player player)
    {
        
    }
    
    public boolean finish(Player player)
    {
        return false;
    }
}
