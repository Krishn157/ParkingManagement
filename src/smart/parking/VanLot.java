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
public class VanLot extends ParkingLot{
    VanLot(String id,boolean occupied,int pid)
    {
        this.id = id;
        this.occupied = occupied;
        this.pid = pid;
    }
}
