/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.parking;

import java.util.*;

/**
 *
 * @author Krishn
 */
public class Admin extends StakeHolders {

    String id = "Parking_Administrator";

    Scanner sc = new Scanner(System.in);

    //Functions Performed
    void displayVehiclesParked() {
        //to dispaly list of vehicles parked
        System.out.println("************* LIST OF CARS PARKED ************");
        int cc = 1;
        System.out.println();
        if (carList.isEmpty()) {
            System.out.println("   No Cars Parked Yet :( ");
        }
        for (Car car : carList) {
            System.out.println(cc + ". RTO Number: " + car.getRto_no());
            System.out.println("Owned By: " + car.getOid());
            System.out.println("Brand: " + car.getBrand());
            System.out.println("Color: " + car.getColor());
            cc++;
        }
        System.out.println("*************************************************");
        System.out.println();
        System.out.println();
        System.out.println("************* LIST OF BIKES PARKED ************");
        int bc = 1;
        System.out.println();
        if (bikeList.isEmpty()) {
            System.out.println("   No Bikes Parked Yet :( ");
        }
        for (MotorBike bike : bikeList) {
            System.out.println(bc + ". RTO Number: " + bike.getRto_no());
            System.out.println("Owned By: " + bike.getOid());
            System.out.println("Brand: " + bike.getBrand());
            System.out.println("Color: " + bike.getColor());
            bc++;
        }
        System.out.println("*************************************************");
        System.out.println();
        System.out.println();
        System.out.println("************* LIST OF BIKES PARKED ************");
        int vc = 1;
        System.out.println();
        if (vanList.isEmpty()) {
            System.out.println("   No Vans Parked Yet :( ");
        }
        for (Van van : vanList) {
            System.out.println(vc + ". RTO Number: " + van.getRto_no());
            System.out.println("Owned By: " + van.getOid());
            System.out.println("Brand: " + van.getBrand());
            System.out.println("Color: " + van.getColor());
            vc++;
        }
        System.out.println("*************************************************");
        System.out.println();
        System.out.println();

    }

    void displayStatistics() {
        //to display statistics
        System.out.println("************* SYSTEM STATISTICS *************");
        System.out.println();
        System.out.println("**** PARKING LOT STATISTICS ****");
        System.out.println();
        System.out.println("Total Capacity of Parking Lot: " + ParkingLot.total_capacity);
        System.out.println("Total number of Car Parkings available: " + carSpace);
        System.out.println("Total number of Van Parkings available: " + vanSpace);
        System.out.println("Total number of Bike Parkings available: " + bikeSpace);
        System.out.println("Number of Car Parkings occupied: " + carParking.size());
        System.out.println("Number of Van Parkings occupied: " + vanParking.size());
        System.out.println("Number of Bike Parkings occupied: " + bikeParking.size());
        System.out.println();
//        System.out.println("**** VEHICLE STATISTICS ****");
//        System.out.println();
//        System.out.println("Number of Cars Parked " + carList.size());
//        System.out.println("Number of Van Parked " + vanList.size());
//        System.out.println("Number of bike Parked " + bikeList.size());
        System.out.println();
        System.out.println("*************************************************");
        System.out.println();
        System.out.println();
    }

    void displayPrice() {
        //to display price chart
        System.out.println("******** PARKING PRICE CHART ************");
        System.out.println();
        System.out.println("Car : Rs.40/hr");
        System.out.println("Van : Rs.60/hr");
        System.out.println("Bike : Rs.20/hr");
        System.out.println("******************************************");
    }

    @Override
    void searchVehicle() {
        // Search Vehicle by rto_no.

        System.out.print("Enter Vehicle type: Car/Bike/Van ? ");
        String type = sc.next();
        System.out.print("Enter Vehicle rto_no: ");
        int rn = sc.nextInt();
        if (type.equalsIgnoreCase("Car")) {

            Iterator<CarLot> cpt = carParking.iterator();
            while (cpt.hasNext()) {
                System.out.println("now here");
                CarLot cl = cpt.next();
                if (cl.pid == rn) {
                    System.out.println("Car with rto_no: " + rn + " Found in CarLot with id: " + cl.id);
                } else {
                    System.out.println("No such vehicle parked here! ");

                }
            }

        } else if (type.equalsIgnoreCase("Bike")) {
            Iterator<BikeLot> bpt = bikeParking.iterator();
            while (bpt.hasNext()) {
                BikeLot bl = bpt.next();
                if (bl.pid == rn) {
                    System.out.print("Bike with rto_no: " + rn + " Found in BikeLot with id: " + bl.id);
                } else {
                    System.out.println("No such vehicle parked here! ");
                }
            }
        } else if (type.equalsIgnoreCase("Van")) {
            Iterator<VanLot> vpt = vanParking.iterator();
            while (vpt.hasNext()) {
                VanLot vl = vpt.next();
                if (vl.pid == rn) {
                    System.out.println("Van with rto_no: " + rn + " Found in VanLot with id: " + vl.id);
                } else {
                    System.out.println("No such vehicle parked here! ");
                }
            }
        } else {
            System.out.println("Parking not available for such type");
        }
    }

    public static void acceptPayment() {
        System.out.println();
        System.out.println("Payment accepted by Admin");
        System.out.println();
    }

}
