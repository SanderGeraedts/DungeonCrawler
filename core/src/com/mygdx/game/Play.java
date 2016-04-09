/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
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
import com.badlogic.gdx.utils.StringBuilder;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.classes.Combat;
import com.mygdx.game.classes.Enemy;
import com.mygdx.game.classes.Floor;
import com.mygdx.game.classes.Hero;
import com.mygdx.game.classes.Item;
import java.awt.Point;
import java.util.Objects;
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
    private Floor floor;
    private int kills;
    
    private Enemy enemy;

    public Play(MyGdxGame dungeonCrawler)
    {
        initializePlayerValues();
        initializeEnemyValues();
        this.dungeonCrawler = dungeonCrawler;
        hud = new HUD(dungeonCrawler.batch, hero, item, combat, floor, enemy);
        //hud = new HUD(dungeonCrawler.batch, enemy);
        
        TmxMapLoader loader = new TmxMapLoader();
        map = loader.load("dungeon_Map1.tmx");
        layer = map.getLayers().get(1);
        objects = layer.getObjects();
        //sprite = new Sprite(new Texture("C:\\Users\\Thijs\\Desktop\\PTgame\\core\\assets\\sprite.jpg"));
        player = new Gameplayer(new Texture(Gdx.files.internal("knight_down.png")), new Texture(Gdx.files.internal("knight_up.png")), new Texture(Gdx.files.internal("knight_left.png")), new Texture(Gdx.files.internal("knight_right.png")));
        renderer = new OrthogonalTiledMapRenderer(map);
        camera = new OrthographicCamera();
    }
    
    public void initializePlayerValues()
    {
       // Character initialize. Test character.
        kills = 0;
        hero = new Hero(1, "TestHero", 100, 10, 1, 100, 0, 0);
        item = new Item(1, "Short sword", "1h weapon", 0, 1);
        combat = new Combat(hero, item, kills);
        floor = new Floor(1, "Level 1", 1);        
    }  
    
    public void initializeEnemyValues()
    {
        enemy = new Enemy(1, "warrior", 50, 0, 1, 50, 0); 
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
            
            if (Intersector.overlaps(rectangle, spriteEnemyRectangle))
            {
                value = true;
            }
        }
        return value;
    }

    @Override
    public void render(float delta) {
        player.update(delta);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        renderer.render();
        renderer.setView(camera);
        camera.position.set(player.getSprite().getX(), player.getSprite().getY(), 0);
        camera.update();
        
        hud.enemyHealth.setVisible(false);
        hud.enemyName.setVisible(false);
        
        isColliding = checkCollision(player);       
        if (isColliding == true) 
        {
            hud.enemyHealth.setVisible(true);
            hud.enemyName.setVisible(true);
        
            if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
            {
                System.out.println("left collision");
                player.CoordDx = -5;
                player.CoordDy = 0;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            {
                System.out.println("right collision");
                player.CoordDx = -5;
                player.CoordDy = 0;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.UP))
            {
                System.out.println("up collision");
                player.CoordDx = 0;
                player.CoordDy = -5;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.DOWN))
            {
                System.out.println("down collision");
                player.CoordDx = 0;
                player.CoordDy = -5;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.SPACE))
            {              
                if(enemy.getHealth() >= 0)
                {
                    System.out.println("PLAYER ATTACKS ENEMY");
                    combat.doDamage(hero, item, 0);
                    combat.receiveDamage(hero, item, enemy.getAttack());
                    hud.HealthLabel.setText(String.valueOf(hero.getHealth()));

                    System.out.println("ENEMY ATTACKS PLAYER");
                    combat.doDamage(hero, item, 0);
                    combat.receiveDamage(enemy, item, hero.getAttack());
                    hud.enemyHealth.setText(String.valueOf(enemy.getHealth()));
                }              
                if(enemy.getHealth() <= 0)
                {
                    System.out.println("ENEMY KILLED");
                    hud.enemyHealth.setText(": ENEMY KILLED");                                             
                }
            }

            isColliding = false;
        }
        else
        {
            player.CoordDx = 3;
            player.CoordDy = 3;
        }

        renderer.getBatch().begin();
        player.render(renderer.getBatch());
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
