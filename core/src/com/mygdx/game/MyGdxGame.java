package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Game;

public class MyGdxGame extends Game 
{
    public static final int gameWidth = 500;
    public static final int gameHeight = 300;
    public static final int PPM = 100;
    public SpriteBatch batch;
    public Texture img;
    
    @Override
    public void create() {
        batch = new SpriteBatch();          
        setScreen(new Play(this)); 
    }
    
    @Override
    public void dispose() {
        super.dispose();
    }
    
    @Override
    public void render() {
        super.render();
    }
    
    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }
    
    @Override
    public void pause(){
        super.pause();
    }
    
    @Override
    public void resume(){
        super.resume();
    }
}
