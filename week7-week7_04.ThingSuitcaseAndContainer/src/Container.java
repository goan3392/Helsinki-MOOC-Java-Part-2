import java.util.*;
public class Container {
    private int weightLimit;
    private ArrayList<Suitcase> scList;
    private int containerCurrent; 
    
    public Container(int weightLimit){
        this.weightLimit = weightLimit;
        scList = new ArrayList<Suitcase>();
        containerCurrent = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(containerCurrent + suitcase.totalWeight() <= weightLimit)
            scList.add(suitcase);
            this.containerCurrent+=suitcase.totalWeight();
    }
    
    public String toString(){
        return scList.size() + " suitcases (" + this.containerCurrent + " kg)";
    }
    
    public void printThings(){
        for(int i = 0; i < scList.size(); i++){
            scList.get(i).printThings();
        }
    }
    
    public int getWeightLimit(){
        return weightLimit;
    }
    
}
