package engine;
import com.golden.gamedev.Game;
import com.golden.gamedev.GameLoader;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.io.File;
import java.util.Map;
import java.awt.image.*;
/**
 *
 * @author Kevin Wu
 */
public class PromoEngine extends com.golden.gamedev.Game{
    private static PromoEngine engineInstance;
    private PromoEngine(){
        
    }
    public static void main(String[] argc){
                String[] arg = {"800", "640", "false"};
                //if(arg == null){
                    arg[0] = "800";
                    arg[1] = "640";
                    arg[2] = "false";
                //}
                GameLoader game = new GameLoader();
                game.setup(getEngineInstance(), new Dimension(Integer.parseInt(arg[0]), Integer.parseInt(arg[1])), Boolean.parseBoolean(arg[2]));
    }
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
    public static PromoEngine getEngineInstance(){
        if(engineInstance == null){
                engineInstance = new PromoEngine();
        }
        return engineInstance;
    }
    public void loadWorld(){
        
    }
    public void loadEntities(){
        
    }
    public void getSprite(String id){
        sprites.get(id);
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
