package LabTasks.Lab6;
public class Rectangle extends Shapes{
    private double length;
    private double width;

    public Rectangle(int y, int x, int d, double length, double width) {
        super(y, x, d);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle is drawn");
    }

    @Override
    public double area() {
        return length*width;

    }

    @Override
    public void colour() {
        System.out.println("Colour of Rectangle:Red");
    }
}

