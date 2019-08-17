/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;
import java.util.*;
import moving.domain.Box;
import moving.domain.Thing;
/**
 *
 * @author antho
 */
public class Packer {
    
    private int boxesVolume;
    
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
    
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> temp = new ArrayList<Box>();
        Box tempBox = new Box(boxesVolume);
        for(int i = 0; i < things.size(); i++) {
            if(tempBox.addThing(things.get(i)) == false) {    
                temp.add(tempBox);
                tempBox = new Box(boxesVolume);
                tempBox.addThing(things.get(i));
            } 
                
        }
        temp.add(tempBox);
        return temp;
    }
}
