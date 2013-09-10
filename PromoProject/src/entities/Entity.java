package entities;

/**
 *
 * @author Kevin Wu
 */
public class Entity extends com.golden.gamedev.object.SpriteGroup{
    private double xpos;
    private double ypos;
    private double deltay;
    private double deltax;
    private int mass;
    public Entity(double x, double y, String name){
        super(name);
        this.xpos = x;
        this.ypos = y;
    }
    public void update(long delta){
        
    }
}
