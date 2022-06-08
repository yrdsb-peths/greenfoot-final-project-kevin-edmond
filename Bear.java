import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
    /**
     * Act - do whatever the Dog wants to do. This method is called whenever
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
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+1);
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-1);
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+1, getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-1, getY());
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-1);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+1);
        }
    }    
}
