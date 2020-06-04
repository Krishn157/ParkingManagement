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
public class Vehicle {

    private int rto_no;
    private String brand;
    private String color;
    private int mileage;
    private String oid;

    public Vehicle(int rto_no, String brand, String color, int mileage,String oid) {
        this.rto_no = rto_no;
        this.brand = brand;
        this.color = color;
        this.mileage = mileage;
        this.oid = oid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getRto_no() {
        return rto_no;
    }

    public void setRto_no(int rto_no) {
        this.rto_no = rto_no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
