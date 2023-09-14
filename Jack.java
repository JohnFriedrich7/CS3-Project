import mayflower.*;

public class Jack extends AnimatedActor
{
    private Animation jump;
    
    public Jack() 
    {
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "img/jack/Jump (" + (i + 1) + ").png";
        }
        jump = new Animation(30, arr);
        setAnimation(jump);
        jump.scale(100, 100);
        jump.setTransparency(59);
    }
    
    public void act()
    {
        super.act();
    }
}
