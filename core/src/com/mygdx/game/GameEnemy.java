/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.classes.Enemy;
import java.util.ArrayList;

/**
 *
 * @author Thijs
 */
public class GameEnemy {
    
    private Texture texture;
    public Enemy enemy;
    private ArrayList<Enemy> enemyList;
    private ArrayList<GameEnemy> gameEnemyList;
    
    private Sprite sprite;
    
    public int coordX;
    public int coordY;
    
    public GameEnemy(Texture texture, int coordX, int coordY)
    {
        enemyList = new ArrayList<Enemy>();
        this.texture = texture;
        sprite = new Sprite(texture);
        this.coordX = coordX;
        this.coordY = coordY;
        sprite.setPosition(coordX, coordY);
    }
    
     public void render(Batch batch)
    {
        this.sprite.draw(batch);
    }
    
    public ArrayList<Enemy> getEnemys()
    {
        return enemyList;
    }
    
    public void addEnemy(Enemy enemy)
    {
        enemyList.add(enemy);
        enemyData();
    }
    
    public void addGameEnemy(GameEnemy gameEnemy)
    {
        gameEnemyList.add(gameEnemy);
        gameEnemyData();
    }
    
    public ArrayList<GameEnemy> getGameEnemys()
    {
        return gameEnemyList;
    }
    
    public void gameEnemyData()
    {
        addGameEnemy (new GameEnemy(new Texture(Gdx.files.internal("knight_down.png")), 100, 100));
        addGameEnemy(new GameEnemy(new Texture(Gdx.files.internal("knight_left.png")), 450, 280));
        addGameEnemy(new GameEnemy(new Texture(Gdx.files.internal("knight_right.png")), 400, 180));
        addGameEnemy(new GameEnemy(new Texture(Gdx.files.internal("knight_left.png")), 400, 480));
        addGameEnemy(new GameEnemy(new Texture(Gdx.files.internal("knight_up.png")), 100, 380));
    }
    
    public void enemyData()
    {
        addEnemy(new Enemy(1, "enemy1", 100, 100, 100, 100, 1));
        addEnemy(new Enemy(2, "enemy2", 100, 100, 100, 100, 1));
        addEnemy(new Enemy(3, "enemy3", 100, 100, 100, 100, 1));
        addEnemy(new Enemy(4, "enemy4", 100, 100, 100, 100, 1));
        addEnemy(new Enemy(5, "enemy5", 100, 100, 100, 100, 1));
        addEnemy(new Enemy(6, "enemy6", 100, 100, 100, 100, 1));
        
    }
}
