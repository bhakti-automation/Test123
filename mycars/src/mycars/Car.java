/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycars;

import java.util.ArrayList;

/**
 *
 * @author virad
 */
public class Car {
    
    private int vin;
    private String make;
    private String color;
    private float price; 
    private Engine engine;// has a relationship
    ArrayList<Wheel> wheels; //has a relationship

    @Override
    public String toString() {
        return "Car{" + "vin=" + vin + ", make=" + make + ", color=" + color + ", price=" + price + ", engine=" + engine + ", wheels=" + wheels + '}';
    }

    public Car(int vin, String make, String color, float price, Engine engine, ArrayList<Wheel> wheels) {
        this.vin = vin;
        this.make = make;
        this.color = color;
        this.price = price;
        this.engine = engine;
        this.wheels = wheels;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }
    
    
    
    
    
}
