/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author Thijs
 */
class Gameplayer
{
    
    
    private Vector2 velocity;
    private float speed = 60 * 2, gravity = 60 * 1.8f;
    
    private Texture textureDown;
    private Texture textureUp;
    private Texture textureRight;
    private Texture textureLeft;
    private Sprite activeSprite;
    
    public int Coordx;
    public int Coordy;
    public int CoordDx = 3;
    public int CoordDy = 3;
    
    public Gameplayer(Texture textureDown, Texture textureUp, Texture textureLeft, Texture textureRight) {
        
        this.textureDown = textureDown;
        this.textureUp = textureUp;
        this.textureLeft = textureLeft;
        this.textureRight = textureRight;
        
        this.activeSprite = new Sprite(textureDown);
        this.Coordx = 50;
        this.Coordy = 50;
        //this.activeSprite.setPosition(10, 50);
        
    }
    
    public Sprite getSprite()
    {
        return this.activeSprite;
    }
    
    public void render(Batch batch)
    {
        this.activeSprite.draw(batch);
    }
    
    public void update(float delta) {
        //System.out.println("update");
       if(Gdx.input.isKeyPressed(Keys.LEFT)) {
           this.Coordx -= CoordDx;
           this.activeSprite.setTexture(textureLeft);
           this.activeSprite.setPosition(Coordx, Coordy);
       }
       if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
           this.Coordx += CoordDx;
           this.activeSprite.setTexture(textureRight);
           this.activeSprite.setPosition(Coordx, Coordy);
       }
       if(Gdx.input.isKeyPressed(Keys.UP)) {
           this.Coordy += CoordDy;
           this.activeSprite.setTexture(textureUp);
           this.activeSprite.setPosition(Coordx, Coordy);
       }
       if(Gdx.input.isKeyPressed(Keys.DOWN)) {
           this.Coordy -= CoordDy;
           this.activeSprite.setTexture(textureDown);
           this.activeSprite.setPosition(Coordx, Coordy);
       }
      
    }
}
