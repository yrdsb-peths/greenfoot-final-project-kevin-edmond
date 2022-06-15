import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    public PlayerOne p1 = new PlayerOne();
    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        super(700, 700, 1); 
        prepare();
        Greenfoot.playSound("bg.wav");
    }
    public void prepare()
    {
        //creates player paddle, ball, and the set of blocks
        addObject(p1, 350, 650);
        for(int i = 0; i < 10; i++) 
            for(int j = 0 ; j < 5; j++)
                addObject(new block(), 35 + 70 * i, 30 + 40 * j);
        ball b = new ball(p1, this);
        addObject(b, 350, 600);
    }
    
}
