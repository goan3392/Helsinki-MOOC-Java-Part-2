
package moving.domain;
import java.util.*;
/**
 *
 * @author antho
 */
public class Box implements Thing{
    private int maximumCapacity;
    private List<Thing> list;
    
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.list = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        if(this.getVolume() + thing.getVolume() > maximumCapacity) return false;
        list.add(thing);
        return true;
    }
    
    public int getVolume(){
        int total = 0;
        for(int i = 0; i < list.size(); i++){
            total+= this.list.get(i).getVolume();
        }
        return total;
    }
    
    public void clear() {
        this.list.clear();
    }
}
