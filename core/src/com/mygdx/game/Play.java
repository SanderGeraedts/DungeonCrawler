/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.MapObjects;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.utils.StringBuilder;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.classes.Combat;
import com.mygdx.game.classes.Dungeon;
import com.mygdx.game.classes.Enemy;
import com.mygdx.game.classes.Floor;
import com.mygdx.game.classes.Hero;
import com.mygdx.game.classes.Item;
import java.awt.Point;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Objects;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Thijs
 */
class Play implements Screen {

    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    private OrthographicCamera camera;
    private Viewport gameport;

    private Gameplayer player;
    private Sprite sprite;
    private MapLayer collisionLayer;
    private boolean isColliding;
    private MapObjects objects;
    private MapLayer layer;
    private HUD hud;
    private MyGdxGame dungeonCrawler;
    
    // Class variables
    private Combat combat;
    private Item item;
    private Hero hero;
    private GameEnemy enemy;
    private GameEnemy enemy2;
    private GameEnemy enemy3;
    private GameEnemy enemy4;
    private GameEnemy enemy5;
    private Floor floor;
    private int kills;
    private Dungeon dungeon;
    private Enemy enemyE;
    
    private ArrayList<GameEnemy> enemies;
    private Random xCoord = new Random();
    private Random yCoord = new Random();
    
    //private Enemy enemy;

    public Play(MyGdxGame dungeonCrawler)
    {
        initializePlayerValues();
        initializeEnemyValues();
        this.dungeonCrawler = dungeonCrawler;
        
        //hud = new HUD(dungeonCrawler.batch, enemy);
        enemyE = new Enemy(1, "enemy1", 50, 50, 1, 50, 1);
        enemies = new ArrayList<GameEnemy>();
        
        TmxMapLoader loader = new TmxMapLoader();
        map = loader.load("dungeon_Map1.tmx");
        layer = map.getLayers().get(1);
        objects = layer.getObjects();
        //sprite = new Sprite(new Texture("C:\\Users\\Thijs\\Desktop\\PTgame\\core\\assets\\sprite.jpg"));
        player = new Gameplayer(new Texture(Gdx.files.internal("knight_down.png")), new Texture(Gdx.files.internal("knight_up.png")), new Texture(Gdx.files.internal("knight_left.png")), new Texture(Gdx.files.internal("knight_right.png")), this);
        
        //enemy = new GameEnemy(new Texture(Gdx.files.internal("knight_down.png")), 100, 100);
        enemies.add(enemy);
        enemies.add(enemy2);
        enemies.add(enemy3);
        enemies.add(enemy4);
        enemies.add(enemy5);
        renderer = new OrthogonalTiledMapRenderer(map);
        camera = new OrthographicCamera();
         
        hud = new HUD(dungeonCrawler.batch, hero, dungeon, enemyE);
    }
    
    public void initializePlayerValues()
    {
       // Character initialize. Test character.
        kills = 0;
        hero = new Hero(1, "TestHero", 100, 10, 1, 100, 0, 0);
        item = new Item(1, "Short sword", "1h weapon", 0, 1);
        //combat = new Combat(hero, item, kills);
        dungeon = new Dungeon(1, "The underpass", "Dark dungeon", 1);
    }  
    
    public void initializeEnemyValues()
    {
        enemy = new GameEnemy(new Texture(Gdx.files.internal("knight_down.png")), 100, 100);
        enemy2 = new GameEnemy(new Texture(Gdx.files.internal("knight_left.png")), 450, 280);
        enemy3 = new GameEnemy(new Texture(Gdx.files.internal("knight_right.png")), 400, 180);
        enemy4 = new GameEnemy(new Texture(Gdx.files.internal("knight_left.png")), 400, 480);
        enemy5 = new GameEnemy(new Texture(Gdx.files.internal("knight_up.png")), 100, 380);
    }
    
    @Override
    public void show() {
//        TmxMapLoader loader = new TmxMapLoader();
//        map = loader.load("dungeon_Map1.tmx");
//        layer = map.getLayers().get(1);
//        objects = layer.getObjects();
//        //sprite = new Sprite(new Texture("C:\\Users\\Thijs\\Desktop\\PTgame\\core\\assets\\sprite.jpg"));
//        player = new Gameplayer(new Texture(Gdx.files.internal("knight_down.png")), new Texture(Gdx.files.internal("knight_up.png")), new Texture(Gdx.files.internal("knight_left.png")), new Texture(Gdx.files.internal("knight_right.png")));
//        renderer = new OrthogonalTiledMapRenderer(map);
//        camera = new OrthographicCamera();
    }
    
