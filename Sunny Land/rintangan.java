import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rintangan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rintangan extends Actor
{
    private int cepatnya = 3;
    /**
     * Act - do whatever the rintangan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        gerakan();
        akhirnya();
    }    
    public void gerakan(){
        int lebar=getX();
        int tinggi=getY();
        setLocation(lebar-cepatnya,tinggi);
    }
    public void akhirnya(){
        if(getX()==0){
            getWorld().removeObject(this);
        }
    }
}
