package com.Inheritance;

public class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year)
    {
        this.brand = brand;
        this.year = year;
    }

    public void start(){
        System.out.println("Vehicle started.......");
    }

    public void stop() {
        System.out.println("Vehicle stop..............");
    }
}

class car extends Vehicle{
    String color;
    int prize;

    public car(String color, int prize, String brand, int year ){
        super(brand, year);
        this.color = color;
        this.prize = prize;
    }

    public void print(){
        System.out.println("Car Brand : " + brand);
        System.out.println("Model Number : " + year);
        System.out.println("Car COlor : " + color);
        System.out.println("Car prize : " + prize);
    }
    public void accelerator()
    {
        System.out.println("press accelerator to increase the speed");
    }
}
