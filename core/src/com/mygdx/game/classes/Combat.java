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
public class Combat
{
    // <editor-fold defaultstate="collapsed" desc="Fields">
    private Character character;
    private Item item;
    private int damage;
    private int kills;
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Combat(Character character, Item item, int kills)
    {
        this.character = character;
        this.item = item;
        this.kills = kills;
    }
    
    public void doDamage(Character character, Item item, int damage)
    {
        this.character = character;
        this.item = item;
        this.damage = damage;
    }
    
    public int receiveDamage(Character character, Item item, int damage)
    {
        this.character = character;
        this.item = item;
        this.damage = damage;
        character.setHealth(damage);
        return damage;
    }
    
    public Character getCharacter()
    {
        return character;
    }
    
    public Item getItem()
    {
        return item;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public int getKills()
    {
        return kills;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    // ...
    // </editor-fold>
}
