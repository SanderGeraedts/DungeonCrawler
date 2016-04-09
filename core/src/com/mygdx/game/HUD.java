/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.classes.Combat;
import com.mygdx.game.classes.Enemy;
import com.mygdx.game.classes.Floor;
import com.mygdx.game.classes.Hero;
import com.mygdx.game.classes.Item;

/**
 *
 * @author Maxime
 */
public class HUD implements Disposable
{
    public Stage stage;
    private Viewport viewport;
    private Viewport viewportEnemy;
    private int timer;
    private float timerCount;
    private int score;
    
    Label AttackLabel;
    Label HealthLabel;
    Label KillLabel;
    Label levelLabel;
    Label worldLabel;
    Label characterLabel;
    
    Label combatLog1;
    //Label combatLog2;
    //Label combatLog3;
    
    Label enemyHealth;
    Label enemyName;
    
    public HUD(SpriteBatch sb, Hero hero, Item item, Combat combat, Floor floor, Enemy enemy)
    {       
       score = 0;
       viewport = new FitViewport(MyGdxGame.gameWidth, MyGdxGame.gameHeight, new OrthographicCamera());
       stage = new Stage(viewport, sb);
 
        Table table = new Table();
        table.top();
        table.setFillParent(true);
        
        AttackLabel = new Label(String.format("Attack: " + hero.getAttack(), hero.getAttack()), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        HealthLabel = new Label(String.format("Health: " + hero.getHealth(), hero.getHealth()), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        //KillLabel = new Label(String.format("Kills: " + combat.getKills(), timer), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        levelLabel = new Label(String.format("Level: " + floor.getFloorNumber(), timer), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        worldLabel = new Label(String.format("World: " + floor.getId(), timer), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        characterLabel =  new Label(String.format("Hero: " + hero.getName(), hero.getName()), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        combatLog1 = new Label(String.format(""), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        //combatLog2 = new Label(String.format(""), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        //combatLog3 = new Label(String.format(""), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        
        
        
        enemyName = new Label(String.format("Name: " + enemy.getName(), timer), new Label.LabelStyle(new BitmapFont(), Color.RED));
        enemyHealth =  new Label(String.format("Health: " + enemy.getHealth(), timer), new Label.LabelStyle(new BitmapFont(), Color.RED));       
        
        table.add(AttackLabel).padLeft(0);
        table.add(HealthLabel).padLeft(10);
        //table.add(KillLabel).padLeft(10);
        table.add(levelLabel).padLeft(10);
        table.add(worldLabel).padLeft(10);
        table.add(characterLabel).padLeft(10);
        
        
        table.row();
        table.add(enemyName).padTop(10);
        table.add(enemyHealth).padTop(10);
        table.add(combatLog1).padTop(200);
        //table.add(combatLog2).padTop(230);
        //table.add(combatLog3).padTop(250);
             
        stage.addActor(table);
    }
    
    @Override
    public void dispose()
    {
        stage.dispose();
    }
}
