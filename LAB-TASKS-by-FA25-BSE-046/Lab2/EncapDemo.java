package Lab2;
public class EncapDemo
{
    public static void main (String args[])
    {
        Encap e1=new Encap();
        e1.age=10;
        System.out.println(e1.age);
        Encap.name="Ali";
        System.out.println(Encap.name);
    }
}