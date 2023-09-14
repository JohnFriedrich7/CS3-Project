import mayflower.*;

public class Dog extends AnimatedActor
{
    private Animation dead;
    
    public Dog() 
    {
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "img/dog/Dead (" + (i + 1) + ").png";
        }
        dead = new Animation(30, arr);
        setAnimation(dead);
        dead.scale(50, 50);
        dead.setTransparency(76);
    }
    
    public void act()
    {
        super.act();
    }
}
