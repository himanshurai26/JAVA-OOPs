package com.Inheritance;

 public  class Student {

     String name;
     int rollNumber;
     int marks;

     public  void display(){

         System.out.println("Enter the marks name and rollNumber of a Student");
     }

 }

 class nine extends Student{

     public  void print()
     {
         name="Himanshu kumar";
         rollNumber = 32;
         marks = 87;

         System.out.println("Name of Student is : " + name);
         System.out.println("RollNumber of Student ins : " + rollNumber);
         System.out.println("Marks of Student is : " + marks);
     }
 }