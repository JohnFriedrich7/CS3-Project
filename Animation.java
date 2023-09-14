import mayflower.*;

public class Animation
{
    private MayflowerImage[] frames;
    private int framerate;
    private int currentFrame;
    
    public Animation(int num, String[] arr) {
        frames = new MayflowerImage[arr.length];
        for (int i = 0; i < frames.length; i++) {
            frames[i] = new MayflowerImage(arr[i]);
        }
        framerate = num;
        currentFrame = 0;
    }
    
    public int getFrameRate() {
        return framerate;
    }
    
    public void scale(int w, int h) {
        for (int i = 0; i < frames.length; i++)
            frames[i].scale(w, h);
    }
    
    public void setTransparency(int percent) {
        for (int i = 0; i < frames.length; i++)
            frames[i].setTransparency(percent);
    }
    
    public void mirrorHorizontally() {
        for (int i = 0; i < frames.length; i++)
            frames[i].mirrorHorizontally();
    }
    
    public void setBounds(int x, int y, int w, int h) {
        for (int i = 0; i < frames.length; i++)    
            frames[i].crop(x, y, w, h);
    }
    
    MayflowerImage getNextFrame() {
        currentFrame %= frames.length;
        MayflowerImage img = frames[currentFrame];
        currentFrame++;
        return img;
    }
}
