import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerOne extends Actor
{
    private int speed = 5;
    public PlayerOne()
    {
        getImage().scale(getImage().getWidth()/6, getImage().getHeight()/6);
    }
    /**
     * Act - do whatever the PlayerOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Controls of the movement of the paddle which can only turn left or right
        if(Greenfoot.isKeyDown("right"))
            setLocation(getX() + speed, getY());
        if(Greenfoot.isKeyDown("left"))
            setLocation(getX() - speed, getY());
        
    }
}
