package com.Inheritance;

public class A {
    int a, b, c;

    public void add(){
        a = 10; b = 30;
        c = a + b;

        System.out.println("Sum of a and b is : " + c);
    }

    public void substract()
    {
        a = 500;
        b = 200;

        c = a - b;

        System.out.println("Differences of a and b  is : " + c);
    }
}

class B extends A{

    public void multi(){
         a = 40;
        b = 30;

        c = a * b;

        System.out.println("Multiplication of a and b is : " + c);
    }

    public void divide()
    {
        a = 40;
        b = 20;

        c = a /b;
        System.out.println("Divion of a and b is : " + c);
    }
}

class c extends  B{

    public void divide(){
        a = 30; b = 20;
        c = a / b;
        System.out.println("divison of clas c is : " + c);
    }

    public void remainder(){
        a = 50;
        b = 10;

        c = a % b;

        System.out.println("Remainder of a and b is : " + c);
    }
}