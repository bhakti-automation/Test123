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
public class HondaEngine extends Engine{
    
    private String Pickup;

    public HondaEngine(String Pickup, String make, float price) {
        super(make, price);
        this.Pickup = Pickup;
    }

    @Override
    public String toString() {
        return "HondaEngine{" + "Pickup=" + Pickup + '}';
    }
    
    

    public String getPickup() {
        return Pickup;
    }

    public void setPickup(String Pickup) {
        this.Pickup = Pickup;
    }
    
    
}
