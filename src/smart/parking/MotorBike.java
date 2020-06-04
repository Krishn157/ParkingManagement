/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.parking;

/**
 *
 * @author Krishn
 */
public class MotorBike extends Vehicle {
   
    private int fuel_capacity;

    public MotorBike(String oid,int fuel_capacity, int rto_no, String brand, String color, int mileage) {
        super(rto_no, brand, color, mileage,oid);
        this.fuel_capacity = fuel_capacity;
    }

    public int getFuel_capacity() {
        return fuel_capacity;
    }

    public void setFuel_capacity(int fuel_capacity) {
        this.fuel_capacity = fuel_capacity;
    }
    
    
    
}
