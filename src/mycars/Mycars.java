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
public class Mycars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     

        Engine te1 = new ToyotaEngine("6c", "toyota", 6270F);
        Engine he1 = new HondaEngine("fast", "honda", 4560F);
        ArrayList<Wheel> wheels = new ArrayList<Wheel>();
        Wheel w1 = new Wheel("toyota", 100F);
        wheels.add(w1);
        wheels.add(w1);
        wheels.add(w1);
        wheels.add(w1);
        
        ArrayList<Wheel> wheels2 = new ArrayList<Wheel>();
        Wheel w2 = new Wheel("Honda", 120F);
        wheels2.add(w2);
        wheels2.add(w2);
        wheels2.add(w2);
        wheels2.add(w2);
   
        Car car1 = new Car(111,"toyota", "red",  24000F, te1, wheels);
        System.out.println(car1);
        
        Car car2 = new Car(111,"toyota", "red",  24000F, he1, wheels2);
        System.out.println(car2);
    }
    
}
