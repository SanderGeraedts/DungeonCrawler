/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.classes;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

/**
 *
 * @author Maxime
 */
public class Enemy extends Character
{ 
    
    public Enemy(int id, String name, int health, int defence, int attack, int currentHealth, int currentTurns)
    {
        super(id, name, health, defence, attack, currentHealth, currentTurns);
    }
    
}
