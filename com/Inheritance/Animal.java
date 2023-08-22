package com.Inheritance;


//example of inheritance

//superclass
public class Animal {
    String species;

    //constructor
    public Animal(String species){
        this.species = species;
    }

    //method
    public void makeSound()
    {
        System.out.println("Animal makes sound..........");
    }
}

class dog extends Animal{

    String breed;

    public dog(String species, String breed)
    {
        super(species);
        this.breed = breed;
    }

    //method for dog class


    @Override
    public void makeSound() {

       super.makeSound();
        System.out.println("DOg barks");
    }

    // this is additional method that will invoke

    public void fetch(){
        System.out.println("Dog is pet Animal...... ");
    }
}



