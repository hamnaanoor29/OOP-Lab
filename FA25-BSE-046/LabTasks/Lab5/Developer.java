package LabTasks.Lab5;

public class Developer extends Employee{
    String language;
    Developer(String name,int age,int id,double salary,String language){
        super(name,age,id,salary);
        this.language=language;
    }
    void showDeveloper(){
        showEmployee();
        System.out.println("Language: "+language);
    }
}
