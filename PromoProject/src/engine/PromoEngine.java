package engine;
import com.golden.gamedev.Game;
import java.awt.Graphics2D;
import java.io.File;
import java.util.Map;
import java.awt.image.*;
/**
 *
 * @author Kevin Wu
 */
public class PromoEngine extends com.golden.gamedev.Game{
    private Map<String, java.awt.image.BufferedImage> sprites;
    @Override
    public void initResources(){
        File spritesFolder = new File("sprites");
        File[] spritesFiles = spritesFolder.listFiles(); //trusts that all files are images.
        for(int i = 0; spritesFiles[i++] != null; i++){
            BufferedImage image = getImage(spritesFiles[i].getName());
            sprites.put(image.getSource().toString().replace(".png", ""), image);
        }
    }
    public void loadWorld(){
        
    }
    public void loadEntities(){
        
    }
    public void getSprite(String id){
        
    }
    public void initPlayer(){
        
    }
    @Override
    public void update(long delta){
        //do math here.
    }
    @Override
    public void render(Graphics2D graphics){
        //render things here.
    }
}
