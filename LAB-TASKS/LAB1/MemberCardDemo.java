package LAB1;
public class MemberCardDemo
{
    public static void main(String args[])
    {
        MemberCard m1=new MemberCard("Ali","BSSE",1,500,true);
        MemberCard m2=new MemberCard("Sarah","BSCS",5,800,true);
        MemberCard m3=new MemberCard("Ahmad","BMD",3,-99,true);
        MemberCard m4=new MemberCard("Ahsan","BBA",2,100,false);
        MemberCard m5=new MemberCard("Alina","BSSE",7,200,false);
        MemberCard m6=new MemberCard("Talha","BPHY",4,50,true);
        m4.deactivateCard();
        m1.activateCard();

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);
        System.out.println("---------------------------------");
        System.out.println("Total Cards Created : " + MemberCard.getTotalCards());




    }
}
