import mayflower.*;

public class Ninja extends AnimatedActor
{
    private Animation dead;
    
    public Ninja() 
    {
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "img/ninjagirl/Dead__00" + (i) + ".png";
        }
        dead = new Animation(30, arr);
        setAnimation(dead);
        dead.scale(75, 75);
        dead.setTransparency(25);
    }
    
    public void act()
    {
        super.act();
    }
}
