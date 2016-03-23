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
public class Mission {
    // <editor-fold defaultstate="collapsed" desc="Fields">
    private int id;
    private String name;
    private String description;
    private String questGiver;
    private int rewardGold;
    private int rewardExp;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Mission(int id, String name, String description, String questGiver, int rewardGold, int rewardExp) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.questGiver = questGiver;
        this.rewardGold = rewardGold;
        this.rewardExp = rewardExp;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getQuestGiver() {
        return questGiver;
    }

    public int getRewardGold() {
        return rewardGold;
    }

    public int getRewardExp() {
        return rewardExp;
    }

    public boolean accept(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean decline(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean finish(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
