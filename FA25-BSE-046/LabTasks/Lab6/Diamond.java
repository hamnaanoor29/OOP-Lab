package LabTasks.Lab6;
public class Diamond extends Shapes{
    private double width;
    private double heigth;

    public Diamond(int y, int x, int d, double width, double heigth) {
        super(y, x, d);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public void draw() {
        System.out.println("Diamond is drawn");
    }

    @Override
    public double area() {
        return (heigth*width)/2;

    }
    @Override
    public void colour() {
        System.out.println("Colour of Diamond:Blue");
    }


}

