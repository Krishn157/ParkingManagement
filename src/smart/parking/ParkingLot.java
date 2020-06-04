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
public abstract class ParkingLot {
    protected String id;
    public static int total_capacity = 100;
    protected boolean occupied;
    protected int pid;
}
