package com.Encapsulation;

public class Person {
    private String name;
    private int age;

    private String getName(){
        return name;
    }

    private void setName(String name){
        this.name = name;
    }

    private int getAge(){
        return age;
    }

    private void  setAge(int age){
       if(age > 0){
           this.age = age;
       }else {
           System.out.println("Age not defined");
       }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Himanshu Kumar");
        person.setAge(21);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        //Now to check else is working or not i am setting invalid number

        person.setAge(-45);
    }


}
