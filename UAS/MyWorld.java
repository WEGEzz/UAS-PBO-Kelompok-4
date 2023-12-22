import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ambulane ambulane = new ambulane();
        addObject(ambulane,380,553);
        ambulane.setLocation(303,546);
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new carblue(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
        if(Greenfoot.getRandomNumber(500)<1){
            addObject(new cargreen(), Greenfoot.getRandomNumber(200) + 200, 600);
        }
        if(Greenfoot.getRandomNumber(10)<2){
            addObject(new tree(), Greenfoot.getRandomNumber(170), 0);
            addObject(new tree(), Greenfoot.getRandomNumber(170) + 440, 0);
        }
        if(Greenfoot.getRandomNumber(300)<1){
            addObject(new coin(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
    }
}
