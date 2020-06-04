/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.parking;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krishn
 */
public abstract class StakeHolders {

    protected String id;
    static int carSpace = ParkingLot.total_capacity / 2;
    static int bikeSpace = ParkingLot.total_capacity / 3;
    static int vanSpace = ParkingLot.total_capacity - (carSpace + bikeSpace);
    static List<Car> carList = new ArrayList<>();
    static List<MotorBike> bikeList = new ArrayList<>();
    static List<Van> vanList = new ArrayList<>();
    static List<CarLot> carParking = new ArrayList<>(carSpace);
    static List<BikeLot> bikeParking = new ArrayList<>(bikeSpace);
    static List<VanLot> vanParking = new ArrayList<>(vanSpace);

    abstract void searchVehicle();
}
