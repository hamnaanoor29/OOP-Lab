package LabTasks.Lab6;
public class Triangle extends Shapes{
    private double height;
    private double base;

    public Triangle(int y, int x, int d, double height, double base) {
        super(y, x, d);
        this.height = height;
        this.base = base;
    }

    @Override
    public void draw() {
        System.out.println("Triangle is drawn");
    }

    @Override
    public double area() {
        return 0.5*base*height;

    }

    @Override
    public void colour() {
        System.out.println("Colour of Triangle:Purple");

    }
}

