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
    public PlayerTwo p2 = new PlayerTwo();
    private static GreenfootSound bgm;
    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        super(600, 1000, 1); 
        prepare();
        prepareOne();
        middleLine m = new middleLine();
        addObject(m, 300, 498);
        bgm = new GreenfootSound("bg.wav");
        if(bgm.isPlaying())
        {
            bgm.stop();
        }
    }
    public void prepare()
    {
        
        addObject(p1, 300, 950);
        for(int i = 0; i < 12; i++) 
            for(int j = 0 ; j < 4; j++)
                addObject(new block(), 32 + 50 * i, 530 + 30 * j);
        ball b = new ball(p1, this);
        addObject(b, 300, 850);
    }
    public void prepareOne()
    {
        
        addObject(p2, 300, 50);
        for(int i = 0; i < 12; i++) 
            for(int j = 0 ; j < 4; j++)
                addObject(new blockTwo(), 32 + 50 * i, 390 + 30 * j);
        ballTwo bTwo = new ballTwo();
        addObject(bTwo, 300, 150);
    }
}
