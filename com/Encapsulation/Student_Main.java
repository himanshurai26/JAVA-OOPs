package com.Encapsulation;

public class Student_Main {
    public static void main(String[] args) {
        Student student = new Student(123, "Himanshu Kumar", 21);
        System.out.println(student);

        student.setStudentId(35);
        student.setStudentName("Himanshu Rai");
        student.setStudentAge(22);

        System.out.println("Updated details : " + student);

        //now to check else statement i am setting invalid number

        student.setStudentAge(-93);
    }
}
