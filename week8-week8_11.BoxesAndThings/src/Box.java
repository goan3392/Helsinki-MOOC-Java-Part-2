import java.util.*;
public class Box implements ToBeStored{
    private double maxWeight, weight;
    private ArrayList<ToBeStored> list;
    
    public Box(double weight){
        this.maxWeight = weight;
        this.weight = 0;
        list = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored obj){
        if(this.weight() + obj.weight() < this.maxWeight){
            list.add(obj);
        }
    }
    
    public double weight(){
        double weight = 0;
        for(ToBeStored obj : this.list){
            weight += obj.weight();
        }
        return weight;
    }
    
    @Override
    public String toString(){
        return "Box: " + list.size() + " things, total weight " + this.weight() + " kg";
    }
}
