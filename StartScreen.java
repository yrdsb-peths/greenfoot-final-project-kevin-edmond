import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    public void act()
    {
        // Start game if user presses space.
        if(Greenfoot.isKeyDown("space"))
        {
            background gameWorld = new background();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        
        super(700, 700, 1); 
        perpare();
    }
    public void perpare()
    {
        Label label = new Label("PRESS SPACE TO START", (40));
        addObject(label,350,450);
    }
}
