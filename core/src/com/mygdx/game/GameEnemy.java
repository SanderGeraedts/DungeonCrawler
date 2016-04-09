/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.classes.Enemy;

/**
 *
 * @author Thijs
 */
public class GameEnemy {
    
    private Texture texture;
    public Enemy enemy;
    
    private Sprite sprite;
    
    public int coordX;
    public int coordY;
    
    public GameEnemy(Texture texture)
    {
        this.texture = texture;
        sprite = new Sprite(texture);
        enemy = new Enemy(1, "Enemy1", 100, 100, 100, 100, 1);
        coordX = 100;
        coordY = 100;
        sprite.setPosition(coordX, coordY);
    }
    
     public void render(Batch batch)
    {
        this.sprite.draw(batch);
    }
    
    
}
