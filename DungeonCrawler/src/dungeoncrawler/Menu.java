/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeoncrawler;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.tiled.TiledMap;

/**
 *
 * @author Thijs
 */
public class Menu extends BasicGameState
{
    private TiledMap tilemap;
    
    private int x;
    private int y;
    
    public Menu(int state)
    {
        
    }

    @Override
    public int getID() 
    {
       return 0;
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 
    {
        tilemap = new TiledMap("resources/map.tmx");
        
        x = 4;
        y = 4;
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException 
    {
        if(x < 10 && y < 10)
        {
            tilemap.render(0, 0,0,0,10,10);
        }
        else if(x > 10 && y < 10)
        {
            tilemap.render(10, 0,0,0,10,10);
        }
        else if(y > 10 && x < 10)
        {
            tilemap.render(0,10,0,0,10,10);
        }
        else if( x > 10 && y > 10)
        {
            tilemap.render(10,10,0,0,10,10);
        }
        
        grphcs.fillRect(x*32, y*32, 32, 32);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException 
    {
        int objectLayer = tilemap.getLayerIndex("Objects");
        
        if(gc.getInput().isKeyPressed(Input.KEY_RIGHT))
        {
            if(tilemap.getTileId(x + 1, y, objectLayer)== 0)
            {
                x++;
            }
        }
        else if(gc.getInput().isKeyPressed(Input.KEY_LEFT))
        {
            if(tilemap.getTileId(x -1, y, objectLayer) == 0)
            {
                x--;
            }
        }
        else if(gc.getInput().isKeyPressed(Input.KEY_UP))
        {
            if(tilemap.getTileId(x, y - 1, objectLayer) == 0)
            {
                y--;
            }
        }
        else if(gc.getInput().isKeyPressed(Input.KEY_DOWN))
        {
            if(tilemap.getTileId(x, y + 1, objectLayer) == 0)
            {
                y++;
            }
        }
    }
    
}
