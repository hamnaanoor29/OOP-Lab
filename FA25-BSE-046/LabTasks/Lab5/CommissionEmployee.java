package LabTasks.Lab5;

public class CommissionEmployee extends Employee{
    double sales;
    double commissionRate;
    CommissionEmployee(String name,int age,int id,double salary,double sales,double rate) {
        super(name, age, id, salary);
        this.sales = sales;
        this.commissionRate = rate;
    }
        void displayCommissionEmployee() {
            showEmployee();
            System.out.println("Sales: " + sales);
            System.out.println("Commission Rate: " + commissionRate);
        }
    }

