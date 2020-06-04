/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.parking;

import java.util.*;
import java.util.UUID;

/**
 *
 * @author Krishn
 */
public class User extends StakeHolders {

    private String name;
    private String email;
    private String address;
    Scanner sc = new Scanner(System.in);

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Functions Performed
    void park(String oid) {
        //Parking 
        System.out.println("Enter Vehicle details");
        System.out.print("1.Enter rto_no. : ");
        int rt = sc.nextInt();
        System.out.print("2.Enter brand : ");
        String b = sc.next();
        System.out.print("3.Enter color: ");
        String c = sc.next();
        System.out.print("3.Enter mileage: ");
        int m = sc.nextInt();
        System.out.print("5.Enter Vehicle type: Car/Bike/Van ? ");
        String type = sc.next();
        if (type.equalsIgnoreCase("Car")) {
            if(carParking.size() < carSpace)
            {
            System.out.print("Enter no. of seats: ");
            int ns = sc.nextInt();
            System.out.print("Enter fuel type [petrol/diesel] :");
            String ft = sc.next();
            carList.add(new Car(oid, rt, b, c, m, ns, ft));
            String lotid = UUID.randomUUID().toString();
            carParking.add(new CarLot(lotid, true, rt));
            System.out.println();
            System.out.println();
            System.out.println("Parked in CarLot with id: " + lotid);
            System.out.println();
            System.out.println("**************** Car Succesfully Parked ! *******************");
            }
            else
            {
                System.out.println();
                System.out.println("** Sorry, but this lot is full. Please wait ");
            }
        } else if (type.equalsIgnoreCase("Bike")) {
            if(bikeParking.size() <= bikeSpace)
            {
            System.out.print("Enter fuel capacity: ");
            int fc = sc.nextInt();
            bikeList.add(new MotorBike(oid, fc, rt, b, c, m));
            String lotid = UUID.randomUUID().toString();
            bikeParking.add(new BikeLot(lotid, true, rt));
            System.out.println();
            System.out.println();
            System.out.println("Parked in BikeLot with id: " + lotid);
            System.out.println();
            System.out.print("************** Bike Successfully Parked ! ****************");
            }
            else
            {
                System.out.println();
                System.out.println("** Sorry, but this lot is full. Please wait ");
            }
        } else if (type.equalsIgnoreCase("Van")) {
            if(vanParking.size() <= vanSpace)
            {
            System.out.print("Enter no. of seats: ");
            int ns = sc.nextInt();
            System.out.print("Enter fuel type [petrol/diesel] :");
            String ft = sc.next();
            vanList.add(new Van(oid, rt, b, c, m, ns, ft));
            String lotid = UUID.randomUUID().toString();
            vanParking.add(new VanLot(lotid, true, rt));
            System.out.println();
            System.out.println();
            System.out.println("Parked in VanLot with id: " + lotid);
            System.out.println();
            System.out.println("******************* Van Successfuly parked ! ******************");
            }
            else
            {
                System.out.println();
                System.out.println("** Sorry, but this lot is full. Please wait ");
            }
        } else {
            System.out.println("No parking for this type !");
        }

    }

