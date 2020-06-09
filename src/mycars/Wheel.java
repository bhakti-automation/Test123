/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycars;

/**
 *
 * @author virad
 */
public class Wheel {
    
    private String make;
    private float price;

    public Wheel(String make, float price) {
        this.make = make;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wheel{" + "make=" + make + ", price=" + price + '}';
    }
    
    
    
}
