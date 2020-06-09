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
public class ToyotaEngine extends Engine {
    private String type;

    public ToyotaEngine(String type, String make, float price) {
        super(make, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ToyotaEngine{" + "type=" + type + '}';
    }
    
    
    
}
