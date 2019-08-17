/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author antho
 */
public class ConstantSensor implements Sensor {
    private int number;

    public ConstantSensor (int number) {
        this.number = number;      
 
    }
    
    public boolean isOn() {
        return true;
    }
    public void on() {

    }       
    public void off() {

    }     
    public int measure() {
        return this.number;
    }
}
