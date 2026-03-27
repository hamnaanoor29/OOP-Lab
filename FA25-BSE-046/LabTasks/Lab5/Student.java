package LabTasks.Lab5;

public class Student extends Person {
    String regNo;
    Student(String name,int age,String regNo){
        super(name,age);
        this.regNo=regNo;
    }
    void showStudent(){
        display();
        System.out.println("Registration Number: "+ regNo);
    }
}
