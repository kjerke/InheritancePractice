/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NonfictionExample1;

/**
 *
 * @author kevinjerke
 */
public class SUV extends Car{
    String engineType;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    
    
    public void getVehicleDetails(){
        System.out.println("Brand: " + getBrandName() + "Number of doors: " + getNumberOfDoors()
                + "Gas or Diesel engine?: " + getEngineType());
    }
}
