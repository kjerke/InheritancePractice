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
public class Automobile {
    String brandName;
    int modelYear;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
    
    public void getVehicleDetails(){
        System.out.println("Brand: " + getBrandName());
    }
}
