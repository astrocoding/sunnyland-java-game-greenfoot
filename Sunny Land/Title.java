import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 240, 1); 
        //Greenfoot.playSound("menu_pembukaan.mp3");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        judul judul = new judul();
        addObject(judul,302,84);
        judul.setLocation(299,88);
        judul.setLocation(304,91);
        enter enter = new enter();
        addObject(enter,295,134);
        enter.setLocation(313,136);
        enter.setLocation(305,135);
        
    }
}
