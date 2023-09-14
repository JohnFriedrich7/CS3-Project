import mayflower.*;

public class AnimatedActor extends GravityActor
{
    private Animation ani;
    private Timer aniTimer;
    public AnimatedActor()
    {
        aniTimer = new Timer(1000);
        ani = null;
    }
    
    public void setAnimation(Animation a) {
        ani = a;
    }
    
    public void act() {
        if (ani == null) {
        }
        else {
           if (aniTimer.isDone()) {
               aniTimer.reset();
           
               MayflowerImage mayImg = ani.getNextFrame();
               setImage(mayImg);
           }
        }
        super.act();
    }
}
