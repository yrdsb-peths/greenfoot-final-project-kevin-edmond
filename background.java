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
    public int score = 0;
    Label scoreLabel;
    int point = 1;
    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        super(700, 700, 1); 
        prepare();
        Greenfoot.playSound("bg.wav");
        scoreLabel = new Label(0, 55);
        addObject(scoreLabel, 35, 35);
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
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if(score % 5 == 0)
        {
            point += 0.25;
        }
    }
}
