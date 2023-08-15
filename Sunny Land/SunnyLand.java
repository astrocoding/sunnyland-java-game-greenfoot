import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SunnyLand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SunnyLand extends World
{
    
    /**
     * Constructor for objects of class SunnyLand.
     * 
     */
    public SunnyLand()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 240, 1); 
        siapkan();
        Greenfoot.playSound("happy.mp3");
        
    }
    public void act(){
        if(Greenfoot.getRandomNumber(100) < 2) //this will make trucks randomley apear.
        {        
            addObject(new Eling(), Greenfoot.getRandomNumber(400) + 200, 150); //this keeps trucks on the road   
        }
        if(Greenfoot.getRandomNumber(100) < 2){
            addObject(new rintangan(), Greenfoot.getRandomNumber(200)+400,200);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void siapkan()
    {
        Road road = new Road();
        addObject(road,300,230);
        Hero sunny = new Hero();
        addObject(sunny,76,204);
    }
    
}
