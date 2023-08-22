package com.Inheritance;

public class VehicleTest {
    public static void main(String[] args) {
        car carobj  = new car("red",300000,"Maruti Suzuki", 2020);

        carobj.start();
        carobj.stop();
        carobj.print();
        carobj.accelerator();
    }
}
