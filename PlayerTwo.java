import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerTwo extends Actor
{
    private int speed = 5;
    public PlayerTwo()
    {
        getImage().scale(getImage().getWidth()/6, getImage().getHeight()/6);
        setRotation(180);
    }
    /**
     * Act - do whatever the PlayerTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("a")){
            move(-1);
        }
        if(Greenfoot.isKeyDown("d")){
            move(1);
        }
    }
}
