package LabTasks.Lab5;

public class Manager extends Employee {
    int teamSize;
    Manager(String name,int age,int id,double salary,int teamSize){
        super(name,age,id,salary);
        this.teamSize=teamSize;
    }
    void showManager(){
        showEmployee();
        System.out.println("Team Size : "+teamSize);
    }
}
