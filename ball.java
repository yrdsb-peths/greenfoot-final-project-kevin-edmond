import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dy = 5;
    int dx = 0;
    int count = 0;
    public PlayerOne p1;
    public World background;
    public ball(PlayerOne p1, World world)
    {
        background = world;
        this.p1 = p1;
        getImage().scale(getImage().getWidth()/18, getImage().getHeight()/18);
    }
    public void act()
    {
        moveAround();
        bounce();
        bounceOffEdge();
        hitBlock();
        youLose();
        youWin();
    }
    public void moveAround()
    {
        setLocation(getX() + dx, getY() + dy);
    }
    public void bounce()
    {
        if (isTouching(PlayerOne.class) && this.p1.getX() > getX() + 50)
        {
            dy = -dy;
            dx -= 6;
        }
        else if (isTouching(PlayerOne.class) && this.p1.getX() < getX() - 50)
        {
            dy = -dy;
            dx += 6;
        }
        else if (isTouching(PlayerOne.class) && this.p1.getX() > getX() + 40 )
        {
            dy = -dy;
            dx -= 5;
        }
        else if (isTouching(PlayerOne.class) && this.p1.getX() < getX() - 40)
        {
            dy = -dy;
            dx += 5;
        }
        else if (isTouching(PlayerOne.class)  && this.p1.getX() > getX() + 30 )
        {
            dy = -dy;
            dx -= 4;
        }
        else if (isTouching(PlayerOne.class) && this.p1.getX() < getX() - 30)
        {
            dy = -dy;
            dx += 4;
        }
        else if (isTouching(PlayerOne.class)  && this.p1.getX() > getX() + 20 )
        {
            dy = -dy;
            dx -= 3;
        }
        else if (isTouching(PlayerOne.class) && this.p1.getX() < getX() - 20)
        {
            dy = -dy;
            dx += 3;
        }
        else if (isTouching(PlayerOne.class)  && this.p1.getX() > getX() + 10 )
        {
            dy = -dy;
            dx -= 2;
        }
        else if (isTouching(PlayerOne.class)  && this.p1.getX() < getX() - 10)
        {
            dy = -dy;
            dx += 2;
        }
        else if ((isTouching(PlayerOne.class) || isTouching(block.class)))
        {
            dy = -dy;
        }
        else if ((isTouching(PlayerOne.class) || isTouching(middleLine.class)))
        {
            dy = -dy;
        }
    }
    public void bounceOffEdge()
    {
        if(getX() >= getWorld().getWidth()-1)
        {
            dx = -dx;
        }
        if(getX() <= 0)
        {
            dx = -dx;
        }
        if(getY() <= 0)
            dy= -dy;
        if(getY()>= getWorld().getHeight() - 1)
            dy= -dy;
    }
    public void hitBlock()
    {
        Actor Block = getOneIntersectingObject(block.class);
        if(Block != null && Block.getX() > getX() + 30)
        {
            getWorld().removeObject(Block);
            dx = -dx;
            count++;
        }
        else if(Block != null && Block.getX() < getX() - 30)
        {
            getWorld().removeObject(Block);
            dx = -dx;
            count++;
        }
        else if(Block !=null)
        {
            getWorld().removeObject(Block);
            count++;
        }
    }
    public void youLose()
    {
        if(getY() >= getWorld().getHeight() -1)
        {
            Greenfoot.stop();
            getWorld().showText("YOU LOSE!", getWorld().getWidth()/2,getWorld().getHeight()/2);
        }
    }
    public void youWin()
    {
        if(count == 48)
        {
            Greenfoot.stop();
            getWorld().showText("YOU WIN!", getWorld().getWidth()/2,getWorld().getHeight()/2);
        }
    }
}
    

