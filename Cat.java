import mayflower.*;

public class Cat extends MovableAnimatedActor
{
    private Animation walk;
    private Animation idle;
    private Animation walkL;
    private Animation idleL;
    private Animation fall;
    private Animation fallL;
    
    public Cat() 
    {
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "img/cat/Walk (" + (i + 1) + ").png";
        }
        walk = new Animation(30, arr);
        //walk.setBounds(18, 5, 54, 80);
        walk.scale(100, 87);
        setWalkRightAnimation(walk);
        
        String[] arr2 = new String[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = "img/cat/Idle (" + (i + 1) + ").png";
        }
        idle = new Animation(30, arr2);
        idle.scale(100, 87);
        //idle.setBounds(18, 5, 54, 80);
        setIdleAnimation(idle);
        
        String[] arr3 = new String[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = "img/cat/Walk (" + (i + 1) + ").png";
        }
        walkL = new Animation(30, arr);
        walkL.mirrorHorizontally();
        walkL.scale(100, 87);
        walkL.setTransparency(0);
        //walkL.setBounds(28, 5, 54, 80);
        setWalkLeftAnimation(walkL);
        
        String[] arr4 = new String[10];
        for (int i = 0; i < arr2.length; i++) {
            arr4[i] = "img/cat/Idle (" + (i + 1) + ").png";
        }
        idleL = new Animation(30, arr2);
        idleL.scale(100, 87);
        //idleL.setBounds(18, 5, 54, 80);
        idleL.mirrorHorizontally();
        setIdleLAnimation(idleL);
        
        String[] arr5 = new String[8];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = "img/cat/Fall (" + (i + 1) + ").png";
        }
        fall = new Animation(30, arr5);
        fall.scale(100, 87);
        //fall.setBounds(18, 5, 54, 80);
        setFallAnimation(fall);
        
        String[] arr6 = new String[8];
        for (int i = 0; i < arr5.length; i++) {
            arr6[i] = "img/cat/Fall (" + (i + 1) + ").png";
        }
        fallL = new Animation(30, arr5);
        fallL.scale(100, 87);
        //fallL.setBounds(18, 5, 54, 80);
        fallL.mirrorHorizontally();
        setFallLAnimation(fallL);
        setAnimation(fallL);
    }
    
    public void act()
    {
        super.act();
    }
}
