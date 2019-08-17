/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.*;
/**
 *
 * @author antho
 */
public class Item implements Thing, Comparable<Item>{
    private String name;
    private int volume;
    
    public Item(String name, int volume){
        this.name = name;
        this.volume = volume;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return name + " (" + this.getVolume() + " dm^3)";
    }

    public int compareTo(Item o) {
        if(this.getVolume() == o.getVolume())
            return 0;
        else if(this.getVolume() < o.getVolume())
            return -1;
        return 1;
    }

}
