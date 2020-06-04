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
public class Car extends Vehicle {

    private int no_of_seats;

    private String fuel_type;

    public Car(String oid,int rto_no, String brand, String color, int no_of_seats, int mileage, String fuel_type) {
        super(rto_no, brand, color, mileage,oid);
        this.no_of_seats = no_of_seats;

        this.fuel_type = fuel_type;
    }

    public int getNo_of_seats() {
        return no_of_seats;
    }

    public void setNo_of_seats(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

}
