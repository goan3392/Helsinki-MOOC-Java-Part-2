/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.*;

/**
 *
 * @author antho
 */
public class AverageSensor implements Sensor {
    private List<Sensor> list;
    private List<Integer> arr;
    
    public AverageSensor(){
        this.list = new ArrayList<Sensor>();
        this.arr = new ArrayList<Integer>();
    }
    
    public boolean isOn() {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).isOn() == false)
                return false;
        }
        return true;
    }
    public void on() {
       for(int i = 0; i < list.size(); i++) {
           list.get(i).on();
       }
    }       
    public void off() {
        for(int i = 0; i < list.size(); i++) {
           list.get(i).off();
       }  
    }     
    public int measure() {
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).isOn() == false)
                throw new IllegalArgumentException("Error");
            else
                count+=list.get(i).measure();
        } 
        int avg = count/list.size();
        this.arr.add(avg);
        return avg;
    }
    
    public void addSensor(Sensor additional) {
        list.add(additional);
    }
    
    public List<Integer> readings() {
        return this.arr;
    }
}
