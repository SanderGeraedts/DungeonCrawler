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
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException 
    {
        tilemap.render(0, 0);
        //System.out.println("Swaaag");
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException 
    {
        
    }
    
}
