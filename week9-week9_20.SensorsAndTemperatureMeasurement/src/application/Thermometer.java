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
public class Thermometer implements Sensor{
    
    private ConstantSensor sensor;
    private boolean current;
    
    public Thermometer() {
        this.sensor = new ConstantSensor(0);
        this.current = false;
     }
     
    
    public boolean isOn() {
        return this.current;
    }
    public void on() {
        this.current = true;
    }       
    public void off() {
        this.current = false;    
    }     
    public int measure() {
        if(this.sensor.isOn()){
            Random rand = new Random();
            return rand.nextInt(61)-30;
        } throw new IllegalArgumentException("Error");
    }
    
}
