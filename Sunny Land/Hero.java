import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    GifImage berdiri = new GifImage("idle.gif");
    GifImage lari = new GifImage("lari.gif");
    GifImage loncat = new GifImage("jump.gif");
    GifImage kena = new GifImage("hurt.gif");
    
    private int kecepatan = 0;
    private int akselerasi = 1;
    private int kuat_loncat = 10;
    
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        tombol();
        gerakan();
        Greenfoot.delay(2);
        jatuh();
        kenaHero();
    }    
    private void tombol(){
        if(Greenfoot.isKeyDown("space")||darat()){
            if(Greenfoot.isKeyDown("space")){
            Greenfoot.playSound("loncat.wav");
            Greenfoot.delay(2);
            }
            lompat();
            
            //setImage(loncat.getCurrentImage());
            
    }
}
    public void kenaHero(){
        Actor elang = getOneObjectAtOffset(0,0,Eling.class);
        if(elang != null){
            setImage(kena.getCurrentImage());
            getWorld().addObject(new gameOver(),300,120);
            getWorld().addObject(new enter(),300,170);
            
            Greenfoot.playSound("kekalahan.wav");
            Greenfoot.stop();
        }
        Actor pohon = getOneObjectAtOffset(0,0,rintangan.class);
        if(pohon != null){
            setImage(kena.getCurrentImage());
            getWorld().addObject(new gameOver(),300,120);
            getWorld().addObject(new enter(),300,170);
            Greenfoot.playSound("kekalahan.wav");
            Greenfoot.stop();
            //get.World().addObject(n)
        }
    }
    public void gerakan(){
        setImage( lari.getCurrentImage());
        
    }
    public void jatuh(){
        setLocation (getX(),getY() +kecepatan);
        kecepatan = kecepatan + akselerasi;
        //setImage(berdiri.getCurrentImage());
        darat();
    }
    public void lompat(){
        kecepatan = -kuat_loncat;
        setImage(loncat.getCurrentImage());
        jatuh();
    }
    public boolean darat(){
        boolean tanah = false;
        
        
        int lebarGambar = getImage().getWidth();
        int tinggiGambar = getImage().getHeight();
        if(getOneObjectAtOffset(lebarGambar / -2,tinggiGambar / 2,Road.class) != null ||
            getOneObjectAtOffset(lebarGambar / 2,tinggiGambar / 2,Road.class) != null){
        tanah = true;
        }
        return tanah;
    }
    public void batas(){
        int tingginya = getImage().getHeight();
        if(tingginya<=5){
            jatuh();
        }
        
    }
}


