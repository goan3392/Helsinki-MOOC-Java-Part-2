import java.util.*;
public class Suitcase {
    private ArrayList<Thing> list;
    private int weightLimit;
    private int currentWeight;
    
    public Suitcase(int weightLimit){
        this.weightLimit = weightLimit;
        this.list = new ArrayList<Thing>();
        this.currentWeight = 0;
    }
    
    public void addThing(Thing thing){
        if(this.currentWeight + thing.getWeight() <= this.weightLimit){
            list.add(thing);
            this.currentWeight+=thing.getWeight();
        }    
    }
    
    public String toString(){
        if(list.size() == 0){
            return "empty (" + this.currentWeight + " kg)";
        } else if(list.size() == 1){
            return "1 thing (" + this.currentWeight + " kg)";
        }
        return list.size() + " things (" + this.currentWeight + " kg)";
    }
    
    public void printThings(){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }        
    }
    
    public int totalWeight(){
        return this.currentWeight;
    }
    
    public Thing heaviestThing(){
        if(list.size() == 0) return null;
        int heaviest = 0;
        Thing temp = new Thing("temp", 0);
        for(int i = 0; i < list.size(); i++){
            Thing item = list.get(i);
            if(item.getWeight() > heaviest){
                temp = item;
                heaviest = item.getWeight();
            }
        }
        return temp;
    }
    
}
