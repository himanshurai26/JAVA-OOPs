package com.Inheritance;

public class Main {
    public static void main(String[] args) {
        //creating an instance of dog subclass

        dog dg = new dog("canine", "Labrador");

        // Accessing properties and methods from the supercclass

        System.out.println("Species: " + dg.species);
        dg.makeSound();

        //Accessing the properties and methods specific to the subclass

        System.out.println("Breed : " + dg.breed);
        dg.fetch();
    }
}
