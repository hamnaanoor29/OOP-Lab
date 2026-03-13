package Lab2;
public class Main
{
    public static void main (String args[])
    {
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();
        Product p4=new Product();
        p1.setname("Ali");
        p2.setid("F234");
        p3.setprice(800);
        p4.setquantity(1);
        System.out.println(p1.getname());
        System.out.println(p2.getid());
        System.out.println(p3.getprice());
        System.out.println(p4.getquantity());
    }
}