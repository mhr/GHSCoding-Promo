package entities;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Kevin Wu
 */
public class EntityManager extends com.golden.gamedev.object.PlayField{
    List<entities.Entity> EntityList = new ArrayList<entities.Entity>();
    public void createEntity(double x, double y, String name){
        EntityList.add(new Entity(x, y, name));
    }
}