    void unPark() {
        //Unparking

        System.out.print("Enter Vehicle type: Car/Bike/Van ? ");
        String type = sc.next();
        System.out.print("Enter Vehicle rto_no: ");
        int rn = sc.nextInt();
        if (type.equalsIgnoreCase("Car")) {

            Iterator<Car> ct = carList.iterator();
            while (ct.hasNext()) {
                Car car = ct.next();
                if (id.equals(car.getOid())) {
                    Iterator<CarLot> cpt = carParking.iterator();
                    while (cpt.hasNext()) {
                        CarLot cl = cpt.next();
                        if (cl.pid == car.getRto_no() && car.getRto_no() == rn) {
                            cpt.remove();
                        } else {
                            System.out.println("Error!, You can unpark only your own vehicle!");
                            System.exit(0);
                        }
                    }
                    ct.remove();
                }
            }
            makePayment();
            Admin.acceptPayment();
            System.out.println();
            System.out.println();
            System.out.println("******************* Car Successfuly Unparked! ******************");
        } else if (type.equalsIgnoreCase("Van")) {
            Iterator<Van> vt = vanList.iterator();
            while (vt.hasNext()) {
                Van van = vt.next();
                if (id.equals(van.getOid())) {
                    Iterator<VanLot> vpt = vanParking.iterator();
                    while (vpt.hasNext()) {
                        VanLot vl = vpt.next();
                        if (vl.pid == van.getRto_no() && van.getRto_no() == rn) {
                            vpt.remove();
                        } else {
                            System.out.println("Error!, You can unpark only your own vehicle!");
                            System.exit(0);
                        }
                    }
                    vt.remove();
                }
            }
            makePayment();
            Admin.acceptPayment();
            System.out.println();
            System.out.println();
            System.out.println("******************* Van Successfuly Unparked! ******************");
        } else if (type.equalsIgnoreCase("Bike")) {
            Iterator<MotorBike> bt = bikeList.iterator();
            while (bt.hasNext()) {
                MotorBike bike = bt.next();
                if (id.equals(bike.getOid())) {
                    Iterator<BikeLot> bpt = bikeParking.iterator();
                    while (bpt.hasNext()) {
                        BikeLot bl = bpt.next();
                        if (bl.pid == bike.getRto_no() && bike.getRto_no() == rn) {
                            bpt.remove();
                        } else {
                            System.out.println("Error!, You can unpark only your own vehicle!");
                            System.exit(0);
                        }
                    }
                    bt.remove();
                }
            }
            makePayment();
            Admin.acceptPayment();
            System.out.println();
            System.out.println();

            System.out.println("******************* Bike Successfuly Unparked! ******************");
        } else {
            System.out.println("No parking for this type !");
        }

    }

    @Override
    void searchVehicle() {
        //Search his own vehicle

        System.out.print("Enter Vehicle type: Car/Bike/Van ? ");
        String type = sc.next();
        System.out.print("Enter Vehicle rto_no: ");
        int rn = sc.nextInt();
        if (type.equalsIgnoreCase("Car")) {

            Iterator<Car> ct = carList.iterator();
            while (ct.hasNext()) {
                Car car = ct.next();
                if (id.equals(car.getOid())) {
                    Iterator<CarLot> cpt = carParking.iterator();
                    while (cpt.hasNext()) {
                        CarLot cl = cpt.next();
                        if (cl.pid == car.getRto_no() && car.getRto_no() == rn) {
                            System.out.println("Car with rto_no: " + car.getRto_no() + " Found in CarLot with id: " + cl.id);
                        } else {
                            System.out.println("Error!, You can search for only your own vehicle!");
                            System.exit(0);
                        }
                    }

                }
            }
            System.out.println();
            System.out.println();
            System.out.println("******************* Car Successfuly Found! ******************");
        } else if (type.equalsIgnoreCase("Van")) {
            Iterator<Van> vt = vanList.iterator();
            while (vt.hasNext()) {
                Van van = vt.next();
                if (id.equals(van.getOid())) {
                    Iterator<VanLot> vpt = vanParking.iterator();
                    while (vpt.hasNext()) {
                        VanLot vl = vpt.next();
                        if (vl.pid == van.getRto_no() && van.getRto_no() == rn) {
                            System.out.println("Van with rto_no: " + van.getRto_no() + " Found in VanLot with id: " + vl.id);
                        } else {
                            System.out.println("Error!, You can search for only your own vehicle!");
                            System.exit(0);
                        }
                    }

                }
            }
            System.out.println();
            System.out.println();
            System.out.println("******************* Van Successfuly Found! ******************");
        } else if (type.equalsIgnoreCase("Bike")) {
            Iterator<MotorBike> bt = bikeList.iterator();
            while (bt.hasNext()) {
                MotorBike bike = bt.next();
                if (id.equals(bike.getOid())) {
                    Iterator<BikeLot> bpt = bikeParking.iterator();
                    while (bpt.hasNext()) {
                        BikeLot bl = bpt.next();
                        if (bl.pid == bike.getRto_no() && bike.getRto_no() == rn) {
                            System.out.print("Bike with rto_no: " + bike.getRto_no() + " Found in BikeLot with id: " + bl.id);
                        } else {
                            System.out.println("Error!, You can search for only your own vehicle!");
                            System.exit(0);
                        }
                    }

                }
            }
            System.out.println();
            System.out.println();
            System.out.println("******************* Bike Successfuly Found! ******************");
        } else {
            System.out.println("No parking for this type !");
        }

    }

    private void makePayment() {
        System.out.println();
        System.out.println("Parkin fee paid ");

    }

}
