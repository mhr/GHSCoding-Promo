package engine;
import engine.PromoEngine;
import com.golden.gamedev.GameLoader;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.lang.Integer;
import java.lang.Boolean;
/**
 *
 * @author Kevin Wu
 */

public class PromoEngineLoader{
    public static void main(String[] argc){
        String[] arg = {"800", "640", "false"};
        PromoEngine pGameInstance = new PromoEngine();
        GameLoader game = new GameLoader();
        //if(arg == null){
            arg[0] = "800";
            arg[1] = "640";
            arg[2] = "false";
        //}
        game.setup(pGameInstance, new Dimension(Integer.parseInt(arg[0]), Integer.parseInt(arg[1])), Boolean.parseBoolean(arg[2]));
    }
}
