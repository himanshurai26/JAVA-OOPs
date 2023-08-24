package com.Encapsulation;

public class Student {
    private int studentId;
    private String studentName;
    private int studentAge;

    public Student(int studentId, String studentName, int studentAge){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;

    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentAge(int studentAge) {
       if(studentAge > 0){
           this.studentAge = studentAge;
           System.out.println("StudentAge is : " + this.studentAge);
       }else {
           System.out.println("Student age is Invalid...");
       }
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String toString(){
        return "StudentId : ," + studentId + " StudentName : ," + studentName + " Studentage : ," + studentAge  +" !";
    }
}
