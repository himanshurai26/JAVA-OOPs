package com.Inheritance;

public class A_Hierarchical {
    String name;
    int age;
    public void display(){
        System.out.println("Enter you name");
    }

}

class BB extends A_Hierarchical{

    public void show(){
        name = "Himanshu Kumar";
        System.out.println("My name is : " + name);
    }
}

class CC extends A_Hierarchical{

    public void ageDisplay()
    {
       age = 21;
        System.out.println("Your age is : " + age);
    }
}