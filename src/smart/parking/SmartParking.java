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
public class SmartParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        String admin_password = "admin123";

        Scanner sc = new Scanner(System.in);
        Admin ad = new Admin();
        String ep;
        String q;
        User us;
        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("************* SMART PARKING MANAGEMENT SYSTEM *************");
            System.out.println();
            System.out.println("1.Park your Vehicle");
            System.out.println("2.Unpark your Vehicle");
            System.out.println("3.Display List of Vehicles parked");
            System.out.println("4.Display Statistics");
            System.out.println("5.Display Price Chart");
            System.out.println("6.Search for a Vehicle by rto_no");
            System.out.println("7.Exit");
            System.out.println();
            System.out.println();
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
//                    System.out.println("1");
                    System.out.println();
                    System.out.println();
                    System.out.println("*********************************************************");
                    System.out.println("Enter user details: ");
//                    System.out.print("1.Enter userid: ");
                    String uid = UUID.randomUUID().toString();
                    System.out.print("1.Enter username: ");
                    String name = sc.next();
                    System.out.print("2.Enter user email: ");
                    String email = sc.next();
                    System.out.print("3.Enter user address: ");
                    String address = sc.next();
                    us = new User(uid, name, email, address);
                    userList.add(us);
                    us.park(uid);
                    System.out.println();
                    System.out.println();
                    System.out.println("*********************************************************");
                    System.out.print("Press any key to return to main menu: ");
                    q = sc.next();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
//                    System.out.println("2");
                    System.out.println();
                    System.out.println();
                    System.out.println("*********************************************************");
                    System.out.print("Enter username: ");
                    String un = sc.next();

                    if (!userList.isEmpty()) {
                        Iterator<User> it = userList.iterator();
                        while (it.hasNext()) {
                            User user = it.next();
                            if (user.getName().equalsIgnoreCase(un)) {
                                user.unPark();
                                it.remove();

                            } else {
                                System.out.println(un + " Has no vehicles parked here !");
                            }
                        }
                    } else {
                        System.out.println("No registered users !");
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println("*********************************************************");
                    System.out.print("Press any key to return to main menu: ");
                    q = sc.next();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 3:
                    //List of Vehicles Parked
                    System.out.print("Enter admin password: ");
                    ep = sc.next();
                    if (ep.equals(admin_password)) {
                        ad.displayVehiclesParked();
                    } else {
                        System.out.println("Error!, Incorrect admin password, try again");
                    }
                    System.out.print("Press any key to return to main menu: ");
                    q = sc.next();
                    break;
                case 4:
                    System.out.print("Enter admin password: ");
                    ep = sc.next();
                    if (ep.equals(admin_password)) {
                        ad.displayStatistics();
                    } else {
                        System.out.println("Error!, Incorrect admin password, try again");
                    }
                    System.out.print("Press any key to return to main menu: ");
                    q = sc.next();
                    break;
                case 5:
                    //display chart
                    System.out.print("Enter admin password: ");
                    ep = sc.next();
                    if (ep.equals(admin_password)) {
                        ad.displayPrice();
                    } else {
                        System.out.println("Error!, Incorrect admin password, try again");
                    }
                    System.out.print("Press any key to return to main menu: ");
                    q = sc.next();
                    break;
                case 6:

                    System.out.println();
                    System.out.println();
                    System.out.println("*********************************************************");
                    System.out.print("Enter username: ");
                    String un6 = sc.next();
                    if (un6.equalsIgnoreCase("admin")) {
                        System.out.print("Enter admin password: ");
                        ep = sc.next();
                        if (ep.equals(admin_password)) {
                            System.out.println();
                            System.out.println("*** Welcome Admin ***");

                            ad.searchVehicle();
                        } else {
                            System.out.println("Error!, Incorrect admin password, try again");
                        }

                    } else {

                        if (!userList.isEmpty()) {
                            Iterator<User> it = userList.iterator();
                            while (it.hasNext()) {
                                User user = it.next();
                                if (user.getName().equalsIgnoreCase(un6)) {
                                    user.searchVehicle();

                                } else {
                                    System.out.println(un6 + " Has no vehicles parked here !");
                                }
                            }
                        } else {
                            System.out.println("No registered users !");
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println("*********************************************************");
                    System.out.print("Press any key to return to main menu: ");
                    q = sc.next();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Program is now Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again !");
            }
        }

    }

}
