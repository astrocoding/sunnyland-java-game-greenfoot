import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enter extends Actor
{
    /**
     * Act - do whatever the enter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        klikaja();
    }   
    public void klikaja(){
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new SunnyLand());
        } else {
            Greenfoot.setWorld(new Title());
        }
    }
}
