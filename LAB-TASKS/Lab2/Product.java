package Lab2;
public class Product
{
    private String name;
    private String id;
    private double price;
    private int quantity;

    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public void setid(String id)
    {
        this.id=id;
    }
    public String getid()
    {
        return id;
    }
    public void setprice(double price)
    {
        this.price=price;
    }
    public double getprice()
    {
        return price;
    }
    public void setquantity(int quantity)
    {
        this.quantity=quantity;
    }
    public int getquantity()
    {
        return quantity;
    }
}