package TheoryAssignments.Assignment1;

public class Demo {
    public static void main(String args[]){
        Company company=new Company("CineStar",3);
        CityCinema c1=new CityCinema("Lahore Emporium",4,"Lahore");
        CityCinema c2=new CityCinema("Ocean Mall",5,"Karachi");
        CityCinema c3=new CityCinema("Mall of Multan",3,"Multan");
        company.branches[0]=c1;
        company.branches[1]=c2;
        company.branches[2]=c3;
        System.out.println(company);

    }
}
