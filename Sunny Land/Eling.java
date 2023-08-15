import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eling here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eling extends Actor
{
    GifImage Bergerak = new GifImage("attack.gif");
    
    private int cepatnya = 2;
    
    /**
     * Act - do whatever the Eling wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setImage(Bergerak.getCurrentImage());
       gerak();
       checkburung();
       akhirnya();
       
        // setLocation(getX()+kecepatan,getY());
        //    if(getX()>getWorld().getWidth()-100)setLocation(+100,getY());
    }
    public void gerak(){
        int lebar=getX();
        int tinggi=getY();
        setLocation(lebar-cepatnya,tinggi);
        }
    
    public void checkburung(){
        Actor Elang = getOneIntersectingObject(Eling.class);
         if(Elang != null)
         {
             getWorld().removeObject(Elang);
         }
    }
    public void akhirnya(){
        if(getX()==0){
            getWorld().removeObject(this);
        }
    }
    
}

