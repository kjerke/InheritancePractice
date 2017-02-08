/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NonfictionExample3;

/**
 *
 * @author kevinjerke
 */
public class Tablet extends MobileComputer{
    String screenSize;
    String software;

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }
    
    
    public void getDeviceDetails(){
        System.out.println("Type of device: " + getTypeOfComputer() + "Screen Size: " + getScreenSize());
    }
}
