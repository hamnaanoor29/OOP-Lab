package LabTasks.Lab5;

public class Employee extends Person{
    int employeeID;
    double salary;
    Employee(String name, int age, int id, double salary){
        super(name,age);
        this.employeeID=id;
        this.salary=salary;
    }
    void showEmployee(){
        display();
        System.out.println("Employee ID :" + employeeID);
        System.out.println("Salary: "+salary);

    }
}
