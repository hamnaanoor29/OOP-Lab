package TheoryAssignments.Assignment1;

public class Company {
    String companyName;
    CityCinema[] branches;
    Company(  String companyName,int branchCount){
        this.companyName=companyName;
       branches=new CityCinema[branchCount];
    }
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Company" + companyName + "\n");
        for (int i = 0; i < branches.length; i++) {
            stringBuilder.append(branches[i] + "\n");

        }
        return stringBuilder.toString();
    }



}
