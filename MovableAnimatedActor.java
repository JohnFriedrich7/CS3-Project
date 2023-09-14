import mayflower.*;
public class MovableAnimatedActor extends AnimatedActor
{
    private Animation walkRight;
    private Animation walkLeft;
    private Animation idle;
    private String currentAction;
    private String direction;
    private Animation idleL;
    private Animation fall;
    private Animation fallL;

    public MovableAnimatedActor()
    {
        walkRight = null;
        idle = null;
        currentAction = null;
        direction = "right";
    }

    public void setWalkRightAnimation(Animation a) {
        walkRight = a;
    }

    public void setWalkLeftAnimation(Animation a) {
        walkLeft = a;
    }

    public void setIdleAnimation(Animation a) {
        idle = a;
    }

    public void setIdleLAnimation(Animation a) {
        idleL = a;
    }

    public void setFallAnimation(Animation a) {
        fall = a;
    }

    public void setFallLAnimation(Animation a) {
        fallL = a;
    }

    public void act() {     
        String newAction = null;

        if (currentAction == null) {
            newAction = "idle";
            currentAction = "idle";
            setAnimation(idle);
        }

        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();

        if (Mayflower.isKeyDown(Keyboard.KEY_RIGHT) && (x + w < 800)){
            setLocation(x + 1, y);
            newAction = "walkRight";
            direction = "right";
            if (isBlocked())
                setLocation(x - 1, y);
            if (isFalling()) 
                newAction = "fall";
        }
        else if (Mayflower.isKeyDown(Keyboard.KEY_LEFT) && (x > 0)) {
            setLocation(x - 1, y);
            newAction = "walkLeft";
            direction = "left";
            if (isBlocked())
                setLocation(x + 1, y);
            if (isFalling()) 
                newAction = "fallLeft";
        }
        else
        {
            newAction = "idle";

            if (direction != null && direction.equals("left")){
                newAction = "idleLeft";
            }    
            if (isFalling()) {
                newAction = "fall";
                if (direction != null && direction.equals("left")){
                    newAction = "fallLeft";
                }  
            }

        }

        super.act();
        if ((newAction != null && currentAction != null) && !currentAction.equals(newAction)) {
            if (newAction.equals("idle"))
                setAnimation(idle);
            else if (newAction.equals("idleLeft"))
                setAnimation(idleL);
            else if (newAction.equals("walkRight"))
                setAnimation(walkRight);
            else if (newAction.equals("walkLeft"))
                setAnimation(walkLeft);
            else if (newAction.equals("fall"))
                setAnimation(fall);
            else if (newAction.equals("fallLeft"))
                setAnimation(fallL);
            currentAction = newAction;
        }

    }

    public void setAnimation(Animation a) {
        super.setAnimation(a);
    }
}
