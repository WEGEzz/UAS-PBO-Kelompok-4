import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class carblue extends parent
{
    int speed = 3;
    
    public void act()
    {
        carblue a = new carblue();
        Actor i = getOneIntersectingObject(carblue.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
