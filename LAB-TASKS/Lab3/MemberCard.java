 package Lab3;
public class MemberCard
{
    private static int counter=1;
    private static final String PREFIX = "LIB-";
    private String cardNo;
    private String studentName;
    private String department;
    private int semester;
    private double feePaid;
    private boolean active;


    public MemberCard()
    {this("Default MemberCard");}


    public MemberCard(String studentName)
    {this(studentName,"Unknown");}

    public MemberCard(String studentName, String department)
    {this(studentName, department,1);}

    public MemberCard(String studentName, String department, int semester)
    {this(studentName,department,semester,1);}

    public MemberCard(String studentName, String department, int semester, double feePaid)
    {this(studentName,department,semester,feePaid,true);}

    public MemberCard(String studentName, String department, int semester, double feePaid, boolean active)
    {this.cardNo = generateCardNo();
        setstudentName(studentName);
        setdepartment(department);
        setsemester(semester);
        setfeePaid(feePaid);
        setactive(active);


    }

    public MemberCard(MemberCard other)
    {
        this.studentName = other.studentName;
        this.department = other.department;
        this.semester = other.semester;
        this.feePaid = other.feePaid;
        this.active = other.active;
    }

    public static int getTotalCards()
    {return counter -1;}

    public void setstudentName(String studentName)
    {
        if (studentName == null || studentName.trim().isEmpty()) {
            this.studentName = "Unknown";
        } else {
            this.studentName = studentName.trim();
        }
    }

    public void setdepartment(String department) {
        if (department == null || department.trim().isEmpty()) {
            this.department = "BSSE";
        } else {
            this.department = department.trim();
        }
    }

    public void setsemester(int semester) {
        if (semester<=0) {
            this.semester = 1;
        } else {
            this.semester = semester;
        }
    }

    public void setfeePaid(double feePaid) {
        if (feePaid < 0) {
            System.out.println("Fee cannot be negative. Setting to 0.");
            this.feePaid = 0;
        } else {
            this.feePaid = feePaid;
        }
    }

    public void setactive(boolean active) {
        if (active == true) {

            this.active = true;
        } else {
            this.active = active;

        }
    }

    public void activateCard()
    {
        active = true;
    }

    public void deactivateCard()
    {
        active = false;
    }

    public String studentName()
    { return studentName;}

    public String department()
    { return department;}


    public int semester()
    { return semester;}


    public double feePaid()
    { return feePaid;}


    public boolean active()
    { return active;}

    private static String generateCardNo()
    {return PREFIX + String.format("%04d", counter++);}

    public String toString() {
        System.out.println("-----------------------------");
        return "Card No: " + cardNo +
                "\nName: " + studentName +
                "\nDepartment: " + department +
                "\nSemester: " + semester +
                "\nFee Paid: " + feePaid +
                "\nActive: " + active;

    }

}