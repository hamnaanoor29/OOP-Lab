package LabTasks.Lab5;
public class Main {
    public static void main(String[] args) {
        Person p=new Person("Aslam",22);
        Student s=new Student("Hamna",19,"Fa25-bse-046");
        Employee e=new Employee("Alina",21,010,6000);
        Manager m = new Manager("Ali", 30, 101, 50000, 5);
        Developer d = new Developer("Sara", 25, 102, 40000, "Java");
        CommissionEmployee c = new CommissionEmployee("Ahmed", 28, 103, 30000, 200000, 0.1);

        System.out.println("----Person----");
        p.display();
        System.out.println("\n----Student----");
        s.showStudent();
        System.out.println("\n---Empolyee---");
        e.showEmployee();
        System.out.println("\n---Manager---");
        m.showManager();
        System.out.println("\n----Developer----- ");
        d.showDeveloper();
        System.out.println("\n-----Commission Employee-----");
        c.displayCommissionEmployee();
    }
}