    private void enterCombat(Gameplayer player)
    {
        // Set player speed to 0 so he cant escapre
        player.speedX = 0;
        player.speedY = 0;
        // Draw text on the screen
        hud.combatLog1.setText("Entered combat, Press space to attack!");
        hud.enemyHealth.setVisible(true);
        hud.enemyName.setVisible(true);
        // Draw options on the screen
        combat = new Combat(player.hero, enemy.enemy);
        
        checkCombatInput();
    }
    
    private void checkCombatInput()
    {
        if(Gdx.input.isKeyPressed(Keys.SPACE))
        {
            hud.combatLog1.setText("Attacking the enemy!");
            //Attack
            if(enemyE.getHealth() > 0)
            {
                combat.doDamage(player.hero, hero.getAttack(), enemyE);
                hud.enemyHealth.setText(String.valueOf(enemyE.getHealth()));
                hud.HealthLabel.setText(String.valueOf(player.hero.getHealth()));
            }
            else if(enemyE.getHealth() <= 0)
            {
                hud.combatLog1.setText("Enemy defeated!");                
            }
        }
        if(Gdx.input.isKeyPressed(Keys.ESCAPE))
        {
            hud.combatLog1.setText("You escaped the fight!");
            player.speedX = 3;
            player.speedY = 3;
            hud.combatLog1.setText("");
        }
        else
        {
            
        }
        //Check other inputs such as escape or use item
    }
    
    public boolean checkCollision(Gameplayer player) 
    {
        boolean value = false;
        // Checking for wall collisions.
        Point p1 = new Point(player.Coordx + 3, player.Coordy + 3);
        Point p2 = new Point(player.Coordx + 3, player.Coordy + 3);
        
        Rectangle spriteRectangle = new Rectangle(p1.x, p1.y, 30, 30);
        Rectangle spriteEnemyRectangle = new Rectangle(p2.x, p2.y, 1, 1);
        for (RectangleMapObject rectangleObject : map.getLayers().get("Collision").getObjects().getByType(RectangleMapObject.class)) 
        {
            Rectangle rectangle = rectangleObject.getRectangle();
            if (Intersector.overlaps(rectangle, spriteRectangle)) 
            {
               value = true;
            }
        }
        return value;
    }

    
    public void checkEnemyCollision(Gameplayer player)
    {
        System.out.println(player.Coordx + " " + player.Coordy);
        System.out.println(enemy.coordX + " " + enemy.coordY);
        for(GameEnemy e : enemies)
        {
            for (int x = e.coordX - 5; x < e.coordX + 5; x++) {
                for (int y = e.coordY - 5; y < e.coordY + 5; y++) {
                    if(player.Coordx == x && player.Coordy == y)
                    {
                        enterCombat(player);
                    }
                }
            }
        }
    }
    
    @Override
    public void render(float delta) {
        player.update(delta);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        // Set HUD visibility to false when the player is not in combat
        hud.enemyHealth.setVisible(false);
        hud.enemyName.setVisible(false);
        
        //Check if the player is in combat with a bool
        //If the player is in combat, is it his turn?
        
        renderer.render();
        renderer.setView(camera);
        camera.position.set(player.getSprite().getX(), player.getSprite().getY(), 0);
        camera.update();
        
        //hud.enemyHealth.setVisible(false);
        //hud.enemyName.setVisible(false);
        
        checkEnemyCollision(player);
        
        isColliding = checkCollision(player);       
        if (isColliding == true) 
        {
            if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
            {
                player.Coordx += 3;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            {
                player.Coordx -= 3;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.UP))
            {
                player.Coordy -= 3;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.DOWN))
            {
                player.Coordy +=3;
            }
            isColliding = false;
        }

        renderer.getBatch().begin();
        player.render(renderer.getBatch());
        
        for(GameEnemy ge : enemies)
        {
            ge.render(renderer.getBatch());
        }
        renderer.getBatch().end();
        
        dungeonCrawler.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();     
    }

    @Override
    public void resize(int width, int height) {
        camera.viewportWidth = width;
        camera.viewportHeight = height;
        camera.update();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        map.dispose();
        renderer.dispose();
    }

}
