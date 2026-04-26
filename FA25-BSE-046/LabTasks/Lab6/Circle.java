package LabTasks.Lab6;
public class Circle extends Shapes {
    private double radius;
    protected final double PIE=3.14;

    public Circle(int y, int x, int d, double radius) {
        super(y, x, d);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPIE() {
        return PIE;
    }

    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }

    @Override
    public double area() {
        return PIE * radius * radius;
    }

    @Override
    public void colour() {
        System.out.println("Colour of Circle:Green");
    }

}

