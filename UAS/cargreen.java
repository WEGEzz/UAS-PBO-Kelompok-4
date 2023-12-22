import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class cargreen extends parent
{
    int speed = -5;
    
    public void act()
    {
        cargreen a = new cargreen();
        Actor i = getOneIntersectingObject(carblue.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
