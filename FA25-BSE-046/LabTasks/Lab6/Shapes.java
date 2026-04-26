package LabTasks.Lab6;
public abstract class Shapes {
    int y;
    int x;
    int d;

    public Shapes(int y, int x, int d) {
        this.y = y;
        this.x = x;
        this.d = d;
    }

    public void erase(){
        System.out.println("Shape is Erased.");
    }
    public abstract void draw();
    public abstract double area();
    public abstract void colour();
    public int moveLeft(){
        return x=y-d;
    }
    public int moveRight(){
        return x=y+d;
    }

}
